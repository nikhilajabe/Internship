import java.util.*;
class BTNode
{
    int data;BTNode left, right;
    public BTNode(int j)
    {
        data= j;right = null;left = null;
    }
}
class LeftViewExample1
{
    BTNode root = null;
    public void displayLeftView()
    {
        if (root == null)
        {
            return;
        }
        Queue<BTNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int siz = queue.size();
            for (int j = 1; j <= siz; j++)
            {
                BTNode temp = queue.poll();

                if (j == 1)
                {
                    System.out.print(temp.data + " ");
                }
                if (temp.left != null)
                {
                    queue.add(temp.left);
                }
                if (temp.right != null)
                {
                    queue.add(temp.right);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        LeftViewExample1 lv = new LeftViewExample1();
        lv.root= new BTNode(20);
        lv.root.left = new BTNode(22);
        lv.root.right = new BTNode(8);
        lv.root.left.left = new BTNode(25);
        lv.root.left.right = new BTNode(3);
        lv.root.right.right = new BTNode(5);
        lv.root.left.right.right = new BTNode(10);
        lv.root.left.right.left = new BTNode(14);
        lv.root.left.right.left.right = new BTNode(7);
        System.out.println("The following are the nodes present in the left view of the Binary Tree: ");
        lv.displayLeftView();
    }
}

//Output:
//The following are the nodes present in the left view of the Binary Tree: 
//20 22 25 14 7 
