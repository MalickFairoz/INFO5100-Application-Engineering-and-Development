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
public class Initialization {

    public UniversityArray a;

    public static UniversityArray initialize1() {
        UniversityArray ua = new UniversityArray();
        University u = new University();
        u.setUniversityName("University1");
        College c = new College();
        u.getCollegearray().getCollegeArray().add(c);

        c.setCollegeName("college1");
 
        
        Department d = new Department();
        c.getDepartmentArray().getDepartmentArray().add(d);
        d.setDepartmentName("Dept1");
        
        
        
        d.setFacultyDirectory(initializefaculty());
        d.setStudentDirectory(initializeStudent());
        d.setCourseCatalog(initializeDepartmentCourses());
        d.setStaffRoleDirectory(initializeStaffRoleDirectory());
        ua.getUniversityArray().add(u);
        //return ua;
        
        
        University u2 = new University();
        u2.setUniversityName("University2");
        College c2 = new College();
        u2.getCollegearray().getCollegeArray().add(c2);

        c2.setCollegeName("college2");
 
        
        Department d2 = new Department();
        c2.getDepartmentArray().getDepartmentArray().add(d2);
        d2.setDepartmentName("Dept2");
        
        d2.setFacultyDirectory(initializefaculty());
        d2.setStudentDirectory(initializeStudent());
        d2.setCourseCatalog(initializeDepartmentCourses());
        d2.setStaffRoleDirectory(initializeStaffRoleDirectory());
        ua.getUniversityArray().add(u2); 
        return ua;
    }

    public static FacultyDirectory initializefaculty() {
        FacultyDirectory f = new FacultyDirectory();
        Faculty faculty = f.addFaculty();
        faculty.setFirstName("Faculty1");
        //  faculty.setLastName("Frank");
        faculty.setFacultyType("FullTime");
        faculty.setHasPhd(true);
        faculty.setMobileNo(1234567890);
        faculty.setExperience(5);
        faculty.setQualification("MS and Phd");
        faculty.setResearchAndProjects("Research in Artificial Intelleigence");

        faculty = f.addFaculty();
        faculty.setFirstName("Faculty2");
        //   faculty.setLastName("Marley");
        faculty.setFacultyType("PartTime");
        faculty.setHasPhd(false);
        faculty.setMobileNo(1243567980);
        faculty.setExperience(2);
        faculty.setQualification("MS");
        faculty.setResearchAndProjects("Undergoing PHD in Data Science");

        faculty = f.addFaculty();
        faculty.setFirstName("Faculty3");
        //   faculty.setLastName("Monroe");
        faculty.setFacultyType("FullTime");
        faculty.setHasPhd(false);
        faculty.setMobileNo(1234568880);
        faculty.setExperience(2);
        faculty.setQualification("MSc");
        faculty.setResearchAndProjects("Undergoing PHD in Statistics");

        faculty = f.addFaculty();
        faculty.setFirstName("Faculty4");
        //   faculty.setLastName("Porter");
        faculty.setFacultyType("PartTime");
        faculty.setHasPhd(true);
        faculty.setMobileNo(1243567980);
        faculty.setExperience(7);
        faculty.setQualification("MS and PHD");
        faculty.setResearchAndProjects("Research in Deep machine Learning");

        faculty = f.addFaculty();
        faculty.setFirstName("Faculty5");
        //   faculty.setLastName("Presley");
        faculty.setFacultyType("FullTime");
        faculty.setHasPhd(true);
        faculty.setMobileNo(1243457980);
        faculty.setExperience(8);
        faculty.setQualification("MS and PHD");
        faculty.setResearchAndProjects("Research in Data mining");

        return f;

    }

