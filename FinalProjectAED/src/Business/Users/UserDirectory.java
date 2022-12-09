/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Users;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class UserDirectory {
   public ArrayList<Person> personList;

    public UserDirectory() {
        this.personList = new ArrayList<Person> ();
    }
   

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addNewUser(){
        Person newPerson = new Person();
        personList.add(newPerson);
        return newPerson;
    }
   
    
    public void deleteUser(Person person) {
        personList.remove(person);
    }
}
