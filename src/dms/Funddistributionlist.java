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
public class Funddistributionlist 
{
    List<Funddistribution> FD = new ArrayList<Funddistribution>();
    int count;

    public Funddistributionlist() {
    }

    public Funddistributionlist(int count,List<Funddistribution> obj) {
        this.count = count;
        this.FD=obj;
    }

    public List<Funddistribution> getT() {
        return FD;
    }

    public void setT(List<Funddistribution> p) {
        this.FD = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Funddistribution obj){
        this.FD.add(obj);
        
    }
    public void Delete(Funddistribution obj){
        this.FD.remove(obj);
    }
    public Boolean search(int id1,int id2){
        for(int i=0;i<this.FD.size();i++)
        {
            if(FD.get(i).getProjectID()==id1&&FD.get(i).getSubjectID()==id2){
                return true;
            }
        }
        return false;
        
    }
    public void updatestatus(){
        for(Funddistribution m:this.FD)
        {
            DB obj=new DB();
            obj.UpdateFunddistribution(m);
        }
    }
//    public void update(int id,Funddistribution obj){
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
        for(Funddistribution m:this.FD)
        {
            DB obj=new DB();
            obj.insertFunddistribution(m);
        }
    }
    public void comit(Funddistribution f){
        
            DB obj=new DB();
            obj.insertFunddistribution(f);
        
    }
    public void getdata(){
        
            DB obj=new DB();
            obj.displayAllFunddistribution(FD);
        
    }
}
