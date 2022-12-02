package BST;

import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CreatingBST {

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,5};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Preorder");
        preOrder(root);
        System.out.println("inorder");
        inOrder(root);
        System.out.println("Postorder");
        postOrder(root);
        System.out.println("levelOrder");
        levelOrder(root);
        System.out.println("count of nOdes ");
        System.out.println(countOfNode(root));
        System.out.println("sum of nOdes ");
        System.out.println(sumOfNode(root));
        System.out.println("height");
        System.out.println(height(root));
        System.out.println("diameter");
        System.out.println(diameter(root));
        System.out.println('d');
        System.out.println(dia(root).diam);
    }
            static class Node{
                int data;
                Node left;
                Node right;

                Node(int data){
                    this.data=data;
                    this.left=left;
                    this.right=right;
                }
                }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
                    idx++;
                    if(nodes[idx]==-1){
                        return null;
                    }
                    Node newNode = new Node(nodes[idx]);
                    newNode.left = buildTree((nodes));
                    newNode.right = buildTree((nodes));
            return newNode;
        }
            }

//pre order traversal
//  root left subtree right subtree

    public static void preOrder(Node root){
      if(root == null){
          return;
      }System.out.println(root.data);
    preOrder(root.left);
    preOrder(root.right);

    }

    //inorder
    // left root right
    public static void inOrder(Node root){
        if(root ==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    //post order
    // left right root
    public static void postOrder(Node root){
        if(root ==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }

    //level order traversal
    // using queues FIFO
    //also using BFS
    //after every lever we remove from the queus
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode =q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else {
                System.out.println(currNode.data);
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }

        }
        return;

    }


    //count of nodes
    public static int countOfNode(Node root){
    if(root==null){
        return 0;
    }
    int leftNodes = countOfNode(root.left);
    int rightNodes = countOfNode(root.right);
        return leftNodes+rightNodes+1;
    }

    //sum of nodes
    public static int sumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = sumOfNode(root.left);
        int rightNodes = sumOfNode(root.right);
        return leftNodes+rightNodes+root.data;
    }

    // height of tree
    public static int height(Node root){
       if(root==null){
           return 0;
       }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int h = Math.max(leftHeight,rightHeight)+1;
        return h;
    }

    //diameter of a Tree
    //Number of Nodes in the longest path between any 2 Nodes
    // case 1 where diameter pass through any 2 nodes
    // case 2 where diameter does not pas through root node
// approach 1 o(n^2)
public static int diameter(Node root){
      if(root==null){
          return 0;
      }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
}

// approach 2 // o(n)

 static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }

 }


 public static TreeInfo dia(Node root){

        if(root==null){
            new TreeInfo(0,0);
        }
        TreeInfo left = dia(root.left);
        TreeInfo right = dia(root.right);
        int heightmy = Math.max(left.ht, right.ht)+1;
        int diam1 = left.diam;
        int diam2= right.diam;
        int diam3 = left.ht+right.ht+1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);
TreeInfo my = new TreeInfo(heightmy,mydiam);
return my;

 }


}
