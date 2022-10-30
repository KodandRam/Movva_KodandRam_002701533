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
public class PersonHistory {
    
    private ArrayList<PersonData> personhistory;
    
    public PersonHistory(){
        this.personhistory= new ArrayList<PersonData>();
    }

    public ArrayList<PersonData> getPersonhistory() {
        return personhistory;
    }

    public void setPersonhistory(ArrayList<PersonData> personhistory) {
        this.personhistory = personhistory;
    }
    
    
    
}
