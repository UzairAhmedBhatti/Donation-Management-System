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
public class Pledgelist 
{   
    List<Pledge> P = new ArrayList<Pledge>();
    int count;

    public Pledgelist() {
    }

    public Pledgelist(int count,List<Pledge> obj) {
        this.count = count;
        this.P=obj;
    }

    public List<Pledge> getT() {
        return P;
    }

    public void setT(List<Pledge> p) {
        this.P = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Pledge obj){
        this.P.add(obj);
        
    }
    public void Delete(Pledge obj){
        this.P.remove(obj);
    }
//    public void update(int id,Pledge obj){
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
        for(Pledge m:this.P)
        {
            DB obj=new DB();
            obj.insertPledge(m);
        }
    }
    public void getdata(){
       
            DB obj=new DB();
            obj.displayAllPledge(this.P);
        
    }
}
