package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class PTester {
    private static DoubleSolenoid one, two, three, four, five, six;

    public PTester() {
        //one = new DoubleSolenoid(16, 1,2 );
        // two = new DoubleSolenoid(15, 2, 5);
        /// three = new DoubleSolenoid(15, 3, 6);
        //// four = new DoubleSolenoid(16, 1, 6);
        // five = new DoubleSolenoid(16, 2, 5);
        // six = new DoubleSolenoid(16, 3, 4);
    }

    public static void oneOn() {
        one.set(DoubleSolenoid.Value.kForward);
    }

    public static void oneOff() {
        one.set(DoubleSolenoid.Value.kReverse);
    }

    public static void twoOn() {
        two.set(DoubleSolenoid.Value.kForward);
    }

    public static void twoOff() {
        two.set(DoubleSolenoid.Value.kReverse);
    }

    public static void threeOn() {
        three.set(DoubleSolenoid.Value.kForward);
    }

    public static void threeOff() {
        three.set(DoubleSolenoid.Value.kReverse);
    }

    public static void fourOn() {
        four.set(DoubleSolenoid.Value.kForward);
    }

    public static void fourOff() {
        four.set(DoubleSolenoid.Value.kReverse);
    }

    public static void fiveOn() {
        five.set(DoubleSolenoid.Value.kForward);
    }

    public static void fiveOff() {
        five.set(DoubleSolenoid.Value.kReverse);
    }

    public static void sixOn() {
        six.set(DoubleSolenoid.Value.kForward);
    }

    public static void sixOff() {
        six.set(DoubleSolenoid.Value.kReverse);
    }

}
