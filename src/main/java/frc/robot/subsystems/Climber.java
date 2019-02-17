package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Climber {
    private static DoubleSolenoid frontClimb, backClimb;

     static  {
        frontClimb = new DoubleSolenoid(15,6, 3);
        backClimb = new DoubleSolenoid(15,4, 1);
    }

    public static void frontOn() {
        frontClimb.set(DoubleSolenoid.Value.kForward);
    }

    public static void frontOff() {
        frontClimb.set(DoubleSolenoid.Value.kReverse);
    }

    public static void backOn() {
        backClimb.set(DoubleSolenoid.Value.kForward);
    }

    public static void backOff() {
        backClimb.set(DoubleSolenoid.Value.kReverse);
    }

}
