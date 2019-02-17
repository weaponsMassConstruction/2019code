package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWM;

public class Crab {
    private static DoubleSolenoid crabC;
    private static PWM crabWalk;

    static {
        crabC = new DoubleSolenoid(15, 5, 2);
        crabWalk = new PWM(7);
        crabWalk.setSpeed(0);
    }

    public static void crabOn() {
        crabC.set(DoubleSolenoid.Value.kForward);
    }

    public static void crabOff() {
        crabC.set(DoubleSolenoid.Value.kReverse);
    }

    public static void left() {
        crabWalk.setSpeed(-1);
    }

    public static void right() {
        crabWalk.setSpeed(1);
    }

    public static void stop() {
        crabWalk.setSpeed(0);
    }
}
