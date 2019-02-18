package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;

public class Crab {
    private static DoubleSolenoid crabC;
    private static Relay crabWalk;

    static {
        crabC = new DoubleSolenoid(15, 5, 2);
        crabWalk = new Relay(0);

    }

    public static void extend() {
        crabC.set(DoubleSolenoid.Value.kForward);
    }

    public static void retract() {
        crabC.set(DoubleSolenoid.Value.kReverse);
    }

    public static void driveLeft() {
        crabWalk.set(Relay.Value.kReverse);
    }

    public static void driveRight() {
        crabWalk.set(Relay.Value.kForward);
    }

    public static void driveStop() {
        crabWalk.set(Relay.Value.kOff);
    }
}
