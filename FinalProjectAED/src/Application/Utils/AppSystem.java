 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import Business.ContractApplication.ContractApplicationCatalog;
import UserInterface.Main.AppView;
import UserInterface.Main.LoginView;
import UserInterface.Main.WorkAreaContPanel;

/**
 *
 * @author Bhawna Bassarmalani <your.name at your.org>
 */
public class AppSystem {
    
    public static AppView appViewObj;
    public static ContractApplicationCatalog contractApplicationCatalog;
    public static WorkAreaContPanel workAreaPanel;
    
    
    
    public AppSystem(AppView appViewObj) {
        this.appViewObj = appViewObj;
        this.contractApplicationCatalog = new ContractApplicationCatalog();
        
        
    }
    
    public static String currentUserRole;
    public static String currentUid;
    
    public static void setCurrentUserRole(String UserRole) {
		currentUserRole = UserRole;
                
	}
    public static void setCurrentUid(String Uid){
         currentUid = Uid;
    
    }
    
}

