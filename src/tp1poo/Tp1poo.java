/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Tp1poo {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        app facebook = new app(10,"facebook");
        app instagram = new app(10,"instagram");  
        app twitter = new app(10,"twitter");
        
        List<app> apps = new ArrayList<app>();
        apps.add(twitter);
        apps.add(instagram);
        apps.add(facebook);
        
        Dueño Simon = new Dueño("Simon", "Gomez", 14);
        
        Celular samsung = new Celular(70,"samsung",20,apps,Simon);
        
        
        Celular xiaomi = new Celular(50,"xiaomni",19);
        xiaomi.getApp().add(twitter);
        
        
        
        
        samsung.saludar();
        xiaomi.saludar();
        
        samsung.suma();

    }
    
}
