package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;


/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left  drive motor:        "left_drive"
 * Motor channel:  Right drive motor:        "right_drive"
 * Motor channel:  Manipulator drive motor:  "left_arm"
 * Servo channel:  Servo to open left claw:  "left_hand"
 * Servo channel:  Servo to open right claw: "right_hand"
 */

public class HardwareRobot {

    // Public opMode Members
    public ColorSensor colSensor;
    //public TouchSensor toSensor;
    //public DcMotor testMotor;
    //public DcMotor testMotor1;
    public DcMotor frontRight;
    public DcMotor frontLeft;
    public DcMotor backRight;
    public DcMotor backLeft;
    // Local opMode Members
    HardwareMap hwMap;

    // Constructor
    public HardwareRobot() {

    }

    // Initialize Standard Hardware Interfaces
    public void init(HardwareMap ahwMap) {

        // Save Reference to HardwareMap
        hwMap = ahwMap;

        frontRight = hwMap.get(DcMotor.class, "frontRight");
        frontLeft = hwMap.get(DcMotor.class, "frontLeft");
        backRight = hwMap.get(DcMotor.class, "backRight");
        backLeft = hwMap.get(DcMotor.class, "backLeft");

        //
        // Reverse Directions
//        FL.setDirection(DcMotorSimple.Direction.REVERSE);
//        BR.setDirection(DcMotorSimple.Direction.REVERSE);
//        FR.setDirection(DcMotorSimple.Direction.REVERSE);

        colSensor = hwMap.get(ColorSensor.class, "colSensor");
        //toSensor = hwMap.get(TouchSensor.class, "toSensor");
        //testMotor = hwMap.get(DcMotor.class,"testMotor");
        //testMotor1 = hwMap.get(DcMotor.class, "testMotor1");


    }
}
