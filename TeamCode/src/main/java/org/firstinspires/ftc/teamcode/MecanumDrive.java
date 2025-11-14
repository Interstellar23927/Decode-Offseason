package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.HardwareRobot;

public class MecanumDrive {

    HardwareRobot robot;
    public ElapsedTime timer;
    double DriveSen = 0.9;

    public MecanumDrive(HardwareMap hardwareMap) {

    }

    public  enum DriveState {
        START,
        IDLE,
        FORWARDS,
        STOP,
        BACKWARDS
    }

    public static DriveState state = DriveState.IDLE;

    public MecanumDrive(HardwareRobot r, ElapsedTime timer) {
        robot = r;
        this.timer = timer;
    }

    public void Update(Gamepad gamepad1, Gamepad gamepad2) {

        double y = 0.75 * gamepad1.left_stick_x;
        double x = 0.75 * -gamepad1.left_stick_y;
        double rx = 0.45 * gamepad1.right_stick_x;

        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);

        if (denominator == 0) {
            robot.frontLeft.setPower(0);
            robot.frontRight.setPower(0);
            robot.backLeft.setPower(0);
            robot.backRight.setPower(0);
        }

        else {
            double frontLeftPower = (y + x + rx) / denominator;
            double backLeftPower = -(y - x - rx) / denominator;
            double frontRightPower = (y - x + rx) / denominator;
            double backRightPower = -(y + x - rx) / denominator;

            robot.frontLeft.setPower(DriveSen * frontLeftPower);
            robot.frontRight.setPower(DriveSen * frontRightPower);
            robot.backLeft.setPower(DriveSen * backLeftPower);
            robot.backRight.setPower(DriveSen * backRightPower);
        }
    }
}