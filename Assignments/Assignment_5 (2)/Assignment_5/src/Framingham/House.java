/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

/**
 *
 * @author Malick
 */
public class House {

    private String nameHouse;
    private FamilyArray familyArray;

    public House() {
        this.familyArray = new FamilyArray();

    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public FamilyArray getFamilyArray() {
        return familyArray;
    }

    public void setFamilyArray(FamilyArray familyArray) {
        this.familyArray = familyArray;
    }

}
