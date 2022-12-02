package BST;

public class InitializeArray {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,5};
        CreatingBST.BinaryTree tree = new CreatingBST.BinaryTree();
        CreatingBST.Node root = tree.buildTree(nodes);
    }
    static class BinaryTree{
        static int idx=-1;
        public static CreatingBST.Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            CreatingBST.Node newNode = new CreatingBST.Node(nodes[idx]);
            newNode.left = buildTree((nodes));
            newNode.right = buildTree((nodes));
            return newNode;
        }
    }
}
