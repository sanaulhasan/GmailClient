
package com.sendinEmail;

import static com.sendinEmail.MainFrame.status;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;

public class SendEmail {
    
     Configuration config = new Configuration();
     
    private String user = config.getProperty("address");
    private String password = config.getProperty("password");
    
    public SendEmail(String to, String subject, String message){
    
        Properties properties = new Properties();    
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
    
             @Override
             protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                 
                 return new javax.mail.PasswordAuthentication(user,password);
            }
    
     });
      try{
       
            Message messages = new MimeMessage(session);
            messages.setFrom(new InternetAddress("no-reply@gmail.com"));
            messages.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            messages.setSubject(subject);
            messages.setText(message);
            
            Transport.send(messages);
           
            status.setIcon(new ImageIcon(getClass().getResource("/com/sendinEmail/tick.png")) );
            MainFrame.status.setText("  Send Successfully");
            MainFrame.to.setEditable(true);
            MainFrame.subject.setEditable(true);
            MainFrame.message.setEditable(true);   
            MainFrame.count = 0;
            MainFrame.new_btn.setVisible(true);
            MainFrame.new_btn.setEnabled(true);
         
        }catch(Exception e){
        
        status.setIcon(new ImageIcon(getClass().getResource("/com/sendinEmail/error.GIF")) );
          
            MainFrame.status.setText("  Sending Failed"); 
            MainFrame.to.setEditable(true);
            MainFrame.subject.setEditable(true);
            MainFrame.message.setEditable(true);
            MainFrame.count = 0;
        }
        
    }
    
}
