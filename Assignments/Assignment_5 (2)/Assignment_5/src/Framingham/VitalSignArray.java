/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Malick
 */
public class VitalSignArray {

    private ArrayList<VitalSign> vitalSignArray;

    public VitalSignArray() {
        this.vitalSignArray = new ArrayList<VitalSign>();

    }

    public ArrayList<VitalSign> getVitalSignArray() {
        return vitalSignArray;
    }

    public void setVitalSignArray(ArrayList<VitalSign> vitalSignArray) {
        this.vitalSignArray = vitalSignArray;
    }

    public VitalSign addVitals() {
        VitalSign vs = new VitalSign();
//         vs.setLowCholesterol(lowCholesterol);
//         vs.setHighCholesterol(highCholesterol);
//         vs.setBloodPressure(bloodPressure);
//         vs.setDiabetes(diabetes);
//         vs.setSmoke(smoke);
//         SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss") {};
        //vs.setDate(dateFormat.format(date));

        vitalSignArray.add(vs);
        return vs;
    }

}
