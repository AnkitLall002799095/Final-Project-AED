/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserSummary;

import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class UserSummaryDirectory {
    
    private ArrayList<UserSummary> summList;
    
    public UserSummaryDirectory(){
        this.summList= new ArrayList<UserSummary>();
    }

    public ArrayList<UserSummary> getSummList() {
        return summList;
    }

    public void setSummList(ArrayList<UserSummary> summList) {
        this.summList = summList;
    }
    
    public UserSummary addNewProfile() {
        UserSummary newProfile = new UserSummary();
        summList.add(newProfile);
        return newProfile;
    }

    public void deleteProfile(UserSummary summ) {
	summList.remove(summ);
    }
    
}
