/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author movvakodandram
 */
public class HospitalHistory {
    
    private ArrayList<HospitalData> hospitalhistory;
    
    public HospitalHistory(){
        this.hospitalhistory= new ArrayList<HospitalData>();
    }

    public ArrayList<HospitalData> getHospitalhistory() {
        return hospitalhistory;
    }

    public void setHospitalhistory(ArrayList<HospitalData> hospitalhistory) {
        this.hospitalhistory = hospitalhistory;
    }
    
    
}
