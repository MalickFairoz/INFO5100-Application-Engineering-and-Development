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
public class SemesterDirectory {
    private ArrayList<Semester> semesterList;
    
   
    public SemesterDirectory() {
        this.semesterList = new ArrayList<Semester>();
    }
    
    

    public ArrayList<Semester> getSemesterList() {
        return semesterList;
    }

    public void setSemesterList(ArrayList<Semester> semesterList) {
        this.semesterList = semesterList;
    }

    public  Semester addSemester(String semesterName,String year){
    Semester semester =new Semester();
    semester.setSemester(semesterName);
    semester.setYear(year);
    semesterList.add(semester);
    return semester;
}
    
    
}
