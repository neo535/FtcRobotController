package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariableUsageNga  extends OpMode {

    @Override
    public void init() {
        int teamNum = 24555;
        int motorAngle = 95;
        double motorSpeed = 0.82;
        boolean clawClosed = false;
        String teamName = "The Recless";

        telemetry.addData("Twam number:", teamNum);
        telemetry.addData("Motor speed: ", motorSpeed);
        telemetry.addData("claw closed: ", clawClosed);
        telemetry.addData("team name: ", teamName);
        telemetry.addData("motor angle: ", motorAngle);


    }

    @Override
    public void loop() {
        /*
        1.
         */

    }
}

