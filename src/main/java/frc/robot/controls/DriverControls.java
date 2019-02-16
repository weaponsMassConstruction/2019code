package frc.robot.controls;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class DriverControls {
	private static double speedStraight, speedLeft, speedRight;
	private static XboxController driverJoy;

	public DriverControls() {
		driverJoy = new XboxController(0);
	}

	public static void driverControls() {
		if (Math.abs(driverJoy.getY(Hand.kLeft)) > .2) {
			speedStraight = driverJoy.getY(Hand.kLeft);
		} else {
			speedStraight = 0;
		}
		System.out.println("Driver left Y" + driverJoy.getY(Hand.kLeft));
		if (Math.abs(driverJoy.getX(Hand.kRight)) > .2) {
			speedLeft = driverJoy.getX(Hand.kRight);
			speedRight = driverJoy.getX(Hand.kRight);
		} else {
			speedLeft = 0;
			speedRight = 0;
		}
		System.out.println("Driver right X" + driverJoy.getX(Hand.kRight));
		DriveTrain.drive(speedStraight, speedLeft, speedRight);
	}
}
