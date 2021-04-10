
package TugasMinggu5.tree;

import java.util.Stack;

/**
 * @author fikry
 */

public class Tree {
    private LatihanMinggu5.Node root;
    
    public Tree() {
    root = null;
    }
    
    public LatihanMinggu5.Node find(int key) { LatihanMinggu5.Node current = root;
        while (current.id != key) {
            if (key < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
    public void insert(int id, String data) {
        LatihanMinggu5.Node newNode = new LatihanMinggu5.Node();
        newNode.id = id;
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            LatihanMinggu5.Node current = root; LatihanMinggu5.Node parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode; return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                }
            }
        }
    }
}
    public boolean delete(int key) {
        LatihanMinggu5.Node current = root;
        LatihanMinggu5.Node parent = root;
        boolean isLeftChild = true;
        
        while (current.id != key) {
            parent = current;
            if (key < current.id) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
                        
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            LatihanMinggu5.Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }
        return true;
    }
    private LatihanMinggu5.Node getSuccessor(LatihanMinggu5.Node delNode) {
        LatihanMinggu5.Node successorParent = delNode;
        LatihanMinggu5.Node successor = delNode;
        LatihanMinggu5.Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }
    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.print("Preorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("Inorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("Postorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }
    private void preOrder(LatihanMinggu5.Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.id + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
    private void inOrder(LatihanMinggu5.Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.id + " ");
            inOrder(localRoot.rightChild);
        }
    }
    private void postOrder(LatihanMinggu5.Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.id + " ");
        }
    }
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false; System.out.println(
        "....................................................");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++) {
                System.out.print(' ');
            }
            while (globalStack.isEmpty() == false) {
                LatihanMinggu5.Node temp = (LatihanMinggu5.Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.id);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--"); localStack.push(null); localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(
                "....................................................");       
    }
}
