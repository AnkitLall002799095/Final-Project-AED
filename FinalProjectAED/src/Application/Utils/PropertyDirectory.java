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
public class PropertyDirectory {
    
    private ArrayList<Property> propList;
    
    public PropertyDirectory(){
        this.propList = new ArrayList<Property>();
    }

    public ArrayList<Property> getPropList() {
        return propList;
    }

    public void setPropList(ArrayList<Property> propList) {
        this.propList = propList;
    }
    
    public Property addNewProfile() {
        Property newProfile = new Property();
        propList.add(newProfile);
        return newProfile;
    }

    public void deleteProfile(Property prop) {
	propList.remove(prop);
    }
}
