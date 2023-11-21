public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    void sortedInsertion(Node new_node)
    {
        Node current;
        if (head == null || head.data
                >= new_node.data) {
            new_node.next = head;
            head = new_node;
        }
        else {
            current = head;
            while (current.next != null
                    && current.next.data < new_node.data)
                current = current.next;
            new_node.next = current.next;
            current.next = new_node;
        }
    }

    Node newNode(int data)
    {
        return new Node(data);
    }

    void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        Node newNode;
        newNode = list.newNode(753);
        list.sortedInsertion(newNode);
        newNode = list.newNode(469);
        list.sortedInsertion(newNode);
        newNode = list.newNode(271);
        list.sortedInsertion(newNode);
        newNode = list.newNode(871);
        list.sortedInsertion(newNode);
        newNode = list.newNode(686);
        list.sortedInsertion(newNode);
        newNode = list.newNode(475);
        list.sortedInsertion(newNode);
        System.out.println("Created LinkedList is");
        list.print();
    }
}  

//Output:
//Created LinkedList is
//271 469 475 686 753 871
