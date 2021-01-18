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
public class Volunteer {
    int volunteerID;
    String volunteerName;
    String position;
    int teamID;

    public Volunteer() {
    }

    public Volunteer(int volunteerID, String volunteerName, String position, int teamID) {
        this.volunteerID = volunteerID;
        this.volunteerName = volunteerName;
        this.position = position;
        this.teamID = teamID;
    }

    public Volunteer(int volunteerID, String volunteerName, String position) {
        this.volunteerID = volunteerID;
        this.volunteerName = volunteerName;
        this.position = position;
    }
    

    public Volunteer(String volunteerName, String position, int teamID) {
        this.volunteerName = volunteerName;
        this.position = position;
        this.teamID = teamID;
    }

    public Volunteer(String volunteerName, int teamID) {
        this.volunteerName = volunteerName;
        this.teamID = teamID;
    }

    public Volunteer(String volunteerName, String position) {
        this.volunteerName = volunteerName;
        this.position = position;
    }

    public Volunteer(String volunteerName) {
        this.volunteerName = volunteerName;
    }
    

    public int getVolunteerID() {
        return volunteerID;
    }

    public void setVolunteerID(int volunteerID) {
        this.volunteerID = volunteerID;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
    
    
    
    
}
