/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11_1301184059;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
/**
 *
 * @author akmal
 */
public class Driver {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        List<Email> email = new ArrayList<>(3);
        email.add(new Email(1,"Eren Yeager","Titan 1","Hello, How Are You?",LocalDate.of(2021, 5,1),false));
        email.add(new Email(2,"Armin Arlert","Titan 2","It's Meet Tomorrow!",LocalDate.of(2021, 4,29),false));
        email.add(new Email(3,"Mikasa Ackerman","Titan 3","Project Deadline",LocalDate.of(2021, 4,30),true));
        
        System.out.println("Menyimapan Data Ke Email.txt");
        File file = new File("email.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < email.size(); i++) {
            bw.write("------------------------------");
            bw.newLine();
            bw.write(email.get(i).sender + "     " + email.get(i).date);
            bw.newLine();
            bw.write(email.get(i).subject);
            bw.newLine();
            if(email.get(i).starred == true){
                bw.write(email.get(i).content + "             *");
            } else {
                bw.write(email.get(i).content + "          x");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        System.out.println("Berhasil Menyimpan \n");
 
        
        System.out.println("Mengambil Data \nEmail :");
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          System.out.println(data);
        }
    }
    
}
