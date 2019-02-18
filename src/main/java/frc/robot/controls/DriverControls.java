package frc.robot.controls;

import frc.robot.Constants;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class DriverControls {
	private static double speedStraight, turn;
	private static Xbox driverJoy;
	private static boolean yPrevious = false, yEnable = false, bPrevious = false, bEnable = false, aPrevious = false,
			xPrevious = false, xEnable = false, aEnable = false;

	static {
		driverJoy = new Xbox(0);
	}

	public static void driverControls() {
		// Toggle switch for the back climbing pneumatics
		if (driverJoy.getYButton()) {
			if (!yPrevious) {
				yEnable = !yEnable;
				if (yEnable) {
					Climber.frontExtend();
				} else {
					Climber.frontRetract();
				}
			}
		}
		yPrevious = driverJoy.getYButton();

		// Toggle switch for the front climbing pneumatics
		if (driverJoy.getBButton()) {
			if (!bPrevious) {
				bEnable = !bEnable;
				if (bEnable) {
					Climber.backExtend();
				} else {
					Climber.backRetract();
				}
			}
		}
		bPrevious = driverJoy.getBButton();

		// Toggles for extending and retracting the hatch
		if (driverJoy.getAButton()) {
			System.out.println((Arm.getSetPosition() == Constants.HATCH_ONE) + "\n\n\n\n\n\n\n\n\n\n");
			if (!aPrevious) {
				aEnable = !aEnable;
				if (aEnable) {
					if (Arm.getSetPosition() == Constants.HATCH_ONE && Arm.isWithinDeadband())// && Arm.isWithinDeadband()) //TODO add this in
						HatchIntake.extend();
				} else
					HatchIntake.retract();
			}
		}
		aPrevious = driverJoy.getAButton();

		// Start to open servo, back to close
		if (driverJoy.getStartButton()) {
			HatchIntake.openServo();
		}
		if (driverJoy.getBackButton()) {
			HatchIntake.closeServo();
		}

		// Toggles for extending and retracting the crab
		if (driverJoy.getXButton()) {
			if (!xPrevious) {
				xEnable = !xEnable;
				if (xEnable) {
					Crab.extend();
				} else {
					Crab.retract();
				}
			}
		}
		xPrevious = driverJoy.getXButton();

		// Make crab move left or right
		if (driverJoy.getBumper(Hand.kLeft)) {
			Crab.driveLeft();
		} else if (driverJoy.getBumper(Hand.kRight)) {
			Crab.driveRight();
		} else {
			Crab.driveStop();
		}

		// Intake controls
		if (driverJoy.getTriggerAxis(Hand.kLeft) > .1) {
			Intake.runIntake();
		} else if (driverJoy.getTriggerAxis(Hand.kRight) > .1) {
			Intake.runOuttake();
		} else {
			Intake.stopIntake();
		}

		// Drive controls front back
		if (Math.abs(driverJoy.getY(Hand.kLeft)) > .12) {
			speedStraight = driverJoy.getY(Hand.kLeft);
		} else {
			speedStraight = 0;
		}
		// Drive controls left right
		if (Math.abs(driverJoy.getX(Hand.kRight)) > .12) {
			turn = driverJoy.getX(Hand.kRight);
		} else {
			turn = 0;
		}
		DriveTrain.drive(speedStraight, turn);
	}
}
