/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class ApartmentDirectory {
    
    private ArrayList<Apartment> aptList;
    
    public ApartmentDirectory(){
        this.aptList = new ArrayList<Apartment>();
    }

    public ArrayList<Apartment> getAptList() {
        return aptList;
    }

    public void setAptList(ArrayList<Apartment> aptList) {
        this.aptList = aptList;
    }
    
    public Apartment addNewProfile() {
        Apartment newProfile = new Apartment();
        aptList.add(newProfile);
        return newProfile;
    }
    
    public void deleteProfile(Apartment apt) {
        aptList.remove(apt);
    }
}
