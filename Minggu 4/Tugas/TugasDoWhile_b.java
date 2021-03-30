
package TugasMinggu4;

/**
 * @fikry
 */
public class TugasDoWhile_b {
    public static void main(String[] args) {
        
        System.out.println("\t Do__While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int angka = 1;
        
        do {
            System.out.print(angka + "   ");
            angka = angka * 2 ;
        } while ( angka <= 100);
        System.out.println("");
    }
}
