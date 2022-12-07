 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application.Utils;

import Business.ContractApplication.ContractApplicationCatalog;
import UserInterface.Main.AppView;
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
}
