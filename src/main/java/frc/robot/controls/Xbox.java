package frc.robot.controls;

import edu.wpi.first.wpilibj.XboxController;

public class Xbox extends XboxController {

   public Xbox(int port) {
       super(port);
   }

   public boolean getButtonDUp() {
       return getPOV() == 0;
   }

   /**
    * @return value of the right d-pad button
    */
   public boolean getButtonDRight() {
       return getPOV() == 90;
   }

   /**
    * @return value of the down d-pad button
    */
   public boolean getButtonDDown() {
       return getPOV() == 180;
   }

   /**
    * @return value of the left d-pad button
    */
   public boolean getButtonDLeft() {
       return getPOV() == 270;
   }

}

