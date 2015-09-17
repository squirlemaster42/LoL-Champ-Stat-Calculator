package com.jakob.graphics;

import javax.swing.JFrame;

public class MakeGui {
	
	public static void makeGUI(int width, int height) {
		
		JFrame frame = new JFrame("LoL Champion Stat Calculator");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}
