/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author movvakodandram
 */
public class PatientData {
    private int patId;
    private int weight;
    private int temperature;
    private String bP;
    private int rR;
    private String diagnosis;
    
 

    public int getPatId() {
        return patId;
    }

    public void setPatId(int patId) {
        this.patId = patId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getbP() {
        return bP;
    }

    public void setbP(String bP) {
        this.bP = bP;
    }

    public int getrR() {
        return rR;
    }

    public void setrR(int rR) {
        this.rR = rR;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    
    
}
