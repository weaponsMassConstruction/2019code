package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class GameController {
    private Joystick joy;

    public GameController(int port) {
        this.joy = new Joystick(port);
    }

    public boolean getTriButton() {
        return joy.getRawButton(4);
    }

    public boolean getCircleButton() {
        return joy.getRawButton(3);
    }

    public boolean getXButton() {
        return joy.getRawButton(2);
    }

    public boolean getSquareButton() {
        return joy.getRawButton(1);
    }

    public boolean getLeftStickButton() {
        return joy.getRawButton(11);
    }

    public boolean getRightStickButton() {
        return joy.getRawButton(12);
    }

    public boolean getLeftBumperButton() {
        return joy.getRawButton(5);
    }

    public boolean getRightBumperButton() {
        return joy.getRawButton(6);
    }

    public boolean getShareButton() {
        return joy.getRawButton(9);
    }

    public boolean getOptionsButton() {
        return joy.getRawButton(10);
    }

    public boolean getPSButton() {
        return joy.getRawButton(13);
    }

    public boolean getTrackpadButton() {
        return joy.getRawButton(14);
    }

    public double getLeftYAxis() {
        return joy.getRawAxis(1);
    }

    public double getLeftXAxis() {
        return joy.getRawAxis(0);
    }

    public double getRightYAxis() {
        return joy.getRawAxis(5);
    }

    public double getRightXAxis() {
        return joy.getRawAxis(2);
    }

    public double getLeftTriggerAxis() {
        return (joy.getRawAxis(3) + 1) / 2;
    }

    public double getRightTriggerAxis() {
        return (joy.getRawAxis(4) + 1) / 2;
    }

    public boolean getButtonDUp() {
        return joy.getPOV() == 0;
    }

    public boolean getButtonDRight() {
        return joy.getPOV() == 90;
    }

    public boolean getButtonDDown() {
        return joy.getPOV() == 180;
    }

    public boolean getButtonDLeft() {
        return joy.getPOV() == 270;
    }
}