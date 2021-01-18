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
public class Donatedlist {
    List<Donated> D=new ArrayList<Donated>();
    int count;

    public Donatedlist() {
    }
    

    public Donatedlist(int count) {
        this.count = count;
    }

    public List<Donated> getD() {
        return D;
    }

    public void setD(List<Donated> D) {
        this.D = D;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void Insert(Donated obj){
        this.D.add(obj);
        
    }
    public void Delete(Donated obj){
        this.D.remove(obj);
    }
    public Boolean search(int id1,int id2){
        for(int i=0;i<this.D.size();i++)
        {
            if(D.get(i).getProjectID()==id1&&D.get(i).getSubjectID()==id2){
                return true;
            }
        }
        return false;
        
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
        for(Donated m:this.D)
        {
            DB obj=new DB();
            obj.insertDonated(m);
        }
    }
    public void comit(Donated f){
        
            DB obj=new DB();
            obj.insertDonated(f);
        
    }
    public void getdata(){
        
            DB obj=new DB();
            obj.displayAllDonated(D);
        
    }
    
}
