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
public class City {

    private String nameCity;
    private CommunityArray communityArray;

    public City() {
        communityArray = new CommunityArray();

    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public CommunityArray getCommunityArray() {
        return communityArray;
    }

    public void setCommunityArray(CommunityArray communityArray) {
        this.communityArray = communityArray;
    }
}
