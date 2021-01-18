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
public class Fundlist {
    List<Fund> F = new ArrayList<Fund>();
    int count;

    public Fundlist() {
    }

    public Fundlist(int count,List<Fund> obj) {
        this.count = count;
        this.F=obj;
    }

    public List<Fund> getT() {
        return F;
    }

    public void setT(List<Fund> p) {
        this.F = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Fund obj){
        this.F.add(obj);
        
    }
    public void Delete(Fund obj){
        this.F.remove(obj);
    }
//    public void update(int id,Fund obj){
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
        for(Fund m:this.F)
        {
            DB obj=new DB();
            obj.insertFund(m);
        }
    }
    public void getdata(){
       DB obj = new DB();
       obj.displayAllFund(this.F);
   }
}
