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
public class LegalCompanyAdmin extends Person{
    int companyId;
    String companyName;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
    
    public LegalCompanyAdmin(String name, LocalDate dob, String gender, String email,long phoneNumber , String password, String street, String community, String city, String state ){
      super();
      setUid(uid);
      setUserRole("legalAdmin");
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
}
