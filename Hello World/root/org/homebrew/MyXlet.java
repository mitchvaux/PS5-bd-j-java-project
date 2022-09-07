package org.homebrew;

import java.io.*;

import java.util.*;

import java.awt.*;
import java.net.*;

import javax.media.*;

import javax.tv.xlet.*;

import org.bluray.ui.event.HRcEvent;

import org.dvb.event.UserEvent;

import org.havi.ui.*;


public class MyXlet implements Xlet, ControllerListener {

	private HScene scene;
	private Container gui;
	private XletContext context;
	private final ArrayList messages = new ArrayList();

	public void initXlet(XletContext context) {
		this.context = context;
		
// START: Code required for text output.

		scene = HSceneFactory.getInstance().getDefaultHScene();

		try {

			gui = new Screen(messages);

			gui.setSize(1920, 1080); // BD screen size
			scene.add(gui, BorderLayout.CENTER);

// END: Code required for text output.

			messages.add("Hello World!");

		} catch (Exception e) {
			messages.add(e.getMessage());
		}
		scene.validate();
	}

// Don't touch any of the code from here on.

	public void startXlet() {
		gui.setVisible(true);
		scene.setVisible(true);
		gui.requestFocus();
	}

	public void pauseXlet() {
		gui.setVisible(false);
	}

	public void destroyXlet(boolean unconditional) {
		scene.remove(gui);
		scene = null;
	}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void numberKeyPressed(int value){}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void colorKeyPressed(int value){}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void popupKeyPressed(){}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void enterKeyPressed(){}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void arrowLeftKeyPressed(){}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void arrowRightPressed(){}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void arrowUpPressed(){}

	/**
	 * Subclasses should override this if they're interested in getting
	 * this event.
	 **/
	protected void arrowDownPressed(){}

	public void controllerUpdate(ControllerEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}