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
public class Fundcollection {
    int projectID;
    int donorID;
    int amount;
    int done;

    public Fundcollection() {
    }

    public Fundcollection(int projectID, int donorID,int amount,int done) {
        this.projectID= projectID;
        this.donorID = donorID;
        this.amount=amount;
        this.done=done;
    }

    public Fundcollection(int projectID, int donorID, int amount) {
        this.projectID = projectID;
        this.donorID = donorID;
        this.amount = amount;
    }

    public Fundcollection(int projectID, int donorID) {
        this.projectID = projectID;
        this.donorID = donorID;
    }
    

    
    

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

   

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
    
}
