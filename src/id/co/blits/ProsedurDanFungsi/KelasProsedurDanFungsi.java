/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.ProsedurDanFungsi;

/**
 *
 * @author ronaldi willson
 */
public class KelasProsedurDanFungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int T, n;


        n = Nilai(4, 4); //Fungsi Nilai dipanggil
        T = n * 100;

        System.out.println(T);
    }

        public static int Nilai(int a, int b) {
        int n;

        b = b * 4;
        n = a + b;
        return n;
    }
    
}
