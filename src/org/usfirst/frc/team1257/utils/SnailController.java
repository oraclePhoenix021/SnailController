package org.usfirst.frc.team1257.utils;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.XboxController;



public class SnailController extends XboxController {

	public SnailController(int port) {
		super(port);
	}
	
	public double getFowardSpeed() {
		
		double forwardSpeed = 0;
		
		if (getAButton()) {
			forwardSpeed = standardizeY(true);
		} else if (getBumper(Hand.kLeft)) {
			forwardSpeed = standardizeY(true);
		} else if (getBumper(Hand.kRight)) {
			forwardSpeed = standardizeY(false);
		}
		return forwardSpeed;
	}
	
	public double getTurnSpeed() {
		
		double turnSpeed = 0;
		
		if (getAButton()) {
			turnSpeed = getX(Hand.kLeft);
		
		} else if (getBumper(Hand.kLeft)) {
			turnSpeed = getX(Hand.kRight);
		
		} else if (getBumper(Hand.kRight)) {
			turnSpeed = getX(Hand.kLeft);
		}
		return turnSpeed;
	}
	
	public double standardizeY(boolean leftJoystick) {
		if(leftJoystick) {
			return getY(Hand.kLeft) * -1;
		} else {
			return getY(Hand.kRight);
		}
	}
}