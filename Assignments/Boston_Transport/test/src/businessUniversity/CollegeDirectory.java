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
public class CollegeDirectory {
    
    private ArrayList<College> collegeList;

    public CollegeDirectory() {
        this.collegeList = new ArrayList<College>();
    }

    
    
    public ArrayList<College> getCollegeList() {
        return collegeList;
    }

    public void setCollegeList(ArrayList<College> collegeList) {
        this.collegeList = collegeList;
    }
    
    
    public College addCollege(String collegeName){
        College college =new College();
        college.setCollegeName(collegeName);
        collegeList.add(college);
        return college;
    }
    
}
