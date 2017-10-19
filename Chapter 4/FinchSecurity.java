package Finch;

import java.awt.Color;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class FinchSecurity {
	public static void main(String[] args){
		Finch myFinch = new Finch();
		System.out.println("connected");

		while(!myFinch.isBeakUp()){
			if(myFinch.isObstacle()){
				myFinch.setLED(255, 0, 0, 1000);
				myFinch.setLED(0, 0, 0, 1000);
			} else {
				myFinch.setWheelVelocities(-100, 100);
				myFinch.buzz(262, 1000);
				myFinch.saySomething("Back off");
				myFinch.setLED(Color.GREEN, 1000);
				myFinch.setLED(Color.BLUE, 1000);
			}
		}
		
		myFinch.quit();
		System.exit(0);
	}
}
