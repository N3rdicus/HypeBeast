package org.usfirst.frc.team6171.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class DriveTrain {
	TalonSRX leftMaster, rightMaster, leftSlave, rightSlave;
	
	
	public DriveTrain(){
		leftMaster = new TalonSRX(RobotMap.kfrontLeftMaster);
		leftSlave = new TalonSRX(RobotMap.kbackLeftSlave);
		
		rightMaster = new TalonSRX(RobotMap.kfrontRightMaster);
		rightSlave = new TalonSRX(RobotMap.kbackRightSlave);
		
		//Try if this works overall
		//Try setting follower in set
		//rightSlave.set(ControlMode.Follower, rightMaster.getDeviceID());
		//leftSlave.set(ControlMode.Follower, leftMaster.getDeviceID());
		
		leftMaster.setNeutralMode(NeutralMode.Coast);
		leftSlave.setNeutralMode(NeutralMode.Coast);
		rightMaster.setNeutralMode(NeutralMode.Coast);
		rightSlave.setNeutralMode(NeutralMode.Coast);
		
		leftMaster.configPeakOutputForward(.5, 0); //param1: percentage param2: msTimeOut
		leftSlave.configPeakOutputForward(.5, 0);
		rightMaster.configPeakOutputForward(.5, 0);
		rightSlave.configPeakOutputForward(.5,0);
		
		leftMaster.configPeakOutputReverse(-.5, 0);
		leftSlave.configPeakOutputReverse(-.5, 0);
		rightMaster.configPeakOutputReverse(-.5, 0);
		rightSlave.configPeakOutputReverse(-.5, 0);
		
		leftMaster.configNominalOutputForward(0, 0);
		rightMaster.configNominalOutputForward(0, 0);
		leftSlave.configNominalOutputForward(0, 0);
		rightSlave.configNominalOutputForward(0, 0);
		
		leftMaster.configNominalOutputReverse(0, 0);
		leftSlave.configNominalOutputReverse(0, 0);
		rightMaster.configNominalOutputReverse(0, 0);
		rightSlave.configNominalOutputReverse(0, 0);

	}
	
	
	public TalonSRX getRightMaster(){
		return rightMaster;
	}
	
	public TalonSRX getLeftMaster(){
		return leftMaster;
	}
	
	public TalonSRX getRightSlave(){
		return rightSlave;
	}
	
	public TalonSRX getLeftSlave(){
		return leftSlave;
	}
	
}
