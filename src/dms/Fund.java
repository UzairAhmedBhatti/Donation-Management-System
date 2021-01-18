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
public class Fund {
    int fundID;
    String fundType;
    int fundAmount;
    int donorID;
  

    public Fund() {
    }

    public Fund(int fundID, String fundType, int fundAmount, int donorID) {
        this.fundID = fundID;
        this.fundType = fundType;
        this.fundAmount = fundAmount;
        this.donorID = donorID;
        
    }

    public Fund(String fundType, int fundAmount, int donorID) {
        this.fundType = fundType;
        this.fundAmount = fundAmount;
        this.donorID = donorID;
    }

    public int getFundID() {
        return fundID;
    }

    public void setFundID(int fundID) {
        this.fundID = fundID;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public int getFundAmount() {
        return fundAmount;
    }

    public void setFundAmount(int fundAmount) {
        this.fundAmount = fundAmount;
    }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }

    
    
    
    
    
}
