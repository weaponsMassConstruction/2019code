import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.PWM;
public class WoMB{
    PWM leftBack, leftFront, rightBack, rightFront;
    TalonSRX arm;
    GameController controller;
    DriverStation driverStation;
    public WoMD(){
        //Drivetrain
        leftBack = new PWM(1);
        leftFront = new PWM(2);
        rightBack = new PWM(3);
        rightFront = new PWM(4);
        //Arm
        arm = new TalonSRX(1);
        //Controller
        //Port can be found under the USB tab of the DriverStation
        int port = 1;
        controller = new GameController(port);
        driverStation = DriverStation.getInstance();

    }
}