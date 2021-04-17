package LatihanMinggu6;

import java.util.Scanner;

/**
 *
 * @author fikry
 */
public class BinarySearch {
    public static int[] data = null;
    public static int first, middle, last, temp, count;
	
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
		
        // masukkan jumlah data
        System.out.print("Jumlah data : ");		
        int jumlah = scan.nextInt();
		
        // masukkan nilai dan simpan ke array
        data = new int[jumlah];
        for(int x = 0; x < data.length; x++) {
            System.out.print("Masukkan Data ke-" + (x+1) + " : ");	
            data[x] = scan.nextInt();
        }
		
        // menampilkan data sebelum di sorting
        System.out.print("\nData    : ");
        for(int x = 0; x < data.length; x++)
            System.out.print(data[x] + " ");
		
        // proses sorting
        sorting();
		
        // menampilkan Data setelah di sorting
        System.out.println();
        System.out.print("Sorting : ");
        for(int x = 0; x < data.length; x++)
            System.out.print(data[x]+" ");
		
        // masukkan data yang dicari
        System.out.print("\nData yang dicari : ");		
        int search = scan.nextInt();
		
        // proses Metode Pencarian Binary Searching
        System.out.println();
        boolean temu = false;
        first = 0;
        last = data.length - 1;
        temp = 0;
        count = 0;
        int iterasi = 0;
        System.out.println("It  Aw  Ak  Te  Ni");
        while(temu != true)
        {							
            middle = (first + last) / 2;
            iterasi++;
		
            // value == cari
            if(data[middle] == search)
            {
                System.out.print(iterasi + "   ");
                System.out.print(first + "   ");
                System.out.print(last + "   ");
                System.out.print(middle + "   ");
                System.out.print(data[middle] + "\n");
                temu = true;
                break;
            }
			
            // value < cari
            else if(data[middle] < search)
            {
                System.out.print(iterasi + "   ");
                System.out.print(first + "   ");
                System.out.print(last + "   ");
                System.out.print(middle + "   ");
                System.out.print(data[middle] + "\n");
                first = middle + 1;
            }
				
            // value > cari
            else if(data[middle] > search)
            {
                System.out.print(iterasi + "   ");
                System.out.print(first + "   ");
                System.out.print(last + "   ");
                System.out.print(middle + "   ");
                System.out.print(data[middle] + "\n");
		last = middle - 1;
            }
			
            // mengecek worst case
            if(temp != data[middle])
               temp = data[middle];
            else
               count++;
			
		// batasan untuk worst case
		if(count == 3)
		break;
        }
		
        // output
        if(temu == true)
            System.out.println("\nData " + search + " ditemukan pada index ke-" + 
                    middle + "\n" + "dan Iterasi ke-" + iterasi);
		
        else
            System.out.println("\nData "+search+" tidak ditemukan");		
    }
	
    // sorting ascending
    public static void sorting() {
        int temp = 0;
        for(int x = 0; x < data.length; x++) {
            for(int y = 0; y < data.length; y++) {
                if(x == y)
                continue;
				
                else {
                    if(data[x] < data[y]) {
                        temp = data[y];
                        data[y] = data[x];
                        data[x] = temp;						
                    }
                }
            }
        }
    }
}
