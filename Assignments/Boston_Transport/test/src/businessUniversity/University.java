/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

/**
 *
 * @author Aswat
 */
public class University {
    private String universityName;
    private CollegeDirectory collegeDirectory;

    public University() {

        collegeDirectory = new CollegeDirectory();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public CollegeDirectory getCollegeDirectory() {
        return collegeDirectory;
    }

}
