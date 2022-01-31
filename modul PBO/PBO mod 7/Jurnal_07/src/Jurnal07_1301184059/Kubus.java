/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jurnal07_1301184059;
import java.lang.Math;

/**
 *
 * @author akmal
 */
public class Kubus extends bentuk implements BangunRuang{
    private int sisi;
    
    public Kubus(String nama, int sisi){
        super(nama);
        this.sisi = sisi;
    }
    
    public double hitungVolume(){
        return Math.pow((double) this.sisi,3);
    }
    
     public double hitungLuasPermukaan(){
        return 6*Math.pow((double)this.sisi,2);
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Nama Kubus      : "+this.getNama());
        System.out.println("Panjang Sisi    : "+this.sisi);
    }
}
