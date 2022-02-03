/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jurnal08;
import java.lang.Math;

/**
 *
 * @author aysla
 */
public class Lingkaran extends BangunDatar{
    private int jari_jari;
    
    public Lingkaran(String nama, int jari_jari) {
        super(nama);
        this.jari_jari = jari_jari;
    }
    
    public int getJari_jari(){
        return this.jari_jari;
    }
    
    @Override
    public double hitungKeliling(){
        String k;
        double kel;
        k = String.format("%.0f", Math.PI*((double) this.jari_jari * 2));
        kel = Double.valueOf(k);
        return kel;
    }
    
    @Override
    public double hitungLuas(){
        double luas;
        String l;
        l = String.format("%.0f", Math.PI * ((double)Math.pow(this.jari_jari, 2)));
        luas = Double.valueOf(l);
        return luas;
    }
    
    public void setJari_jari(int jari_jari){
        this.jari_jari = jari_jari;
    }
}
