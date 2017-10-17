package Finch;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FinchArrowKeys implements KeyListener{
	
	static JFrame frame = new JFrame();
	static Finch myFinch = new Finch();
	
	public static void main(String[] args){
		System.out.println("Connected");
		FinchArrowKeys test = new FinchArrowKeys();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    		System.out.println("Terminating");
		        	myFinch.quit();
		            System.exit(0);
		    }
		});
		//myFinch.quit();
	}
	
	public FinchArrowKeys(){
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.GREEN);
		frame.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:  frame.getContentPane().setBackground(Color.GREEN);
								myFinch.setWheelVelocities(-100, 100);
								break;
		case KeyEvent.VK_RIGHT: frame.getContentPane().setBackground(Color.RED);
								myFinch.setWheelVelocities(100, -100);
								break;
		case KeyEvent.VK_UP:	frame.getContentPane().setBackground(Color.CYAN);
								myFinch.setWheelVelocities(100, 100);
								break;
		case KeyEvent.VK_DOWN:  frame.getContentPane().setBackground(Color.ORANGE);
								myFinch.setWheelVelocities(-100, -100);
								break;
		case KeyEvent.VK_SPACE: LED();
								break;
		}
	}
	
	public static void LED(){
		myFinch.setLED(255, 0, 0, 1000);
		myFinch.setLED(0, 255, 0, 1000);
		myFinch.setLED(0, 0, 255, 1000);
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:  myFinch.stopWheels();
								break;
		case KeyEvent.VK_RIGHT: myFinch.stopWheels();
								break;
		case KeyEvent.VK_UP:	myFinch.stopWheels();
								break;
		case KeyEvent.VK_DOWN:  myFinch.stopWheels();
								break;
		}
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
