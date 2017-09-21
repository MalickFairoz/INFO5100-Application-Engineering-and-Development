/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import businessUniversity.Alumini;
import businessUniversity.College;
import businessUniversity.Course;
import businessUniversity.CourseLoad;
import businessUniversity.CourseOffering;
import businessUniversity.CourseSchedule;
import businessUniversity.Department;
import businessUniversity.Faculty;
import businessUniversity.FacultyDirectory;
import java.util.Scanner;
import businessUniversity.Intialization;
import businessUniversity.Intialization1;
import businessUniversity.Seat;
import businessUniversity.Semester;
import businessUniversity.Student;
import businessUniversity.Transcript;
import businessUniversity.University;
/**
 *
 * @author PeaceFull
 */

public  class Main_Execution {

    
  
     public static void main(String[] args) {
          boolean statusMain=true;
         
         do
         {
        Scanner reader1 = new Scanner(System.in);  // Reading from System.in
        System.out.println("*********Welcome to the EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("Enter Your choice: \n1. Northeastern University \n2. Boston University  ");
        System.out.println("3. Performance Evaluation University Level");
        int choiceMain = reader1.nextInt(); // Scans the next token of the input as an int.
       
        switch (choiceMain) {
            case 1:
                 
        {
         boolean status=true;
         
         do
         {
        System.out.println("*********Welcome to the University LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
        System.out.println("1.University");
        System.out.println("2.College Wise Record in the University");
        System.out.println("3.Performance College Wise Records");
        System.out.println("4.Department Wise Record in the University");
        System.out.println("5.Performance Department Wise Record in the College");
       
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. Please enter a number for example just enter 1 for University Name");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.
       
        switch (choice) {
            
        case 1:
           
         boolean status1=true;
         do{
 
            System.out.println("*********Welcome to the University Level Report*************** ");
            System.out.println("*********Please enter the choice below for University Reports*************** ");
            System.out.println("1.  University Name");
            System.out.println("2.  Faculty List of the University");
            System.out.println("3.  Alumini Details Department Wise for Univeristy");
            System.out.println("4.  Courses Offered Department and Semester Wise");
            System.out.println("5.  List of All Department offered by University ");
            System.out.println("6.  Performance College wise of student who have published paper in University");
            System.out.println("7.  Non Teaching Faculty List of University");
        
            int choiceCase1 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase1){
            case 1:
                   
                System.out.println("University Name = "+Intialization.initializeDepartmentDirectory().getUniversityName());
                break;
                
            case 2:
                  
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
               {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
                {      
                 for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                    if(faculty.getJobRole().equals("Teaching Faculty")){
                    System.out.println("Department = "+department.getName()+'\n');
           
                    System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
                    }
                 }
           
                }
           }
             
                 break;
                    
                    
            case 3:
            
            for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            System.out.println('\n'+ "College Name = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
             System.out.println("Department Name = "+department.getName());
          
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
              }     
             } 
           }
               System.out.println("*************** REPORT ENDS******************");
                break;
            case 4:
            for (CourseOffering courseOffering: Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getCourseOfferingDirectory().getCourseOfferingList())
            {
                       System.out.println("COurses Offered = "+courseOffering.getCourse().getCourseName());
                       System.out.println("Year = "+courseOffering.getSemester().getYear());
                       System.out.println("Season = "+courseOffering.getSemester().getSemester());
                       for (CourseSchedule courseSchedule:courseOffering.getCourse().getCourseScheduleDirectory().getCourseScheduleList())
                       {
                          System.out.println("Building = "+ courseSchedule.getClassRoom().getBuidingName());
                          System.out.println("Floor = "+ courseSchedule.getClassRoom().getFloorNumber());
                          System.out.println("Room =  "+ courseSchedule.getClassRoom().getRoomNumber());
                          System.out.println("Faculty = "+ courseSchedule.getPerson().getFirstName()+courseSchedule.getPerson().getLastName());
                       }
                   }
             break;
           
             
            case 5:
               
            for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            System.out.println('\n'+ "College Name = "+college.getCollegeName()+'\n');
           for(Department department :college.getDepartmentDirectory().getDepartmentList())
           
            {
             System.out.println("Department = "+department.getName());
            }
           }
             break;
           case 6:
          
                  float paperAvg1;
                  float paperAvg2;
                  float paperAvg3;
                  {
                  float count10=0;
                  float countPaper10=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count10++;
                       countPaper10=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper10;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper10=countPaper10/count10;
                 paperAvg1=avgPaper10;
                 
                  System.out.println("Total Number of Student Published = "+count10);
                  System.out.println("Total Number of Paper Published = "+countPaper10);
                   System.out.println("Average Number of Paper Published = "+avgPaper10);
                  }         
                  
                   {
                  float count11=0;
                  float countPaper11=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count11++;
                       countPaper11=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper11;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper11=countPaper11/count11;
                 paperAvg2=avgPaper11;
                  System.out.println("Total Number of Student Published = "+count11);
                  System.out.println("Total Number of Paper Published = "+countPaper11);
                   System.out.println("Average Number of Paper Published = "+avgPaper11);
                  }         
                      
                   
           {
                 float count12=0;
                 float countPaper12=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count12++;
                       countPaper12=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper12;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper12=countPaper12/count12;
                 paperAvg3=avgPaper12;
                  System.out.println("Total Number of Student Published = "+count12);
                  System.out.println("Total Number of Paper Published = "+countPaper12);
                   System.out.println("Average Number of Paper Published = "+avgPaper12);
                  }     
           
           
                  System.out.println("Overall Report");
                  
                   System.out.println("Average Number of Paper Published in College of Engineering = "+paperAvg1);
                   
                   System.out.println("Average Number of Paper Published in College of Management = "+paperAvg2);
                   
                   System.out.println("Average Number of Paper Published in College of Arts = "+paperAvg3);
                   
                   if(paperAvg1>paperAvg2 && paperAvg1>paperAvg3){
                       System.out.println("College of Engineering is the best in terms of Research and Paper Publication");
                   }
                   else if(paperAvg2>paperAvg1 && paperAvg2>paperAvg3){
                      System.out.println("College of Management is the best in terms of Research and Paper Publication");
                 
                   }
                     else if(paperAvg3>paperAvg1 && paperAvg3>paperAvg2){
                      System.out.println("College of Arts is the best in terms of Research and Paper Publication");
                 
                   }
          
             break;
              
               case 7:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){
                if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
           }
           
           }
           }
             break;
        
              
        }
             System.out.println("Do You Want To Display Another University Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status1=true;
            }   
            else if(continueReport==0){
                status1=false;
            }
                
          
        }while(status1);
               
            break;
            
