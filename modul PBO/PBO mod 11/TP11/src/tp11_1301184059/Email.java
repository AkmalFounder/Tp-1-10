/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11_1301184059;

import java.time.LocalDate;

/**
 *
 * @author akmal
 */
public class Email {
    int id;
    String sender,subject,content;
    LocalDate date;
    Boolean starred;
    
    public Email(int id, String sender, String Subjek, String konten, LocalDate Tgl, boolean star){
        this.id = id;
        this.sender = sender;
        this.subject = Subjek;
        this.content = konten;
        this.date = Tgl;
        this.starred = star;
    }
    
     public int getID(){
        return this.id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getSender(){
        return this.sender;
    }
    
    public void setSender(String sender){
        this.sender = sender;
    }
    
    public String getSubject(){
        return this.subject;
    }
    
    public void setSubject(String Subjek){
        this.subject = Subjek;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public void setContent(String konten){
        this.content = konten;
    }
    
    public LocalDate getDate(){
        return this.date;
    }
    
    public void setDate(LocalDate tgl){
        this.date = tgl;
    }
    
    public boolean GetStarred(){
        return this.starred;
    }
    
    public void setStarred(boolean star){
        this.starred = star;
    }
    
    public void display(){
        System.out.println("------------------------------");
        System.out.println(this.sender + "     " + this.date);
        System.out.println(this.subject);
        if(this.starred == true){
            System.out.println(content + "             *");
        } else {
            System.out.println(content + "          x");
        }
    }
    
}
