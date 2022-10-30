/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author movvakodandram
 */
public class MedicalSystem {
    
    public PersonHistory perH;
    public PatientHistory patH;
    public HospitalHistory hsptH;
    public DoctorHistory drH;
    public CommunityHistory commH;
    
    
    public MedicalSystem(){
        perH = new PersonHistory();
        patH = new PatientHistory();
        hsptH =  new HospitalHistory();
        drH = new DoctorHistory();
        commH = new CommunityHistory();
    }
    
}
