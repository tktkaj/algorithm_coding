package linkedlist;

class LinkedListImprove {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    LinkedListImprove() {
        header = new Node();
    }

    public void append(int data) {
        Node end = new Node();
        end.data = data;
        Node n = header;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public void delete(int data) {
        Node n = header;
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    public void retrieve() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }
}

public class LinkedListNode {
    public static void main(String[] args) {

        LinkedListImprove ll = new LinkedListImprove();

        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);

        ll.retrieve();

        ll.delete(10);
        ll.delete(20);

        ll.retrieve();

    }
}


