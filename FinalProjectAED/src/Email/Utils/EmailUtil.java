/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Email.Utils;


import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EmailUtil {
    
    public static void triggerUserToManagementMail(String userEmail, String mgmtEmail){
        
        // passing email id and password from method
        final String username = userEmail;
        final String password = "qtprumgsaychvgnd";
        final String recipientEmail = mgmtEmail;
        final String host = "localhost";

        // Getting system properties which are in key-value pair format
        Properties property = new Properties();			

        // enable the authentication for connection
        // for gmail authentication is mandatory so setting to 'true'
        property.put("mail.smtp.auth", "true");			

        // enabling STARTTLS as below for TLS encryption
        property.put("mail.smtp.starttls.enable", "true");

        // Setting up the mail server
        // for gmail host is "smtp.gmail.com"
        property.put("mail.smtp.host", "smtp.gmail.com");	

        // Setting value for TLS Port as 587 for gmail SMTP
        property.put("mail.smtp.port", "587");			

        // creating Session instance to login using the provided credentials
        // creating new authenticator to validate the session
        Session session = Session.getInstance(property, new javax.mail.Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            
            // composing the message
            // javax.mail.internet.MimeMessage class is mostly used for abstraction.
            Message mess = new MimeMessage(session);

            // specifying from address for triggering email
            mess.setFrom(new InternetAddress("abcx98414@gmail.com"));

            //specifying recipient address to trigger email
            mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            mess.setSubject("New request waiting for action!");
            mess.setText("Hey,\nI am interested in using your property management services. Kindly refer to my request.\n\nThanks and regards!");

            //sending message
            Transport.send(mess);
        }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void triggerManagementToUserMail(String mgmtEmail, String userEmail){
        
        // passing email id and password from method
        final String username = mgmtEmail;
        final String password = "lpzdslbpypipsbbq";
        final String recipientEmail = userEmail;
        final String host = "localhost";

        // Getting system properties which are in key-value pair format
        Properties property = new Properties();			

        // enable the authentication for connection
        // for gmail authentication is mandatory so setting to 'true'
        property.put("mail.smtp.auth", "true");			

        // enabling STARTTLS as below for TLS encryption
        property.put("mail.smtp.starttls.enable", "true");

        // Setting up the mail server
        // for gmail host is "smtp.gmail.com"
        property.put("mail.smtp.host", "smtp.gmail.com");	

        // Setting value for TLS Port as 587 for gmail SMTP
        property.put("mail.smtp.port", "587");			

        // creating Session instance to login using the provided credentials
        // creating new authenticator to validate the session
        Session session = Session.getInstance(property, new javax.mail.Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            
            // composing the message
            // javax.mail.internet.MimeMessage class is mostly used for abstraction.
            Message mess = new MimeMessage(session);

            // specifying from address for triggering email
            mess.setFrom(new InternetAddress("abcx98414@gmail.com"));

            //specifying recipient address to trigger email
            mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            mess.setSubject("Review the action on your request");
            mess.setText("Hey,\nThanks a lot for reaching out to us. We have analyzed your request and updated the request status accordingly. Feel free to reach out for further queries.\n\nThanks and regards!");

            //sending message
            Transport.send(mess);
        }
        catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
}
