package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Grabber {
    private static DoubleSolenoid inside, outside;
    static {
        inside = new DoubleSolenoid(16, 5, 3);
        outside = new DoubleSolenoid(16, 6, 4);
    }

    public static void inExtend() {
        inside.set(DoubleSolenoid.Value.kForward);
    }

    public static void inRetract() {
        inside.set(DoubleSolenoid.Value.kReverse);
    }

    public static void outExtend() {
        outside.set(DoubleSolenoid.Value.kForward);
    }

    public static void outRetract() {
        outside.set(DoubleSolenoid.Value.kReverse);
    }

    public static boolean isInExtended() {
        if (inside.get() == DoubleSolenoid.Value.kForward) {
            return true;
        }
        return false;
    }

    public static boolean isOutExtended() {
        if (outside.get() == DoubleSolenoid.Value.kForward) {
            return true;
        }
        return false;
    }
}
