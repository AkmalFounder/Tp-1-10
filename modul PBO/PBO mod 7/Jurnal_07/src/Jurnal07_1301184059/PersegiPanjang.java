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
public class PersegiPanjang extends bentuk implements BangunDatar{
    private int lebar;
    private int panjang;
    
    public PersegiPanjang(String nama, int p, int l){
        super(nama);
        this.panjang = p;
        this.lebar = l;
    }
    
     public double hitungLuas(){
        return this.panjang*this.lebar;
    }
    
    public double hitungKeliling(){
        return 2*this.panjang + 2*this.lebar;
    }
    
   
    @Override
    public void info(){
        super.info();
        System.out.println("Nama Persegi Panjang    : "+this.getNama());
        System.out.println("Panjang                 : "+this.panjang);
        System.out.println("Lebar                   : "+this.lebar);
    }
}
