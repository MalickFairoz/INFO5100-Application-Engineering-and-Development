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
public class TranscriptDirectory {
    private ArrayList<Transcript> transcriptList;

    public TranscriptDirectory() {
        this.transcriptList = new ArrayList<Transcript>();
    }

    public ArrayList<Transcript> getTranscriptList() {
        return transcriptList;
    }

    public void setTranscriptList(ArrayList<Transcript> transcriptList) {
        this.transcriptList = transcriptList;
    }
    
    public Transcript addTranscript(CourseLoad courseLoad){
        Transcript transcript = new Transcript();
        transcript.setCourseLoad(courseLoad);
        transcriptList.add(transcript);
        return transcript;
    }
    
}
