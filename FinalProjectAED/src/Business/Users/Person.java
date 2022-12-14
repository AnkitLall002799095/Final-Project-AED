package Business.Users;


import java.time.LocalDate;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class Person {
    public  int uid;
    public  String userRole;
    public  String name;
    public  LocalDate dob;
    public  String gender;
    public String email;
    public long phoneNumber;
    public String password;
    public String street;
    public String community;
    public String  city;
    public String state;

    
    public int getUid() {
        return uid;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

   public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getStreet() {
        return street;
    }

    public String getCommunity() {
        return community;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    

    
    
	
		
	
}