    /*public  static double calculatePhdPercentage(){
        FacultyDirectory f1 = new FacultyDirectory();
        int a= Collections.frequency(f1.getFacultyList(), "PHD");
        int itemCount = f1.getFacultyList().size();
        double d= (a/itemCount)*100;
        System.out.println("The percentage of Staffs with PHD is: "+ d);
        return d;
    }
    public static int calculateFacultyRatio(){
        FacultyDirectory f2 = new FacultyDirectory();
        int a= Collections.frequency(f2.getFacultyList(), "Full Time");
        System.out.println("full time count"+a);
        int b= Collections.frequency(f2.getFacultyList(), "Part Time");
        System.out.println("part time count"+b);
        System.out.println("The Full Time to Part Time Faculty ratio is"+ a+":"+b);
        return a/b;
    } */
    public static StaffRoleDirectory initializeStaffRoleDirectory() {
        StaffRoleDirectory staffRoleDirectory = new StaffRoleDirectory();
        StaffRole staffRole = staffRoleDirectory.addStaffRole();
        staffRole.setLastName("raj");
        staffRole.setFirstName("vicky");
        staffRole.setMobileNo(1234567890);
        staffRole.setJobPosition("Receptionist");
        staffRole.setQualification("BS");
        staffRole.setExperience("2 years");
        staffRole = staffRoleDirectory.addStaffRole();
        staffRole.setLastName("venu");
        staffRole.setFirstName("gopal");
        staffRole.setMobileNo(1234567891);
        staffRole.setJobPosition("Admin");
        staffRole.setQualification("BTech");
        staffRole.setExperience("3 years");
        staffRole = staffRoleDirectory.addStaffRole();
        staffRole.setLastName("thiaga");
        staffRole.setFirstName("rajan");
        staffRole.setMobileNo(1234567892);
        staffRole.setJobPosition("Dean");
        staffRole.setQualification("PhD");
        staffRole.setExperience("20 years");
        staffRole = staffRoleDirectory.addStaffRole();
        staffRole.setLastName("hari");
        staffRole.setFirstName("haran");
        staffRole.setMobileNo(1234567893);
        staffRole.setJobPosition("Admin");
        staffRole.setQualification("MS");
        staffRole.setExperience("5 years");
        staffRole = staffRoleDirectory.addStaffRole();
        staffRole.setLastName("sree");
        staffRole.setFirstName("dharan");
        staffRole.setMobileNo(1234567894);
        staffRole.setJobPosition("Admin");
        staffRole.setQualification("BA");
        staffRole.setExperience("10 years");
        return staffRoleDirectory;
    }

