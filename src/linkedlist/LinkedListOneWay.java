package linkedlist;

class Node {

    int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }

    public void append(int data) {
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(data);
    }

    public void retrieve() {
        Node n = this;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void delete(int data) {
        Node n = this;
        while (n.next != null) {
            n = n.next;
            if (n.next.data == data) {
                break;
            }
        }
        n.next = n.next.next;
    }
}

public class LinkedListOneWay {

    public static void main(String[] args) {

        Node head = new Node(10);

        head.append(20);
        head.retrieve();
        head.append(30);
        head.append(40);
        head.delete(40);
        head.append(50);

        head.retrieve();

    }
}
