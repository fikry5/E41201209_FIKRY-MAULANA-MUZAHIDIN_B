package LatihanMinggu6;

/**
 *
 * @author fikry
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8}; 
        System.out.println("Array Before Selection Sort Sort");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println("");
        System.out.println("====================================================");
        
        //proses selection sort
        System.out.println("Proses Selection Sort");
        for (int x = 0; x < arr.length - 1; x++) {
            System.out.println("Iterasi ke-" + (x + 1) + " : ");
            for (int y = 0; y < arr.length; y++) {
                System.out.print(arr[y] + " ");
            }

            System.out.println(" Apakah data " + arr[x] + " sudah benar pada urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = arr[x];
            String  note = " Tidak Ada Pertukaran";
            for (int y = x + 1; y < arr.length; y++) {
                if (min > arr[y]) {
                    tukar = true;
                    index = y;
                    min = arr[y];
                }
            }
            if (tukar == true) {
                //swap elements
                note = " Data " + arr[x] + " ditukar dengan Data " + arr[index];
                int temp = arr[x];
                arr[x] = arr[index];
                arr[index] = temp;
            }
            for (int y = 0; y < arr.length; y++) {
                System.out.print(arr[y] + " ");
            }
            System.out.println( note + "\n");
        }

        //tampilkan array setelah disorting
        System.out.println("====================================================");
        System.out.println("Array After Selection Sort");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println("");
    }
}
