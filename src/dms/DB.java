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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;
import java.sql.*;  
public class DB {
    Connection con;
    Statement stmt;
    
    DB(){
        try
        {
             String s = "jdbc:sqlserver://localhost:1433;databaseName=DMS";
             con=DriverManager.getConnection(s,"uzair","123");


            stmt = con.createStatement(); 
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void displayAllProject(){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Project");
             while(rs.next())
             {
                 
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4));
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void displayAllProject(List<Project> p){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Project");
            Project a;
             while(rs.next())
             {
                 a = new Project(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6));
                 p.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertProject(Project obj){
        try 
        {
          
            String a = "insert into Project (projectName,projectDescription,requiredBudget,projectManager) values(\'"+ obj.getProjectName()+"\',\'"+obj.getProjectDescription() + "\',\'"+ obj.getRequiredBudget() + "\',\'" + obj.getProjectManager()+ "')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void deleteProject(String name){
        try 
        {
          
            String a = "Delete From Project Where projectName = \'" + name + "\'";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void UpdateProject(Project obj){
        try 
        {
          
           PreparedStatement update = con.prepareStatement
                       ("UPDATE Project SET teamID = ? WHERE projectID= ?");

                       update.setInt(1,obj.getTeamID() );
                       
                         
                       
                       update.setInt(2,obj.getProjectID());

                       update.executeUpdate();         
        
        }
        
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void displayAllTeam(List<Team> t){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Team");
            Team a;
             while(rs.next())
             {
                 a = new Team(rs.getInt(1),rs.getString(2),rs.getInt(3));
                 t.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertTeam(Team obj){
        try 
        {
          
            String a = "insert into Team (teamName,projectID) values(\'"+ obj.getTeamName() + "\',\'"+ obj.getProjectID() + "')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void displayAllSubject(List<Subject> s){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Subject");
            Subject a;
             while(rs.next())
             {
                 a = new Subject(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
                 s.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertSubject(Subject obj){
        try 
        {
          
            String a;
            a = "insert into Subject (subjectName,subjectType,subjectAddress,subjectPhone,subjectDOB,subjectIncome) values(\'"+ obj.getSubjectName() + "\',\'"+ obj.getSubjectType() + "\',\'" + obj.getSubjectAddress()+"\',\'" +obj.getSubjectPhone()+"\',\'" +obj.getSubjectDOB() +"\',\'" +obj.getSubjectIncome()+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void displayAllVolunteer(List<Volunteer> v){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Volunteer");
            Volunteer a;
             while(rs.next())
             {
                 a = new Volunteer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                 System.out.println(a.volunteerID);
                 v.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertVolunteer(Volunteer obj){
        try 
        {
          
            String a;
            a = "insert into Volunteer (volunteerName,position,teamID) values(\'"+ obj.getVolunteerName() + "\',\'"+ obj.getPosition() + "\',\'" + obj.getTeamID()+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void deleteVolunteer(String name,int id){
        try 
        {
          
            String a = "Delete From Volunteer Where (teamID='" + id + "' AND volunteerName = '" + name + "')"; 
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void UpdateVolunteer(Volunteer obj){
        try 
        {
           System.out.println(obj.getVolunteerID()+obj.getVolunteerName()+obj.getPosition()+obj.getTeamID());
            //String a = "Update Volunteer set  volunteerName= \'" + obj.getVolunteerName()+ " \'position= \'" + obj.getPosition() +"\'teamID=\'" +obj.getTeamID() +  "\' Where volunteerID=" + obj.getVolunteerID() +" ";
            //int rs = stmt.executeUpdate(a);
            //System.out.println();
            PreparedStatement update = con.prepareStatement
                       ("UPDATE Volunteer SET volunteerName = ?, position = ?, teamID = ?  WHERE volunteerID= ?");

                       update.setString(1,obj.getVolunteerName() );
                       update.setString(2,obj.getPosition());
                         
                       update.setInt(3,obj.getTeamID());
                       update.setInt(4,obj.getVolunteerID());

                       update.executeUpdate();         
        }
        
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void displayAllDonor(){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Donor");
             while(rs.next())
             {
                 
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
             }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void displayAllDonor(List<Donor> d){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Donor");
            Donor a;
             while(rs.next())
             {
                 a = new Donor(rs.getInt(1),rs.getString(2));
                 
                 
                 d.add(a);
                 
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertDonor(Donor obj){
        try 
        {
          
            String a;
            a = "insert into Donor (donorName) values(\'"+ obj.getDonorName()+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void displayAllFund(List<Fund> f){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Fund");
            Fund a;
             while(rs.next())
             {
                 a = new Fund(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
                 f.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertFund(Fund obj){
        try 
        {
          
            String a;
            a = "insert into Fund (fundType,fundAmount,donorID) values(\'"+ obj.getFundType() +"\',\'"+obj.getFundAmount()+"\',\'"+obj.getDonorID()+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
     void insertFundcollection(Fundcollection obj){
        try 
        {
          
            String a;
            a = "insert into FundCollection (projectID,donorID,amount,done) values(\'"+ obj.getProjectID() +"\',\'"+obj.getDonorID()+"\',\'"+obj.getAmount()+"\',\'"+0+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
     void insertFunddistribution(Funddistribution obj){
        try 
        {
          
            String a;
            a = "insert into FundDistribution (projectID,subjectID,done) values(\'"+ obj.getProjectID() +"\',\'"+obj.getSubjectID()+"\',\'"+0+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
     void displayAllFunddistribution(List<Funddistribution> f){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from FundDistribution");
            Funddistribution a;
             while(rs.next())
             {
                 a = new Funddistribution(rs.getInt(1),rs.getInt(2),rs.getInt(3));
                 f.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void displayAllFundcollection(List<Fundcollection> f){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from FundCollection");
            Fundcollection a;
             while(rs.next())
             {
                 a = new Fundcollection(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4));
                 f.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertDonated(Donated obj){
        try 
        {
          
            String a;
            a = "insert into Donated (projectID,subjectID,amount) values(\'"+ obj.getProjectID() +"\',\'"+obj.getSubjectID()+"\',\'"+obj.getAmount()+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void displayAllDonated(List<Donated> f){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Donated");
            Donated a;
             while(rs.next())
             {
                 a = new Donated(rs.getInt(1),rs.getInt(2),rs.getInt(3));
                 f.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void insertPledge(Pledge obj){
        try 
        {
          
            String a;
            a = "insert into Pledge (pledgeDescription,pledgeDate,donorID) values(\'"+ obj.getPledgeDescription() +"\',\'"+obj.getPledgeDate()+"\',\'"+obj.getDonorID()+"')";
            int rs = stmt.executeUpdate(a);
            System.out.println();
                     
        }
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void displayAllPledge(List<Pledge> f){
        
        try
        {
            ResultSet rs=stmt.executeQuery("select * from Pledge");
            Pledge a;
             while(rs.next())
             {
                 a = new Pledge(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                 f.add(a);
                
             }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void UpdateFunddistribution(Funddistribution obj){
        try 
        {
           //System.out.println(obj.getVolunteerID()+obj.getVolunteerName()+obj.getPosition()+obj.getTeamID());
            //String a = "Update Volunteer set  volunteerName= \'" + obj.getVolunteerName()+ " \'position= \'" + obj.getPosition() +"\'teamID=\'" +obj.getTeamID() +  "\' Where volunteerID=" + obj.getVolunteerID() +" ";
            //int rs = stmt.executeUpdate(a);
            //System.out.println();
            PreparedStatement update = con.prepareStatement
                       ("UPDATE FundDistribution SET done = ?  WHERE projectID= ? AND subjectID=?");

                       update.setInt(1,obj.getDone() );
                       update.setInt(2,obj.getProjectID());
                         
                       update.setInt(3,obj.getSubjectID());
                       

                       update.executeUpdate();         
        }
        
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
    void UpdateFundcollection(Fundcollection obj){
        try 
        {
           //System.out.println(obj.getVolunteerID()+obj.getVolunteerName()+obj.getPosition()+obj.getTeamID());
            //String a = "Update Volunteer set  volunteerName= \'" + obj.getVolunteerName()+ " \'position= \'" + obj.getPosition() +"\'teamID=\'" +obj.getTeamID() +  "\' Where volunteerID=" + obj.getVolunteerID() +" ";
            //int rs = stmt.executeUpdate(a);
            //System.out.println();
            PreparedStatement update = con.prepareStatement
                       ("UPDATE FundCollection SET done = ?  WHERE projectID= ? AND donorID=?");

                       update.setInt(1,obj.getDone() );
                       update.setInt(2,obj.getProjectID());
                         
                       update.setInt(3,obj.getDonorID());
                       

                       update.executeUpdate();         
        }
        
        
        catch(Exception e) 
        {
            System.out.println(e);
            
        }
    }
   
}
