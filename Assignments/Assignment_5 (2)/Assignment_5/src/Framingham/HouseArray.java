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
public class HouseArray {

    private ArrayList<House> houseArray;

    public HouseArray() {
        this.houseArray = new ArrayList<House>();

    }

    public ArrayList<House> getHouseArray() {
        return houseArray;
    }

    public void setHouseArray(ArrayList<House> houseArray) {
        this.houseArray = houseArray;
    }

    public House addHouse() {
        House h = new House();
//         h.setNameHouse(nameHouse);

        houseArray.add(h);
        return h;
    }

}
