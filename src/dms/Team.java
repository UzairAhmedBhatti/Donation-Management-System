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
public class Team {
    int teamID;
    String teamName;
    int projectID;

    public Team() {
    }
    
    
    public Team(int teamID, String teamName, int projectID) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.projectID = projectID;
    }
    public Team( String teamName, int projectID) {
        
        this.teamName = teamName;
        this.projectID = projectID;
    }

    public int getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getProjectID() {
        return projectID;
    }
    
    
    
    
}
