/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119004.muhamadramadan.no2;

import java.util.Scanner;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini berisi tentang tabungan
 */
public class UTSIF110119004MUHAMADRAMADANNo2 {
    private static double saldoAwal;
    static Scanner scanner = new Scanner (System.in);
    private static double jumlahPenarikan;
    private static void inputTabungan(){
              
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan saldo awal : Rp. ");
        saldoAwal = scanner.nextDouble();
        System.out.print("Jumlah uang yang diambil : Rp. ");
        jumlahPenarikan = scanner.nextDouble();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabungan = new Tabungan();
        inputTabungan();
        tabungan.hitung(saldoAwal, jumlahPenarikan);
    }
    
}
