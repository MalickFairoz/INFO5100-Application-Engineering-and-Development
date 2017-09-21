    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

import businessUniversity.Department;
import businessUniversity.Faculty;
import businessUniversity.FacultyDirectory;
import businessUniversity.Intialization1;

/**
 *
 * @author PeaceFull
 */
public class Intialization1 {
  
    public static DepartmentDirectory departmentDirectory;
    public static FacultyDirectory facultyDirectory;
    
      public static University initializeDepartmentDirectory() {
          
         University university=new University();
         
         university.setUniversityName("Boston University");
         College college1=university.getCollegeDirectory().addCollege("College of Engineering");
         College college2=university.getCollegeDirectory().addCollege("College of Management");
         College college3=university.getCollegeDirectory().addCollege("College of Arts");
         
      Department department1 = university.getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory(). addDepartment("IS");
      Department department2 = college1.getDepartmentDirectory().addDepartment("EM");
      Department department3 = college1.getDepartmentDirectory().addDepartment("CSE");
               

  
  
      Department department4 = college2.getDepartmentDirectory().addDepartment("Finance");
      Department department5 = college2.getDepartmentDirectory().addDepartment("Marketing");
      Department department6 = college2.getDepartmentDirectory().addDepartment("Human Resource");
      
      
      Department department7 = college3.getDepartmentDirectory().addDepartment("Physics");
      Department department8 = college3.getDepartmentDirectory().addDepartment("Mathematics");
      Department department9 = college3.getDepartmentDirectory().addDepartment("Chemistry");
        
     Course course1 =university.getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getCourseDirectory().addCourse("AED","C234","4","1000");
     
     Course course2 =department1.getCourseDirectory().addCourse("DBMS","C235","4","1000");
     Course course3 =department1.getCourseDirectory().addCourse("ADBMS","C236","4","1000");
     Course course4 =department1.getCourseDirectory().addCourse("DW&BI","C237","4","1000");
     
     Course course5 =department2.getCourseDirectory().addCourse("General Management","E241","4","1000");
     Course course6 =department2.getCourseDirectory().addCourse("Finance in Mgn","E242","4","1000");
     Course course7 =department2.getCourseDirectory().addCourse("Marketing","E243","4","1000");
     Course course8 =department2.getCourseDirectory().addCourse("HR","E244","4","1000");
     Course course67 =department2.getCourseDirectory().addCourse("DBMS","E235","4","1000");
     
     Course course9 =department3.getCourseDirectory().addCourse("Operating System","CS100","4","1000");
     Course course10 =department3.getCourseDirectory().addCourse("Web Technology","CS101","4","1000");
     Course course11=department3.getCourseDirectory().addCourse("DBMS","CS102","4","1000");
     Course course12=department3.getCourseDirectory().addCourse("Architechture","CS103","4","1000");
     Course course13=department3.getCourseDirectory().addCourse("Big Data","CS105","4","1000");
     
     Course course20 =department4.getCourseDirectory().addCourse("Finance Management","F22","4","1200");
     Course course21=department4.getCourseDirectory().addCourse("Finance in Banking","F23","4","1200");
     Course course22=department4.getCourseDirectory().addCourse("Finance in Marking","F24","4","1200");
     Course course23 =department4.getCourseDirectory().addCourse("DBMS","F237","4","1200");
      Course course24 =department4.getCourseDirectory().addCourse("Co-op","F238","4","1200");
 
      
     Course course25 =department5.getCourseDirectory().addCourse("Marketing Management","M241","4","1100");
     Course course26 =department5.getCourseDirectory().addCourse("Marketing Internet","M242","4","1100");
     Course course27 =department5.getCourseDirectory().addCourse("Human Resourse","M243","4","1100");
     Course course28 =department5.getCourseDirectory().addCourse("Marketing in IT","M244","4","1100");
     Course course29 =department5.getCourseDirectory().addCourse("IT Management","M235","4","1100");
      
      
     Course course30 =department6.getCourseDirectory().addCourse("IT Management","HR100","4","1100");
     Course course31 =department6.getCourseDirectory().addCourse("Human Resourse Management","HR101","4","1100");
     Course course32=department6.getCourseDirectory().addCourse("Organizational Change","HR102","4","1100");
     Course course33=department6.getCourseDirectory().addCourse("Finance Overview","HR103","4","1100");
     Course course34=department6.getCourseDirectory().addCourse("DBMS","HR105","4","1100");
     
     
     Course course35 =department7.getCourseDirectory().addCourse("General Physics","P22","4","900");
     Course course36=department7.getCourseDirectory().addCourse("Atmosphere","P23","4","900");
     Course course37=department7.getCourseDirectory().addCourse("Gravity","P24","4","900");
     Course course38 =department7.getCourseDirectory().addCourse("Linear Motion","P237","4","900");
     Course course39 =department7.getCourseDirectory().addCourse("Momentum","P238","4","900");
 
     Course course40 =department8.getCourseDirectory().addCourse("Algebra","ME241","4","1000");
     Course course41 =department8.getCourseDirectory().addCourse("Geometry","ME242","4","1000");
     Course course42 =department8.getCourseDirectory().addCourse("Probablity","ME243","4","1000");
     Course course43 =department8.getCourseDirectory().addCourse("Arithmetic","ME244","4","1000");
     Course course44 =department8.getCourseDirectory().addCourse("Graph","ME235","4","1000");
 
     Course course45 =department9.getCourseDirectory().addCourse("Molecular Chemistry","CH100","4","1100");
     Course course46 =department9.getCourseDirectory().addCourse("Organic Chemistry","CH101","4","1100");
     Course course47=department9.getCourseDirectory().addCourse("Non-Organic Chemistry","CH102","4","1100");
     Course course48=department9.getCourseDirectory().addCourse("Physical Chemistry","CH103","4","1100");
     Course course49=department9.getCourseDirectory().addCourse("Chemical Engineering","CH105","4","1100");
          
     
      Semester semester1 =university.getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getSemesterDirectory().addSemester("Fall", "2016");
        
      CourseOffering courseOffering1= university.getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getCourseOfferingDirectory().addCourseOffering(course1, semester1);     
        
        
        
      Semester semester2 =department1.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester3 =department1.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester4 =department1.getSemesterDirectory().addSemester("Fall", "2017");
      
      Semester semester5 =department2.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester6 =department2.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester7 =department2.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester8 =department2.getSemesterDirectory().addSemester("Fall", "2017");
      
      Semester semester9=department3.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester10 =department3.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester11=department3.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester12 =department3.getSemesterDirectory().addSemester("Fall", "2017");
 
         Semester semester20 =department4.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester21 =department4.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester22 =department4.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester23 =department4.getSemesterDirectory().addSemester("Fall", "2017");
      
      Semester semester24 =department5.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester25 =department5.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester26 =department5.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester27 =department5.getSemesterDirectory().addSemester("Fall", "2017");
      
      Semester semester28=department6.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester29 =department6.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester30=department6.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester31 =department6.getSemesterDirectory().addSemester("Fall", "2017");
      
      Semester semester32=department7.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester33 =department7.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester34 =department7.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester35 =department7.getSemesterDirectory().addSemester("Fall", "2017");
     
      Semester semester36 =department8.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester37 =department8.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester38 =department8.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester39 =department8.getSemesterDirectory().addSemester("Fall", "2017"); 
     
      
      Semester semester40=department9.getSemesterDirectory().addSemester("Fall", "2016");
      Semester semester41 =department9.getSemesterDirectory().addSemester("Spring", "2017");
      Semester semester42=department9.getSemesterDirectory().addSemester("Summer", "2017");
      Semester semester43 =department9.getSemesterDirectory().addSemester("Fall", "2017");
      
     Faculty faculty1 =department1.getFaculty_Directory().addFaculty1("Deiva","Kumaran","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty2 =department1.getFaculty_Directory().addFaculty1("Akil","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty3 =department1.getFaculty_Directory().addFaculty1("Aswath","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty4 =department1.getFaculty_Directory().addFaculty1("Venketesh","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty5 =department1.getFaculty_Directory().addFaculty1("Joseph","Rajendiran","Professor","Full-Time","Professor","Staff");
   
        
     Faculty faculty6 =department2.getFaculty_Directory().addFaculty1("Raj","Kumaran","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty7 =department2.getFaculty_Directory().addFaculty1("Vignesh","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty8 =department2.getFaculty_Directory().addFaculty1("Prasi","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty9 =department2.getFaculty_Directory().addFaculty1("Karthik ","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty10 =department2.getFaculty_Directory().addFaculty1("Ganesh","Rajendiran","Professor","Full-Time","Professor","Staff");
   
        
     Faculty faculty11 =department3.getFaculty_Directory().addFaculty1("Manoharan","V","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty12 =department3.getFaculty_Directory().addFaculty1("Sevaraj","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty13 =department3.getFaculty_Directory().addFaculty1("Sugumaran","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty14 =department3.getFaculty_Directory().addFaculty1("Sivakumar ","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty15 =department3.getFaculty_Directory().addFaculty1("Thirumaran","Rajendiran","Professor","Full-Time","Professor","Teaching Faculty");
   
     
     Faculty faculty16 =department4.getFaculty_Directory().addFaculty1("Kyal","Kumaran","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty17 =department4.getFaculty_Directory().addFaculty1("ABhat","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty18 =department4.getFaculty_Directory().addFaculty1("Aswin","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty19=department4.getFaculty_Directory().addFaculty1("Virat","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty20 =department4.getFaculty_Directory().addFaculty1("Joy","Rajendiran","Professor","Full-Time","Professor","Staff");
   
        
     Faculty faculty21 =department5.getFaculty_Directory().addFaculty1("Hoyt","Kumaran","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty22 =department5.getFaculty_Directory().addFaculty1("Maty","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty23 =department5.getFaculty_Directory().addFaculty1("Farat","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty24 =department5.getFaculty_Directory().addFaculty1("Mcrath ","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty25 =department5.getFaculty_Directory().addFaculty1("Preneth","Rajendiran","Professor","Full-Time","Professor","Staff");
   
        
     Faculty faculty26 =department6.getFaculty_Directory().addFaculty1("Vishal","V","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty27 =department6.getFaculty_Directory().addFaculty1("Vijay","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty28 =department6.getFaculty_Directory().addFaculty1("Kumar","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty29 =department6.getFaculty_Directory().addFaculty1("Lingu","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty30 =department6.getFaculty_Directory().addFaculty1("Simbu","Rajendiran","Professor","Full-Time","Professor","Teaching Faculty");
   
     Faculty faculty31 =department7.getFaculty_Directory().addFaculty1("Vikas","Kumaran","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty32 =department7.getFaculty_Directory().addFaculty1("Ptech","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty33 =department7.getFaculty_Directory().addFaculty1("Tefal","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty34=department7.getFaculty_Directory().addFaculty1("Manoer","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty35 =department7.getFaculty_Directory().addFaculty1("Paul","Rajendiran","Professor","Full-Time","Professor","Staff");
   
        
     Faculty faculty36 =department8.getFaculty_Directory().addFaculty1("John","Kumaran","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty37 =department8.getFaculty_Directory().addFaculty1("Nithiya","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty38 =department8.getFaculty_Directory().addFaculty1("Raky","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty39 =department8.getFaculty_Directory().addFaculty1("Taragesh ","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty40 =department8.getFaculty_Directory().addFaculty1("Prasanna","Rajendiran","Professor","Full-Time","Professor","Staff");
   
        
     Faculty faculty41 =department9.getFaculty_Directory().addFaculty1("GuruPrasath","V","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty42 =department9.getFaculty_Directory().addFaculty1("Shandeep","Rajendiran","Professor","Full-Time","Professor","Staff");
     Faculty faculty43 =department9.getFaculty_Directory().addFaculty1("Danush","Raj","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty44 =department9.getFaculty_Directory().addFaculty1("Atharva","Shankar","Professor","Full-Time","Professor","Teaching Faculty");
     Faculty faculty45 =department9.getFaculty_Directory().addFaculty1("Satesh","Rajendiran","Professor","Full-Time","Professor","Teaching Faculty");
   
    
     
     
     Student student1 =department1.getStudentDirectory().addStudent("Rakesh", "1234", "2014", "IS","3","1");
     Student student2 =department1.getStudentDirectory().addStudent("Ramesh", "1235", "2014", "IS","4","1");
     Student student3 =department1.getStudentDirectory().addStudent("Suresh", "1236", "2014", "IS","1","2");
     Student student4 =department1.getStudentDirectory().addStudent("Frank", "1290", "2015", "IS","3","1");
     Student student9 =department1.getStudentDirectory().addStudent("Pradeep", "1200", "2014", "IS","1","1");
    
     Student student5 =department2.getStudentDirectory().addStudent("Mahesh", "1237", "2014", "EM","2","1");
     Student student6 =department2.getStudentDirectory().addStudent("Yokesh", "1238", "2014", "EM","1","1");
     Student student7 =department2.getStudentDirectory().addStudent("Pranesh", "1239", "2014", "EM","1","0");
     Student student8 =department2.getStudentDirectory().addStudent("Prathik", "1299", "2014", "EM","2","1");
     Student student10 =department2.getStudentDirectory().addStudent("Prasanth", "1876", "2014", "EM","3","1");
    
     Student student11 =department3.getStudentDirectory().addStudent("Priyal", "2100", "2014", "CSE","2","2");
     Student student12 =department3.getStudentDirectory().addStudent("Madev", "2101", "2014", "CSE","1","1");
     Student student13 =department3.getStudentDirectory().addStudent("Eswar", "2102", "2014", "CSE","2","1");
     Student student14 =department3.getStudentDirectory().addStudent("Lohesh", "2103", "2014", "CSE","2","2");
     Student student15 =department3.getStudentDirectory().addStudent("Ajay", "2004", "2104", "CSE","3","2");
  
     
     Student student16 =department4.getStudentDirectory().addStudent("Utakash", "4200", "2014", "Finance","2","0");
     Student student17 =department4.getStudentDirectory().addStudent("Prutick", "4201", "2014", "Finance","2","1");
     Student student18 =department4.getStudentDirectory().addStudent("Siyack", "4203", "2014", "Finance","2","1");
     Student student19=department4.getStudentDirectory().addStudent("Catick", "4204", "2015", "Finance","2","1");
     Student student20 =department4.getStudentDirectory().addStudent("Orlick", "4205", "2014", "Finance","3","0");
     
     Student student21 =department5.getStudentDirectory().addStudent("Tennu", "3100", "2014", "Marketing","2","1");
     Student student22 =department5.getStudentDirectory().addStudent("Meenu", "3102", "2014", "Marketing","2","1");
     Student student23 =department5.getStudentDirectory().addStudent("Mano", "3103", "2014", "Marketing","0","2");
     Student student24=department5.getStudentDirectory().addStudent("Vignesh", "3104", "2014", "Marketing","2","0");
     
     Student student25 =department6.getStudentDirectory().addStudent("Priya", "5001", "2014", "Human Resource","2","232");
     Student student26 =department6.getStudentDirectory().addStudent("Dinesh", "5002", "2014", "Human Resource","1","1");
     Student student27 =department6.getStudentDirectory().addStudent("Santhosh", "5003", "2014", "Human Resource","1","1");
     Student student28 =department6.getStudentDirectory().addStudent("Litesh", "5004", "2014", "Human Resource","0","1");
     Student student29 =department6.getStudentDirectory().addStudent("Praquet", "5005", "2104", "Human Resource","0","1");
  
     
     Student student30 =department7.getStudentDirectory().addStudent("Upersh", "4600", "2014", "Physics","2","1");
     Student student31 =department7.getStudentDirectory().addStudent("Preeti", "4601", "2014", "Physics","1","1");
     Student student32 =department7.getStudentDirectory().addStudent("Deenu", "4603", "2014", "Physics","1","1");
     Student student33=department7.getStudentDirectory().addStudent("Rahul", "4604", "2015", "Physics","0","1");
     Student student34 =department7.getStudentDirectory().addStudent("Yamesh", "4605", "2014", "Physics","0","1");
    
    
       
     Student student35 =department8.getStudentDirectory().addStudent("Tinku", "3600", "2014", "Mathematics","1","2");
     Student student36 =department8.getStudentDirectory().addStudent("Ketam", "3602", "2014", "Mathematics","1","1");
     Student student37 =department8.getStudentDirectory().addStudent("Deekshit", "3603", "2014", "Mathematics","0","1");
     Student student38=department8.getStudentDirectory().addStudent("Teja", "3604", "2014", "Mathematics","0","2");
     
     Student student39 =department9.getStudentDirectory().addStudent("Sintel", "5101", "2014", "Chemistry","3","0");
     Student student40 =department9.getStudentDirectory().addStudent("Loteu", "5102", "2014", "Chemistry","2","1");
     Student student41 =department9.getStudentDirectory().addStudent("Mtehu", "5103", "2014", "Chemistry","1","1");
     Student student42 =department9.getStudentDirectory().addStudent("Breniya", "5104", "2014", "Chemistry","2","1");
     Student student43 =department9.getStudentDirectory().addStudent("Factue", "5105", "2104", "Chemistry","1","1");
     
     Alumini alumini25 =department7.getAluminiDirectory().addAlumini("4600", "NASA", "Working","140000", "2016");
     Alumini alumini26 =department7.getAluminiDirectory().addAlumini("4601", "British Airways", "Working","120000", "2016");
     Alumini alumini27 =department7.getAluminiDirectory().addAlumini("4603", "", "Not-Working","", "2016");
     Alumini alumini28 =department7.getAluminiDirectory().addAlumini("4604", "Indian Airways", "Working","90000", "2016");
     
     Alumini alumini29 =department8.getAluminiDirectory().addAlumini("3600", "Oracle", "Working","92000", "2016");
     Alumini alumini30 =department8.getAluminiDirectory().addAlumini("3602", "MIT", "Working","130000", "2016");
     Alumini alumini31 =department8.getAluminiDirectory().addAlumini("3603", "", "Not-Working","", "2016");
     Alumini alumini32 =department8.getAluminiDirectory().addAlumini("3604", "", "Not-Working","", "2016");
     Alumini alumini1 =department1.getAluminiDirectory().addAlumini("1234", "IBM", "Working","110000", "2016");
     Alumini alumini2 =department1.getAluminiDirectory().addAlumini("1236", "ORACLE", "Working","150000", "2016");
     Alumini alumini3 =department1.getAluminiDirectory().addAlumini("1235", "", "Not-Working","", "2016");
     Alumini alumini4 =department1.getAluminiDirectory().addAlumini("1200", "Google", "Working","140000", "2016");
    
     Alumini alumini5 =department2.getAluminiDirectory().addAlumini("1238", "NIKE", "Working","93000", "2016");
     Alumini alumini6 =department2.getAluminiDirectory().addAlumini("1239", "DISNEY", "Working","110000", "2016");
     Alumini alumini7 =department2.getAluminiDirectory().addAlumini("1237", "", "Not-Working","", "2016");
     Alumini alumini8 =department2.getAluminiDirectory().addAlumini("1876", "", "Not-Working","", "2016");
     
     Alumini alumini9 =department3.getAluminiDirectory().addAlumini("2100", "Facebook", "Working","110000", "2016");
     Alumini alumini10 =department3.getAluminiDirectory().addAlumini("2101", "Yahoo", "Working","150000", "2016");
     Alumini alumini11=department3.getAluminiDirectory().addAlumini("2102", "Piki", "Working","80000", "2016");
     Alumini alumini12=department3.getAluminiDirectory().addAlumini("2104", "Apple", "Working","150000", "2016");
     
       Alumini alumini33=department9.getAluminiDirectory().addAlumini("5101", "T-Labs", "Working","85000", "2016");
     Alumini alumini34 =department9.getAluminiDirectory().addAlumini("5102", "Q-Labs", "Working","75000", "2016");
     Alumini alumini35=department9.getAluminiDirectory().addAlumini("5103", "S-Labs", "Working","110000", "2016");
     Alumini alumini36=department9.getAluminiDirectory().addAlumini("5104", "K-Labs", "Working","160000", "2016");
     
     Alumini alumini13 =department4.getAluminiDirectory().addAlumini("4200", "Bank Of America", "Working","96000", "2016");
     Alumini alumini14 =department4.getAluminiDirectory().addAlumini("4201", "Santander", "Working","110000", "2016");
     Alumini alumini15 =department4.getAluminiDirectory().addAlumini("4202", "", "Not-Working","", "2016");
     Alumini alumini16 =department4.getAluminiDirectory().addAlumini("4203", "Bank of New York", "Working","120000", "2016");
    
       
     
     Alumini alumini17 =department5.getAluminiDirectory().addAlumini("3100", "Addidas", "Working","95000", "2016");
     Alumini alumini18 =department5.getAluminiDirectory().addAlumini("3102", "Ray-Bon", "Working","110000", "2016");
     Alumini alumini19 =department5.getAluminiDirectory().addAlumini("3103", "", "Not-Working","", "2016");
     Alumini alumini20 =department5.getAluminiDirectory().addAlumini("3104", "", "Not-Working","", "2016");
     Alumini alumini101 =department5.getAluminiDirectory().addAlumini("3105", "", "Working","", "2016");
     
   
     
     Alumini alumini21=department6.getAluminiDirectory().addAlumini("5001", "Amazon", "Working","110000", "2016");
     Alumini alumini22 =department6.getAluminiDirectory().addAlumini("5002", "ARM", "Working","120000", "2016");
     Alumini alumini23=department6.getAluminiDirectory().addAlumini("5003", "Intel", "Working","150000", "2016");
     Alumini alumini24=department6.getAluminiDirectory().addAlumini("5004", "Verizon", "Working","160000", "2016");
     Alumini alumini100=department6.getAluminiDirectory().addAlumini("5005", "Kelly", "Working","120000", "2016");
    
     
      ClassRoom classRoom1 =course1.getClassroomDirectory().addClassRoomBuilding("Shillman Hall", "250", "2");
     
      ClassRoom classroom38 =course38.getClassroomDirectory().addClassRoomBuilding("Shillman Hall", "255", "2");
      ClassRoom classroom39 =course39.getClassroomDirectory().addClassRoomBuilding("Rider Hall", "319", "3");
      ClassRoom classroom40 =course40.getClassroomDirectory().addClassRoomBuilding("West Village", "455", "4");
      ClassRoom classroom41 =course41.getClassroomDirectory().addClassRoomBuilding("Ell Hall", "311", "3");
      ClassRoom classroom42 =course42.getClassroomDirectory().addClassRoomBuilding("NEU Main Building", "16", "1");
      ClassRoom classroom43 =course43.getClassroomDirectory().addClassRoomBuilding("Snell Library", "376", "3");
      ClassRoom classroom44 =course44.getClassroomDirectory().addClassRoomBuilding("Columbus Hall", "131", "1");
      ClassRoom classroom45 =course45.getClassroomDirectory().addClassRoomBuilding("Abraham Hall", "476", "4");
     
  
      
      CourseOffering courseOffering2= department1.getCourseOfferingDirectory().addCourseOffering(course2, semester1);
      CourseOffering courseOffering3= department1.getCourseOfferingDirectory().addCourseOffering(course3, semester1);
      CourseOffering courseOffering4= department1.getCourseOfferingDirectory().addCourseOffering(course4, semester1);
      CourseOffering courseOffering5= department1.getCourseOfferingDirectory().addCourseOffering(course1, semester2);
      CourseOffering courseOffering6= department1.getCourseOfferingDirectory().addCourseOffering(course2, semester2);
      CourseOffering courseOffering7= department1.getCourseOfferingDirectory().addCourseOffering(course3, semester2);
      CourseOffering courseOffering8= department1.getCourseOfferingDirectory().addCourseOffering(course4, semester2);

      
      CourseOffering courseOffering9= department1.getCourseOfferingDirectory().addCourseOffering(course1, semester3);
      CourseOffering courseOffering10= department1.getCourseOfferingDirectory().addCourseOffering(course2, semester3);
      CourseOffering courseOffering11= department1.getCourseOfferingDirectory().addCourseOffering(course3, semester3);
      CourseOffering courseOffering12= department1.getCourseOfferingDirectory().addCourseOffering(course4, semester3);
      CourseOffering courseOffering13= department1.getCourseOfferingDirectory().addCourseOffering(course1, semester4);
      CourseOffering courseOffering14= department1.getCourseOfferingDirectory().addCourseOffering(course2, semester4);
      CourseOffering courseOffering15= department1.getCourseOfferingDirectory().addCourseOffering(course3, semester4);
      CourseOffering courseOffering16= department1.getCourseOfferingDirectory().addCourseOffering(course4, semester4);

      CourseOffering courseOffering17= department2.getCourseOfferingDirectory().addCourseOffering(course5, semester5);
      CourseOffering courseOffering18= department2.getCourseOfferingDirectory().addCourseOffering(course6, semester5);
      CourseOffering courseOffering19= department2.getCourseOfferingDirectory().addCourseOffering(course7, semester5);
      CourseOffering courseOffering20= department2.getCourseOfferingDirectory().addCourseOffering(course8, semester5);
      CourseOffering courseOffering21= department2.getCourseOfferingDirectory().addCourseOffering(course5, semester6);
      CourseOffering courseOffering22= department2.getCourseOfferingDirectory().addCourseOffering(course6, semester6);
      CourseOffering courseOffering23= department2.getCourseOfferingDirectory().addCourseOffering(course7, semester6);
      CourseOffering courseOffering24= department2.getCourseOfferingDirectory().addCourseOffering(course8, semester6);
      
      CourseOffering courseOffering25= department2.getCourseOfferingDirectory().addCourseOffering(course5, semester7);
      CourseOffering courseOffering26= department2.getCourseOfferingDirectory().addCourseOffering(course6, semester7);
      CourseOffering courseOffering27= department2.getCourseOfferingDirectory().addCourseOffering(course7, semester7);
      CourseOffering courseOffering28= department2.getCourseOfferingDirectory().addCourseOffering(course8, semester7);
      CourseOffering courseOffering29= department2.getCourseOfferingDirectory().addCourseOffering(course5, semester8);
    
      CourseOffering courseOffering30= department2.getCourseOfferingDirectory().addCourseOffering(course6, semester8);
      CourseOffering courseOffering31= department2.getCourseOfferingDirectory().addCourseOffering(course7, semester8);
      CourseOffering courseOffering32= department2.getCourseOfferingDirectory().addCourseOffering(course8, semester8);
      CourseOffering courseOffering33= department3.getCourseOfferingDirectory().addCourseOffering(course9, semester9);
      CourseOffering courseOffering34= department3.getCourseOfferingDirectory().addCourseOffering(course10, semester9);
      CourseOffering courseOffering35= department3.getCourseOfferingDirectory().addCourseOffering(course11, semester9);
      CourseOffering courseOffering36= department3.getCourseOfferingDirectory().addCourseOffering(course12, semester9);
      CourseOffering courseOffering37= department3.getCourseOfferingDirectory().addCourseOffering(course13, semester9);
      
      CourseOffering courseOffering38= department3.getCourseOfferingDirectory().addCourseOffering(course9, semester10);
      CourseOffering courseOffering39= department3.getCourseOfferingDirectory().addCourseOffering(course10, semester10);
      CourseOffering courseOffering40= department3.getCourseOfferingDirectory().addCourseOffering(course11, semester10);
      CourseOffering courseOffering41= department3.getCourseOfferingDirectory().addCourseOffering(course12, semester10);
      CourseOffering courseOffering42= department3.getCourseOfferingDirectory().addCourseOffering(course13, semester10);
      CourseOffering courseOffering43= department3.getCourseOfferingDirectory().addCourseOffering(course9, semester11);
      CourseOffering courseOffering44= department3.getCourseOfferingDirectory().addCourseOffering(course10, semester11);
      CourseOffering courseOffering45= department3.getCourseOfferingDirectory().addCourseOffering(course11, semester11);
      
      CourseOffering courseOffering46= department3.getCourseOfferingDirectory().addCourseOffering(course12, semester11);
      CourseOffering courseOffering47= department3.getCourseOfferingDirectory().addCourseOffering(course13, semester11);
      CourseOffering courseOffering48= department3.getCourseOfferingDirectory().addCourseOffering(course9, semester12);
      CourseOffering courseOffering49= department3.getCourseOfferingDirectory().addCourseOffering(course10, semester12);
      CourseOffering courseOffering50= department3.getCourseOfferingDirectory().addCourseOffering(course11, semester12);
      CourseOffering courseOffering51= department3.getCourseOfferingDirectory().addCourseOffering(course12, semester12);
      CourseOffering courseOffering52= department3.getCourseOfferingDirectory().addCourseOffering(course13, semester12);
      CourseOffering courseOffering53= department4.getCourseOfferingDirectory().addCourseOffering(course20, semester20);
    
      
      CourseOffering courseOffering54= department4.getCourseOfferingDirectory().addCourseOffering(course21, semester20);
      CourseOffering courseOffering55= department4.getCourseOfferingDirectory().addCourseOffering(course22, semester20);
      CourseOffering courseOffering56= department4.getCourseOfferingDirectory().addCourseOffering(course23, semester20);
      CourseOffering courseOffering57= department4.getCourseOfferingDirectory().addCourseOffering(course20, semester21);
      CourseOffering courseOffering58= department4.getCourseOfferingDirectory().addCourseOffering(course21, semester21);
      CourseOffering courseOffering59= department4.getCourseOfferingDirectory().addCourseOffering(course22, semester21);
      CourseOffering courseOffering60= department4.getCourseOfferingDirectory().addCourseOffering(course23, semester21);
      CourseOffering courseOffering61= department4.getCourseOfferingDirectory().addCourseOffering(course20, semester22);

      CourseOffering courseOffering62= department4.getCourseOfferingDirectory().addCourseOffering(course21, semester22);
      CourseOffering courseOffering63= department4.getCourseOfferingDirectory().addCourseOffering(course22, semester22);
      CourseOffering courseOffering64= department4.getCourseOfferingDirectory().addCourseOffering(course23, semester22);
      CourseOffering courseOffering65= department4.getCourseOfferingDirectory().addCourseOffering(course20, semester23);
      CourseOffering courseOffering66= department4.getCourseOfferingDirectory().addCourseOffering(course21, semester23);
      CourseOffering courseOffering67= department4.getCourseOfferingDirectory().addCourseOffering(course22, semester23);
      CourseOffering courseOffering68= department4.getCourseOfferingDirectory().addCourseOffering(course23, semester23);
      CourseOffering courseOffering69= department5.getCourseOfferingDirectory().addCourseOffering(course25, semester24);
      
      
      
      CourseOffering courseOffering70= department5.getCourseOfferingDirectory().addCourseOffering(course26, semester24);
      CourseOffering courseOffering71= department5.getCourseOfferingDirectory().addCourseOffering(course27, semester24);
      CourseOffering courseOffering72= department5.getCourseOfferingDirectory().addCourseOffering(course28, semester24);
      CourseOffering courseOffering73= department5.getCourseOfferingDirectory().addCourseOffering(course29, semester24);
      CourseOffering courseOffering74= department5.getCourseOfferingDirectory().addCourseOffering(course25, semester25);
      CourseOffering courseOffering75= department5.getCourseOfferingDirectory().addCourseOffering(course26, semester25);
      CourseOffering courseOffering76= department5.getCourseOfferingDirectory().addCourseOffering(course27, semester26);
      CourseOffering courseOffering77= department5.getCourseOfferingDirectory().addCourseOffering(course28, semester27);
      
      CourseOffering courseOffering78= department5.getCourseOfferingDirectory().addCourseOffering(course29, semester27);
      CourseOffering courseOffering79= department6.getCourseOfferingDirectory().addCourseOffering(course30, semester28);
      CourseOffering courseOffering80= department6.getCourseOfferingDirectory().addCourseOffering(course31, semester29);
      CourseOffering courseOffering81= department6.getCourseOfferingDirectory().addCourseOffering(course32, semester30);
      CourseOffering courseOffering82= department6.getCourseOfferingDirectory().addCourseOffering(course33, semester31);
      CourseOffering courseOffering83= department6.getCourseOfferingDirectory().addCourseOffering(course34, semester29);
      CourseOffering courseOffering84= department6.getCourseOfferingDirectory().addCourseOffering(course30, semester30);
      CourseOffering courseOffering85= department6.getCourseOfferingDirectory().addCourseOffering(course31, semester31);
      CourseOffering courseOffering86= department6.getCourseOfferingDirectory().addCourseOffering(course32, semester28);
      CourseOffering courseOffering87= department6.getCourseOfferingDirectory().addCourseOffering(course33, semester30);
      CourseOffering courseOffering88= department6.getCourseOfferingDirectory().addCourseOffering(course34, semester29);
      CourseOffering courseOffering89= department7.getCourseOfferingDirectory().addCourseOffering(course35, semester30);
      CourseOffering courseOffering90= department7.getCourseOfferingDirectory().addCourseOffering(course36, semester31);
      CourseOffering courseOffering92= department7.getCourseOfferingDirectory().addCourseOffering(course37, semester32);
      CourseOffering courseOffering93= department7.getCourseOfferingDirectory().addCourseOffering(course38, semester33);
      CourseOffering courseOffering94= department7.getCourseOfferingDirectory().addCourseOffering(course39, semester34);
      CourseOffering courseOffering95= department7.getCourseOfferingDirectory().addCourseOffering(course39, semester35);
      CourseOffering courseOffering96= department7.getCourseOfferingDirectory().addCourseOffering(course37, semester30);
      CourseOffering courseOffering97= department7.getCourseOfferingDirectory().addCourseOffering(course36, semester31);
      CourseOffering courseOffering98= department7.getCourseOfferingDirectory().addCourseOffering(course39, semester32);
      CourseOffering courseOffering99= department8.getCourseOfferingDirectory().addCourseOffering(course40, semester36);
      CourseOffering courseOffering100= department9.getCourseOfferingDirectory().addCourseOffering(course45, semester43);
      
      
      ClassRoom classroom2 =course2.getClassroomDirectory().addClassRoomBuilding("Rider Hall", "315", "3");
      ClassRoom classroom3 =course3.getClassroomDirectory().addClassRoomBuilding("West Village", "450", "4");
      ClassRoom classroom4 =course4.getClassroomDirectory().addClassRoomBuilding("Ell Hall", "309", "3");
      ClassRoom classroom5 =course5.getClassroomDirectory().addClassRoomBuilding("NEU Main Building", "120", "1");
      ClassRoom classroom6 =course6.getClassroomDirectory().addClassRoomBuilding("Snell Library", "310", "3");
      ClassRoom classroom7 =course7.getClassroomDirectory().addClassRoomBuilding("Columbus Hall", "130", "1");
      ClassRoom classroom8 =course8.getClassroomDirectory().addClassRoomBuilding("Abraham Hall", "400", "4");

      ClassRoom classroom9 =course9.getClassroomDirectory().addClassRoomBuilding("Shillman Hall", "255", "2");
      ClassRoom classroom10 =course10.getClassroomDirectory().addClassRoomBuilding("Rider Hall", "319", "3");
      ClassRoom classroom11 =course11.getClassroomDirectory().addClassRoomBuilding("West Village", "455", "4");
      ClassRoom classroom12 =course12.getClassroomDirectory().addClassRoomBuilding("Ell Hall", "311", "3");
      ClassRoom classroom13 =course13.getClassroomDirectory().addClassRoomBuilding("NEU Main Building", "16", "1");
      
      
     
      ClassRoom classroom46=course46.getClassroomDirectory().addClassRoomBuilding("Shillman Hall", "499", "4");
      ClassRoom classroom47 =course47.getClassroomDirectory().addClassRoomBuilding("Rider Hall", "310", "3");
      ClassRoom classroom48 =course48.getClassroomDirectory().addClassRoomBuilding("West Village", "400", "4");
      ClassRoom classroom49 =course49.getClassroomDirectory().addClassRoomBuilding("Ell Hall", "393", "3");
         

      ClassRoom classroom20 =course20.getClassroomDirectory().addClassRoomBuilding("Ell Hall", "378", "3");
      ClassRoom classroom21 =course21.getClassroomDirectory().addClassRoomBuilding("NEU Main Building", "165", "1");
      ClassRoom classroom22 =course22.getClassroomDirectory().addClassRoomBuilding("Snell Library", "377", "3");
      ClassRoom classroo23 =course23.getClassroomDirectory().addClassRoomBuilding("Columbus Hall", "133", "1");
      ClassRoom classroom24 =course24.getClassroomDirectory().addClassRoomBuilding("Abraham Hall", "477", "4");
        
      

   

      ClassRoom classroom30 =course31.getClassroomDirectory().addClassRoomBuilding("Shillman Hall", "350", "3");
      ClassRoom classroom31 =course32.getClassroomDirectory().addClassRoomBuilding("Rider Hall", "415", "4");
      ClassRoom classroom32 =course33.getClassroomDirectory().addClassRoomBuilding("West Village", "455", "4");
      ClassRoom classroom33 =course34.getClassroomDirectory().addClassRoomBuilding("Ell Hall", "310", "3");
      ClassRoom classroom34 =course35.getClassroomDirectory().addClassRoomBuilding("NEU Main Building", "111", "1");
      ClassRoom classroom35 =course36.getClassroomDirectory().addClassRoomBuilding("Snell Library", "510", "5");
      ClassRoom classroom36 =course37.getClassroomDirectory().addClassRoomBuilding("Columbus Hall", "530", "5");
      ClassRoom classroom37 =course30.getClassroomDirectory().addClassRoomBuilding("Abraham Hall", "100", "1");
  
     
     CourseSchedule courseSchedule1= course1.getCourseScheduleDirectory().addCourseSchedule(classroom9, faculty9, courseOffering1);
    Seat seat1 = student1.getSeatDirectory().addSeat(courseSchedule1, 3);
     CourseLoad courseload1= student1.getCourseLoadDirectory().addCourseLoad(courseOffering1, seat1);
     
     CourseSchedule courseSchedule2= course2.getCourseScheduleDirectory().addCourseSchedule(classroom8, faculty8, courseOffering2);
    Seat seat2 = student1.getSeatDirectory().addSeat(courseSchedule2, 4);
     CourseLoad courseload2= student1.getCourseLoadDirectory().addCourseLoad(courseOffering2, seat2);
     
     CourseSchedule courseSchedule3= course3.getCourseScheduleDirectory().addCourseSchedule(classroom6, faculty6, courseOffering3);
    Seat seat3 = student1.getSeatDirectory().addSeat(courseSchedule2, 3);
     CourseLoad courseload3= student1.getCourseLoadDirectory().addCourseLoad(courseOffering3, seat2);
     
     CourseSchedule courseSchedule4= course4.getCourseScheduleDirectory().addCourseSchedule(classroom5, faculty5, courseOffering4);
    Seat seat4 = student1.getSeatDirectory().addSeat(courseSchedule1, 2);
     CourseLoad courseload4= student1.getCourseLoadDirectory().addCourseLoad(courseOffering4, seat1);
     
     CourseSchedule courseSchedule5= course5.getCourseScheduleDirectory().addCourseSchedule(classroom9, faculty8, courseOffering9);
    Seat seat5 = student2.getSeatDirectory().addSeat(courseSchedule2, 4);
     CourseLoad courseload5= student2.getCourseLoadDirectory().addCourseLoad(courseOffering1, seat4);
     
     CourseSchedule courseSchedule6= course6.getCourseScheduleDirectory().addCourseSchedule(classroom9, faculty7, courseOffering10);
    Seat seat6 = student2.getSeatDirectory().addSeat(courseSchedule1, 2);
     CourseLoad courseload6= student2.getCourseLoadDirectory().addCourseLoad(courseOffering2, seat1);
     
     CourseSchedule courseSchedule7= course7.getCourseScheduleDirectory().addCourseSchedule(classroom7, faculty8, courseOffering4);
    Seat seat7 = student3.getSeatDirectory().addSeat(courseSchedule1, 3);
     CourseLoad courseload7= student3.getCourseLoadDirectory().addCourseLoad(courseOffering2, seat1);
             
     CourseSchedule courseSchedule8= course8.getCourseScheduleDirectory().addCourseSchedule(classroom8, faculty7, courseOffering7);
    Seat seat8 = student3.getSeatDirectory().addSeat(courseSchedule1, 4);
     CourseLoad courseload8= student3.getCourseLoadDirectory().addCourseLoad(courseOffering3, seat1);
     
     CourseSchedule courseSchedule9= course9.getCourseScheduleDirectory().addCourseSchedule(classroom9, faculty9, courseOffering9);
    Seat seat9 = student4.getSeatDirectory().addSeat(courseSchedule6, 3);
     CourseLoad courseload9= student4.getCourseLoadDirectory().addCourseLoad(courseOffering1, seat1);
     
     CourseSchedule courseSchedule10= course10.getCourseScheduleDirectory().addCourseSchedule(classroom9, faculty9, courseOffering9);
    Seat seat10 = student4.getSeatDirectory().addSeat(courseSchedule2, 4);
     CourseLoad courseload10= student4.getCourseLoadDirectory().addCourseLoad(courseOffering4, seat1);
     
     CourseSchedule courseSchedule11= course11.getCourseScheduleDirectory().addCourseSchedule(classroom9, faculty9, courseOffering11);
    Seat seat11 = student9.getSeatDirectory().addSeat(courseSchedule1, 3);
     CourseLoad courseload11= student9.getCourseLoadDirectory().addCourseLoad(courseOffering3, seat1);
     
     CourseSchedule courseSchedule12= course12.getCourseScheduleDirectory().addCourseSchedule(classroom9, faculty9, courseOffering12);
    Seat seat12 = student9.getSeatDirectory().addSeat(courseSchedule1, 3);
     CourseLoad courseload12= student9.getCourseLoadDirectory().addCourseLoad(courseOffering4, seat1);
     
     

    return  university;
   
}
     
}