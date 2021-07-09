/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectjava;

/**
 *
 * @author A S U S
 */
class barang{
    String nama;
    int hargaSatuan;
    int jumlah;
    int total;
    int diskon;
    int hargaBayar;
    
    int hitungHargaTotal(int jumlah, int hargaSatuan){
    total = hargaSatuan * jumlah;
        System.out.println("Total               : Rp."+ total);
        return total;
    }
    
    int hitungDiskon(int total){
    if(total > 100000){
        diskon = total * 10/100;
        System.out.println("DIskon              : Rp."+diskon);
    }else if(total>= 50000 && total <= 100000){
        diskon = total * 5/100;
        System.out.println("Diskon              : Rp."+diskon);
    }else{
        System.out.println("DIskon              : Rp.0");
    }
    return diskon;
    }
    
    int hitungHargaBayar(){
        hargaBayar = total - diskon;
        System.out.println("Anda harus membayar : Rp."+hargaBayar);
        return hargaBayar;
    }
}
public class ObjectJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        barang barang1 = new barang();
        barang1.nama = "Susu bear brand";
        barang1.jumlah = 15;
        barang1.hargaSatuan = 10000;
        System.out.println("Nama barang         : "+barang1.nama);
        barang1.hitungHargaTotal(barang1.jumlah, barang1.hargaSatuan);
        barang1.hitungDiskon(barang1.total);
        barang1.hitungHargaBayar();
        
        System.out.println("");
        
        barang barang2 = new barang();
        barang2.nama = "Susu Ultramilk";
        barang2.jumlah = 10;
        barang2.hargaSatuan = 5000;
        System.out.println("Nama barang         : "+barang2.nama);
        barang2.hitungHargaTotal(barang2.jumlah, barang2.hargaSatuan);
        barang2.hitungDiskon(barang2.total);
        barang2.hitungHargaBayar();
        
        System.out.println("");
        
        barang barang3 = new barang();
        barang3.nama = "Susu Frisia Flag";
        barang3.jumlah = 2;
        barang3.hargaSatuan = 4500;
        System.out.println("Nama barang         : "+barang3.nama);
        barang3.hitungHargaTotal(barang3.jumlah, barang3.hargaSatuan);
        barang3.hitungDiskon(barang3.total);
        barang3.hitungHargaBayar();
    }
    
}
