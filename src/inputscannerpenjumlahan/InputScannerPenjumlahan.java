/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputscannerpenjumlahan;

import java.util.Scanner;

/**
 *
 * @author nicolahara
 */
public class InputScannerPenjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program Inputan Menjumlahkan 2 Bilangan");
        Scanner sc = new Scanner(System.in);
        int bilangan1, bilangan2, total;
        System.out.println("Masukkan Bilangan 1 :");
        bilangan1 = sc.nextInt();
        System.out.println("Masukkan Bilangan 2 :");
        bilangan2 = sc.nextInt();
        total = bilangan1 + bilangan2;
        System.out.println("Jumlah Bilangan :" + total);    
    }
    
}
