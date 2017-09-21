/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class UniversityArray {

    private ArrayList<University> universityArray;

    public ArrayList<University> getUniversityArray() {
        return universityArray;
    }

    public void setUniversityArray(ArrayList<University> universityArray) {
        this.universityArray = universityArray;
    }

    public UniversityArray() {
        universityArray = new ArrayList<University>();
    }

    public University addUniversity() {
        University un = new University();
        universityArray.add(un);
        return un;
    }

    public void deleteUniversity(University u) {
        universityArray.remove(u);

    }

    public void calculateUniversityFacultyRatio(UniversityArray ua) {
        for (University u : ua.getUniversityArray()) {
            for (College c : u.getCollegearray().getCollegeArray()) {
                for (Department d : c.getDepartmentArray().getDepartmentArray()) {
                    //departmentArray.calculateFacultyRatio();

                    System.out.println("University Name : " + u.getUniversityName());
                    System.out.println("College Name : " + c.getCollegeName());
                    System.out.println("Department Name : " + d.getDepartmentName());
                    int a = 0;
                    int b = 0;
                    for (Faculty faculty : d.getFacultyDirectory().getFacultyDirectory()) {
                        if (faculty.getFacultyType() == "FullTime") {
                            a++;

                        }
                        if (faculty.getFacultyType() == "PartTime") {
                            b++;

                        }
                    }
                    System.out.println("full time count " + a);
                    System.out.println("part time count " + b);
                    ratio(a, b);
                }
            }
        }

    }

    public void studentEmploymentRatio(UniversityArray ua) {
        for (University u : ua.getUniversityArray()) {
            for (College c : u.getCollegearray().getCollegeArray()) {
                for (Department d : c.getDepartmentArray().getDepartmentArray()) {
                    //departmentArray.calculateFacultyRatio();

                    System.out.println("University Name : " + u.getUniversityName());
                    System.out.println("College Name : " + c.getCollegeName());
                    System.out.println("Department Name : " + d.getDepartmentName());
                    int a = 0;
                    int b = 0;
                    for (Student student : d.getStudentDirectory().getStudentDeptDirectory()) {
                        if (student.getEmploymentStatus()== "Employed") {
                            a++;

                        }
                        
                    }
                    System.out.println("No of Students employed " + a);

                }
            }
        }

    }

    public void ratio(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if (max % min == 0) {
            System.out.println("1" + " " + max / min);
            return;
        }
        for (int i = 2; i <= min; i++) {
            while (max % i == 0 && min % i == 0) {
                max /= i;
                min /= i;
            }
        }
        System.out.println(max + ":" + min);
    }

    public void calculateUniversityFacultyStaffRatio(UniversityArray ua) {

        for (University u : ua.getUniversityArray()) {
            for (College c : u.getCollegearray().getCollegeArray()) {
                for (Department d : c.getDepartmentArray().getDepartmentArray()) {
                    int a = d.getFacultyDirectory().getFacultyDirectory().size();
                    int b = d.getStaffRoleDirectory().getStaffRoleDirectory().size();
                    System.out.println("University Name : " + u.getUniversityName());
                    System.out.println("College Name : " + c.getCollegeName());
                    System.out.println("Department Name : " + d.getDepartmentName());
                    ratio(a, b);
                }
            }
        }

    }

    public void calculateUniversityStudentFacultyRatio(UniversityArray ua) {
        for (University u : ua.getUniversityArray()) {
            for (College c : u.getCollegearray().getCollegeArray()) {
                for (Department d : c.getDepartmentArray().getDepartmentArray()) {
                    int a = d.getFacultyDirectory().getFacultyDirectory().size();
                    int b = d.getStudentDirectory().getStudentDeptDirectory().size();
                    System.out.println("University Name : " + u.getUniversityName());
                    System.out.println("College Name : " + c.getCollegeName());
                    System.out.println("Department Name : " + d.getDepartmentName());
                    ratio(a, b);
                }
            }
        }
    }

    public void calculateUniversityPhdPercentage(UniversityArray ua) {
        for (University u : ua.getUniversityArray()) {
            for (College c : u.getCollegearray().getCollegeArray()) {
                int result = 0;
                for (Department d : c.getDepartmentArray().getDepartmentArray()) {
                    for (Faculty faculty : d.getFacultyDirectory().getFacultyDirectory()) {
                        if (faculty.getQualification().contains("Phd")) {
                            result++;
                        }
                    }
                    System.out.println("University Name : " + u.getUniversityName());
                    System.out.println("College Name : " + c.getCollegeName());
                    System.out.println("Department Name : " + d.getDepartmentName());
                    System.out.println("No of phd   : " + result);
                }
            }
        }
    }

}
