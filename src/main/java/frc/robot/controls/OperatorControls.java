package frc.robot.controls;

import frc.robot.subsystems.*;
import frc.robot.*;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OperatorControls {
    private static XboxController operatorJoy;

    public OperatorControls() {
        operatorJoy = new XboxController(1);
    }

    public static void operatorControls() {
        if (!HatchIntake.getOut()) {
            if (Math.abs(operatorJoy.getY(Hand.kRight)) > .05) {
                Arm.manualMove(operatorJoy.getY(Hand.kRight));
            } else {
                if (operatorJoy.getAButton()) {
                    Arm.setPosition(Constants.BALL_TWO);
                } else if (operatorJoy.getBButton()) {
                    Arm.setPosition(Constants.HATCH_TWO);
                } else if (operatorJoy.getXButton()) {
                    Arm.setPosition(Constants.HATCH_ONE);
                } else if (operatorJoy.getYButton()) {
                    Arm.setPosition(Constants.BALL_ONE);
                } else if (operatorJoy.getTriggerAxis(Hand.kRight) > .05) {
                    Arm.setPosition(Constants.HATCH_THREE);
                } else if (operatorJoy.getTriggerAxis(Hand.kLeft) > .05) {
                    Arm.setPosition(Constants.BALL_THREE);
                } else if (operatorJoy.getBumper(Hand.kRight)) {
                    Arm.setPosition(Constants.GROUND);
                } else if (operatorJoy.getBumper(Hand.kLeft)) {
                    Arm.setPosition(Constants.CARGO_STATION);
                }
            }
        }
        if (Math.abs(operatorJoy.getY(Hand.kLeft)) > .05) {

        }
    }
}