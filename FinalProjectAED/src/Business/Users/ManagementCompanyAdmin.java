/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import java.time.LocalDate;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class ManagementCompanyAdmin extends Person {
    
    int companyId;
    String companyName;
    
    public ManagementCompanyAdmin(String name, LocalDate dob, String gender, String email, long phoneNumber , String password, String street, String community, String city, String state ){
       super();
       setUserRole("mgtCompAdmin");
       setName(name);
       setDob(dob);
       setGender(gender);
       setEmail(email);
       setPhoneNumber(phoneNumber);
       setPassword(password);
       setStreet(street);
       setCommunity(community);
       setCity(city);
       setState(state);      
    }
    
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int CompanyId) {
        this.companyId = CompanyId;
    }  
    
}
