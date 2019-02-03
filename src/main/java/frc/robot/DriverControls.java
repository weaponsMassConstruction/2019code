package frc.robot;

public class DriverControls {
	private WoMB ob;
	private DriveTrain drive;
	private double speedStraight = 0, speedLeft = 0, speedRight = 0;

	public DriverControls(WoMB ob, DriveTrain drive) {
		this.ob = ob;
		this.drive = drive;
	}

	public void driverControlsPS4() {
		if (Math.abs(ob.controller.getLeftYAxis()) > 0.1) {
			speedStraight = -ob.controller.getLeftYAxis();
		} else {
			speedStraight = 0.0;
		}
		if (ob.controller.getSquareButton()) {
			speedLeft = ob.controller.getLeftTriggerAxis() * 0.33;
			speedRight = ob.controller.getRightTriggerAxis() * 0.33;
		} else {
			speedLeft = ob.controller.getLeftTriggerAxis() * 0.65;
			speedRight = ob.controller.getRightTriggerAxis() * 0.65;
		}
		drive.drive(speedStraight, speedRight, speedLeft);

	}
}
