package BST;

public class InvertBST {
    public static void main(String[] args) {

    }

    public static void invertBinaryTree(BinaryTree tree) {
        // Write your code here.
            if (tree == null ) {
                return;
            }
            swapLeftAndRight(tree);
            invertBinaryTree(tree.left);
            invertBinaryTree(tree.right);
        }
        private static void swapLeftAndRight(BinaryTree tree) {
            BinaryTree left = tree.left;
            tree.left = tree.right;
            tree.right = left;
        }



    class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }

    }

}
