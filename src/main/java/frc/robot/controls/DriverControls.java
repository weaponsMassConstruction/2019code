package frc.robot.controls;

import frc.robot.subsystems.*;
import frc.robot.*;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class DriverControls {
	private static double speedStraight, turn;
	private static XboxController driverJoy;
	private static boolean yPrevious = false, yEnable = true, bPrevious = false, bEnable = true, aPrevious = false,
			xPrevious = false, xEnable = true, aEnable = true;

	public DriverControls() {
		driverJoy = new XboxController(0);
	}

	public static void driverControls() {
		// Toggle switch for the back climbing pneumatics
		if (driverJoy.getYButton()) {
			if (!yPrevious) {
				yEnable = !yEnable;
				if (yEnable) {
					Climber.frontOn();
				} else {
					Climber.frontOff();
				}
			}
		}
		yPrevious = driverJoy.getYButton();

		// toggles the other side of the robot's pneumatics
		if (driverJoy.getBButton()) {
			if (!bPrevious) {
				bEnable = !bEnable;
				if (bEnable) {
					Climber.backOn();
				} else {
					Climber.backOff();
				}
			}
		}
		bPrevious = driverJoy.getBButton();

		// toggles enting and retracting the hach collector
		if (driverJoy.getAButton()) {
			if (aPrevious) {
				aEnable = !aEnable;
				if (aEnable) {
					HatchIntake.extend();
				} else
					HatchIntake.retract();
			}
		}
		aPrevious = driverJoy.getAButton();

		if (driverJoy.getXButton()) {
			if (!xPrevious) {
				xEnable = !xEnable;
				if (xEnable) {
					Crab.crabOn();
				} else {
					Crab.crabOff();
				}
			}
		}
		yPrevious = driverJoy.getYButton();
		// start will open servo
		if (driverJoy.getStartButton()) {
			HatchIntake.openServo();
		}
		// the back button will close the servo

		if (driverJoy.getBackButton()) {
			HatchIntake.closeServo();
		}

		// left bumper will make the crab drive train move to the left
		if (driverJoy.getBumper(Hand.kLeft)) {
			Crab.left();
		}
		// right bumper will make the crab drive train move to the right
		else if (driverJoy.getBumper(Hand.kRight)) {
			Crab.right();
		} else {
			Crab.stop();
		}
		// drive train code
		if (Math.abs(driverJoy.getY(Hand.kLeft)) > .2) {
			speedStraight = driverJoy.getY(Hand.kLeft);
		} else {
			speedStraight = 0;
		}
		if (Math.abs(driverJoy.getX(Hand.kRight)) > .2) {
			turn = driverJoy.getX(Hand.kRight);
		} else {
			turn = 0;
		}
		DriveTrain.drive(speedStraight, turn);

	}
}
