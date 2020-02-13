
package com.sendinEmail;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


public class Configuration {
    
    public static Properties property = new Properties();
    
    public void saveProperty(String title, String value){
    
        try{
            property.setProperty(title, value);
            property.store(new FileOutputStream("sendFrom.config"), null);
        
        
        
        }catch(Exception e){
            System.out.print(e);
        }
    
    
    }
    
    
    public String getProperty(String title){
           String value = "";
           
     try{
            property.load(new FileInputStream("sendFrom.config"));
           value = property.getProperty(title);
        
        }catch(Exception e){
            System.out.print(e);
        }
       
    return value;
    }
    
}
