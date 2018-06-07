package org.usfirst.frc.team1257.utils;
import edu.wpi.first.wpilibj.XboxController;

public class SnailController extends XboxController {

	public SnailController(int port) {
		super(port);
	}
	
	public double getFowardSpeed() {
		
		double forwardSpeed = 0;
		
		if (getAButton()) {                     // If the driver presses the A button
			forwardSpeed = standardizeY(true);  // Fix for left joystick
		} else if (getBumper(Hand.kLeft)) {     // If the driver uses the left joystick
			forwardSpeed = standardizeY(true);  // Fix for left joystick
		} else if (getBumper(Hand.kRight)) {    // If the driver uses the right joystick
			forwardSpeed = standardizeY(false); // Do not need to fix
		}
		return forwardSpeed;
	}
	
	public double getTurnSpeed() {
		
		double turnSpeed = 0;
		
		if (getAButton()) {                     // If the driver presses the A button
			turnSpeed = getX(Hand.kLeft);       // Get X for left joystick
		} else if (getBumper(Hand.kLeft)) {     // If the driver uses the left joystick
			turnSpeed = getX(Hand.kRight);      // Get X for right joystick
		} else if (getBumper(Hand.kRight)) {    // If the driver uses the right joystick
			turnSpeed = getX(Hand.kLeft);       // Get X for left joystick
		}
		return turnSpeed;
	}
	
	@Override
	public double getY(Hand side) {
		//  if side is Hand.kLeft,  neg. value     else positive value
		return side == Hand.kLeft ? -super.getY(side) : super.getY(side);
	}
}