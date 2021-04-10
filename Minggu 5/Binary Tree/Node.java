
package TugasMinggu5.tree;

/**
 * @author fikry
 */

public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;
    
    public void displayNode() {
        System.out.print("{ " + id + ", " + data + " }");
    }
}
