
package LatihanMinggu2;

/**
 * @fikry
 */

import java.util.Scanner;

public class LatihanMinggu2_d {
    public static void main(String[] args) {
    // Membuat scanner  
        Scanner scan = new Scanner(System.in);
        
    // Mengambil nilai dari keyboard    
        System.out.print("Masukkan Harga = ");
        int harga = scan.nextInt();
        System.out.print("Masukkan jumlah = ");
        int jumlah = scan.nextInt();
        
    // Menghitung dan menampilkan    
        int total = harga * jumlah;
        System.out.println("Tota pembayaran = " + total);
    }
}
