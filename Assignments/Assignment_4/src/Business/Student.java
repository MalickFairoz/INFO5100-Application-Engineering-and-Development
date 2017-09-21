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
public class Student {
    
private String name;
private String studentID;
private String dept;
private String courseCoreSeleted;
private String courseElectiveSelected;
private String overallGPA;
private String graduationStatus;
private String employmentStatus;
private String skillset;
private String feesStatus;
private Transcript transcript;
private double courseGpa;
private String courseGrade;
private String college;
private String university;



    public String getSkillset() {
        return skillset;
    }

    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }





    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }



    public double getCourseGpa() {
        return courseGpa;
    }

    public void setCourseGpa(double courseGpa) {
        this.courseGpa = courseGpa;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }


    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    


    public String getFeesStatus() {
        return feesStatus;
    }

    public void setFeesStatus(String feesStatus) {
        this.feesStatus = feesStatus;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCourseCoreSeleted() {
        return courseCoreSeleted;
    }

    public void setCourseCoreSeleted(String courseCoreSeleted) {
        this.courseCoreSeleted = courseCoreSeleted;
    }

    public String getCourseElectiveSelected() {
        return courseElectiveSelected;
    }

    public void setCourseElectiveSelected(String courseElectiveSelected) {
        this.courseElectiveSelected = courseElectiveSelected;
    }

    public String getOverallGPA() {
        return overallGPA;
    }

    public void setOverallGPA(String overallGPA) {
        this.overallGPA = overallGPA;
    }

    public String getGraduationStatus() {
        return graduationStatus;
    }

    public void setGraduationStatus(String graduationStatus) {
        this.graduationStatus = graduationStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    
      
   public double calculateGpa(){
       double calc =0;
       int courseNum =0;
       for(CourseLoad cl: transcript.getCourseLoadArray().getCourseLoadArrayList()){
           for(Course c:cl.getCourseList()){
               calc = calc + c.getSeatAssignment().getCourseGpa();
               courseNum = courseNum +c.getSeatAssignment().getCount();
           }
       }
       return calc/courseNum;
   } 
       

}
