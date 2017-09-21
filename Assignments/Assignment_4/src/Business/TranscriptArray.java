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
public class TranscriptArray {
    
    
    private ArrayList<Transcript> TranscriptArray;

    public ArrayList<Transcript> getTranscriptArray() {
        return TranscriptArray;
    }

    public void setTranscriptArray(ArrayList<Transcript> TranscriptArray) {
        this.TranscriptArray = TranscriptArray;
    }
    
     public Transcript addProduct() {
        Transcript tc = new Transcript();
        TranscriptArray.add(tc);
        return tc;
    }

    public void deleteProduct(Transcript t) {
        TranscriptArray.remove(t);

    }

        
}
