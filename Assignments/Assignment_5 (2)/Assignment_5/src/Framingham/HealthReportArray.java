/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class HealthReportArray {

    private ArrayList<HealthReport> healthReportArray;

    public HealthReportArray() {
        this.healthReportArray = new ArrayList<HealthReport>();

    }

    public ArrayList<HealthReport> getHealthReportArray() {
        return healthReportArray;
    }

    public void setHealthReportArray(ArrayList<HealthReport> healthReportArray) {
        this.healthReportArray = healthReportArray;
    }

    public HealthReport addRisk(int healthScore) {
        HealthReport hr = new HealthReport();
        hr.setHealthScore(healthScore);
        healthReportArray.add(hr);
        return hr;

    }

}
