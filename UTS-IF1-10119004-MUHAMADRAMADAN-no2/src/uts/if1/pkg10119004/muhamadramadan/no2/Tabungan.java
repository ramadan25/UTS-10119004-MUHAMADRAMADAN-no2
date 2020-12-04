/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119004.muhamadramadan.no2;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini berisi tentang tabungan
 */
class Tabungan {
    private double saldoSekarang;
    

    public void hitung(double saldoAwal,double jumlahPenarikan){ 
       saldoSekarang = saldoAwal - jumlahPenarikan;
       tampil();
   }
    private void tampil(){
        System.out.println("======Hasil Penarikan uang======");
        System.out.println("Saldo Sekarang\t\t\t: Rp. " + saldoSekarang);       
   }
    
}
