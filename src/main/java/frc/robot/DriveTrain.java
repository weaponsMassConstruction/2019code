package frc.robot;


public class DriveTrain {
    WoMB ob;
    
   public DriveTrain(WoMB o){
       ob = o;
   }

    /**
 	* makes the drive train move in arcade drive
 	* @param speed: straight axis value
 	* @param rightTurn: right axis value
 	* @param leftTurn: left axis value
 	*/
    public void drive(double speed, double rightTurn, double leftTurn) {
       ob.rightBack.setSpeed( speed - rightTurn + leftTurn);
       ob.rightFront.setSpeed( speed - rightTurn + leftTurn);
       ob.leftBack.setSpeed(-speed + leftTurn - rightTurn);
       ob.leftFront.setSpeed(-speed + leftTurn - rightTurn);
   }
}

