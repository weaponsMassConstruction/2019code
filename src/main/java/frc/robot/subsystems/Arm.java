package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

public class Arm {
    private static TalonSRX arm;
    static {
        arm = new TalonSRX(0);
        arm.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
        arm.setSelectedSensorPosition(0);
        arm.config_kP(0, .001, 0);
        arm.config_kF(0, .0001, 0);
        arm.enableVoltageCompensation(true);
        arm.setSensorPhase(true);
        arm.set(ControlMode.PercentOutput, 0);
    }

    public static void setPosition(double position) {
        arm.set(ControlMode.Position, position);
    }

    public static void manualMove(double speed) {
        arm.set(ControlMode.PercentOutput, speed);
    }

    public static double getPosition() {
        return arm.getSelectedSensorPosition();
    }

    public static double getSetPosition() {
        return arm.getClosedLoopTarget();
    }

    public static boolean isWithinDeadband(){
        return false;
    }
    public static void print() {
        System.out.println("Sensor position: " + arm.getSelectedSensorPosition());
        System.out.println("Set point: " + arm.getClosedLoopTarget());
        System.out.println("Error: " + arm.getClosedLoopError());
    }
}