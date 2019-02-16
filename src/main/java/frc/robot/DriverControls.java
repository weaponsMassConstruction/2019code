package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
public class DriverControls {
	private static double speedStraight, speedLeft, speedRight;
	private static XboxController driverJoy;
	public DriverControls() {
		driverJoy = new XboxController(1);
	}

	public static void driverControls() {
		if (Math.abs(driverJoy.getLeftYAxis()) > 0.1) {
			speedStraight = -driverJoy.getLeftYAxis();
		} else {
			speedStraight = 0.0;
		}
		if (driverJoy.getSquareButton()) {
			speedLeft = driverJoy.getLeftTriggerAxis() * 0.33;
			speedRight = driverJoy.getRightTriggerAxis() * 0.33;
		} else {
			speedLeft = driverJoy.getLeftTriggerAxis() * 0.65;
			speedRight = driverJoy.getRightTriggerAxis() * 0.65;
		}
		DriveTrain.drive(speedStraight, speedRight, speedLeft);
	}

}
