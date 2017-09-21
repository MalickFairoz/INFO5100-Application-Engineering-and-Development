/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

/**
 *
 * @author PeaceFull
 */
public class Student {
    private String studentName;
    private String studentId;
    private String startYear;
    private String department;
    private String numberOfPaperPublished;
    private String numberOfInternship;
    private TranscriptDirectory transcriptDirectory;
      private CourseLoadDirectory courseLoadDirectory;
      private SeatDirectory seatDirectory;   
          public Student() {
           this.courseLoadDirectory=new CourseLoadDirectory();
           this.seatDirectory= new SeatDirectory();
           this.transcriptDirectory=new TranscriptDirectory();
          
    }

    public TranscriptDirectory getTranscriptDirectory() {
        return transcriptDirectory;
    }

    public void setTranscriptDirectory(TranscriptDirectory transcriptDirectory) {
        this.transcriptDirectory = transcriptDirectory;
    }

    public SeatDirectory getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(SeatDirectory seatDirectory) {
        this.seatDirectory = seatDirectory;
    }

   

    public CourseLoadDirectory getCourseLoadDirectory() {
        return courseLoadDirectory;
    }

    public void setCourseLoadDirectory(CourseLoadDirectory courseLoadDirectory) {
        this.courseLoadDirectory = courseLoadDirectory;
    }



    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNumberOfPaperPublished() {
        return numberOfPaperPublished;
    }

    public void setNumberOfPaperPublished(String numberOfPaperPublished) {
        this.numberOfPaperPublished = numberOfPaperPublished;
    }

    public String getNumberOfInternship() {
        return numberOfInternship;
    }

    public void setNumberOfInternship(String numberOfInternship) {
        this.numberOfInternship = numberOfInternship;
    }
    
}
