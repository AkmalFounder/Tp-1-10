/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivergeneric_1301184059;

/**
 *
 * @author akmal
 */
public class Side_1301184059<T,V> {
    T left1301184059;
    V right1301184059;
    
    public Side_1301184059(T left1301184059, V right1301184059){
        this.left1301184059=left1301184059;
        this.right1301184059=right1301184059;
    }
    
    public void setLeft1301184059(T left1301184059){
        this.left1301184059=left1301184059;
    }
    
    public void setRight1301184059(V right1301184059){
        this.right1301184059=right1301184059;
    }
    
    public T getLeft1301184059(){
        return left1301184059;
    }
    
    public V getRight1301184059(){
        return right1301184059;
    }
    
    public void info1301184059(){
        System.out.println("Tipe Left : "+ left1301184059.getClass().getName());
        System.out.println("Nilai Left : "+ this.getLeft1301184059());
        System.out.println("Tipe Right : "+ right1301184059.getClass().getName());
        System.out.println("Nilai Right : "+ this.getRight1301184059());
    }
}