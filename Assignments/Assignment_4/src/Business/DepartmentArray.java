/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

public class DepartmentArray {

    private ArrayList<Department> departmentArray;

    public DepartmentArray() {
        this.departmentArray = new ArrayList<Department>();

    }

    public ArrayList<Department> getDepartmentArray() {
        return departmentArray;
    }

    public void setDepartmentArray(ArrayList<Department> departmentArray) {
        this.departmentArray = departmentArray;
    }

    public Department addDepartment() {
        Department dt = new Department();
        departmentArray.add(dt);
        return dt;
    }

    public void deleteDepartment(Student s) {
        departmentArray.remove(s);

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

    public double calculatePhdPercentage() {
        double a = 0;
        FacultyDirectory f1 = Initialization.initializefaculty();

        int itemCount = f1.getFacultyDirectory().size();
        double d = (a / itemCount) * 100;
        System.out.println("The percentage of Staffs with PHD is: " + d);
        return d;
    }

    public int calculateFacultyRatio() {
        int a = 0;
        int b = 0;
        int result = 0;
        FacultyDirectory f2 = Initialization.initializefaculty();
        for (Faculty faculty : f2.getFacultyDirectory()) {
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
        //System.out.println("full time count"+a);
        //System.out.println("part time count"+b);
        //System.out.println("The Full Time to Part Time Faculty ratio is"+Math.abs(a/b));

        return result;
    }

    public int calculateFacultyStaffRatio() {
        int a = 0;
        int b = 0;
        int result = 0;


        return result;
    }

    public String displayCourseName() {
        CourseCatalog d1 = Initialization.initializeDepartmentCourses();
        for (Course c : d1.getCourseList()) {
            System.out.println("Course offered by the Department: \n" + c.getCourseName());

        }
        return null;
    }

}
