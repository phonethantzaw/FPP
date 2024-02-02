package Lesson10;

public class MainBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(6);
        bst.insert(3);
        bst.insert(1);
        bst.insert(4);
        bst.insert(9);
        bst.insert(6);
        bst.insert(10);


//        bst.inOrderTraverse(bst.root);

        bst.deleteNode(bst.root, 9);
    }
}
