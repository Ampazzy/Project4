/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author bagas
 */
public class PenghitunganTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Penghitungan p = new Penghitungan();
        int bayar;
        
        System.out.println("Pengetesan Dimulai");
        
        System.out.println("Tes 1 :");
        bayar = p.ngitung(10, 10000);
        System.out.println(bayar);
        
        System.out.println("Tes 2 : ");
        bayar = p.ngitung(0, 10000);
        System.out.println(bayar);
        
        System.out.println("Tes 3 : ");
        bayar = p.ngitung(10, 0);
        System.out.println(bayar);
        
        System.out.println("Pengetesan Selesai");
        p.dispose();
    }

}
