/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalno3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author viky1sr
 */
public class SoalNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiswa: ");
        
        int jmlMhs = scan.nextInt();
               
        int nilaiPBO[] = new int[jmlMhs];
        
        System.out.print("Masukan nilai mahasiswa: ");
        for (int i = 0; i < nilaiPBO.length; i++) {
            nilaiPBO[i] = scan.nextInt();
        }
        
        int max = Arrays.stream(nilaiPBO).max().getAsInt();
        
        System.out.println("Nilai terbaik = " + max);
    }
    
}
