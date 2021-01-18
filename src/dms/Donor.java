/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dms;

/**
 *
 * @author Uzair
 */
import java.util.*;
public class Donor {
    int donorID;
    String donorName;

    public Donor() {
    }

    public Donor(int donorID, String donorName) {
        this.donorID = donorID;
        this.donorName = donorName;
    }

    public Donor(String donorName) {
        this.donorName = donorName;
    }

   
    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }
    
    
    
}
