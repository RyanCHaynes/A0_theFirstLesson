package com.TwodTutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	public static int HEALTH = 100;
	
	public void tick(){
		
	}
	public void render(Graphics g){
		g.setColor(Color.GRAY);
		g.fillRect(15, 15, 200, 32);
		g.setColor(Color.GREEN);
		g.fillRect(15, 15, HEALTH * 2, 32);
		g.setColor(Color.ORANGE);
		g.drawRect(15, 15, HEALTH * 2, 32);
	}
}
