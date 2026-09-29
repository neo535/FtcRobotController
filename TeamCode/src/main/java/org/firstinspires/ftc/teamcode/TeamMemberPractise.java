package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeamMemberPractise extends OpMode {

    boolean initDone;


    @Override
    public void init() {
        telemetry.addData("iinit", initDone);
        initDone = true;


    }

    double squareInputWithSign(double input) {
        double output = input * input;

        if (input < 0) {
            output += -1;
        }
        return  output;
    }
    @Override
    public void loop() {
        telemetry.addData("Init", initDone);

        double yAxis = gamepad1.left_stick_y;;

        telemetry.addData("L s norm", yAxis);

        yAxis = squareInputWithSign(yAxis);
        telemetry.addData("L s moded", yAxis);
    }
}
