/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

import java.util.ArrayList;

/**
 *
 * @author PeaceFull
 */
public class UnivesityDirectory {
    private ArrayList<University> universityList;

    public UnivesityDirectory() {
        this.universityList = new ArrayList<University>();
    }

    
    public ArrayList<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(ArrayList<University> universityList) {
        this.universityList = universityList;
    }
    
    
}
