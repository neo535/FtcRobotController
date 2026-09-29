package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {

    double angle;
    double x;
    double y;

    // constsructor method

    public  RobotLocationPractice(double angle) {
        this.angle = angle;
    }

    public double getHeading() {
        // this method normalizes robot heading between -180 and 180

        // this is useful for calculating turn angles, especially when crossing the 0/360 boundary

        double heading = this.angle; // copy the angle of imu

        while (heading > 180) {
            heading -= 360; // subtract until in target range
        }

        while (heading <= -180) { // <-- MUST HAVE MINUS HERE
            heading += 360; // add until in target range
        }

        return heading; // return normalized value
    }

    public void turnRobot(double turn) {
        this.angle += turn;
    }


    public void setAngle(double angle) {
        this.angle = angle;

    }

    public double getAngle() {
        return this.angle;
    }

    public void changeX(double changeAmount) {
        x += changeAmount;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }


    public void changeY(double changeAmount) {
        y += changeAmount;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

}
