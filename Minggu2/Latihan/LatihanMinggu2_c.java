
package LatihanMinggu2;

class buku {
    int harga,halaman;
    
    public void set (int harga,int halaman){
        this.harga = harga;
        this.halaman = halaman;
    }

    public void show (){
        System.out.println("Informasi Buku");
        System.out.println("Harga buku : " + harga);
        System.out.println("Jumlah halaman : " + halaman);
    }
}

public class LatihanMinggu2_c {
    public static void main(String[] args) {
        buku algoritma = new buku();
        algoritma.set(50000, 75);
        algoritma.show();
    }
    
} 
