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
public class Lingkaran extends bentuk implements BangunDatar{
    private final int jariJari;
    
    public Lingkaran(String nama, int jariJari){
        super(nama);
        this.jariJari = jariJari;
    }
    
    public double hitungLuas(){
        double luas;
        String l;
        l = String.format("%.0f", Math.PI * ((double)Math.pow(this.jariJari, 2)));
        luas = Double.valueOf(l);
        return luas;
    }
    
    public double hitungKeliling(){
        String k;
        double kel;
        k = String.format("%.0f", Math.PI*((double) this.jariJari * 2));
        kel = Double.valueOf(k);
        return kel;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Nama Lingkaran      : "+this.getNama());
        System.out.println("Panjang Jari-jari   : "+this.jariJari);
    };
}
