package org.usfirst.frc.team6171.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
	public static final int LEFTX = 0;
	public static final int LEFTY = 1;
	public static final int RIGHTX = 4;
	public static final int RIGHTY = 5;
	
	Joystick xBox;
	
	public OI(){
		xBox = new Joystick(0);	
	}
	
	public double getLeftY(){
		if(Math.abs(xBox.getRawAxis(LEFTY))>0.2)
			return xBox.getRawAxis(LEFTY);
		return 0;
	}
	
	public double getLeftX(){
		if(Math.abs(xBox.getRawAxis(LEFTX))>0.2)
			return xBox.getRawAxis(LEFTX);
		return 0;
	}
	
	public double getRightX(){
		if(Math.abs(xBox.getRawAxis(RIGHTX))>0.2)
			return xBox.getRawAxis(RIGHTX);
		return 0;
	}
	
	public double getRightY(){
		if(Math.abs(xBox.getRawAxis(RIGHTY))>0.2)
			return xBox.getRawAxis(RIGHTY);
		return 0;
	}
	
	
}
