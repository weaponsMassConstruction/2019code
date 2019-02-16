package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Servo;

public class Intake {
    private static DoubleSolenoid intake;
    private static Servo servo;

    public Intake() {
        intake = new DoubleSolenoid(5, 6);
        servo = new Servo(0);
    }

    public static void extend() {
        intake.set(Value.kForward);
    }

    public static void retract() {
        intake.set(Value.kReverse);
    }

    public static void openServo() {
        servo.set(1);
    }

    public static void closeServo() {
        servo.set(0);
    }
}