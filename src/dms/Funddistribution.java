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
public class Funddistribution {
    int projectID;
    int subjectID;
    int done;

    public Funddistribution() {
    }

    public Funddistribution(int projectID, int subjectID,int done) {
        this.projectID = projectID;
        this.subjectID = subjectID;
        this.done = done;
    }

    public Funddistribution(int projectID, int subjectID) {
        this.projectID = projectID;
        this.subjectID = subjectID;
    }
    

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }
    
    
    
}
