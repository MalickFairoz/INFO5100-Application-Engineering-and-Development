/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessUniversity;

import java.util.ArrayList;

/**
 *
 * @author Aswat
 */

    public class SeatDirectory {
    private ArrayList<Seat> seatDirectoryList;

    public SeatDirectory() {
       this.seatDirectoryList = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeatDirectoryList() {
        return seatDirectoryList;
    }
    
    public Seat addSeat(CourseSchedule courseSchedule ,int gpa) {
        Seat seat = new Seat();
       // seat.setGpaEarned(gpa);
       seat.setGpa(gpa);
        seat.setCourseSchedule(courseSchedule);
        
        seatDirectoryList.add(seat);
        return seat;

    }
    
}
