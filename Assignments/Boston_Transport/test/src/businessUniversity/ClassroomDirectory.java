/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

import java.util.ArrayList;

/**
 *
 * @author PeaceFull
 */
public class ClassroomDirectory {
    
    private ArrayList<ClassRoom> classroomList;
   
    public ClassroomDirectory() {
        this.classroomList = new ArrayList<ClassRoom>();
    }

    
    public ArrayList<ClassRoom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(ArrayList<ClassRoom> classroomList) {
        this.classroomList = classroomList;
    }
      public ClassRoom addClassRoomBuilding(String buildingName,String roomNumber,String floorNumber ){
     
         ClassRoom classroom =new ClassRoom();
         classroom.setBuidingName(buildingName);
        classroom.setRoomNumber(roomNumber);
        classroom.setFloorNumber(floorNumber);
        classroomList.add(classroom);
         return classroom;
         
     }
}
