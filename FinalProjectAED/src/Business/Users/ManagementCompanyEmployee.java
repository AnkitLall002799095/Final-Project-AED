/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class ManagementCompanyEmployee extends Person  {
    int companyId;
    String companyName;
    
   ManagementCompanyEmployee(int uid ,String userRole, String name, String dob, String gender, String email,String phoneNumber , String password, String street, String community, String city, String state ){
      super();
      setUid(uid);
      setUserRole("Management User Employee");
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
      setCompanyId(companyId);
      setCompanyName(companyName);
      
     }
    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int CompanyId) {
        this.companyId = CompanyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String CompanyName) {
        this.companyName = CompanyName;
    }
    
   
    
    
    
    
    
    
    
    
}
