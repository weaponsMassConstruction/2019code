package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

public class Arm {
    private static TalonSRX arm;

    public Arm() {
        // Arm
        arm = new TalonSRX(1);
        arm.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Absolute);
        arm.config_kP(0, .08, 0);
        arm.enableVoltageCompensation(true);
    }

    public static void setPosition(double position) {
        arm.set(ControlMode.Position, position);
    }
    public static void manualMove(double speed){
        arm.set(ControlMode.PercentOutput, speed);
    }
}