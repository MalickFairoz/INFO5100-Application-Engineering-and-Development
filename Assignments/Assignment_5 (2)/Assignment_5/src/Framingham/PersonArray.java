/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Malick
 */
public class PersonArray {

    private ArrayList<Person> personArray;

    public PersonArray() {
        this.personArray = new ArrayList<Person>();

    }

    public ArrayList<Person> getPersonArray() {
        return personArray;
    }

    public void setPersonArray(ArrayList<Person> personArray) {
        this.personArray = personArray;
    }

    public Person addPerson() {
        Person p = new Person();
//         p.setNamePerson(namePerson);
//         p.setAge(age);

        personArray.add(p);
        return p;
    }

}
