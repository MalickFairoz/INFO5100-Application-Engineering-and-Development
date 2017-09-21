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
public class CommunityArray {

    private ArrayList<Community> communityArray;

    public CommunityArray() {
        this.communityArray = new ArrayList<Community>();

    }

    public ArrayList<Community> getCommunityArray() {
        return communityArray;
    }

    public void setCommunityArray(ArrayList<Community> communityArray) {
        this.communityArray = communityArray;
    }

    public Community addCommunity() {
        Community c = new Community();
//         c.setNameCommunity(name);
        communityArray.add(c);
        return c;
    }

}
