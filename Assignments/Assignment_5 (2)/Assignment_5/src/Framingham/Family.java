/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framingham;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class Family {

    private String nameFamily;
    private PersonArray personArray;
    ArrayList<GrandParents> grandParentsList;
    ArrayList<Parents> parentsList;
    ArrayList<Children> childrenList;

    public Family() {
        this.personArray = new PersonArray();

        grandParentsList = new ArrayList<GrandParents>();
        parentsList = new ArrayList<Parents>();
        childrenList = new ArrayList<Children>();

    }

    public String getNameFamily() {
        return nameFamily;
    }

    public void setNameFamily(String nameFamily) {
        this.nameFamily = nameFamily;
    }

    public PersonArray getPersonArray() {
        return personArray;
    }

    public void setPersonArray(PersonArray personArray) {
        this.personArray = personArray;
    }

    void addGrandParents(GrandParents grandParents) {
        grandParentsList.add(grandParents);
    }

    void addParents(Parents parents) {
        parentsList.add(parents);

    }

    void addChildren(Children children) {
        childrenList.add(children);
    }

    public ArrayList<GrandParents> getGrandParentsList() {
        return grandParentsList;
    }

    public void setGrandParentsList(ArrayList<GrandParents> grandParentsList) {
        this.grandParentsList = grandParentsList;
    }

    public ArrayList<Parents> getParentsList() {
        return parentsList;
    }

    public void setParentsList(ArrayList<Parents> parentsList) {
        this.parentsList = parentsList;
    }

    public ArrayList<Children> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(ArrayList<Children> childrenList) {
        this.childrenList = childrenList;
    }

}
