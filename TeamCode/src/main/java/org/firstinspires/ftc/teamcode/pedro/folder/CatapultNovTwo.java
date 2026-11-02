package org.firstinspires.ftc.teamcode.pedro.folder;


import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;

/// adds interpolation table; needs tuning
/// we're just so gracious and professional
@TeleOp(name="Catapult")
@Config

public class CatapultNovTwo extends LinearOpMode {



    private DcMotorEx launchMotor1;
    private DcMotorEx launchMotor2;









    @Override
    public void runOpMode() {

        launchMotor1 = hardwareMap.get(DcMotorEx.class, "launchMotor1");
        launchMotor2 = hardwareMap.get(DcMotorEx.class, "launchMotor2");






        launchMotor1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        launchMotor2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);



        // Wait for the game to start (driver presses START)
        waitForStart();

        while (opModeIsActive()) {










            if (gamepad1.a) {
                launchMotor1.setPower(1);
                launchMotor2.setPower(1);
            }
            else if (gamepad1.b) {
                launchMotor1.setPower(-1);
                launchMotor2.setPower(-1);
            }
            else {
                launchMotor1.setPower(0);
                launchMotor2.setPower(0);
            }

            telemetry.update();
                
        }
    }
}
//we love being gracious and professional
//the wise words of Jackson Bethune
