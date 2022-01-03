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

        bayar = p.ngitung(10, 10000);
        System.out.println(bayar);
        p.dispose();
    }

}
