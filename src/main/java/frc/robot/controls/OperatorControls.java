package frc.robot.controls;

import frc.robot.subsystems.*;
import frc.robot.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OperatorControls {
    private static Xbox operatorJoy;
    private static boolean override = false;

    static {
        operatorJoy = new Xbox(1);
    }

    public static void operatorControls() {
        Arm.print();
        // Manual arm movement
        if (!HatchIntake.isExtended()) {
            if (Math.abs(operatorJoy.getY(Hand.kRight)) > .2) {
                Arm.manualMove(-operatorJoy.getY(Hand.kRight));
                override = true;
            } else {
                if (override) {
                    Arm.setPosition(Arm.getPosition());
                    override = false;
                }
                // PID Arm movement
                else if (operatorJoy.getAButton()) {
                    Arm.setPosition(Constants.BALL_TWO);
                } else if (operatorJoy.getBButton()) {
                    Arm.setPosition(Constants.HATCH_TWO);
                } else if (operatorJoy.getXButton()) {
                    Arm.setPosition(Constants.HATCH_ONE);
                } else if (operatorJoy.getYButton()) {
                    Arm.setPosition(Constants.BALL_ONE);
                } else if (operatorJoy.getTriggerAxis(Hand.kRight) > .05) {
                    Grabber.outExtend();
                    Grabber.inExtend();
                    Arm.setPosition(Constants.HATCH_THREE);
                } else if (operatorJoy.getTriggerAxis(Hand.kLeft) > .05) {
                    Grabber.outExtend();
                    Grabber.inExtend();
                    Arm.setPosition(Constants.BALL_THREE);
                } else if (operatorJoy.getBumper(Hand.kRight)) {
                    Arm.setPosition(Constants.GROUND);
                } else if (operatorJoy.getBumper(Hand.kLeft)) {
                    Arm.setPosition(Constants.CARGO_STATION);
                }
            }
        }
		// Grabber controls
		if (operatorJoy.getButtonDRight()&& Arm.getSetPosition() != Constants.GROUND) {
			Grabber.outExtend();
		} else if (operatorJoy.getButtonDLeft() && !Grabber.isInExtended()) {
			Grabber.outRetract();
		} else if (operatorJoy.getButtonDUp() && Grabber.isOutExtended()) {
			Grabber.inExtend();
		} else if (operatorJoy.getButtonDDown()) {
			Grabber.inRetract();
		}
    }
}