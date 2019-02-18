package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWM;

public class Intake {
    private static PWM rollerLeft, rollerRight;

    static {
        rollerLeft = new PWM(5);
        rollerRight = new PWM(6);
    }

    public static void runIntake() {
        rollerLeft.setSpeed(1);
        rollerRight.setSpeed(1);
    }

    public static void runOuttake(){
        rollerLeft.setSpeed(-1);
        rollerRight.setSpeed(-1);
    }
    public static void stopIntake() {
        rollerLeft.setSpeed(0);
        rollerRight.setSpeed(0);
    }
}