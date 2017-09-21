/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.util.Date;

/**
 *
 * @author Malick
 */
public class VitalSign {

    private int lowCholesterol;
    private int highCholesterol;
    private int bloodPressure;
    private int diabetes;
    private boolean smoke;
    private Date date;
    private HealthReportArray HealthReportArray;

    public VitalSign() {
        HealthReportArray = new HealthReportArray();
    }

    public int getLowCholesterol() {
        return lowCholesterol;
    }

    public void setLowCholesterol(int lowCholesterol) {
        this.lowCholesterol = lowCholesterol;
    }

    public int getHighCholesterol() {
        return highCholesterol;
    }

    public void setHighCholesterol(int highCholesterol) {
        this.highCholesterol = highCholesterol;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(int diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HealthReportArray getHealthReportArray() {
        return HealthReportArray;
    }

    public void setHealthReportArray(HealthReportArray HealthReportArray) {
        this.HealthReportArray = HealthReportArray;
    }

}
