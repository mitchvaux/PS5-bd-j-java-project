@echo off

if exist 00000.jar echo Deleting old JAR && del /q 00000.jar
if exist C:\bdj-ps3\common\sig\00000.jar del /q C:\bdj-ps3\common\sig\00000.jar
echo Compiling && javac -source 1.3 -target 1.3 -cp C:\bdj-ps3\common\bdj.jar root\org\homebrew\*.java && echo Copying permissions file to work area && copy C:\bdj-ps3\common\bluray.MyXlet.perm root\org\homebrew && echo Building new JAR && jar cf 00000.jar -C root . && echo Moving JAR to signing area && echo y | copy 00000.jar C:\bdj-ps3\common\sig\00000.jar && echo Signing JAR && pushd C:\bdj-ps3\common\sig && sign 00000.jar && popd && echo Copying signed JAR back to work area && echo y | copy C:\bdj-ps3\common\sig\00000.jar . && echo Finished.