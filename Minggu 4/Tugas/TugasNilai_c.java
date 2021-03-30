
package TugasMinggu4;

import java.util.Scanner;

/**
 * @fikry
 */
public class TugasNilai_c {
    public static void main(String[] args) {
        int nilai[];
        int banyak_data, average;
        int jumlah = 0;
        
        Scanner masukan = new Scanner(System.in);
        
        //masukkan banyak data
        System.out.print("Masukan banyaknya data nilai = ");
        banyak_data = masukan.nextInt();
        nilai = new int[banyak_data];
        
        //masukkan nilai
        for(int i = 0; i < banyak_data; i++){
            System.out.print("Masukan data nilai ke " + (i+1) + " = ");
            nilai[i] = masukan.nextInt();
            
            jumlah += nilai[i];
        }
        
        int min = nilai[0];
        int max = nilai[0];        
        
        //mencari nilai min & max
        for(int i = 0; i < banyak_data; i++){
            if (min > nilai[i]) {
                min = nilai[i];
            }
            else if (max < nilai[i]) {
                max = nilai[i];
            }
        }
        
        //mencari rata-rata
        average = jumlah/banyak_data;
        
        //menampilkan output
        System.out.println("");
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai rata ratanya adalah  = " + average);
    }
}
