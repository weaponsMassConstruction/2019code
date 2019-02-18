package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class HatchIntake {
    private static DoubleSolenoid intake;
    private static Servo servo;

    static {
        intake = new DoubleSolenoid(16, 1, 2);
        servo = new Servo(0);
    }

    public static void extend() {
        intake.set(DoubleSolenoid.Value.kForward);
    }

    public static void retract() {
        intake.set(DoubleSolenoid.Value.kReverse);
    }

    public static void openServo() {
        servo.set(1);
    }

    public static void closeServo() {
        servo.set(0);
    }

    public static boolean isExtended() {
        if (intake.get() == Value.kForward) {
            return true;
        }
        return false;
    }
}