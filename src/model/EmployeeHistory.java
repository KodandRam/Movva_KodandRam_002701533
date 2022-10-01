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
public class EmployeeHistory {
    
    
    private ArrayList<EmployeeData> history;
    
    public EmployeeHistory(){
        this.history=new ArrayList<EmployeeData>();
    }

    public ArrayList<EmployeeData> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeData> history) {
        this.history = history;
    }
    
}
