/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_2101092052;

/**
 *
 * @author Maharani Diradinova
 */
import java.util.Scanner;
public class hotel {
     public static void main(String[] args) 
    {
    Scanner masuktotal=new Scanner (System.in);
        int room = 0;
        int kodepesan,kodepelanggan,jeniskamar1=600000,jeniskamar2=700000,tarif,diskon,total, waktu, uang, kembali;
       
   
        System.out.println("WELCOME TO DINOVA HOTEL");
        System.out.println();
        System.out.println("DAPATKAN DISKON 2% JIKA ANDA BOOKING KAMAR 1 DAN DISKON 3% JIKA ANDA BOOKING KAMAR 2!!!");
        System.out.println();
        System.out.println("DAFTAR HARGA\n1. KAMAR 1 = Rp.600.000,-\n2. KAMAR 2 = Rp.700.000,-");
     
        System.out.print("Masukan Nomor Kode Kelas Kamar = ");
        room = masuktotal.nextInt();
     
        switch (room){
            case 1: System.out.println("Anda akan memesan KAMAR 1");
            System.out.println();
                    System.out.print("Silahkan Masukan Berapa Hari anda akan tinggal = ");
                    waktu = masuktotal.nextInt();
                    tarif = waktu*600000;
                    System.out.println("Harga = Rp."+tarif+",-");
                    if(waktu>=4){
                    diskon=((tarif*2)/100);  
                        System.out.println("diskon = Rp."+diskon+",-");
                        tarif = (tarif-diskon);
                    System.out.println("Total harga = Rp."+tarif+",-");
                    }
                    System.out.print("Masukan Uang yang diberikan Rp.");
                    uang = masuktotal.nextInt();
                        kembali=(uang-tarif);
                    System.out.println("Kembalian Anda = Rp."+kembali+",-");
                    System.out.println();
                    System.out.println("TerimaKasih Atas Pemesanan Anda");
                    System.out.println("================Maharani Diradinova================");
                    break;
            case 2: System.out.println("Anda akan memesan kamar KAMAR 2");
            System.out.println();
                    System.out.print("Silahkan Masukan Berapa Hari anda akan tinggal = ");
                    waktu = masuktotal.nextInt();
                    tarif = waktu*700000;
                    System.out.println("Harga = Rp."+tarif+",-");
                    if(waktu>=4){
                    diskon=((tarif*3)/100);  
                        System.out.println("diskon = Rp."+diskon+",-");
                        tarif = (tarif-diskon);
                    System.out.println("Total harga = Rp."+tarif+",-");
                    }
                    System.out.print("Masukan Uang yang diberikan Rp.");
                    uang = masuktotal.nextInt();
                    kembali=(uang-tarif);
                    System.out.println("Kembalian Anda = Rp."+kembali+",-");
                    System.out.println();
                    System.out.println("TerimaKasih Atas Pemesanan Anda");
                    System.out.println("================Maharani Diradinova================");
                    
    System.out.println("TerimaKasih Atas Pemesanan Anda");
    System.out.println("================Maharani Diradinova================");
                    }
        }
    
}
