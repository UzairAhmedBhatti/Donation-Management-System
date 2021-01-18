/*
 * To change this license header, choose License Headers in Team Properties.
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
public class Teamlist {
     List<Team> T = new ArrayList<Team>();
    int count;

    public Teamlist() {
    }

    public Teamlist(int count,List<Team> obj) {
        this.count = count;
        this.T=obj;
    }

    public List<Team> getT() {
        return T;
    }

    public void setT(List<Team> p) {
        this.T = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Team obj){
        this.T.add(obj);
        
    }
    public void Delete(Team obj){
        this.T.remove(obj);
    }
//    public void update(int id,Team obj){
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
    public void comit()
    {
        for(Team m:this.T)
        {
            DB obj=new DB();
            obj.insertTeam(m);
        }
    }
    public void getdata()
    {
       DB obj = new DB();
       obj.displayAllTeam(this.T);
   }
}
