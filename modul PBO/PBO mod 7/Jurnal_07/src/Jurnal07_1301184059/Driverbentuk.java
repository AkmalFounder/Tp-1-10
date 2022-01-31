/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jurnal07_1301184059;

/**
 *
 * @author akmal
 */
public class Driverbentuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus K = new Kubus("Kiub", 5);
        Lingkaran L = new Lingkaran("Sirkel", 14);
        PersegiPanjang PP = new PersegiPanjang("Rektenggel", 8,9);
        PrismaSegi3 PS3 = new PrismaSegi3("Traienggel Prism", 6,7,10);
        L.info();
        System.out.println("Luas                : "+L.hitungLuas());
        System.out.println("Keliling            : "+L.hitungKeliling()+"\n");
        PP.info();
        System.out.println("Luas                    : "+PP.hitungLuas());
        System.out.println("Keliling                : "+PP.hitungKeliling()+"\n");
        K.info();
        System.out.println("Luas Permukaan  : "+K.hitungLuasPermukaan());
        System.out.println("Volume          : "+K.hitungVolume()+"\n");
        PS3.info();
        System.out.println("Luas Permukaan          : "+PS3.hitungLuasPermukaan());
        System.out.println("Volume                  : "+PS3.hitungVolume()+"\n");
    }
    
}
