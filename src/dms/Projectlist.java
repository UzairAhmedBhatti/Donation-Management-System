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
public class Projectlist 
{


    List<Project> p = new ArrayList<Project>();
    int count;

    public Projectlist() {
    }

    public Projectlist(int count,List<Project> obj) {
        this.count = count;
        this.p=obj;
    }

    public List<Project> getp() {
        return p;
    }

    public void setp(List<Project> p) {
        this.p = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Project obj){
        this.p.add(obj);
        
    }
    public void Delete(Project obj){
        this.p.remove(obj);
    }
    public Project Searchbyname(String name){
        for(int i=0;i<this.p.size();i++){
            if(this.p.get(i).projectName.equals(name)){
                return this.p.get(i);
            }    
        }
        System.out.println("Project Not Found");
        return null;
    }
    public Project Searchbymanager(String name){
        for(int i=0;i<this.p.size();i++){
            if(this.p.get(i).projectManager.equals(name)){
                return this.p.get(i);
            }
            
            
        }
        System.out.println("Project Not Found");
        return null;
    }
    public void allocateteam()
    {    
        for(Project m:this.p)
        {
            DB obj=new DB();
            obj.UpdateProject(m);
        }
    }
//    public void update(int id,Project obj){
//        for(int i=0;i<this.p.size();i++)
//        {
//           if (this.p.get(i).getId()== obj.getId())
//           {
//               this.p.get(i).setId(obj.getId());
//               this.p.get(i).setMedName(obj.getMedName());
//               this.p.get(i).setMedPrice(obj.getMedPrice());
//               this.p.get(i).setMedQuantity(obj.getMedQuantity());
//           }
//           else
//           {
//               System.out.println("Id Not Found");
//           }
//        }
//    }
   public void comit(){
        for(Project m:this.p)
        {
            DB obj=new DB();
            obj.insertProject(m);
        }
    }
   public void getdata(){
       DB obj = new DB();
       obj.displayAllProject(this.p);
   }
    
    
    


    
}