    public static CourseCatalog initializeDepartmentCourses() {

        CourseCatalog courseCatalog = new CourseCatalog();
        Course course = courseCatalog.addCourse();

        course.setCourseName("Course1");
        course.setCourseCode("5100");
        course.setDepartmentName("Dept1");
        course.setCreditHours(Integer.parseInt("4"));
        course.setCreditPrice(Integer.parseInt("1500"));
        course.setPrerequisiteCourse("Course11");
        course.setFollowupCourse("Course12");
        course.setCoreCourses("Course13");
        course.setElectiveCourses("Course14");
        
        
        Course course1 = courseCatalog.addCourse();
        course1.setCourseName("Course2");
        course1.setCourseCode("5120");
        course1.setDepartmentName("Dept1");
        course1.setCreditHours(Integer.parseInt("4"));
        course1.setCreditPrice(Integer.parseInt("1500"));
        course1.setPrerequisiteCourse("Course21");
        course1.setFollowupCourse("Course22");
        course1.setCoreCourses("Course23");
        course1.setElectiveCourses("Course24");
        
        
Course course2 = courseCatalog.addCourse(); 
        course2.setCourseName("Course3");
        course2.setCourseCode("5130");
        course2.setDepartmentName("Dept2");
        course2.setCreditHours(Integer.parseInt("4"));
        course2.setCreditPrice(Integer.parseInt("1500"));
        course2.setPrerequisiteCourse("Course31");
        course2.setFollowupCourse("Course32");
        course2.setCoreCourses("Course33");
        course2.setElectiveCourses("Course34");

        Course course3 = courseCatalog.addCourse();
        course3.setCourseName("Course4");
        course3.setCourseCode("5140");
        course3.setDepartmentName("Dept2");
        course3.setCreditHours(Integer.parseInt("4"));
        course3.setCreditPrice(Integer.parseInt("1500"));
        course3.setPrerequisiteCourse("Course41");
        course3.setFollowupCourse("Course42");
        course3.setCoreCourses("Course43");
        course3.setElectiveCourses("Course44");
        
        Course course4 = courseCatalog.addCourse();
        course4.setCourseName("Course5");
        course4.setCourseCode("5150");
        course4.setDepartmentName("Dept3");
        course4.setCreditHours(Integer.parseInt("4"));
        course4.setCreditPrice(Integer.parseInt("1500"));
        course4.setPrerequisiteCourse("Course51");
        course4.setFollowupCourse("Course52");
        course4.setCoreCourses("Course53");
        course4.setElectiveCourses("Course54");
        
        Course course5 = courseCatalog.addCourse();
        course5.setCourseName("Course6");
        course5.setCourseCode("5160");
        course5.setDepartmentName("Dept3");
        course5.setCreditHours(Integer.parseInt("4"));
        course5.setCreditPrice(Integer.parseInt("1500"));
        course5.setPrerequisiteCourse("Course61");
        course5.setFollowupCourse("Course62");
        course5.setCoreCourses("Course63");
        course5.setElectiveCourses("Course64");
        
        Course course6 = courseCatalog.addCourse();
        course6.setCourseName("Course7");
        course6.setCourseCode("5170");
        course6.setDepartmentName("Dept4");
        course6.setCreditHours(Integer.parseInt("4"));
        course6.setCreditPrice(Integer.parseInt("1500"));
        course6.setPrerequisiteCourse("Course61");
        course6.setFollowupCourse("Course62");
        course6.setCoreCourses("Course63");
        course6.setElectiveCourses("Course64");
        
        Course course7 = courseCatalog.addCourse();
        course7.setCourseName("Course8");
        course7.setCourseCode("5180");
        course7.setDepartmentName("Dept4");
        course7.setCreditHours(Integer.parseInt("4"));
        course7.setCreditPrice(Integer.parseInt("1500"));
        course7.setPrerequisiteCourse("Course61");
        course7.setFollowupCourse("Course62");
        course7.setCoreCourses("Course63");
        course7.setElectiveCourses("Course64");
        
        Course course8 = courseCatalog.addCourse();
        course8.setCourseName("Course9");
        course8.setCourseCode("5190");
        course8.setDepartmentName("Dept5");
        course8.setCreditHours(Integer.parseInt("4"));
        course8.setCreditPrice(Integer.parseInt("1500"));
        course8.setPrerequisiteCourse("Course61");
        course8.setFollowupCourse("Course62");
        course8.setCoreCourses("Course63");
        course8.setElectiveCourses("Course64");

//        course.setCourseName("Course10");
//        course.setCourseCode("5200");
//        course.setDepartmentName("Dept5");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course11");
//        course.setCourseCode("5210");
//        course.setDepartmentName("Dept6");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course12");
//        course.setCourseCode("5220");
//        course.setDepartmentName("Dept6");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course13");
//        course.setCourseCode("5230");
//        course.setDepartmentName("Dept7");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course14");
//        course.setCourseCode("5240");
//        course.setDepartmentName("Dept7");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course15");
//        course.setCourseCode("5250");
//        course.setDepartmentName("Dept8");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course16");
//        course.setCourseCode("5260");
//        course.setDepartmentName("Dept8");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course17");
//        course.setCourseCode("5270");
//        course.setDepartmentName("Dept9");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course18");
//        course.setCourseCode("5280");
//        course.setDepartmentName("Dept9");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course19");
//        course.setCourseCode("5290");
//        course.setDepartmentName("Dept10");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course20");
//        course.setCourseCode("5300");
//        course.setDepartmentName("Dept10");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course21");
//        course.setCourseCode("5310");
//        course.setDepartmentName("Dept11");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course22");
//        course.setCourseCode("5320");
//        course.setDepartmentName("Dept11");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course23");
//        course.setCourseCode("5330");
//        course.setDepartmentName("Dept12");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");
//
//        course.setCourseName("Course24");
//        course.setCourseCode("5340");
//        course.setDepartmentName("Dept12");
//        course.setCreditHours(Integer.parseInt("4"));
//        course.setCreditPrice(Integer.parseInt("1500"));
//        course.setPrerequisiteCourse("Course61");
//        course.setFollowupCourse("Course62");
//        course.setCoreCourses("Course63");
//        course.setElectiveCourses("Course64");

        return courseCatalog;
    }

