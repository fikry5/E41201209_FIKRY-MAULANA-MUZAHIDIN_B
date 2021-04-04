
package TugasMinggu4;

/**
 * @fikry
 */
public class TugasDoWhile_b {
    public static void main(String[] args) {
        
        System.out.println("\t Do__While");
        System.out.println("Bilangan Perkalian 2 (0-100)");
        System.out.println("============================");
        
        int angka = 2;
        int akhir = 100;
        
        do {
            System.out.print(angka + "   ");
            angka = angka * 2 ;
        } while ( angka <= akhir);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("\t FOR");
        System.out.println("Bilangan Kelipatan 2 (0-100)");
        System.out.println("============================");
        
        int awal = 2;
        int batasAkhir = 50;
        int hasil;
        for(int i = 2; i <= batasAkhir; i++){
            hasil =+ i * awal;
            System.out.println(i + " x " + awal + " = " + hasil);
        }
        System.out.println("");
        
    }
}
