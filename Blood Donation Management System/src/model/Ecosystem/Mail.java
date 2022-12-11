/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Ecosystem;


import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author surajvisvesh
 */
public class Mail {
    public static void sendEmailMessage(String emailId, String body) {
        String to = emailId;
        String from = "bloodonate.aed@gmail.com";
        String pass = "htrbinzqtlmvutdx";

        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties);
        try {
            System.out.println("Entered try");
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("New User Registration");
            message.setText(body);
            System.out.println("before");
            Transport transport = session.getTransport("smtp");
                System.out.println("Entered transport");
                transport.connect(host, from, pass);
                System.out.println("Entered transport2");
                transport.sendMessage(message, message.getAllRecipients());
            
        
            System.out.println("Sent message successfully....");
        } catch (Exception mex) {
            System.out.print(mex.getMessage());
//            JOptionPane.showMessageDialog(null, "Invalid Email Address");
        }
    }
}
