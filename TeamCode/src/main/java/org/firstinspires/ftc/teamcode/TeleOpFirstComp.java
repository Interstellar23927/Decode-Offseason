package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;

@TeleOp
public class TeleOpFirstComp extends LinearOpMode {

    @Override

    public void runOpMode() throws InterruptedException {

        HardwareRobot robot = new HardwareRobot();
        ElapsedTime timer = new ElapsedTime();

        MecanumDrive drive = new MecanumDrive(robot, timer);

        //TestMotor testMotor = new TestMotor(robot);
        //TestMotor1 testMotor1 = new TestMotor1(robot);

        robot.init(hardwareMap);

        waitForStart();

        if (isStopRequested()) return;


        while(opModeIsActive()) {
            //testMotor.Update(gamepad1);
            drive.Update(gamepad1, gamepad2);
            //testMotor1.Update(gamepad1);
            telemetry.addData("Status", "Running");
            telemetry.addData("Red", robot.colSensor.red());
            telemetry.addData("Green", robot.colSensor.green());
            telemetry.addData("Blue", robot.colSensor.blue());
            //telemetry.addData("Pressed", robot.toSensor.getValue());
            telemetry.update();
        }
    }
}
