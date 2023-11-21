class BinaryTree {
    Node root;
    BinaryTree() {
        this.root = null;
    }
    static class Node {
        Node left;
        Node right;
        int data;
        Node(int data) {
            this.data = data;
            this.right = right;
            this.left = left;
        }
    }

    int findHeight(Node temp) {
        if (root == null) {
            return 0;
        }
        int leftHeight = 0;
        int rightHeight = 0;
        if (temp.left != null) {
            leftHeight = findHeight(temp.left);
        }
        if (temp.right != null) {
            rightHeight = findHeight(temp.right);
        }
        int max = Math.max(leftHeight, rightHeight);
        return max + 1;
    }


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(19);
        bt.root.right = new Node(13);
        bt.root.right.left = new Node(18);
        bt.root.right.right = new Node(12);
        bt.root.left = new Node(23);
        bt.root.left.right = new Node(21);
        bt.root.left.left = new Node(17);
        bt.root.left.left.right = new Node(5);
        bt.root.left.left.left = new Node(10);
        bt.root.left.left.left.right = new Node(12);
        bt.root.left.left.left.right.left = new Node(12);
        System.out.println("Height of Binary tree is : " + bt.findHeight(bt.root));
    }
}

//Output is:
//Height of Binary tree is : 6
