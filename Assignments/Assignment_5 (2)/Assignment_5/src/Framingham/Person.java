/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

/**
 *
 * @author Malick
 */
public class Person {

    private String namePerson;
    private int age;
    private String sex;
    private VitalSignArray vitalSignArray;

    public Person() {
        this.vitalSignArray = new VitalSignArray();

    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public VitalSignArray getVitalSignArray() {
        return vitalSignArray;
    }

    public void setVitalSignArray(VitalSignArray vitalSignArray) {
        this.vitalSignArray = vitalSignArray;
    }

}
