/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class PBOUlang10118802Latihan5 {

    int jumlahKambing = 88;
    
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: "+ jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: "+ jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBOUlang10118802Latihan5 kambingSusu =  new PBOUlang10118802Latihan5();
        kambingSusu.getJumlahKambing();
        kambingSusu.tambahKambing();
        kambingSusu.getJumlahKambing();
    }
    
}
