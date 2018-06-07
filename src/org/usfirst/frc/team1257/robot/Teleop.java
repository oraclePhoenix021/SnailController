package org.usfirst.frc.team1257.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Teleop {
	Spark m_frontleft = new Spark(1);
	Spark m_rearleft = new Spark(2);
	SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontleft, m_rearleft);
	
	Spark m_frontright = new Spark(3);
	Spark m_rearright = new Spark(4);
	SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontright, m_rearright);
	
	DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);
}