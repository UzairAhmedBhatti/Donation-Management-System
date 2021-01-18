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
public class Donorlist 
{
    List<Donor> D = new ArrayList<Donor>();
    int count;

    public Donorlist() {
    }

    public Donorlist(int count,List<Donor> obj) {
        this.count = count;
        this.D=obj;
    }

    public List<Donor> getD() {
        return D;
    }

    public void setD(List<Donor> D) {
        this.D = D;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Donor obj){
        this.D.add(obj);
        
    }
    public void Delete(Donor obj){
        this.D.remove(obj);
    }
    public Donor searchbyname(String name){
        for(int i=0;i<D.size();i++){
            if(D.get(i).getDonorName().equalsIgnoreCase(name)){
                return D.get(i);
            }
            
        }
        return null;
        
    }
//    public void update(int id,Donor obj){
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
        for(Donor m:this.D)
        {
            DB obj=new DB();
            obj.insertDonor(m);
        }
    }
    public void getdata(){
       DB obj = new DB();
       obj.displayAllDonor(this.D);
   }
}