            case 2:
            boolean status2=true;
            do{
 
            System.out.println("*********Welcome to the College Level Report*************** ");
            System.out.println("*********Please enter the choice below for College Reports*************** ");
            System.out.println("1. List of All Colleges in the University ");
            System.out.println("2. Student of College Of Engineering");
            System.out.println("3. Student List of College of Management");
            System.out.println("4. Student List of College of Arts");
            System.out.println("5. Faculty List of College Of Engineering");
            System.out.println("6. Faculty List of College of Management");
            System.out.println("7. Faculty List of College of Arts");
            System.out.println("8. Non Teaching Faculty List of College Of Engineering");
            System.out.println("9. Non Teaching Faculty List of College of Management");
            System.out.println("10. Non Teaching Faculty List of College of Arts");
            System.out.println("11. Alumini List of College Of Engineering");
            System.out.println("12. Alumini List of College of Management");
            System.out.println("13. Alumini List of College of Arts");
            System.out.println("14. Student Courseload and CGPA List Based on College ");
            System.out.println("15. Student Courseload and GPA List Based on College ");
            
       
            int choiceCase2 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase2){
            
           case 1:
            for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
            {
                System.out.println('\n'+ "College Name = "+college.getCollegeName()+'\n');
            }
            break;
            
            case 2:
             for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
             {
                 if(college.getCollegeName().equals("College of Engineering")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
           
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
                 {      
                    System.out.println("Department = "+department.getName()+'\n');
           
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
           
                  }
                }    
           
              }
             break;
             
            case 3:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Management")){
                  System.out.println("College = "+college.getCollegeName()+'\n');
                   for(Department department :college.getDepartmentDirectory().getDepartmentList())
                   {      
                     System.out.println("Department = "+department.getName()+'\n');
                      for( Student student :department.getStudentDirectory().getStudentList())
                      {
                          System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                      }
           
                   }
                 }    
           
                }
             break; 
               
            case 4:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Arts")){
                    System.out.println("College = "+college.getCollegeName()+'\n');
                  for(Department department :college.getDepartmentDirectory().getDepartmentList())
                  {      
                    System.out.println("Department = "+department.getName()+'\n');
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                  }
                }    
              }
             break;
             
             case 5:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                    if(college.getCollegeName().equals("College of Engineering")){
                    System.out.println("College = "+college.getCollegeName()+'\n');
                    for(Department department :college.getDepartmentDirectory().getDepartmentList())
                    {      
                    for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                        if(faculty.getJobRole().equals("Teaching Faculty")){
                        System.out.println("Department = "+department.getName()+'\n');
                        System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
                        }
                      }
                    }
                  }
                }
             break;
            
            case 6:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                if(college.getCollegeName().equals("College of Management")){
               System.out.println("College = "+college.getCollegeName()+'\n');
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
              {      
                for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                if(faculty.getJobRole().equals("Teaching Faculty")){
                System.out.println("Department = "+department.getName()+'\n');
                System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
                }
                } 
               }
              }
             }
             break;
             
            case 7:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                    if(college.getCollegeName().equals("College of Arts")){
                    System.out.println("College = "+college.getCollegeName()+'\n');
                    for(Department department :college.getDepartmentDirectory().getDepartmentList())
                    {      
                    for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                        if(faculty.getJobRole().equals("Teaching Faculty")){
                        System.out.println("Department = "+department.getName()+'\n');
                        System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
                        }
                       }
                    }
                   }
                  }
             break;
              case 8:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                if(college.getCollegeName().equals("College of Engineering")){
               System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){

        if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
             }
            }
           }
           }
             break;
             case 9:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                if(college.getCollegeName().equals("College of Management")){
               System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){
                if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
             }
            }
           }
           }
             break;
             
              case 10:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                if(college.getCollegeName().equals("College of Arts")){
               System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){
                if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
             }
            }
           }
           }
             break;
          
            case 11:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Engineering")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
                 {      
                    for(Alumini alumini :department.getAluminiDirectory().getAluminiList() ){
                    System.out.println("Department = "+department.getName()+'\n');
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    for( Student student :department.getStudentDirectory().getStudentList())
                    {
                       if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                   }
                 }    
                }
              }
             break;
              case 12:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Management")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
                 {      
                    for(Alumini alumini :department.getAluminiDirectory().getAluminiList() ){
                    System.out.println("Department = "+department.getName()+'\n');
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    for( Student student :department.getStudentDirectory().getStudentList())
                    {
                       if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                   }
                 }    
                }
              }
             break;
              case 13:
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Arts")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
                 {      
                    for(Alumini alumini :department.getAluminiDirectory().getAluminiList() ){
                    System.out.println("Department = "+department.getName()+'\n');
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    for( Student student :department.getStudentDirectory().getStudentList())
                    {
                       if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                   }
                 }    
                }
              }
             break;
             
                  case 14:
                   //Total GPA earned and CGPA
                   
                   int count =0;
                   int i=0;
                  for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
                   System.out.println("College = "+college.getCollegeName());
                   
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
                   System.out.println("Department = "+department.getName());
                   for(Student student : Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getStudentDirectory().getStudentList())
                   {
                       
                       System.out.println(student.getStudentName());
                       
                       for (Transcript transcript : student.getTranscriptDirectory().getTranscriptList())
                       {
                        System.out.println("Course Name:"+ transcript.getCourseLoad().getCourseOffering().getCourse().getCourseName()+" Year:"+ 
                        transcript.getCourseLoad().getCourseOffering().getSemester().getYear()+" Season:"+ 
                        transcript.getCourseLoad().getCourseOffering().getSemester().getSemester() + "  GPA:" + transcript.getCourseLoad().getSeat().getGpa());
                        count = count + transcript.getCourseLoad().getSeat().getGpa();
                        i=i+1;
                       
                        }
                       
                       int cgpa = count/i;
                       System.out.println("Total GPA:" + count);
                       System.out.println("CGPA:" + cgpa);
                       i=0;
                       count=0;
                   }
            }
           }
                  break;
                  
                  case 15:
                      for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
                   System.out.println("College = "+college.getCollegeName());
                   
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
                   System.out.println("Department = "+department.getName());
                 for(Student student : Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getStudentDirectory().getStudentList())
                   {
                       
                       System.out.println(student.getStudentName());
                       
                       for (CourseLoad courseLoad : student.getCourseLoadDirectory().getCourseLoadList())
                       {
                      System.out.println("Course Load = "+ courseLoad.getCourseOffering().getCourse().getCourseName()+"Year = "+ courseLoad.getCourseOffering().getSemester().getYear()+"Season = "+ courseLoad.getCourseOffering().getSemester().getSemester());
                      //System.out.println("Course Load "+ courseLoad.getCourseOffering().getSemester().getYear());
        }
                       for (Seat seat : student.getSeatDirectory().getSeatDirectoryList()){
                           System.out.println("GPA = "+ seat.getGpa());
                       }
                   }
            }
           }
                 break;
            }
            System.out.println("Do You Want To Display College Wise Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status2=true;
            }   
            else if(continueReport==0){
                status2=false;
            }
             
            }while(status2);
            break;
            
             
            case 3:
            boolean status3=true;
            do{
 
            System.out.println("*********Welcome to the College Level Performance Report*************** ");
            System.out.println("*********Please enter the choice below for Performance College Reports*************** ");
            System.out.println("1.Performance College Evaluation Based On Department Average Salary of Alumini");
            System.out.println("2.Performance College Evaluation Based On Department Total Job Placement of Students");
            System.out.println("3. Performance College wise of student who have undergone internship in University");
            System.out.println("4. Performance Average Number of student who have published paper in College of Engineering");
            System.out.println("5. Performance Average Number of student who have published paper in College of Management");
            System.out.println("6. Performance Average Number of student who have published paper in College of Arts");
            System.out.println("7. Performance Average Number of student who have undergone internship in College of Engineering");
            System.out.println("8. Performance Average Number of student who have undergone internship in College of Management");
            System.out.println("9. Performance Average Number of student who have undergone internship in College of Engineering");
           
       
            int choiceCase3 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase3){
                
                      
            case 1 :
            int avgSalary1=0;
            int avgSalary2=0;
            int avgSalary3=0;
            { 
           
             int WorkingCount=0;
             int totalSalary=0;
              for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Engineering")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount++;
                  totalSalary =Integer.valueOf(alumini.getSalary())+totalSalary;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        int averageSalary1=totalSalary/WorkingCount; 
        avgSalary1=averageSalary1;
        System.out.println("Average Salary of College of Engineering = "+averageSalary1);
        }
                
            { 
             int WorkingCount1=0;
             int totalSalary1=0;
              for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Management")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount1++;
                  totalSalary1 =Integer.valueOf(alumini.getSalary())+totalSalary1;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        int averageSalary2=totalSalary1/WorkingCount1; 
        avgSalary2=averageSalary2;
        System.out.println("Average Salary of College of Management = "+averageSalary2);
            }
            
            
            {
                
             int WorkingCount2=0;
             int totalSalary2=0;
              for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Arts")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount2++;
                  totalSalary2 =Integer.valueOf(alumini.getSalary())+totalSalary2;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        int averageSalary3=totalSalary2/WorkingCount2; 
        avgSalary3=averageSalary3;
        System.out.println("Average Salary of College of Arts = "+averageSalary3);
         }
            
         System.out.println("Overall Report of Average Salary : ");
        
         System.out.println("Average Salary of College of Engineering = "+avgSalary1);
         System.out.println("Average Salary of College of Management = "+avgSalary2);
         System.out.println("Average Salary of College of Arts = "+avgSalary3);
            
        if(avgSalary1 >avgSalary2 && avgSalary1>avgSalary3)
        {
            System.out.println("College of Engineering is the best in terms of Salary Earned by Student ");
        }
        else if(avgSalary2>avgSalary1 && avgSalary2>avgSalary3)
            System.out.println ("College of Management is the best in terms of Salary Earned by Student ");
        else if(avgSalary3>avgSalary1 && avgSalary3>avgSalary2)
            System.out.println ("College of Arts is the best in terms of Salary Earned by Student ");
       
        break;
            
        
         case 2 :
             int countWorking=0;
             int countWorking1=0;
             int countWorking2=0;
           
            { 
           
             int WorkingCount=0;
            
              for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Engineering")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        System.out.println("Total Number of Student Employed in College of Engineering = "+WorkingCount);
        countWorking=WorkingCount;
        }
                
            { 
             int WorkingCount1=0;
            
              for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Management")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount1++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        
        System.out.println("Total Number of Student Employed in  College of Management = "+WorkingCount1);
            countWorking1=WorkingCount1;
            }
            
            
            {
                
             int WorkingCount2=0;
           
              for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Arts")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount2++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        System.out.println("Total Number of Student Employed in  College of Arts = "+WorkingCount2);
        countWorking2=WorkingCount2;
        
         }
            
         System.out.println("Overall Report of Salary : ");
        
         System.out.println("Total Number of Student Employed in  College of Engineering"+countWorking);
         System.out.println("Total Number of Student Employed in College of Management = "+countWorking1);
         System.out.println("Total Number of Student Employed in  College of Arts = "+countWorking2);
            
        if(countWorking>countWorking1 && countWorking >countWorking2)
        {
            System.out.println("College of Engineering is the best in terms of Number of Students Earned Job ");
        }
        else if(countWorking1>countWorking && countWorking1 >countWorking2)
            System.out.println ("College of Management is the best in terms of Number of Students Earned Job ");
        else if(countWorking2>countWorking1 && countWorking2>countWorking)
            System.out.println ("College of Arts is the best in terms of Number of Students Earned Job  ");
       
        break;
            
      
                case 3:
          
                  float internAvg1;
                  float internAvg2;
                  float internAvg3;
                  {
                  float count10=0;
                  float countPaper10=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count10++;
                       countPaper10=Integer.valueOf(student.getNumberOfInternship())+countPaper10;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper10=countPaper10/count10;
                 internAvg1=avgPaper10;
                 
                  System.out.println("Total Number of Student Published = "+count10);
                  System.out.println("Total Number of Paper Published = "+countPaper10);
                   System.out.println("Average Number of Paper Published = "+avgPaper10);
                  }         
                  
                   {
                  float count11=0;
                  float countPaper11=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count11++;
                       countPaper11=Integer.valueOf(student.getNumberOfInternship())+countPaper11;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper11=countPaper11/count11;
                 internAvg2=avgPaper11;
                  System.out.println("Total Number of Student Published = "+count11);
                  System.out.println("Total Number of Paper Published = "+countPaper11);
                   System.out.println("Average Number of Paper Published = "+avgPaper11);
                  }         
                      
                   
           {
                 float count12=0;
                 float countPaper12=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count12++;
                       countPaper12=Integer.valueOf(student.getNumberOfInternship())+countPaper12;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper12=countPaper12/count12;
                 internAvg3=avgPaper12;
                  System.out.println("Total Number of Student Published = "+count12);
                  System.out.println("Total Number of Paper Published = "+countPaper12);
                   System.out.println("Average Number of Paper Published = "+avgPaper12);
                  }     
           
           
                  System.out.println("Overall Report");
                  
                   System.out.println("Average Number of Internship done in College of Engineering = "+internAvg1);
                   
                   System.out.println("Average Number of Internship done in College of Management = "+internAvg2);
                   
                   System.out.println("Average Number of Internship done in College of Arts = "+internAvg3);
                   
                   if(internAvg1>internAvg2 && internAvg1>internAvg3){
                       System.out.println("College of Engineering is the best in terms of Internship student Underwent");
                   }
                   else if(internAvg2>internAvg1 && internAvg2 >internAvg3){
                      System.out.println("College of Management is the best in terms of Internship student Underwent");
                 
                   }
                     else if(internAvg3>internAvg1 && internAvg3>internAvg2){
                      System.out.println("College of Arts is the best in terms of Internship student Underwent");
                 
                   }
          
             break;
             
                  case 4:
                  float count5=0;
                  float countPaper=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count5++;
                       countPaper=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper=countPaper/count5;
                 
                  System.out.println("Total Number of Student Published = "+count5);
                  System.out.println("Total Number of Paper Published = "+countPaper);
                   System.out.println("Average Number of Paper Published = "+avgPaper);
                  
                  
                 
             break;
             case 5:
                  float count6=0;
                  float countPaper1=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count6++;
                       countPaper1=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper1;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper1=countPaper1/count6;
                 
                  System.out.println("Total Number of Student Published = "+count6);
                  System.out.println("Total Number of Paper Published = "+countPaper1);
                   System.out.println("Average Number of Paper Published = "+avgPaper1);
                  
                  
                 
             break;

              case 6:
                  float count7=0;
                  float countPaper2=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count7++;
                       countPaper2=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper2;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper2=countPaper2/count7;
                 
                  System.out.println("Total Number of Student Published = "+count7);
                  System.out.println("Total Number of Paper Published = "+countPaper2);
                   System.out.println("Average Number of Paper Published = "+avgPaper2);
            break;
        case 7:
                  float count20=0;
                  float countInternship20=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count20++;
                       countInternship20=Integer.valueOf(student.getNumberOfInternship())+countInternship20;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgInternship20=countInternship20/count20;
                 
                  System.out.println("Total Number of Student Published = "+count20);
                  System.out.println("Total Number of Paper Published = "+countInternship20);
                   System.out.println("Average Number of Paper Published = "+avgInternship20);
                  
                  
                 
             break;
             case 8:
                 
                  float count21=0;
                  float countInternship21=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count21++;
                       countInternship21=Integer.valueOf(student.getNumberOfInternship())+countInternship21;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgInternship21=countInternship21/count21;
                 
                  System.out.println("Total Number of Student Published = "+count21);
                  System.out.println("Total Number of Paper Published = "+countInternship21);
                   System.out.println("Average Number of Paper Published = "+avgInternship21);
                  
                  
                 
             break;
             case 9:
                 
                  float count22=0;
                  float countInternship22=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count22++;
                       countInternship22=Integer.valueOf(student.getNumberOfInternship())+countInternship22;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgInternship22=countInternship22/count22;
                 
                  System.out.println("Total Number of Student Published = "+count22);
                  System.out.println("Total Number of Paper Published = "+countInternship22);
                   System.out.println("Average Number of Paper Published = "+avgInternship22);
                  
                  
                 
             break;
               
            }
            System.out.println("Do You Want To Display Performance College Wise Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status3=true;
            }   
            else if(continueReport==0){
                status3=false;
            }
             
            }while(status3);
            
            break;
                    
                    
            case 5:
                 boolean status5=true;
                 do{
 
                  System.out.println("*********Welcome to the Deprtment Level Report*************** ");
                  System.out.println("*********Please enter the choice below for Department Reports*************** ");
                  System.out.println("1. Performance Department wise of student who have undergone internship in College of Engineering");
                  System.out.println("2. Performance Department wise of student who have undergone internship in College of Management");
                  System.out.println("3. Performance Department wise of student who have undergone internship in College of Arts");
       
                  System.out.println("4.Performance Department wise Placement Record for College of Engineering");
                  System.out.println("5.Performance Department wise Placement Record for College of Management");
                  System.out.println("6.Performance Department wise Placement Record for College of Arts");
                  System.out.println("7.Performance Department wise Salary Based Performance Record for College of Engineering ");
                  System.out.println("8.Performance Department wise Salary Based Performance Record for College of Management ");
                  System.out.println("9.Performance Department wise Salary Based Performance Record for College of Arts ");
      
       
            int choiceCase5 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase5){
                 case 1 :
                     
                 float count30=0;
                 float count31=0;
                 float count32=0;
                  float countInternship30=0;
                  float countInternship31=0;
                  float countInternship32=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {     
               if(department.getName().equals("IS")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count30++;
                       countInternship30=Integer.valueOf(student.getNumberOfInternship())+countInternship30;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
               else if(department.getName().equals("EM")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count31++;
                       countInternship31=Integer.valueOf(student.getNumberOfInternship())+countInternship31;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
                else if(department.getName().equals("CSE")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count32++;
                       countInternship32=Integer.valueOf(student.getNumberOfInternship())+countInternship32;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
         }
           
           }
                 float avgInternship30=countInternship30/count30;
                 
                 float avgInternship31=countInternship31/count31;
                 
                 float avgInternship32=countInternship32/count32;
                 
               System.out.println("Average Number of Internship Student in IS Department = "+avgInternship30);
               System.out.println("Average Number of Internship Student in EM Department = "+avgInternship31);
               System.out.println("Average Number of Internship Student in CSE Department = "+avgInternship32);
               
               if(avgInternship30>avgInternship31 && avgInternship30 >avgInternship32 )
               {
                   System.out.println("IS Department is the best in terms of Internship");
                   
               }
               else if(avgInternship31>avgInternship30 && avgInternship31>avgInternship32){
                   System.out.println("EM Department is the best in terms of Internship");
               }
                 
               else if(avgInternship32>avgInternship31 && avgInternship32 >avgInternship30){
                   System.out.println("CSE Department is the best in terms of Internship");
               }
                
             break;
             
                  case 2 :
                     
                  float count40=0;
                  float count41=0;
                  float count42=0;
                  float countInternship40=0;
                  float countInternship41=0;
                  float countInternship42=0;
                  for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
               {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
           {     
               if(department.getName().equals("Finance")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count40++;
                       countInternship40=Integer.valueOf(student.getNumberOfInternship())+countInternship40;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
               else if(department.getName().equals("Marketing")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count41++;
                       countInternship41=Integer.valueOf(student.getNumberOfInternship())+countInternship41;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
                else if(department.getName().equals("Human Resource")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count42++;
                       countInternship42=Integer.valueOf(student.getNumberOfInternship())+countInternship42;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
         }
           
           }
                 float avgInternship40=countInternship40/count40;
                 
                 float avgInternship41=countInternship41/count41;
                 
                 float avgInternship42=countInternship42/count42;
                 
               System.out.println("Average Number of Internship Student in Finance Department = "+avgInternship40);
               System.out.println("Average Number of Internship Student in Marketing Department = "+avgInternship41);
               System.out.println("Average Number of Internship Student in Human Resource Department = "+avgInternship42);
               
               if(avgInternship40>avgInternship41 && avgInternship40 >avgInternship42 )
               {
                   System.out.println("Finance Department is the best in terms of Internship");
                   
               }
               else if(avgInternship41>avgInternship40 && avgInternship41>avgInternship42){
                   System.out.println("Marketing Department is the best in terms of Internship");
               }
                 
               else if(avgInternship42>avgInternship41 && avgInternship42 >avgInternship40){
                   System.out.println("Human Resource Department is the best in terms of Internship");
               }
                
             break;
              
                  case 3 :
                     
                 float count50=0;
                 float count51=0;
                 float count52=0;
                  float countInternship50=0;
                  float countInternship51=0;
                  float countInternship52=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {     
               if(department.getName().equals("Physics")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count50++;
                       countInternship50=Integer.valueOf(student.getNumberOfInternship())+countInternship50;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
               else if(department.getName().equals("Chemistry")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count51++;
                       countInternship51=Integer.valueOf(student.getNumberOfInternship())+countInternship51;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
                else if(department.getName().equals("Mathematics")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count52++;
                       countInternship52=Integer.valueOf(student.getNumberOfInternship())+countInternship52;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
         }
           
           }
                 float avgInternship50=countInternship50/count50;
                 
                 float avgInternship51=countInternship51/count51;
                 
                 float avgInternship52=countInternship52/count52;
                 
               System.out.println("Average Number of Internship Student in Physics Department = "+avgInternship50);
               System.out.println("Average Number of Internship Student in Chemistry Department = "+avgInternship51);
               System.out.println("Average Number of Internship Student in Mathematcis Department = "+avgInternship52);
               
               if(avgInternship50>avgInternship51 && avgInternship50 >avgInternship52 )
               {
                   System.out.println("Physics Department is the best in terms of Internship");
                   
               }
               else if(avgInternship51>avgInternship50 && avgInternship51>avgInternship52){
                   System.out.println("Chemistry Department is the best in terms of Internship");
               }
                 
               else if(avgInternship52>avgInternship51 && avgInternship52 >avgInternship50){
                   System.out.println("Mathematics Department is the best in terms of Internship");
               }
                
             break;
            
            case 4:
                
             int isWorkingCount=0;
             int emWorkingCount=0;
             int csWorkingCount=0;  
             
            for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
               if(college.getCollegeName().equals("College of Engineering"))
               {
              
            System.out.println("University = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
         
            
          {
             System.out.println("Department = "+department.getName());
          if(department.getName().equals("IS"))
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     isWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
          
          else if(department.getName().equals("EM"))
              
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     emWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
           else if(department.getName().equals("CSE")){
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                    csWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year" +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
          
         
           }
         }
       }
           }
       System.out.println("Total Number of Student Placed in IS Department = "+isWorkingCount);
          System.out.println("Total Number of Student Placed in EM Department = "+emWorkingCount);
          System.out.println("Total Number of Student Placed in CSE Department = "+csWorkingCount);
        
          if(isWorkingCount> emWorkingCount && isWorkingCount >csWorkingCount)
          {
           System.out.println(" IS is the Best Department Interms of placement after graduation");
            
          }
          else if(csWorkingCount>isWorkingCount && csWorkingCount>emWorkingCount){
              System.out.println("CS is the Best Department Interms of placement after graduation");
          
          }
          else if(emWorkingCount>csWorkingCount && emWorkingCount>isWorkingCount)
              System.out.println(" EM is the Best Department Interms of placement after graduation");
                
      
         
               System.out.println("*************** REPORT ENDS******************");
                break;
          
             
            
            case 5:
                
            int financeWorkingCount=0;
            int marketingWorkingCount=0;
            int hrWorkingCount=0;  
             
            for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
               if(college.getCollegeName().equals("College of Management"))
               {
              
            System.out.println("University = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
         
            
            {
             System.out.println("Department = "+department.getName());
            if(department.getName().equals("Finance"))
            {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     financeWorkingCount++;
                     System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
                      for( Student student :department.getStudentDirectory().getStudentList())
                      {
                        if(alumini.getStudentId().equals(student.getStudentId())  )
                        System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                      }
                 }  
             }
             
           }
          
          else if(department.getName().equals("Marketing"))
              
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     marketingWorkingCount++;
                    System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
           else if(department.getName().equals("Human Resource")){
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
                {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                    hrWorkingCount++;
                    System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year" +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
          }
      
          
        }
       }
      }
          System.out.println("Total Number of Student Placed in Finance Department = "+financeWorkingCount);
          System.out.println("Total Number of Student Placed in Marketing Department = "+marketingWorkingCount);
          System.out.println("Total Number of Student Placed in Human Resource Department = "+hrWorkingCount);
        
          if(financeWorkingCount> marketingWorkingCount && financeWorkingCount > hrWorkingCount)
          {
           System.out.println(" Finance is the Best Department Interms of placement after graduation");
            
          }
          else if(marketingWorkingCount>financeWorkingCount && marketingWorkingCount>hrWorkingCount){
              System.out.println("Marketing is the Best Department Interms of placement after graduation");
          
          }
          else if(hrWorkingCount>financeWorkingCount && hrWorkingCount>marketingWorkingCount)
              System.out.println(" Human Resource is the Best Department Interms of placement after graduation");
                
      
                System.out.println("***************Department LEVEL REPORT ENDS******************");
                break;
            
        case 6:
        
            int physicsWorkingCount=0;
            int mathsWorkingCount=0;
            int chemistryWorkingCount=0;  
             
            for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
               if(college.getCollegeName().equals("College of Arts"))
               {
              
            System.out.println("University = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
         
            
            {
             System.out.println("Department = "+department.getName());
          if(department.getName().equals("Physics"))
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     physicsWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
          
          else if(department.getName().equals("Chemistry"))
              
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     chemistryWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
           else if(department.getName().equals("Mathematics")){
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                    mathsWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year" +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
          
         
           }
      
          
         }
       }
      }
          System.out.println("Total Number of Student Placed in Physics Department = "+physicsWorkingCount);
          System.out.println("Total Number of Student Placed in Chemistry Department = "+chemistryWorkingCount);
        
          System.out.println("Total Number of Student Placed in Mathematics Department = "+mathsWorkingCount);
         
          if(physicsWorkingCount >chemistryWorkingCount && physicsWorkingCount > mathsWorkingCount)
          {
           System.out.println(" Physics is the Best Department Interms of placement after graduation");
            
          }
          else if(chemistryWorkingCount >mathsWorkingCount && chemistryWorkingCount>physicsWorkingCount){
              System.out.println("Chemistry is the Best Department Interms of placement after graduation");
          
          }
          else if(mathsWorkingCount >physicsWorkingCount && mathsWorkingCount >chemistryWorkingCount)
              System.out.println(" Mathematics is the Best Department Interms of placement after graduation");
                
      
                System.out.println("*************** REPORT ENDS******************");
                break;
             case 7:
             int csWorkingCount1=0;
             int isWorkingCount1=0;
             int emWorkingCount1=0;
             int totalSalaryCs=0;
             int totalSalaryIs=0;
             int totalSalaryEm=0;
             for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
             if(college.getCollegeName().equals("College of Engineering")){  
             for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             if(department.getName().equals("IS")){
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  isWorkingCount1++;
                  totalSalaryIs =Integer.valueOf(alumini.getSalary())+totalSalaryIs;
                   System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                   
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                         System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
          }
          
          else if(department.getName().equals("EM"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 emWorkingCount1++;
                 totalSalaryEm =Integer.valueOf(alumini.getSalary())+totalSalaryEm;
               
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                     
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                          System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
           else if(department.getName().equals("CSE"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 csWorkingCount1++;
                 totalSalaryCs =Integer.valueOf(alumini.getSalary())+totalSalaryCs;
               
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                     
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                    System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
        }
      } }
             
          int averageSalaryCs=totalSalaryCs/csWorkingCount1;   
          int averageSalaryIs=totalSalaryIs/isWorkingCount1;
          int averageSalaryEm=totalSalaryEm/emWorkingCount1;
         System.out.println("Average Salary of Alumini in CSE Department = "+averageSalaryCs);
         System.out.println("Average Salary of Alumini in IS Department = "+averageSalaryIs);
         System.out.println("Average Salary of Alumini in EM Department = "+averageSalaryEm);
         
          if(averageSalaryCs>averageSalaryIs && averageSalaryCs>averageSalaryEm)
          {
           System.out.println(" CSE is the Best Department Interms of Average Salary after graduation");
            
          }
          else if(averageSalaryEm>averageSalaryIs && averageSalaryEm>averageSalaryCs){
            System.out.println(" EM is the Best Department Interms of Average Salary after graduation");
             
          }
          else if(averageSalaryIs>averageSalaryCs && averageSalaryIs>averageSalaryEm)
              System.out.println(" IS is the Best Department Interms of Average Salary after graduation");
           
                System.out.println("***************REPORTS Ends******************");
                break;
            default:
                System.out.println("INPUT ENTERED IS INCORRECT ASK USER FOR THE INPUT AGAIN EXPLORE WHILE/Do-While loops");
                break;
        
           case 8:
             
             int financeWorkingCount2=0;
             int marketingWorkingCount2=0;
             int hrWorkingCount2=0;
             int totalSalaryFinance=0;
             int totalSalaryMarketing=0;
             int totalSalaryHr=0;
             for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
              if(college.getCollegeName().equals("College of Management")){  
          
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             if(department.getName().equals("Finance")){
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  financeWorkingCount2++;
                  totalSalaryFinance =Integer.valueOf(alumini.getSalary())+totalSalaryFinance;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
          }
          
          else if(department.getName().equals("Marketing"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 marketingWorkingCount2++;
                 totalSalaryMarketing =Integer.valueOf(alumini.getSalary())+totalSalaryMarketing;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                 
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                        System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
           else if(department.getName().equals("Human Resource"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 hrWorkingCount2++;
                 totalSalaryHr =Integer.valueOf(alumini.getSalary())+totalSalaryHr;
               
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
        }
      } 
     }
             
          int averageSalaryFinance=totalSalaryFinance/financeWorkingCount2;   
          int averageSalaryMarketing=totalSalaryMarketing/marketingWorkingCount2;
          int averageSalaryHr=totalSalaryHr/hrWorkingCount2;
         System.out.println("Average Salary of Alumini in Finance Department = "+averageSalaryFinance);
         System.out.println("Average Salary of Alumini in Marketing Department = "+averageSalaryMarketing);
         System.out.println("Average Salary of Alumini in HR Department = "+averageSalaryHr);
         
          if(averageSalaryHr>averageSalaryFinance && averageSalaryHr>averageSalaryMarketing)
          {
           System.out.println(" HR is the Best Department Interms of Average Salary after graduation");
            
          }
          else if(averageSalaryFinance>averageSalaryHr && averageSalaryFinance>averageSalaryMarketing){
            System.out.println(" Finance is the Best Department Interms of Average Salary after graduation");
             
          }
          else if(averageSalaryMarketing>averageSalaryHr && averageSalaryMarketing>averageSalaryFinance)
              System.out.println(" Markting is the Best Department Interms of Average Salary after graduation");
           
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORTS STARTS******************");
                break;
             
            case 9:
             int physicsWorkingCount2=0;
             int chemistryWorkingCount2=0;
             int mathematicsWorkingCount2=0;
             int totalSalaryPhysics=0;
             int totalSalaryChemistry=0;
             int totalSalaryMathematics=0;
             for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
             if(college.getCollegeName().equals("College of Arts")){  
          
             for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             if(department.getName().equals("Physics")){
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                 physicsWorkingCount2++;
                  totalSalaryPhysics =Integer.valueOf(alumini.getSalary())+totalSalaryPhysics;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                  
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                      System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
          }
          
          else if(department.getName().equals("Chemistry"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 chemistryWorkingCount2++;
                 totalSalaryChemistry =Integer.valueOf(alumini.getSalary())+totalSalaryChemistry;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                 
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
           else if(department.getName().equals("Mathematics"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                     mathematicsWorkingCount2++;
                 totalSalaryMathematics =Integer.valueOf(alumini.getSalary())+totalSalaryMathematics;
               
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                  
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
        }
      } 
     }
             
          int averageSalaryPhysics=totalSalaryPhysics/physicsWorkingCount2;   
          int averageSalaryChemistry=totalSalaryChemistry/chemistryWorkingCount2;
          int averageSalaryMaths=totalSalaryMathematics/mathematicsWorkingCount2;
         System.out.println("Average Salary of Alumini in Physics Department = "+averageSalaryPhysics);
         System.out.println("Average Salary of Alumini in Chemistry Department = "+averageSalaryChemistry);
         System.out.println("Average Salary of Alumini in Maths Department = "+averageSalaryMaths);
         
          if(averageSalaryChemistry >averageSalaryMaths && averageSalaryChemistry >averageSalaryPhysics)
          {
           System.out.println(" Chemistry is the Best Department Interms of Average Salary after graduation");
            
          }
          else if(averageSalaryMaths> averageSalaryChemistry && averageSalaryMaths > averageSalaryPhysics){
            System.out.println(" Mathematics is the Best Department Interms of Average Salary after graduation");
             
          }
          else if(averageSalaryPhysics >averageSalaryMaths && averageSalaryPhysics >averageSalaryChemistry)
              System.out.println(" Physics is the Best Department Interms of Average Salary after graduation");
           
                System.out.println("***************University ECO SYSTEM LEVEL REPORTS STARTS******************");
               break;
             
           
            }
            System.out.println(" \n Do You Want To Display Performance Department Wise Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status5=true;
            }   
            else if(continueReport==0){
                status5=false;
            }
             
            }while(status5);
            
            break;    
                      
          
        }
        
            System.out.println("Do You Want To Display Another Ecosystem Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status=true;
            }   
            else if(continueReport==0){
                status=false;
            }
                
            } while(status);
           break;
           }//end of case 1 (University 1)
        
            case 2:
            { 
        
                 boolean status=true;
         
         do
         {
        System.out.println("*********Welcome to the EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
        System.out.println("1.University");
        System.out.println("2.College Wise Record in the University");
        System.out.println("3.Performance College Wise Records");
        System.out.println("4.Department Wise Record in the University");
        System.out.println("5.Performance Department Wise Record in the College");
    
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. Please enter a number for example just enter 1 for University Name");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.
       
        switch (choice) {
            
        case 1:
           
         boolean status1=true;
         do{
 
            System.out.println("*********Welcome to the University Level Report*************** ");
            System.out.println("*********Please enter the choice below for University Reports*************** ");
            System.out.println("1.  University Name1");
            System.out.println("2.  Faculty List of the University");
            System.out.println("3.  Alumini Details Department Wise for Univeristy");
            System.out.println("4.  Courses Offered Department and Semester Wise");
            System.out.println("5.  List of All Department offered by University ");
            System.out.println("6.  Performance College wise of student who have published paper in University");
            System.out.println("7.  Non Teaching Faculty List of University");
        
            int choiceCase1 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase1){
            case 1:
                   
                System.out.println("University Name = "+Intialization1.initializeDepartmentDirectory().getUniversityName());
                break;
                
            case 2:
                  
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
               {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
                {      
                 for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                    if(faculty.getJobRole().equals("Teaching Faculty")){
                    System.out.println("Department = "+department.getName()+'\n');
           
                    System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
                    }
                 }
           
                }
           }
             
                 break;
                    
                    
            case 3:
            
            for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            System.out.println('\n'+ "College Name = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
             System.out.println("Department Name = "+department.getName());
          
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
              }     
             } 
           }
               System.out.println("*************** REPORT ENDS******************");
                break;
            case 4:
            for (CourseOffering courseOffering: Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getCourseOfferingDirectory().getCourseOfferingList())
            {
                       System.out.println("COurses Offered = "+courseOffering.getCourse().getCourseName());
                       System.out.println("Year = "+courseOffering.getSemester().getYear());
                       System.out.println("Season = "+courseOffering.getSemester().getSemester());
                       for (CourseSchedule courseSchedule:courseOffering.getCourse().getCourseScheduleDirectory().getCourseScheduleList())
                       {
                          System.out.println("Building = "+ courseSchedule.getClassRoom().getBuidingName());
                          System.out.println("Floor = "+ courseSchedule.getClassRoom().getFloorNumber());
                          System.out.println("Room =  "+ courseSchedule.getClassRoom().getRoomNumber());
                          System.out.println("Faculty = "+ courseSchedule.getPerson().getFirstName()+courseSchedule.getPerson().getLastName());
                       }
                   }
             break;
           
             
            case 5:
               
            for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            System.out.println('\n'+ "College Name = "+college.getCollegeName()+'\n');
           for(Department department :college.getDepartmentDirectory().getDepartmentList())
           
            {
             System.out.println("Department = "+department.getName());
            }
           }
             break;
           case 6:
          
                  float paperAvg1;
                  float paperAvg2;
                  float paperAvg3;
                  {
                  float count10=0;
                  float countPaper10=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count10++;
                       countPaper10=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper10;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper10=countPaper10/count10;
                 paperAvg1=avgPaper10;
                 
                  System.out.println("Total Number of Student Published = "+count10);
                  System.out.println("Total Number of Paper Published = "+countPaper10);
                   System.out.println("Average Number of Paper Published = "+avgPaper10);
                  }         
                  
                   {
                  float count11=0;
                  float countPaper11=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count11++;
                       countPaper11=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper11;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper11=countPaper11/count11;
                 paperAvg2=avgPaper11;
                  System.out.println("Total Number of Student Published = "+count11);
                  System.out.println("Total Number of Paper Published = "+countPaper11);
                   System.out.println("Average Number of Paper Published = "+avgPaper11);
                  }         
                      
                   
           {
                 float count12=0;
                 float countPaper12=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count12++;
                       countPaper12=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper12;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper12=countPaper12/count12;
                 paperAvg3=avgPaper12;
                  System.out.println("Total Number of Student Published = "+count12);
                  System.out.println("Total Number of Paper Published = "+countPaper12);
                   System.out.println("Average Number of Paper Published = "+avgPaper12);
                  }     
           
           
                  System.out.println("Overall Report");
                  
                   System.out.println("Average Number of Paper Published in College of Engineering = "+paperAvg1);
                   
                   System.out.println("Average Number of Paper Published in College of Management = "+paperAvg2);
                   
                   System.out.println("Average Number of Paper Published in College of Arts = "+paperAvg3);
                   
                   if(paperAvg1>paperAvg2 && paperAvg1>paperAvg3){
                       System.out.println("College of Engineering is the best in terms of Research and Paper Publication");
                   }
                   else if(paperAvg2>paperAvg1 && paperAvg2>paperAvg3){
                      System.out.println("College of Management is the best in terms of Research and Paper Publication");
                 
                   }
                     else if(paperAvg3>paperAvg1 && paperAvg3>paperAvg2){
                      System.out.println("College of Arts is the best in terms of Research and Paper Publication");
                 
                   }
          
             break;
              
               case 7:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){
                if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
           }
           
           }
           }
             break;
        
              
        }
             System.out.println("Do You Want To Display Another University Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status1=true;
            }   
            else if(continueReport==0){
                status1=false;
            }
                
          
        }while(status1);
               
            break;
            
            case 2:
            boolean status2=true;
            do{
 
            System.out.println("*********Welcome to the College Level Report*************** ");
            System.out.println("*********Please enter the choice below for College Reports*************** ");
            System.out.println("1. List of All Colleges in the University ");
            System.out.println("2. Student of College Of Engineering");
            System.out.println("3. Student List of College of Management");
            System.out.println("4. Student List of College of Arts");
            System.out.println("5. Faculty List of College Of Engineering");
            System.out.println("6. Faculty List of College of Management");
            System.out.println("7. Faculty List of College of Arts");
            System.out.println("8. Non Teaching Faculty List of College Of Engineering");
            System.out.println("9. Non Teaching Faculty List of College of Management");
            System.out.println("10. Non Teaching Faculty List of College of Arts");
            System.out.println("11. Alumini List of College Of Engineering");
            System.out.println("12. Alumini List of College of Management");
            System.out.println("13. Alumini List of College of Arts");
            System.out.println("14. Student Courseload and CGPA List Based on College ");
            System.out.println("15. Student Courseload and GPA List Based on College ");
            
       
            int choiceCase2 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase2){
            
           case 1:
            for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
            {
                System.out.println('\n'+ "College Name = "+college.getCollegeName()+'\n');
            }
            break;
            
            case 2:
             for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
             {
                 if(college.getCollegeName().equals("College of Engineering")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
           
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
                 {      
                    System.out.println("Department = "+department.getName()+'\n');
           
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
           
                  }
                }    
           
              }
             break;
             
            case 3:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Management")){
                  System.out.println("College = "+college.getCollegeName()+'\n');
                   for(Department department :college.getDepartmentDirectory().getDepartmentList())
                   {      
                     System.out.println("Department = "+department.getName()+'\n');
                      for( Student student :department.getStudentDirectory().getStudentList())
                      {
                          System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                      }
           
                   }
                 }    
           
                }
             break; 
               
            case 4:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Arts")){
                    System.out.println("College = "+college.getCollegeName()+'\n');
                  for(Department department :college.getDepartmentDirectory().getDepartmentList())
                  {      
                    System.out.println("Department = "+department.getName()+'\n');
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                  }
                }    
              }
             break;
             
             case 5:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                    if(college.getCollegeName().equals("College of Engineering")){
                    System.out.println("College = "+college.getCollegeName()+'\n');
                    for(Department department :college.getDepartmentDirectory().getDepartmentList())
                    {      
                    for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                        if(faculty.getJobRole().equals("Teaching Faculty")){
                        System.out.println("Department = "+department.getName()+'\n');
                        System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
                        }
                      }
                    }
                  }
                }
             break;
            
            case 6:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                if(college.getCollegeName().equals("College of Management")){
               System.out.println("College = "+college.getCollegeName()+'\n');
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
              {      
                for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                if(faculty.getJobRole().equals("Teaching Faculty")){
                System.out.println("Department = "+department.getName()+'\n');
                System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
                }
                } 
               }
              }
             }
             break;
             
            case 7:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                    if(college.getCollegeName().equals("College of Arts")){
                    System.out.println("College = "+college.getCollegeName()+'\n');
                    for(Department department :college.getDepartmentDirectory().getDepartmentList())
                    {      
                    for(Faculty faculty : department.getFaculty_Directory().getFacultyList() ){
                        if(faculty.getJobRole().equals("Teaching Faculty")){
                        System.out.println("Department = "+department.getName()+'\n');
                        System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
                        }
                       }
                    }
                   }
                  }
             break;
              case 8:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                if(college.getCollegeName().equals("College of Engineering")){
               System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){

        if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
             }
            }
           }
           }
             break;
             case 9:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                if(college.getCollegeName().equals("College of Management")){
               System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){
                if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
             }
            }
           }
           }
             break;
             
              case 10:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                if(college.getCollegeName().equals("College of Arts")){
               System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
             for(Faculty faculty : department.getFaculty_Directory().getStaffList()){
                if(faculty.getJobRole().equals("Staff")){
                 System.out.println("Department = "+department.getName()+'\n');
           
                 System.out.println("The Faculty" + '\n'+"FirstName = " + faculty.getFirstName()+'\n'+"LastName = " +faculty.getLastName() +'\n'+"Avalability = "+ faculty.getAvailability()+'\n'+"Designation = " +faculty.getDesignation()+'\n'+"Role And Specilization = " + faculty.getRole_description()+'\n'+"JobCategory = "+faculty.getJobRole()+'\n');
            
           }
             }
            }
           }
           }
             break;
          
            case 11:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Engineering")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
                 {      
                    for(Alumini alumini :department.getAluminiDirectory().getAluminiList() ){
                    System.out.println("Department = "+department.getName()+'\n');
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    for( Student student :department.getStudentDirectory().getStudentList())
                    {
                       if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                   }
                 }    
                }
              }
             break;
              case 12:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Management")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
                 {      
                    for(Alumini alumini :department.getAluminiDirectory().getAluminiList() ){
                    System.out.println("Department = "+department.getName()+'\n');
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    for( Student student :department.getStudentDirectory().getStudentList())
                    {
                       if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                   }
                 }    
                }
              }
             break;
              case 13:
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                {
                 if(college.getCollegeName().equals("College of Arts")){
                 System.out.println("College = "+college.getCollegeName()+'\n');
                 for(Department department :college.getDepartmentDirectory().getDepartmentList())
                 {      
                    for(Alumini alumini :department.getAluminiDirectory().getAluminiList() ){
                    System.out.println("Department = "+department.getName()+'\n');
                    System.out.println('\n'+"Alumini detail :  "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    for( Student student :department.getStudentDirectory().getStudentList())
                    {
                       if(alumini.getStudentId().equals(student.getStudentId()))
                       System.out.println("Student Record for Alumini : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
                    }
                   }
                 }    
                }
              }
             break;
             
                  case 14:
                   //Total GPA earned and CGPA
                   
                   int count =0;
                   int i=0;
                  for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
                   System.out.println("College = "+college.getCollegeName());
                   
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
                   System.out.println("Department = "+department.getName());
                   for(Student student : Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getStudentDirectory().getStudentList())
                   {
                       
                       System.out.println(student.getStudentName());
                       
                       for (Transcript transcript : student.getTranscriptDirectory().getTranscriptList())
                       {
                        System.out.println("Course Name:"+ transcript.getCourseLoad().getCourseOffering().getCourse().getCourseName()+" Year:"+ 
                        transcript.getCourseLoad().getCourseOffering().getSemester().getYear()+" Season:"+ 
                        transcript.getCourseLoad().getCourseOffering().getSemester().getSemester() + "  GPA:" + transcript.getCourseLoad().getSeat().getGpa());
                        count = count + transcript.getCourseLoad().getSeat().getGpa();
                        i=i+1;
                       
                        }
                       
                       int cgpa = count/i;
                       System.out.println("Total GPA:" + count);
                       System.out.println("CGPA:" + cgpa);
                       i=0;
                       count=0;
                   }
            }
           }
                  break;
                  
                  case 15:
                      for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
                   System.out.println("College = "+college.getCollegeName());
                   
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
                   System.out.println("Department = "+department.getName());
                 for(Student student : Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList().get(0).getDepartmentDirectory().getDepartmentList().get(0).getStudentDirectory().getStudentList())
                   {
                       
                       System.out.println(student.getStudentName());
                       
                       for (CourseLoad courseLoad : student.getCourseLoadDirectory().getCourseLoadList())
                       {
                      System.out.println("Course Load = "+ courseLoad.getCourseOffering().getCourse().getCourseName()+"Year = "+ courseLoad.getCourseOffering().getSemester().getYear()+"Season = "+ courseLoad.getCourseOffering().getSemester().getSemester());
                      //System.out.println("Course Load "+ courseLoad.getCourseOffering().getSemester().getYear());
        }
                       for (Seat seat : student.getSeatDirectory().getSeatDirectoryList()){
                           System.out.println("GPA = "+ seat.getGpa());
                       }
                   }
            }
           }
                 break;
            }
            System.out.println("Do You Want To Display College Wise Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status2=true;
            }   
            else if(continueReport==0){
                status2=false;
            }
             
            }while(status2);
            break;
            
             
            case 3:
            boolean status3=true;
            do{
 
            System.out.println("*********Welcome to the College Level Performance Report*************** ");
            System.out.println("*********Please enter the choice below for Performance College Reports*************** ");
            System.out.println("1.Performance College Evaluation Based On Department Average Salary of Alumini");
            System.out.println("2.Performance College Evaluation Based On Department Total Job Placement of Students");
            System.out.println("3. Performance College wise of student who have undergone internship in University");
            System.out.println("4. Performance Average Number of student who have published paper in College of Engineering");
            System.out.println("5. Performance Average Number of student who have published paper in College of Management");
            System.out.println("6. Performance Average Number of student who have published paper in College of Arts");
            System.out.println("7. Performance Average Number of student who have undergone internship in College of Engineering");
            System.out.println("8. Performance Average Number of student who have undergone internship in College of Management");
            System.out.println("9. Performance Average Number of student who have undergone internship in College of Engineering");
           
       
            int choiceCase3 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase3){
                
                      
            case 1 :
            int avgSalary1=0;
            int avgSalary2=0;
            int avgSalary3=0;
            { 
           
             int WorkingCount=0;
             int totalSalary=0;
              for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Engineering")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount++;
                  totalSalary =Integer.valueOf(alumini.getSalary())+totalSalary;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        int averageSalary1=totalSalary/WorkingCount; 
        avgSalary1=averageSalary1;
        System.out.println("Average Salary of College of Engineering = "+averageSalary1);
        }
                
            { 
             int WorkingCount1=0;
             int totalSalary1=0;
              for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Management")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount1++;
                  totalSalary1 =Integer.valueOf(alumini.getSalary())+totalSalary1;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        int averageSalary2=totalSalary1/WorkingCount1; 
        avgSalary2=averageSalary2;
        System.out.println("Average Salary of College of Management = "+averageSalary2);
            }
            
            
            {
                
             int WorkingCount2=0;
             int totalSalary2=0;
              for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Arts")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount2++;
                  totalSalary2 =Integer.valueOf(alumini.getSalary())+totalSalary2;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        int averageSalary3=totalSalary2/WorkingCount2; 
        avgSalary3=averageSalary3;
        System.out.println("Average Salary of College of Arts = "+averageSalary3);
         }
            
         System.out.println("Overall Report of Average Salary : ");
        
         System.out.println("Average Salary of College of Engineering = "+avgSalary1);
         System.out.println("Average Salary of College of Management = "+avgSalary2);
         System.out.println("Average Salary of College of Arts = "+avgSalary3);
            
        if(avgSalary1 >avgSalary2 && avgSalary1>avgSalary3)
        {
            System.out.println("College of Engineering is the best in terms of Salary Earned by Student ");
        }
        else if(avgSalary2>avgSalary1 && avgSalary2>avgSalary3)
            System.out.println ("College of Management is the best in terms of Salary Earned by Student ");
        else if(avgSalary3>avgSalary1 && avgSalary3>avgSalary2)
            System.out.println ("College of Arts is the best in terms of Salary Earned by Student ");
       
        break;
            
        
         case 2 :
             int countWorking=0;
             int countWorking1=0;
             int countWorking2=0;
           
            { 
           
             int WorkingCount=0;
            
              for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Engineering")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        System.out.println("Total Number of Student Employed in College of Engineering = "+WorkingCount);
        countWorking=WorkingCount;
        }
                
            { 
             int WorkingCount1=0;
            
              for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Management")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount1++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        
        System.out.println("Total Number of Student Employed in  College of Management = "+WorkingCount1);
            countWorking1=WorkingCount1;
            }
            
            
            {
                
             int WorkingCount2=0;
           
              for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               if(college.getCollegeName().equals("College of Arts")){
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCount2++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
          }
            
        }
      } 
              
        System.out.println("Total Number of Student Employed in  College of Arts = "+WorkingCount2);
        countWorking2=WorkingCount2;
        
         }
            
         System.out.println("Overall Report of Salary : ");
        
         System.out.println("Total Number of Student Employed in  College of Engineering"+countWorking);
         System.out.println("Total Number of Student Employed in College of Management = "+countWorking1);
         System.out.println("Total Number of Student Employed in  College of Arts = "+countWorking2);
            
        if(countWorking>countWorking1 && countWorking >countWorking2)
        {
            System.out.println("College of Engineering is the best in terms of Number of Students Earned Job ");
        }
        else if(countWorking1>countWorking && countWorking1 >countWorking2)
            System.out.println ("College of Management is the best in terms of Number of Students Earned Job ");
        else if(countWorking2>countWorking1 && countWorking2>countWorking)
            System.out.println ("College of Arts is the best in terms of Number of Students Earned Job  ");
       
        break;
            
      
                case 3:
          
                  float internAvg1;
                  float internAvg2;
                  float internAvg3;
                  {
                  float count10=0;
                  float countPaper10=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count10++;
                       countPaper10=Integer.valueOf(student.getNumberOfInternship())+countPaper10;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper10=countPaper10/count10;
                 internAvg1=avgPaper10;
                 
                  System.out.println("Total Number of Student Published = "+count10);
                  System.out.println("Total Number of Paper Published = "+countPaper10);
                   System.out.println("Average Number of Paper Published = "+avgPaper10);
                  }         
                  
                   {
                  float count11=0;
                  float countPaper11=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count11++;
                       countPaper11=Integer.valueOf(student.getNumberOfInternship())+countPaper11;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper11=countPaper11/count11;
                 internAvg2=avgPaper11;
                  System.out.println("Total Number of Student Published = "+count11);
                  System.out.println("Total Number of Paper Published = "+countPaper11);
                   System.out.println("Average Number of Paper Published = "+avgPaper11);
                  }         
                      
                   
           {
                 float count12=0;
                 float countPaper12=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count12++;
                       countPaper12=Integer.valueOf(student.getNumberOfInternship())+countPaper12;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper12=countPaper12/count12;
                 internAvg3=avgPaper12;
                  System.out.println("Total Number of Student Published = "+count12);
                  System.out.println("Total Number of Paper Published = "+countPaper12);
                   System.out.println("Average Number of Paper Published = "+avgPaper12);
                  }     
           
           
                  System.out.println("Overall Report");
                  
                   System.out.println("Average Number of Internship done in College of Engineering = "+internAvg1);
                   
                   System.out.println("Average Number of Internship done in College of Management = "+internAvg2);
                   
                   System.out.println("Average Number of Internship done in College of Arts = "+internAvg3);
                   
                   if(internAvg1>internAvg2 && internAvg1>internAvg3){
                       System.out.println("College of Engineering is the best in terms of Internship student Underwent");
                   }
                   else if(internAvg2>internAvg1 && internAvg2 >internAvg3){
                      System.out.println("College of Management is the best in terms of Internship student Underwent");
                 
                   }
                     else if(internAvg3>internAvg1 && internAvg3>internAvg2){
                      System.out.println("College of Arts is the best in terms of Internship student Underwent");
                 
                   }
          
             break;
             
                  case 4:
                  float count5=0;
                  float countPaper=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count5++;
                       countPaper=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper=countPaper/count5;
                 
                  System.out.println("Total Number of Student Published = "+count5);
                  System.out.println("Total Number of Paper Published = "+countPaper);
                   System.out.println("Average Number of Paper Published = "+avgPaper);
                  
                  
                 
             break;
             case 5:
                  float count6=0;
                  float countPaper1=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count6++;
                       countPaper1=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper1;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper1=countPaper1/count6;
                 
                  System.out.println("Total Number of Student Published = "+count6);
                  System.out.println("Total Number of Paper Published = "+countPaper1);
                   System.out.println("Average Number of Paper Published = "+avgPaper1);
                  
                  
                 
             break;

              case 6:
                  float count7=0;
                  float countPaper2=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count7++;
                       countPaper2=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper2;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgPaper2=countPaper2/count7;
                 
                  System.out.println("Total Number of Student Published = "+count7);
                  System.out.println("Total Number of Paper Published = "+countPaper2);
                   System.out.println("Average Number of Paper Published = "+avgPaper2);
            break;
        case 7:
                  float count20=0;
                  float countInternship20=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count20++;
                       countInternship20=Integer.valueOf(student.getNumberOfInternship())+countInternship20;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgInternship20=countInternship20/count20;
                 
                  System.out.println("Total Number of Student Published = "+count20);
                  System.out.println("Total Number of Paper Published = "+countInternship20);
                   System.out.println("Average Number of Paper Published = "+avgInternship20);
                  
                  
                 
             break;
             case 8:
                 
                  float count21=0;
                  float countInternship21=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count21++;
                       countInternship21=Integer.valueOf(student.getNumberOfInternship())+countInternship21;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgInternship21=countInternship21/count21;
                 
                  System.out.println("Total Number of Student Published = "+count21);
                  System.out.println("Total Number of Paper Published = "+countInternship21);
                   System.out.println("Average Number of Paper Published = "+avgInternship21);
                  
                  
                 
             break;
             case 9:
                 
                  float count22=0;
                  float countInternship22=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count22++;
                       countInternship22=Integer.valueOf(student.getNumberOfInternship())+countInternship22;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
           
           }
                 float avgInternship22=countInternship22/count22;
                 
                  System.out.println("Total Number of Student Published = "+count22);
                  System.out.println("Total Number of Paper Published = "+countInternship22);
                   System.out.println("Average Number of Paper Published = "+avgInternship22);
                  
                  
                 
             break;
               
            }
            System.out.println("Do You Want To Display Performance College Wise Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status3=true;
            }   
            else if(continueReport==0){
                status3=false;
            }
             
            }while(status3);
            
            break;
                    
                    
            case 5:
                 boolean status5=true;
                 do{
 
                  System.out.println("*********Welcome to the Deprtment Level Report*************** ");
                  System.out.println("*********Please enter the choice below for Department Reports*************** ");
                  System.out.println("1. Performance Department wise of student who have undergone internship in College of Engineering");
                  System.out.println("2. Performance Department wise of student who have undergone internship in College of Management");
                  System.out.println("3. Performance Department wise of student who have undergone internship in College of Arts");
       
                  System.out.println("4.Performance Department wise Placement Record for College of Engineering");
                  System.out.println("5.Performance Department wise Placement Record for College of Management");
                  System.out.println("6.Performance Department wise Placement Record for College of Arts");
                  System.out.println("7.Performance Department wise Salary Based Performance Record for College of Engineering ");
                  System.out.println("8.Performance Department wise Salary Based Performance Record for College of Management ");
                  System.out.println("9.Performance Department wise Salary Based Performance Record for College of Arts ");
      
       
            int choiceCase5 = reader.nextInt(); // Scans the next token of the input as an int.
            switch(choiceCase5){
                 case 1 :
                     
                 float count30=0;
                 float count31=0;
                 float count32=0;
                  float countInternship30=0;
                  float countInternship31=0;
                  float countInternship32=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Engineering")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {     
               if(department.getName().equals("IS")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count30++;
                       countInternship30=Integer.valueOf(student.getNumberOfInternship())+countInternship30;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
               else if(department.getName().equals("EM")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count31++;
                       countInternship31=Integer.valueOf(student.getNumberOfInternship())+countInternship31;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
                else if(department.getName().equals("CSE")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count32++;
                       countInternship32=Integer.valueOf(student.getNumberOfInternship())+countInternship32;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
         }
           
           }
                 float avgInternship30=countInternship30/count30;
                 
                 float avgInternship31=countInternship31/count31;
                 
                 float avgInternship32=countInternship32/count32;
                 
               System.out.println("Average Number of Internship Student in IS Department = "+avgInternship30);
               System.out.println("Average Number of Internship Student in EM Department = "+avgInternship31);
               System.out.println("Average Number of Internship Student in CSE Department = "+avgInternship32);
               
               if(avgInternship30>avgInternship31 && avgInternship30 >avgInternship32 )
               {
                   System.out.println("IS Department is the best in terms of Internship");
                   
               }
               else if(avgInternship31>avgInternship30 && avgInternship31>avgInternship32){
                   System.out.println("EM Department is the best in terms of Internship");
               }
                 
               else if(avgInternship32>avgInternship31 && avgInternship32 >avgInternship30){
                   System.out.println("CSE Department is the best in terms of Internship");
               }
                
             break;
             
                  case 2 :
                     
                  float count40=0;
                  float count41=0;
                  float count42=0;
                  float countInternship40=0;
                  float countInternship41=0;
                  float countInternship42=0;
                  for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
               {
                 if(college.getCollegeName().equals("College of Management")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
           {     
               if(department.getName().equals("Finance")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count40++;
                       countInternship40=Integer.valueOf(student.getNumberOfInternship())+countInternship40;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
               else if(department.getName().equals("Marketing")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count41++;
                       countInternship41=Integer.valueOf(student.getNumberOfInternship())+countInternship41;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
                else if(department.getName().equals("Human Resource")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count42++;
                       countInternship42=Integer.valueOf(student.getNumberOfInternship())+countInternship42;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
         }
           
           }
                 float avgInternship40=countInternship40/count40;
                 
                 float avgInternship41=countInternship41/count41;
                 
                 float avgInternship42=countInternship42/count42;
                 
               System.out.println("Average Number of Internship Student in Finance Department = "+avgInternship40);
               System.out.println("Average Number of Internship Student in Marketing Department = "+avgInternship41);
               System.out.println("Average Number of Internship Student in Human Resource Department = "+avgInternship42);
               
               if(avgInternship40>avgInternship41 && avgInternship40 >avgInternship42 )
               {
                   System.out.println("Finance Department is the best in terms of Internship");
                   
               }
               else if(avgInternship41>avgInternship40 && avgInternship41>avgInternship42){
                   System.out.println("Marketing Department is the best in terms of Internship");
               }
                 
               else if(avgInternship42>avgInternship41 && avgInternship42 >avgInternship40){
                   System.out.println("Human Resource Department is the best in terms of Internship");
               }
                
             break;
              
                  case 3 :
                     
                 float count50=0;
                 float count51=0;
                 float count52=0;
                  float countInternship50=0;
                  float countInternship51=0;
                  float countInternship52=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                 if(college.getCollegeName().equals("College of Arts")){
             
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {     
               if(department.getName().equals("Physics")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count50++;
                       countInternship50=Integer.valueOf(student.getNumberOfInternship())+countInternship50;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
               else if(department.getName().equals("Chemistry")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count51++;
                       countInternship51=Integer.valueOf(student.getNumberOfInternship())+countInternship51;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
                else if(department.getName().equals("Mathematics")){ 
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count52++;
                       countInternship52=Integer.valueOf(student.getNumberOfInternship())+countInternship52;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            }    
         }
           
           }
                 float avgInternship50=countInternship50/count50;
                 
                 float avgInternship51=countInternship51/count51;
                 
                 float avgInternship52=countInternship52/count52;
                 
               System.out.println("Average Number of Internship Student in Physics Department = "+avgInternship50);
               System.out.println("Average Number of Internship Student in Chemistry Department = "+avgInternship51);
               System.out.println("Average Number of Internship Student in Mathematcis Department = "+avgInternship52);
               
               if(avgInternship50>avgInternship51 && avgInternship50 >avgInternship52 )
               {
                   System.out.println("Physics Department is the best in terms of Internship");
                   
               }
               else if(avgInternship51>avgInternship50 && avgInternship51>avgInternship52){
                   System.out.println("Chemistry Department is the best in terms of Internship");
               }
                 
               else if(avgInternship52>avgInternship51 && avgInternship52 >avgInternship50){
                   System.out.println("Mathematics Department is the best in terms of Internship");
               }
                
             break;
            
            case 4:
                
             int isWorkingCount=0;
             int emWorkingCount=0;
             int csWorkingCount=0;  
             
            for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
               if(college.getCollegeName().equals("College of Engineering"))
               {
              
            System.out.println("University = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
         
            
          {
             System.out.println("Department = "+department.getName());
          if(department.getName().equals("IS"))
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     isWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
          
          else if(department.getName().equals("EM"))
              
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     emWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
           else if(department.getName().equals("CSE")){
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                    csWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year" +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
          
         
           }
         }
       }
           }
       System.out.println("Total Number of Student Placed in IS Department = "+isWorkingCount);
          System.out.println("Total Number of Student Placed in EM Department = "+emWorkingCount);
          System.out.println("Total Number of Student Placed in CSE Department = "+csWorkingCount);
        
          if(isWorkingCount> emWorkingCount && isWorkingCount >csWorkingCount)
          {
           System.out.println(" IS is the Best Department Interms of placement after graduation");
            
          }
          else if(csWorkingCount>isWorkingCount && csWorkingCount>emWorkingCount){
              System.out.println("CS is the Best Department Interms of placement after graduation");
          
          }
          else if(emWorkingCount>csWorkingCount && emWorkingCount>isWorkingCount)
              System.out.println(" EM is the Best Department Interms of placement after graduation");
                
      
         
               System.out.println("*************** REPORT ENDS******************");
                break;
          
             
            
            case 5:
                
            int financeWorkingCount=0;
            int marketingWorkingCount=0;
            int hrWorkingCount=0;  
             
            for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
               if(college.getCollegeName().equals("College of Management"))
               {
              
            System.out.println("University = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
         
            
            {
             System.out.println("Department = "+department.getName());
            if(department.getName().equals("Finance"))
            {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     financeWorkingCount++;
                     System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
                      for( Student student :department.getStudentDirectory().getStudentList())
                      {
                        if(alumini.getStudentId().equals(student.getStudentId())  )
                        System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                      }
                 }  
             }
             
           }
          
          else if(department.getName().equals("Marketing"))
              
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     marketingWorkingCount++;
                    System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
           else if(department.getName().equals("Human Resource")){
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
                {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                    hrWorkingCount++;
                    System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
                    for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year" +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
          }
      
          
        }
       }
      }
          System.out.println("Total Number of Student Placed in Finance Department = "+financeWorkingCount);
          System.out.println("Total Number of Student Placed in Marketing Department = "+marketingWorkingCount);
          System.out.println("Total Number of Student Placed in Human Resource Department = "+hrWorkingCount);
        
          if(financeWorkingCount> marketingWorkingCount && financeWorkingCount > hrWorkingCount)
          {
           System.out.println(" Finance is the Best Department Interms of placement after graduation");
            
          }
          else if(marketingWorkingCount>financeWorkingCount && marketingWorkingCount>hrWorkingCount){
              System.out.println("Marketing is the Best Department Interms of placement after graduation");
          
          }
          else if(hrWorkingCount>financeWorkingCount && hrWorkingCount>marketingWorkingCount)
              System.out.println(" Human Resource is the Best Department Interms of placement after graduation");
                
      
                System.out.println("***************Department LEVEL REPORT ENDS******************");
                break;
            
        case 6:
        
            int physicsWorkingCount=0;
            int mathsWorkingCount=0;
            int chemistryWorkingCount=0;  
             
            for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
            
               if(college.getCollegeName().equals("College of Arts"))
               {
              
            System.out.println("University = "+college.getCollegeName()+'\n');
            for(Department department :college.getDepartmentDirectory().getDepartmentList())
         
            
            {
             System.out.println("Department = "+department.getName());
          if(department.getName().equals("Physics"))
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     physicsWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
          
          else if(department.getName().equals("Chemistry"))
              
          {
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                     chemistryWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary Per Annum = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
           }
           else if(department.getName().equals("Mathematics")){
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                    mathsWorkingCount++;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Company Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year" +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
          
         
           }
      
          
         }
       }
      }
          System.out.println("Total Number of Student Placed in Physics Department = "+physicsWorkingCount);
          System.out.println("Total Number of Student Placed in Chemistry Department = "+chemistryWorkingCount);
        
          System.out.println("Total Number of Student Placed in Mathematics Department = "+mathsWorkingCount);
         
          if(physicsWorkingCount >chemistryWorkingCount && physicsWorkingCount > mathsWorkingCount)
          {
           System.out.println(" Physics is the Best Department Interms of placement after graduation");
            
          }
          else if(chemistryWorkingCount >mathsWorkingCount && chemistryWorkingCount>physicsWorkingCount){
              System.out.println("Chemistry is the Best Department Interms of placement after graduation");
          
          }
          else if(mathsWorkingCount >physicsWorkingCount && mathsWorkingCount >chemistryWorkingCount)
              System.out.println(" Mathematics is the Best Department Interms of placement after graduation");
                
      
                System.out.println("*************** REPORT ENDS******************");
                break;
             case 7:
             int csWorkingCount1=0;
             int isWorkingCount1=0;
             int emWorkingCount1=0;
             int totalSalaryCs=0;
             int totalSalaryIs=0;
             int totalSalaryEm=0;
             for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
             if(college.getCollegeName().equals("College of Engineering")){  
             for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             if(department.getName().equals("IS")){
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  isWorkingCount1++;
                  totalSalaryIs =Integer.valueOf(alumini.getSalary())+totalSalaryIs;
                   System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                   
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                         System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
          }
          
          else if(department.getName().equals("EM"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 emWorkingCount1++;
                 totalSalaryEm =Integer.valueOf(alumini.getSalary())+totalSalaryEm;
               
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                     
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                          System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
           else if(department.getName().equals("CSE"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 csWorkingCount1++;
                 totalSalaryCs =Integer.valueOf(alumini.getSalary())+totalSalaryCs;
               
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                     
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                    System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
        }
      } }
             
          int averageSalaryCs=totalSalaryCs/csWorkingCount1;   
          int averageSalaryIs=totalSalaryIs/isWorkingCount1;
          int averageSalaryEm=totalSalaryEm/emWorkingCount1;
         System.out.println("Average Salary of Alumini in CSE Department = "+averageSalaryCs);
         System.out.println("Average Salary of Alumini in IS Department = "+averageSalaryIs);
         System.out.println("Average Salary of Alumini in EM Department = "+averageSalaryEm);
         
          if(averageSalaryCs>averageSalaryIs && averageSalaryCs>averageSalaryEm)
          {
           System.out.println(" CSE is the Best Department Interms of Average Salary after graduation");
            
          }
          else if(averageSalaryEm>averageSalaryIs && averageSalaryEm>averageSalaryCs){
            System.out.println(" EM is the Best Department Interms of Average Salary after graduation");
             
          }
          else if(averageSalaryIs>averageSalaryCs && averageSalaryIs>averageSalaryEm)
              System.out.println(" IS is the Best Department Interms of Average Salary after graduation");
           
                System.out.println("***************REPORTS Ends******************");
                break;
            default:
                System.out.println("INPUT ENTERED IS INCORRECT ASK USER FOR THE INPUT AGAIN EXPLORE WHILE/Do-While loops");
                break;
        
           case 8:
             
             int financeWorkingCount2=0;
             int marketingWorkingCount2=0;
             int hrWorkingCount2=0;
             int totalSalaryFinance=0;
             int totalSalaryMarketing=0;
             int totalSalaryHr=0;
             for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
              if(college.getCollegeName().equals("College of Management")){  
          
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             if(department.getName().equals("Finance")){
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  financeWorkingCount2++;
                  totalSalaryFinance =Integer.valueOf(alumini.getSalary())+totalSalaryFinance;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
          }
          
          else if(department.getName().equals("Marketing"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 marketingWorkingCount2++;
                 totalSalaryMarketing =Integer.valueOf(alumini.getSalary())+totalSalaryMarketing;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                 
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                        System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
           else if(department.getName().equals("Human Resource"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 hrWorkingCount2++;
                 totalSalaryHr =Integer.valueOf(alumini.getSalary())+totalSalaryHr;
               
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                    
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
        }
      } 
     }
             
          int averageSalaryFinance=totalSalaryFinance/financeWorkingCount2;   
          int averageSalaryMarketing=totalSalaryMarketing/marketingWorkingCount2;
          int averageSalaryHr=totalSalaryHr/hrWorkingCount2;
         System.out.println("Average Salary of Alumini in Finance Department = "+averageSalaryFinance);
         System.out.println("Average Salary of Alumini in Marketing Department = "+averageSalaryMarketing);
         System.out.println("Average Salary of Alumini in HR Department = "+averageSalaryHr);
         
          if(averageSalaryHr>averageSalaryFinance && averageSalaryHr>averageSalaryMarketing)
          {
           System.out.println(" HR is the Best Department Interms of Average Salary after graduation");
            
          }
          else if(averageSalaryFinance>averageSalaryHr && averageSalaryFinance>averageSalaryMarketing){
            System.out.println(" Finance is the Best Department Interms of Average Salary after graduation");
             
          }
          else if(averageSalaryMarketing>averageSalaryHr && averageSalaryMarketing>averageSalaryFinance)
              System.out.println(" Markting is the Best Department Interms of Average Salary after graduation");
           
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORTS STARTS******************");
               break;
             
            case 9:
             int physicsWorkingCount2=0;
             int chemistryWorkingCount2=0;
             int mathematicsWorkingCount2=0;
             int totalSalaryPhysics=0;
             int totalSalaryChemistry=0;
             int totalSalaryMathematics=0;
             for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
             if(college.getCollegeName().equals("College of Arts")){  
          
             for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
            System.out.println("Department = "+department.getName());
             if(department.getName().equals("Physics")){
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                 physicsWorkingCount2++;
                  totalSalaryPhysics =Integer.valueOf(alumini.getSalary())+totalSalaryPhysics;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                  
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                      System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                   }
                 }  
             }
             
          }
          
          else if(department.getName().equals("Chemistry"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                 chemistryWorkingCount2++;
                 totalSalaryChemistry =Integer.valueOf(alumini.getSalary())+totalSalaryChemistry;
                 System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                 
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
           else if(department.getName().equals("Mathematics"))
                for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {
                     mathematicsWorkingCount2++;
                 totalSalaryMathematics =Integer.valueOf(alumini.getSalary())+totalSalaryMathematics;
               
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                  
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                   if(alumini.getStudentId().equals(student.getStudentId())  )
                       System.out.println( "Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student start year = " +student.getStartYear()+'\n' +"student department = "+ student.getDepartment()+'\n'); 
    
                    }
                 }  
             }
        }
      } 
     }
             
          int averageSalaryPhysics=totalSalaryPhysics/physicsWorkingCount2;   
          int averageSalaryChemistry=totalSalaryChemistry/chemistryWorkingCount2;
          int averageSalaryMaths=totalSalaryMathematics/mathematicsWorkingCount2;
         System.out.println("Average Salary of Alumini in Physics Department = "+averageSalaryPhysics);
         System.out.println("Average Salary of Alumini in Chemistry Department = "+averageSalaryChemistry);
         System.out.println("Average Salary of Alumini in Maths Department = "+averageSalaryMaths);
         
          if(averageSalaryChemistry >averageSalaryMaths && averageSalaryChemistry >averageSalaryPhysics)
          {
           System.out.println(" Chemistry is the Best Department Interms of Average Salary after graduation");
            
          }
          else if(averageSalaryMaths> averageSalaryChemistry && averageSalaryMaths > averageSalaryPhysics){
            System.out.println(" Mathematics is the Best Department Interms of Average Salary after graduation");
             
          }
          else if(averageSalaryPhysics >averageSalaryMaths && averageSalaryPhysics >averageSalaryChemistry)
              System.out.println(" Physics is the Best Department Interms of Average Salary after graduation");
           
                System.out.println("***************EDUCATION ECO SYSTEM LEVEL REPORTS STARTS******************");
               break;
             
           
            }
            System.out.println("Do You Want To Display Performance Department Wise Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status5=true;
            }   
            else if(continueReport==0){
                status5=false;
            }
             
            }while(status5);
            
            break;    
        

                 
        }
        
            System.out.println("Do You Want To Display Another Ecosystem Report \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                status=true;
            }   
            else if(continueReport==0){
                status=false;
            }
                
            } while(status);
            break;
           }
            case 3:
                
        System.out.println("*********Welcome to the Performance Evaluation for EDUCATION LEVEL ECOSYSTEM*************** ");
        System.out.println("1. Performance Evaluation of University Based on Number of Student Placed After Graduations");
        System.out.println("2. Performance Evaluation of University Based on Number of Student Publised Technical Papers during Graduations");
        System.out.println("3. Performance Evaluation of University Based on Number of Student underwent Internship during Graduations");
       
        int choiceP = reader1.nextInt(); // Scans the next token of the input as an int.
       
        switch (choiceP) {
            case 1:
                 
        {
         
         
         
                 int WorkingCountUniv1=0;
                 
                 int WorkingCountUniv2=0;
                 
            
              for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
                
                System.out.println('\n'+"College Name " +college.getCollegeName());
             
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
               System.out.println('\n'+"Department Name " +department.getName());
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCountUniv1++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                }  
             }
          }
            
        }
              
                for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
           {
               System.out.println('\n'+"College Name " +college.getCollegeName());
             
              for(Department department :college.getDepartmentDirectory().getDepartmentList())
            {
                
              System.out.println('\n'+"Department Name " +department.getName());
            
             for (Alumini alumini : department.getAluminiDirectory().getAluminiList())
             {
                 if(alumini.getWorkingStatus().equals("Working"))
                 {    
                  WorkingCountUniv2++;
                  System.out.println('\n'+"Alumini detail : "+ '\n' +"Alumini Student ID = "+alumini.getStudentId()+'\n'+"Alumini Comapany Name = "+alumini.getCompanyName()+'\n'+"Alumini Salary = "+alumini.getSalary()+'\n'+"Alumini Passed Out Year = "+alumini.getPassedyYear());
                 }  
             }
          }
            
        }
         System.out.println("Total Number of Student Employed in Northeastern University = " + WorkingCountUniv1);
                    
         System.out.println("Total Number of Student Employed in Boston University = " + WorkingCountUniv2);
              
         if(WorkingCountUniv1 > WorkingCountUniv2)
         {
            System.out.println("Northeastern University is the Best University interms of Number of Students Placed in University After Graduation");
         }
         if(WorkingCountUniv1 < WorkingCountUniv2)
         {
            System.out.println("Boston University is the Best University interms of Number of Students Placed in University After Graduation");
         }
             
         break;
        }
        
            case 2:
                
                  {
                  float count=0;
                  float countPaper=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count++;
                       countPaper=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            
           
           }
                 float avgPaper=countPaper/count;
               
                 
                  System.out.println("Total Number of Student Published = "+count);
                  System.out.println("Total Number of Paper Published = "+countPaper);
                   System.out.println("Average Number of Paper Published = "+avgPaper);
                          
                  
                {
                  float count1=0;
                  float countPaper1=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count1++;
                       countPaper1=Integer.valueOf(student.getNumberOfPaperPublished())+countPaper;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            
           
           }
                 float avgPaper1=countPaper1/count1;
               
                 
                  System.out.println("Total Number of Student Published = "+count1);
                  System.out.println("Total Number of Paper Published = "+countPaper1);
                   System.out.println("Average Number of Paper Published = "+avgPaper1);
                     if(avgPaper>avgPaper1){
                   System.out.println("Northeastern University is the Best University interms of Number of Students Publishes Technical Papers in University ");
       
                   }
                     else if(avgPaper<avgPaper1){
                      System.out.println("Boston University is the Best University interms of Number of Students Publishes Technical Papers in University ");
       
                   }
                  }
                 
                  
                  } 
                break;
                
            case 3:
                 {
                  float count=0;
                  float countPaper=0;
                 for(College college :Intialization.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count++;
                       countPaper=Integer.valueOf(student.getNumberOfInternship())+countPaper;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            
           
           }
                 float avgPaper=countPaper/count;
               
                 
                  System.out.println("Total Number of Student Published = "+count);
                  System.out.println("Total Number of Paper Published = "+countPaper);
                   System.out.println("Average Number of Paper Published = "+avgPaper);
                          
                  
                {
                  float count1=0;
                  float countPaper1=0;
                 for(College college :Intialization1.initializeDepartmentDirectory().getCollegeDirectory().getCollegeList())
                 {
               
                System.out.println("College = "+college.getCollegeName()+'\n');
           
               for(Department department :college.getDepartmentDirectory().getDepartmentList())
            
            {      
              System.out.println("Department = "+department.getName()+'\n');
           
               for( Student student :department.getStudentDirectory().getStudentList())
                   {
                       count1++;
                       countPaper1=Integer.valueOf(student.getNumberOfInternship())+countPaper;
                       System.out.println("Student Record : "+'\n'+"Student Name = " + student.getStudentName() +'\n' +"Student ID = " +student.getStudentId()+'\n' +"Student Start Year = " +student.getStartYear()+'\n' +"Student Department = "+ student.getDepartment()+'\n' +"Number of Paper Published = "+student.getNumberOfPaperPublished()+'\n'+"Number of InternShip = "+ student.getNumberOfInternship()+'\n'); 
    
                    }
           
             }
            
           
           }
                 float avgPaper1=countPaper1/count1;
               
                 
                  System.out.println("Total Number of Student Published = "+count1);
                  System.out.println("Total Number of Paper Published = "+countPaper1);
                   System.out.println("Average Number of Paper Published = "+avgPaper1);
                     if(avgPaper>avgPaper1){
                   System.out.println("Northeastern University is the Best University interms of Number of Student who have done Internship during Graduation");
       
                   }
                     else if(avgPaper<avgPaper1){
                  System.out.println("Boston University is the Best University interms of Number of Student who have done Internship during Graduation");
       
                   }
                  }
                 
                  
                  } 
                
                break;
        }
            
        }// end of Switch
         System.out.println("Do You Want To Display All University Report Again \n Press Number 1 to Contine OR 0 to Exit Report");
            int continueReport = reader1.nextInt(); // Scans the next token of the input as an int.
            if(continueReport==1){
                statusMain=true;
            }   
            else if(continueReport==0){
                statusMain=false;
            }
         }while(statusMain);
     }//end of static main
        
}//end of main
