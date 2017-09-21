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
public class Community {

    private String nameCommunity;
    private HouseArray houseArray;

    public Community() {
        this.houseArray = new HouseArray();

    }

    public String getNameCommunity() {
        return nameCommunity;
    }

    public void setNameCommunity(String nameCommunity) {
        this.nameCommunity = nameCommunity;
    }

    public HouseArray getHouseArray() {
        return houseArray;
    }

    public void setHouseArray(HouseArray houseArray) {
        this.houseArray = houseArray;
    }

}
