/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dms;

/**
 *
 * @author ali
 */
import java.util.*;
public class Project 
{

    int projectID;
    String projectName;
    String projectDescription;
    int requiredBudget;
    String projectManager;
    int teamID;
    
    
    

    public Project() {
    }

    public Project(int projectID, int teamID) {
        this.projectID = projectID;
        this.teamID = teamID;
    }
    

    public Project(int projectID, String projectName, String projectDescription, int requiredBudget, String projectManager,int teamID) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.requiredBudget = requiredBudget;
        this.projectManager = projectManager;
        this.teamID=teamID;
    }

    public Project(String projectName, String projectDescription, int requiredBudget, String projectManager,int teamID) 
    {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.requiredBudget = requiredBudget;
        this.projectManager = projectManager;
        this.teamID=teamID;
    }

    public int getTeamID() 
    {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }
    
    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

   

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getRequiredBudget() {
        return requiredBudget;
    }

    public void setRequiredBudget(int requiredBudget) {
        this.requiredBudget = requiredBudget;
    }

    public String getProjectManager() 
    {
        return projectManager;
    }

    public void setProjectManager(String projectManager) 
    {
        this.projectManager = projectManager;
    }
}
