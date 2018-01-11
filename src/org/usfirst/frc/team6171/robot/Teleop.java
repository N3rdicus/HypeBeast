package org.usfirst.frc.team6171.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class Teleop {
	public static final double sensitivity = 0.5;
	public DriveTrain driveTrain;
	public OI oi;
	
	public Teleop(){
		driveTrain = new DriveTrain();
		oi = new OI();
	}
	
	public void init(){
		driveTrain.getLeftMaster().set(ControlMode.PercentOutput, oi.getLeftX()*sensitivity);
		driveTrain.getRightMaster().set(ControlMode.PercentOutput, oi.getRightY()*sensitivity);
	}
	
	public void testing(){
		driveTrain.getLeftMaster().set(ControlMode.PercentOutput, sensitivity);
		driveTrain.getRightMaster().set(ControlMode.PercentOutput, sensitivity);
		driveTrain.getLeftSlave().set(ControlMode.PercentOutput, sensitivity);
		driveTrain.getRightSlave().set(ControlMode.PercentOutput, sensitivity);
	}
}
