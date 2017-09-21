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

public class Faculty extends Person{
    private String facultyType;
    private boolean hasPhd;
    private int experience;
    private String qualification;
    private String researchAndProjects;
    private Ratio ratio;

    public Ratio getRatio() {
        return ratio;
    }

    public void setRatio(Ratio ratio) {
        this.ratio = ratio;
    }

    public String getFacultyType() {
        return facultyType;
    }

    public void setFacultyType(String facultyType) {
        this.facultyType = facultyType;
    }

    public boolean isHasPhd() {
        return hasPhd;
    }

    public void setHasPhd(boolean hasPhd) {
        this.hasPhd = hasPhd;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getResearchAndProjects() {
        return researchAndProjects;
    }

    public void setResearchAndProjects(String researchAndProjects) {
        this.researchAndProjects = researchAndProjects;
    }
    
  
    
    }

   
