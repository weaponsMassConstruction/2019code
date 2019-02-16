package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Climber {
    private static DoubleSolenoid frontClimb, backClimb;

    public Climber() {
        frontClimb = new DoubleSolenoid(0, 1);
        backClimb = new DoubleSolenoid(4, 5);
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
