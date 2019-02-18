package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWM;

public class DriveTrain {
    private static PWM leftBack, leftFront, rightBack, rightFront;

    static  {
        // Drivetrain
        leftBack = new PWM(3);
        leftFront = new PWM(1);
        rightBack = new PWM(4);
        rightFront = new PWM(2);
    }

    /**
     * makes the drive train move in arcade drive
     * 
     * @param speed: straight axis value
     * @param rightTurn: right axis value
     * @param leftTurn: left axis value
     */
    public static void drive(double speed, double turn) {
        rightBack.setSpeed(speed + turn);
        rightFront.setSpeed(speed + turn);
        leftBack.setSpeed(speed - turn);
        leftFront.setSpeed(speed - turn);
    }
}
