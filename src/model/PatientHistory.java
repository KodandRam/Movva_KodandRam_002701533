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
public class PatientHistory {
  
    private ArrayList<PatientData> patienthistory;
    
    public PatientHistory(){
        this.patienthistory=new ArrayList<PatientData>();
    }

    public ArrayList<PatientData> getPatienthistory() {
        return patienthistory;
    }

    public void setPatienthistory(ArrayList<PatientData> patienthistory) {
        this.patienthistory = patienthistory;
    }
    
    
    
}
