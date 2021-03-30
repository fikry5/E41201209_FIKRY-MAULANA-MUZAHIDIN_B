
package TugasMinggu4;

import java.util.Scanner;
/**
 * @fikry
 */
public class TugasFor_a {
    public static void main(String[] args) {
        
        Scanner masukan = new Scanner(System.in);
        
        int awal, akhir;
        
        System.out.println(" DERETAN BILANGAN GENAP ");
        System.out.println("-----------------------");
        System.out.println("");
        
        System.out.print("Masukan Batas Awal : ");
        awal = masukan.nextInt();
        System.out.print("Masukan Batas Akhir : ");
        akhir = masukan.nextInt();
        System.out.println("");
        
        System.out.print("Deretan bilangan genap antara (" + awal + "-" + akhir + ") = ");
        for(int i = awal; i <= akhir; i++){
            if (i%2 == 0 )
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