    public static StudentDirectory initializeStudent() {
        StudentDirectory studentDeptDirectory = new StudentDirectory();


        Student student = studentDeptDirectory.addStudent();
        // Student student=new Student();
        student.setName("Student1");
        student.setStudentID("111");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("Course1");
        student.setCourseElectiveSelected("Course2");
        // student.setOverallGPA("4");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setSkillset("skill1");
        //  student.setTranscript(" ");
        student.setFeesStatus("Paid");
        student.setCourseGrade("B+");
        student.setCourseGpa(Double.parseDouble("3.3"));
        student.setCollege("College1");
        student.setUniversity("University1");
        //   Transcript transcript=new Transcript();
        //   student.setTranscript(transcript);
        //return student;

        student = studentDeptDirectory.addStudent();
        student.setName("Student2");
        student.setStudentID("112");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("Course1");
        student.setCourseElectiveSelected("Course2");
        student.setSkillset("skill1");
        //student.setOverallGPA("2.5");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4.0"));
        student.setCollege("College1");
        student.setUniversity("University1");

        student = studentDeptDirectory.addStudent();
        student.setName("Student3");
        student.setStudentID("113");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("Course1");
        student.setCourseElectiveSelected("Course2");
        //student.setOverallGPA("3.7");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setSkillset("skill1");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4"));
        student.setCollege("College1");
        student.setUniversity("University1");

        student = studentDeptDirectory.addStudent();
        student.setName("Student4");
        student.setStudentID("114");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("Course1");
        student.setCourseElectiveSelected("Course2");
        //student.setOverallGPA("3.9");
        student.setFeesStatus("Paid");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setSkillset("skill2");
        student.setCourseGrade("B");
        student.setCourseGpa(Double.parseDouble("3"));
        student.setCollege("College1");
        student.setUniversity("University1");

        student = studentDeptDirectory.addStudent();
        student.setName("Student5");
        student.setStudentID("115");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("Course1");
        student.setCourseElectiveSelected("Course2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setSkillset("skill2");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("College1");
        student.setUniversity("University1");

//**********************************************************************************        
        student = studentDeptDirectory.addStudent();
        student.setName("Student6");
        student.setStudentID("121");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student7");
        student.setStudentID("122");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student8");
        student.setStudentID("123");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student9");
        student.setStudentID("124");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student10");
        student.setStudentID("125");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduauted");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student11");
        student.setStudentID("131");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student12");
        student.setStudentID("132");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student13");
        student.setStudentID("133");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student14");
        student.setStudentID("134");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student15");
        student.setStudentID("135");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student16");
        student.setStudentID("136");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        // student.setOverallGPA("4");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        //  student.setTranscript(" ");
        student.setFeesStatus("Paid");
        student.setCourseGrade("B+");
        student.setCourseGpa(Double.parseDouble("3.3"));
        student.setCollege("COS");
        student.setUniversity("NEU");
        //   Transcript transcript=new Transcript();
        //   student.setTranscript(transcript);
        //return student;

        student = studentDeptDirectory.addStudent();
        student.setName("Student17");
        student.setStudentID("137");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("2.5");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4.0"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student18");
        student.setStudentID("138");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.7");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student19");
        student.setStudentID("139");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.9");
        student.setFeesStatus("Paid");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("B");
        student.setCourseGpa(Double.parseDouble("3"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student20");
        student.setStudentID("140");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student21");
        student.setStudentID("141");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student22");
        student.setStudentID("142");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student23");
        student.setStudentID("143");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student24");
        student.setStudentID("124");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student25");
        student.setStudentID("125");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student26");
        student.setStudentID("131");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student27");
        student.setStudentID("132");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student28");
        student.setStudentID("133");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student29");
        student.setStudentID("134");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student30");
        student.setStudentID("135");
        student.setDept("Dept");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("NEU");

        student = studentDeptDirectory.addStudent();
        // Student student=new Student();
        student.setName("Student31");
        student.setStudentID("311");
        student.setDept("IS");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        // student.setOverallGPA("4");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        //  student.setTranscript(" ");
        student.setFeesStatus("Paid");
        student.setCourseGrade("B+");
        student.setCourseGpa(Double.parseDouble("3.3"));
        student.setCollege("COE");
        student.setUniversity("BU");
        //   Transcript transcript=new Transcript();
        //   student.setTranscript(transcript);
        //return student;

        student = studentDeptDirectory.addStudent();
        student.setName("Student32");
        student.setStudentID("312");
        student.setDept("IS");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("2.5");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4.0"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student33");
        student.setStudentID("313");
        student.setDept("IS");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.7");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student34");
        student.setStudentID("314");
        student.setDept("IS");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.9");
        student.setFeesStatus("Paid");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("B");
        student.setCourseGpa(Double.parseDouble("3"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student35");
        student.setStudentID("315");
        student.setDept("IS");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student36");
        student.setStudentID("316");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student37");
        student.setStudentID("317");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student38");
        student.setStudentID("338");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student39");
        student.setStudentID("339");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student40");
        student.setStudentID("340");
        student.setDept("EM");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student41");
        student.setStudentID("341");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student42");
        student.setStudentID("342");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student43");
        student.setStudentID("343");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student44");
        student.setStudentID("344");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student45");
        student.setStudentID("345");
        student.setDept("TSM");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COE");
        student.setUniversity("BU");

        student.setName("Student46");
        student.setStudentID("346");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        // student.setOverallGPA("4");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        //  student.setTranscript(" ");
        student.setFeesStatus("Paid");
        student.setCourseGrade("B+");
        student.setCourseGpa(Double.parseDouble("3.3"));
        student.setCollege("COS");
        student.setUniversity("BU");
        //   Transcript transcript=new Transcript();
        //   student.setTranscript(transcript);
        //return student;

        student = studentDeptDirectory.addStudent();
        student.setName("Student47");
        student.setStudentID("347");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("2.5");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4.0"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student48");
        student.setStudentID("348");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.7");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setFeesStatus("Paid");
        student.setCourseGrade("A");
        student.setCourseGpa(Double.parseDouble("4"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student49");
        student.setStudentID("349");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.9");
        student.setFeesStatus("Paid");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("B");
        student.setCourseGpa(Double.parseDouble("3"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student50");
        student.setStudentID("350");
        student.setDept("Dept1");
        student.setCourseCoreSeleted("AED");
        student.setCourseElectiveSelected("DBMS");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student51");
        student.setStudentID("351");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student52");
        student.setStudentID("352");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student53");
        student.setStudentID("353");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student54");
        student.setStudentID("354");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student55");
        student.setStudentID("355");
        student.setDept("Dept2");
        student.setCourseCoreSeleted("EM1");
        student.setCourseElectiveSelected("EM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student56");
        student.setStudentID("356");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Employed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student57");
        student.setStudentID("357");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student58");
        student.setStudentID("358");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student59");
        student.setStudentID("359");
        student.setDept("Dept3");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("InProgress");
        student.setEmploymentStatus("None");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");

        student = studentDeptDirectory.addStudent();
        student.setName("Student60");
        student.setStudentID("360");
        student.setDept("Dept");
        student.setCourseCoreSeleted("TSM1");
        student.setCourseElectiveSelected("TSM2");
        //student.setOverallGPA("3.6");
        student.setGraduationStatus("Graduated");
        student.setEmploymentStatus("Eamployed");
        student.setCourseGrade("A-");
        student.setCourseGpa(Double.parseDouble("3.7"));
        student.setCollege("COS");
        student.setUniversity("BU");
        return studentDeptDirectory;
    }
}
