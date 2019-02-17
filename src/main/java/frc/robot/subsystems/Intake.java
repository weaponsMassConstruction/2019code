package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWM;

public class Intake {
    private static PWM rollerLeft, rollerRight;
    private static DoubleSolenoid gate;

    public Intake() {
        rollerLeft = new PWM(5);
        rollerLeft = new PWM(6);
        gate = new DoubleSolenoid(16, 3, 5);
    }

    public static void openGate() {
        gate.set(DoubleSolenoid.Value.kForward);
    }

    public static void closeGate() {
        gate.set(DoubleSolenoid.Value.kReverse);
    }

    public static void runIntake() {
        rollerLeft.setSpeed(1);
        rollerRight.setSpeed(1);
    }

    public static void stopIntake() {
        rollerLeft.stopMotor();
        rollerRight.stopMotor();
    }
}