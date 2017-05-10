package com.TwodTutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private int key;
	public KeyInput (Handler handler){
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e){
		key = e.getKeyCode();
		
		for (int i =0; i< handler.object.size(); i++)
		{
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getID() == ID.Player){
				//Key events for player 1
				if(key == 'w') tempObject.setVelY(5);
			}
		}
		System.out.println(e.getKeyChar());
	}
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
	}
	
}
