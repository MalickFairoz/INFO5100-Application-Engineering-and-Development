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
public class FamilyArray {

    private ArrayList<Family> familyArray;

    public FamilyArray() {
        this.familyArray = new ArrayList<Family>();

    }

    public ArrayList<Family> getFamilyArray() {
        return familyArray;
    }

    public void setFamilyArray(ArrayList<Family> familyArray) {
        this.familyArray = familyArray;
    }

    public Family addFamily() {
        Family f = new Family();
//         f.setNameFamily(nameFamily);

        familyArray.add(f);
        return f;
    }

}
