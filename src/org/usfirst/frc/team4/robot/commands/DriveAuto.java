package org.usfirst.frc.team4.robot.commands;

import org.usfirst.frc.team4.robot.Robot;
import org.usfirst.frc.team4.robot.constants.DriveConstants;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveAuto extends Command {

		
	private double m_distance, m_heading;
	private double m_rightError, m_leftError;
	
	private double m_startTime, m_timeout;
	
	private double m_maxStraightPower;
	
    public DriveAuto(double distance, double heading, double timeout) {
    	m_distance = distance;
    	m_heading = heading;
    	m_timeout = timeout;

    	m_maxStraightPower = DriveConstants.distanceMaxPower;
    	
    	
        requires(Robot.m_chassis);
    }
//    public DriveStraightDistance(double distance, double heading, double timeout, double maxStraightPower) {
//    	m_distance = distance;
//    	m_heading = heading;
//    	m_timeout = timeout;
//   		m_maxStraightPower = maxStraightPower;
//   
//   		requires(Robot.m_chassis); }
    // Called just before this Command runs the first time
    protected void initialize() {
    }//one (1) code for kristian

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
