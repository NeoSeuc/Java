package core;

public class Node {
    private Node next = null;
    private int data;

    Node(int data) {
        this.data = data;
    }

    Node insertInTail(Node head) {
        this.next = head;
        return head;
    }

    boolean hasNext() {
        return next != null;
    }

    int get() {
        return data;
    }

    Node getNext() {
        return next;
    }
}

class NodeApp {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = node1.insertInTail(new Node(2));
        node2.insertInTail(new Node(3));

        Node node = node1;
        while (node!=null) {
            System.out.println(node.get());
            node = node.getNext();
        }
    }
}
