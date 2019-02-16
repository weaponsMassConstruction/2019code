package frc.robot;

import edu.wpi.first.wpilibj.PWM;

public class DriveTrain {
    private static PWM leftBack, leftFront, rightBack, rightFront;

    public DriveTrain() {
        // Drivetrain
        leftBack = new PWM(3);
        leftFront = new PWM(2);
        rightBack = new PWM(4);
        rightFront = new PWM(1);
    }

    /**
     * makes the drive train move in arcade drive
     * 
     * @param speed: straight axis value
     * @param rightTurn: right axis value
     * @param leftTurn: left axis value
     */
    public static void drive(double speed, double rightTurn, double leftTurn) {
        rightBack.setSpeed(speed - rightTurn + leftTurn);
        rightFront.setSpeed(speed - rightTurn + leftTurn);
        leftBack.setSpeed(-speed + leftTurn - rightTurn);
        leftFront.setSpeed(-speed + leftTurn - rightTurn);
    }
}
