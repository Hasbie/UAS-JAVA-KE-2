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
public class Pecahan {
    private int pembilang;
    private int penyebut;

    public Pecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    public int getPembilang() {
        return pembilang;
    }

    public void setPembilang(int pembilang) {
        this.pembilang = pembilang;
    }

    public int getPenyebut() {
        return penyebut;
    }

    public void setPenyebut(int penyebut) {
        this.penyebut = penyebut;
    }

    public Pecahan tambah(Pecahan p){
        p.setPembilang(p.pembilang += this.pembilang);
        p.setPenyebut( p.penyebut += this.penyebut);
        return p;
    }
}
