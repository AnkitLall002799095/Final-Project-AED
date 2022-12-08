/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Request;

import java.util.ArrayList;

/**
 *
 * @author hmitt
 */
public class UserRequestDirectory {
    
    private ArrayList<UserRequest> reqList;

    public UserRequestDirectory(){
        this.reqList= new ArrayList<UserRequest>();
    }

    public ArrayList<UserRequest> getReqList() {
        return reqList;
    }

    public void setReqList(ArrayList<UserRequest> reqList) {
        this.reqList = reqList;
    }
    
    public UserRequest addNewProfile() {
        UserRequest newProfile = new UserRequest();
        reqList.add(newProfile);
        return newProfile;
    }
    
    public void deleteProfile(UserRequest req) {
        reqList.remove(req);
    }
    
}
