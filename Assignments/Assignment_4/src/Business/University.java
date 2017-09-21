/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Malick
 */
public class University {

    private String universityName;
    private CollegeArray collegeArray;


    public University() {
        collegeArray = new CollegeArray();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public CollegeArray getCollegearray() {
        return collegeArray;
    }

    public void setCollegearray(CollegeArray collegearray) {
        this.collegeArray = collegearray;
    }

}
