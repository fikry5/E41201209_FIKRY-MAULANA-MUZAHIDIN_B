
package TugasMinggu5.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fikry
 */

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        LatihanMinggu5.Tree theTree = new LatihanMinggu5.Tree();
        theTree.insert(80, "Alpukat");
        theTree.insert(76, "Jeruk");
        theTree.insert(90, "Pepaya");
        theTree.insert(47, "Semangka");
        theTree.insert(32, "Kedondong");
        theTree.insert(83, "Nanas");
        theTree.insert(52, "Markisa");
        theTree.insert(25, "Pir");
        theTree.insert(93, "Anggur");
        theTree.insert(89, "Strawberry");
        theTree.insert(94, "Anggur");
        theTree.insert(91, "Leci");
        theTree.insert(78, "Sirsak");
        
        while (true) {
            System.out.print("Enter fisrt letter of show, " +
                    "insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value and data to " + "insert: ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    LatihanMinggu5.Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find" + value);
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Could not delete " + value);
                    }
                    break;
                case 't':
                    System.out.print("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }  
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
