/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivergeneric_1301184059;

import java.time.LocalDate;

/**
 *
 * @author akmal
 */
public class DriverGeneric_1301184059 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Array List A");
        Side_1301184059<String, Integer> A[] = new Side_1301184059[2];
        A[0] = new Side_1301184059<>("nilai",60);
        A[0].info1301184059();
       
        A[1] = new Side_1301184059<>("tahun",2001);
        A[1].info1301184059();
        
        System.out.println(" ");
        
        System.out.println("Array List B");
        Side_1301184059 <LocalDate, Double> B[] = new Side_1301184059[2];
        B[0] = new Side_1301184059<>(LocalDate.now(),9.6);
        B[0].info1301184059();
       
        B[1] = new Side_1301184059<>(LocalDate.of(2020,01,01),7.8);
        B[1].info1301184059();
    }
}
