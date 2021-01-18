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
public class Assessorlist
{
    List<Assessor> A = new ArrayList<Assessor>();
    int count;

    public Assessorlist() {
    }

    public Assessorlist(int count,List<Assessor> obj) {
        this.count = count;
        this.A=obj;
    }

    public List<Assessor> getT() {
        return A;
    }

    public void setT(List<Assessor> p) {
        this.A = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Assessor obj){
        this.A.add(obj);
        
    }
    public void Delete(Assessor obj){
        this.A.remove(obj);
    }
//    public void update(int id,Assessor obj){
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
//    public void comit(){
//        for(Assessor m:this.p)
//        {
//            DB obj=new DB();
//            obj.insertAssessor(m);
//        }
//    }
}
