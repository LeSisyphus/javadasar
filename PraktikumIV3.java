package praktikum;
import java.util.Scanner;

public class PraktikumIV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPembelian = 0;
        int menit = 0;
        int stokTersisa = 150; 
        int hasilPembelian = 0;
        int hargaSemangka = 100000;

        System.out.println("===== TOKO BUAH A =====");
        System.out.print("Enter jumlah pembelian : ");
        jumlahPembelian = input.nextInt();
        
        if (jumlahPembelian <= 0 || jumlahPembelian > stokTersisa) {
            System.err.println("ERROR - Masukkan jumlah pembelian yang valid!");
        } else {
            System.out.print("Enter menit : ");
            menit = input.nextInt();

        if (menit <= 0) {
        System.err.println("ERROR - Masukkan nputan tidak valid!");
        } else if (menit > 420){
        System.err.println("Toko Tutup!");
        }
        else {   
        int potongan = (menit / 40) * 5;
                
        hasilPembelian = jumlahPembelian * hargaSemangka;
        int totalPotongan = (hasilPembelian * potongan) / 100;
        hasilPembelian -= totalPotongan;

        stokTersisa -= jumlahPembelian;

        System.out.println("===============================");
        System.out.println("Jumlah Pembelian : " + jumlahPembelian);
        System.out.println("Stok Tersisa : " + stokTersisa);
        System.out.println("Hasil Pembelian : Rp" + hasilPembelian);
        
      }
    }
  }
}