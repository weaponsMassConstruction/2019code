package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class Arm {
    WoMC ob;

    public Arm(WoMC o) {
        ob = o;
    }

    public void setPosition(double position) {
        ob.arm.set(ControlMode.Position, position);
    }
}