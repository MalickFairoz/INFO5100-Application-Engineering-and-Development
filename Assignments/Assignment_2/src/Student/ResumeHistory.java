/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class ResumeHistory {
    private ArrayList<Resume> resumeHistory;
    
    public ResumeHistory() {
        resumeHistory = new ArrayList<Resume>();
    }

    public ArrayList<Resume> getresumeHistory() {
        return resumeHistory; 
    }
 
    public void setresumeHistory(ArrayList<Resume> ResumeHistory) {
        this.resumeHistory = ResumeHistory;
    }
    
    public Resume addResume()
    {
        Resume rm = new Resume();
        resumeHistory.add(rm);
        return rm;
    }
    public void deleteResume(Resume r)
    {
        resumeHistory.remove(r);
        
                
    }

    public void setSex(String male) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
