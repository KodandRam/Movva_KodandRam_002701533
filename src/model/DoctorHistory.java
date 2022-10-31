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
public class DoctorHistory {
    private ArrayList<DoctorData> doctorhistory;
    public DoctorHistory(){
        this.doctorhistory= new ArrayList<DoctorData>();
    }

    public ArrayList<DoctorData> getDoctorhistory() {
        return doctorhistory;
    }

    public void setDoctorhistory(ArrayList<DoctorData> doctorhistory) {
        this.doctorhistory = doctorhistory;
    }
    
    public DoctorData addNewData() {
       DoctorData newDoctorData = new DoctorData();
      doctorhistory.add(newDoctorData);
      return newDoctorData;
        
    }
    
     public void deleteData(DoctorData selectedPerson) {
        doctorhistory.remove(selectedPerson);
    }
}
