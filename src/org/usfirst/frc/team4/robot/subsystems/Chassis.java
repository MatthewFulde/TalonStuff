package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.Drive;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
	
    WPI_VictorSPX leftFrontMotor;
    WPI_TalonSRX leftMiddleMotor;
    WPI_VictorSPX leftBackMotor;
	
    WPI_VictorSPX rightFrontMotor;
    WPI_TalonSRX rightMiddleMotor;
    WPI_VictorSPX rightBackMotor;
    
    AHRS gyro;
    public Chassis() {
		leftFrontMotor = new WPI_VictorSPX(RobotMap.CHASSIS_MOTOR_LEFT_FRONT);
		leftMiddleMotor = new WPI_TalonSRX(RobotMap.CHASSIS_MOTOR_LEFT_MIDDLE);
		leftBackMotor = new WPI_VictorSPX(RobotMap.CHASSIS_MOTOR_LEFT_REAR);
		
		rightFrontMotor = new WPI_VictorSPX(RobotMap.CHASSIS_MOTOR_RIGHT_FRONT);
		rightMiddleMotor = new WPI_TalonSRX(RobotMap.CHASSIS_MOTOR_RIGHT_MIDDLE);
		rightBackMotor = new WPI_VictorSPX(RobotMap.CHASSIS_MOTOR_RIGHT_REAR);
		
		leftMiddleMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
		rightMiddleMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder);
		
		leftFrontMotor.follow(leftMiddleMotor);
		leftBackMotor.follow(leftMiddleMotor);
		
		rightFrontMotor.follow(rightMiddleMotor);
		rightBackMotor.follow(rightMiddleMotor);
		
		gyro = new AHRS(SPI.Port.kMXP);
	}
    public void initDefaultCommand() {
		setDefaultCommand(new Drive());
	}
	public double getRightEncoder() {
		return rightMiddleMotor.getSelectedSensorPosition();
	}
}


