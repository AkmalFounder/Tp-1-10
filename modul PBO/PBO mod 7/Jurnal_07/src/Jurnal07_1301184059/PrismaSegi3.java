/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jurnal07_1301184059;
import java.lang.Math;

// @author akmal
public class PrismaSegi3 extends bentuk implements BangunRuang{
    private int alas;
    private int tinggi;
    private int tinggiPrisma;
    
    public PrismaSegi3(String nama, int alas, int tinggi, int tinggiPrisma){
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double hitungVolume(){
        return (double)(((this.alas*this.tinggi)/2)*this.tinggiPrisma);
    }
    
    public double hitungLuasPermukaan(){
        return (double)((2*this.alas)+((3*this.alas)*this.tinggiPrisma));
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Nama Prisma Segitiga    : "+this.getNama());
        System.out.println("Alas Segitiga           : "+this.alas);
        System.out.println("Tinggi Segitiga         : "+this.tinggi);
        System.out.println("Tinggi Prisma           : "+this.tinggiPrisma);
    }
}
