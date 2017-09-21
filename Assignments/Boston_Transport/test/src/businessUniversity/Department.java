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
public class Department {
    private String name;
    private FacultyDirectory faculty_Directory;
    private StudentDirectory studentDirectory;
    private CourseDirectory courseDirectory;
    private SemesterDirectory semesterDirectory;
    private AluminiDirectory aluminiDirectory;
     private CourseOfferingDirectory courseOfferingDirectory;

    public Department() {
       this.faculty_Directory =new FacultyDirectory();
       this.studentDirectory =new StudentDirectory(); 
       this.courseDirectory=new CourseDirectory();
       this.semesterDirectory=new SemesterDirectory();
       this.aluminiDirectory=new AluminiDirectory();
        this.courseOfferingDirectory = new CourseOfferingDirectory();                
    }

     public CourseOfferingDirectory getCourseOfferingDirectory() {
        return courseOfferingDirectory;
    }

    public void setCourseOfferingDirectory(CourseOfferingDirectory courseOfferingDirectory) {
        this.courseOfferingDirectory = courseOfferingDirectory;
    }
    
    public FacultyDirectory getFaculty_Directory() {
        return faculty_Directory;
    }

    public void setFaculty_Directory(FacultyDirectory faculty_Directory) {
        this.faculty_Directory = faculty_Directory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

    public SemesterDirectory getSemesterDirectory() {
        return semesterDirectory;
    }

    public void setSemesterDirectory(SemesterDirectory semesterDirectory) {
        this.semesterDirectory = semesterDirectory;
    }

    public AluminiDirectory getAluminiDirectory() {
        return aluminiDirectory;
    }

    public void setAluminiDirectory(AluminiDirectory aluminiDirectory) {
        this.aluminiDirectory = aluminiDirectory;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
