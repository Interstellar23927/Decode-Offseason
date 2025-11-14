package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.HardwareRobot;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Gamepad;

public class TestMotor {
    HardwareRobot robot;

    public TestMotor(HardwareRobot r){
        robot = r;
    }
    public void Update(Gamepad gamepad1){
        double red = robot.colSensor.red();
        double green = robot.colSensor.green();
        double blue = robot.colSensor.blue();

        /*if(red > green && red > blue) { //red
            robot.testMotor.setPower(0.75);
        } else if(red>blue && (green+200) > red) { //yellow
            robot.testMotor.setPower(0.5);
        } else if(blue>(red+50)) { //blue
            robot.testMotor.setPower(0.25);
        } else {
            robot.testMotor.setPower(0);
        }*/

    }


}
