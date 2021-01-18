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
public class Fundcollectionlist 
{
    List<Fundcollection> FC = new ArrayList<Fundcollection>();
    int count;

    public Fundcollectionlist() {
    }

    public Fundcollectionlist(int count,List<Fundcollection> obj) {
        this.count = count;
        this.FC=obj;
    }

    public List<Fundcollection> getFC() {
        return FC;
    }

    public void setFC(List<Fundcollection> p) {
        this.FC = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Fundcollection obj){
        this.FC.add(obj);
        
    }
    public void Delete(Fundcollection obj){
        this.FC.remove(obj);
    }
     public void updatestatus(){
        for(Fundcollection m:this.FC)
        {
            DB obj=new DB();
            obj.UpdateFundcollection(m);
        }
    }
    
//    public void update(int id,Fundcollection obj){
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
        for(Fundcollection m:this.FC)
        {
            DB obj=new DB();
            obj.insertFundcollection(m);
        }
    }
    public void getdata(){
        
            DB obj=new DB();
            obj.displayAllFundcollection(this.FC);
        
    }
   
}
