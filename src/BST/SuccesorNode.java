package BST;

import java.util.ArrayList;

public class SuccesorNode {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,5};

    }

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public static BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        ArrayList<BinaryTree> list = new ArrayList<>();
        inorder(tree,list);
        for (int i = 0; i < list.size(); i++) {
           BinaryTree currnode = list.get(i);
           if(currnode!=null){
               continue;
           }

            if(i== list.size()-1){
                return null;
            }
            return list.get(i+1);

        }
        return null;
    }

    public static void inorder(BinaryTree tree, ArrayList<BinaryTree> list){
        if(tree==null){
            return;
        }
        inorder(tree.left,list);
        list.add(tree);
        inorder(tree.right,list);

    }
}
