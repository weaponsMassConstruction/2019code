package frc.robot;
import edu.wpi.first.wpilibj.XboxController;
public class OperatorControls {
	private static double speedStraight, speedLeft, speedRight;
	private static XboxController operatorJoy;
	public OperatorControls() {
		operatorJoy = new XboxController(1);
	}

	public static void driverControls() {
        if(operatorJoy.getAButton()){
            Arm.setPosition(Constants.BALL_TWO);
        }
        else if(operatorJoy.getBButton()){
            Arm.setPosition(Constants.HATCH_TWO);
        }
        else if(operatorJoy)
    }
}
