/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalno4;

/**
 *
 * @author viky1sr
 */
public class SoalNo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pecahan p1 = new Pecahan(1, 2);
       Pecahan p2 = new Pecahan(2, 4);
       
       p2.tambah(p1);
       
       System.out.println(p1.getPembilang());
       System.out.println("-");
       System.out.println(p1.getPenyebut());

       System.out.println("---------");

       System.out.println(p2.getPembilang());
       System.out.println("-");
       System.out.println(p2.getPenyebut());
    }
    
}
