package com.university.rahim.uitms.UITMS_module.Detector;

/**
 * Created by RAHIM on 10/4/2017.
 */

public class SensorValue {
    private double x;
    private double y;
    private double z;

    public SensorValue() {
        this.x = 0.0d;
        this.y = 0.0d;
        this.z = 0.0d;
    }

    public SensorValue(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
