class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}


class BinaryTree {
    Node root;
    boolean isBST() {
        return isBSTorNot(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean isBSTorNot(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min && node.data > max) {
            return false;
        }
        return isBSTorNot(node.left, min, node.data - 1) &&
                isBSTorNot(node.right, node.data + 1, min);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(10);
        bt.root.left = new Node(5);
        bt.root.right = new Node(15);
        bt.root.left.left = new Node(3);
        bt.root.left.right = new Node(8);
      
        if (bt.isBST())
            System.out.println("is BST");
        else
            System.out.println("Not a BST");
    }
}

//Output: is BST
