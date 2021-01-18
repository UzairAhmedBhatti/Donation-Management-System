/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dms;

/**
 *
 * @author Uzair
 */
import java.util.*;
public class Subject {
    int subjectID; 
    String subjectName; 
    String subjectType;
    String subjectAddress; 
    String subjectPhone;
    String subjectDOB;
    int subjectIncome; 

    public Subject() {
    }

    public Subject(int subjectID, String subjectName, String subjectType, String subjectAddress, String subjectPhone, String subjectDOB, int subjectIncome) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectType = subjectType;
        this.subjectAddress = subjectAddress;
        this.subjectPhone = subjectPhone;
        this.subjectDOB = subjectDOB;
        this.subjectIncome = subjectIncome;
    }

    public Subject(String subjectName, String subjectType, String subjectAddress, String subjectPhone, String subjectDOB, int subjectIncome) {
        this.subjectName = subjectName;
        this.subjectType = subjectType;
        this.subjectAddress = subjectAddress;
        this.subjectPhone = subjectPhone;
        this.subjectDOB = subjectDOB;
        this.subjectIncome = subjectIncome;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public String getSubjectAddress() {
        return subjectAddress;
    }

    public void setSubjectAddress(String subjectAddress) {
        this.subjectAddress = subjectAddress;
    }

    public String getSubjectPhone() {
        return subjectPhone;
    }

    public void setSubjectPhone(String subjectPhone) {
        this.subjectPhone = subjectPhone;
    }

    public String getSubjectDOB() {
        return subjectDOB;
    }

    public void setSubjectDOB(String subjectDOB) {
        this.subjectDOB = subjectDOB;
    }

    public int getSubjectIncome() {
        return subjectIncome;
    }

    public void setSubjectIncome(int subjectIncome) {
        this.subjectIncome = subjectIncome;
    }
    
    
    
}
