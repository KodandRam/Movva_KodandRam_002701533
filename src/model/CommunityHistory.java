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
public class CommunityHistory {
    private ArrayList<CommunityData> communityhistory;
    
    public CommunityHistory(){
        this.communityhistory= new ArrayList<CommunityData>();
    }

    public ArrayList<CommunityData> getCommunityhistory() {
        return communityhistory;
    }

    public void setCommunityhistory(ArrayList<CommunityData> communityhistory) {
        this.communityhistory = communityhistory;
    }
    
}
