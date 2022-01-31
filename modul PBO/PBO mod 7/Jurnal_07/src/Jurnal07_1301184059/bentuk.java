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
public abstract class bentuk {
    private String nama;
    
    public bentuk(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void info(){}
}
