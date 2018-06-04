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
			forwardSpeed = GetY(true);
		} else if (getBumper(Hand.kLeft)) {
			forwardSpeed = GetY(true);
		} else if (getBumper(Hand.kRight)) {
			forwardSpeed = GetY(false);
		}
		return forwardSpeed;
	}
	
	public double getTurnSpeed() {
		
		double turnSpeed = 0;
		
		if (getAButton()) {
			turnSpeed = GetX(true);
		} else if (getBumper(Hand.kLeft)) {
			turnSpeed = GetY(true);
		} else if (getBumper(Hand.kRight)) {
			turnSpeed = GetY(false);
		}
		return turnSpeed;
	}
	
	public double GetY(boolean left) {
		if(left) {
			return getY(Hand.kLeft) * -1;
		}else {
			return getY(Hand.kRight);
		}
	}
	
	public double GetX(boolean left) {
		if(left) {
			return getY(Hand.kLeft);
		}else {
			return getY(Hand.kRight);
		}
	}
}
