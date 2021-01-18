/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ali
 */
public class Volunteerlist 
{
    List<Volunteer> V = new ArrayList<Volunteer>();
    int count;

    public Volunteerlist() {
    }

    public Volunteerlist(int count,List<Volunteer> obj) {
        this.count = count;
        this.V=obj;
    }

    public List<Volunteer> getV() {
        return V;
    }

    public void setV(List<Volunteer> p) {
        this.V = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Volunteer obj){
        this.V.add(obj);
        
    }
    public void Delete(Volunteer obj){
        this.V.remove(obj);
    }
    public void update(String name,String name1,String position,int id){
        for(int i=0;i<this.V.size();i++)
        {
           if (this.V.get(i).volunteerName.equals(name) && this.V.get(i).teamID==id)
           {
               this.V.get(i).setVolunteerName(name1);
               this.V.get(i).setPosition(position);
               this.V.get(i).setTeamID(id);
              
               DB obj=new DB();
               obj.UpdateVolunteer( this.V.get(i));
           }
           else
           {
               System.out.println("Id Not Found");
           }
        }
    }
    public void comit(){
        for(Volunteer m:this.V)
        {
            DB obj=new DB();
            obj.insertVolunteer(m);
        }
    }
    public void delete()
    {
        for(Volunteer m:this.V)
        {
            DB obj=new DB();
            obj.deleteVolunteer(m.volunteerName,m.teamID);
        }
    }
//    public void update(){
//        for(Volunteer m:this.V)
//        {
//            DB obj=new DB();
//            obj.UpdateVolunteer(m);
//        }
//    }
    public void getdata(){
       DB obj = new DB();
       obj.displayAllVolunteer(this.V);
   }
}
