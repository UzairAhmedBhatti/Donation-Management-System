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
public class Pledge {
    int pledgeID;
    String pledgeDescription;
    String pledgeDate;
    int donorID;

    public Pledge() {
    }

    public Pledge(int pledgeID, String pledgeDescription, String pledgeDate, int donorID) {
        this.pledgeID = pledgeID;
        this.pledgeDescription = pledgeDescription;
        this.pledgeDate = pledgeDate;
        this.donorID = donorID;
    }

    public Pledge(String pledgeDescription, String pledgeDate, int donorID) {
        this.pledgeDescription = pledgeDescription;
        this.pledgeDate = pledgeDate;
        this.donorID = donorID;
    }

    public int getPledgeID() {
        return pledgeID;
    }

    public void setPledgeID(int pledgeID) {
        this.pledgeID = pledgeID;
    }

    public String getPledgeDescription() {
        return pledgeDescription;
    }

    public void setPledgeDescription(String pledgeDescription) {
        this.pledgeDescription = pledgeDescription;
    }

    public String getPledgeDate() {
        return pledgeDate;
    }

    public void setPledgeDate(String pledgeDate) {
        this.pledgeDate = pledgeDate;
    }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }
    
    
    
}
