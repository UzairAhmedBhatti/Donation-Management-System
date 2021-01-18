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
public class Subjectlist
{
    List<Subject> S = new ArrayList<Subject>();
    int count;

    public Subjectlist() {
    }

    public Subjectlist(int count,List<Subject> obj) {
        this.count = count;
        this.S=obj;
    }

    public List<Subject> getT() {
        return S;
    }

    public void setT(List<Subject> p) {
        this.S = p;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void Insert(Subject obj){
        this.S.add(obj);
        
    }
    public void Delete(Subject obj){
        this.S.remove(obj);
    }
    public Subject searchbyname(String name){
        for(int i=0;i<S.size();i++){
            if(S.get(i).getSubjectName().equalsIgnoreCase(name)){
                return S.get(i);
            }
        }
        return null;
    }
//    public void update(int id,Subject obj){
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
        for(Subject m:this.S)
        {
            DB obj=new DB();
            obj.insertSubject(m);
        }
    }
     public void getdata(){
        
            DB obj=new DB();
            obj.displayAllSubject(this.S);
        
    }
}
