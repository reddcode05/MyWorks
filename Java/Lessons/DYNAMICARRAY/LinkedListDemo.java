package mainpackages;

class Node {

    String titleSong;
    Node next;

    Node(String titleSong) {
        this.titleSong = titleSong;
        this.next = null;
    }

    public static void show(Node head) {
        System.out.println("Show playlist:");
        System.out.print("> ");
        Node current = head;
        while (current != null) {
            System.out.print(current.titleSong + " -> ");
            current = current.next;
        }
        System.out.print("Null");
        System.out.println("");
    }

    public static Node insertSong(Node head, Node newNode) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.next = newNode;
    }

    public static void deleteSong(Node head, String titleSong) {
        Node current = head;
        while (current != null) {
            if (current.titleSong.equalsIgnoreCase(titleSong)) {
                System.out.println(current.titleSong + " is Found and Delete.");
                head.next = current.next;
                return;
            }
            current = current.next;
        }
        System.out.println("NOT Found in the list.");
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {
        Node head = new Node("Song A");
        head.next = new Node("Song B");
        head.next.next = new Node("Song C");
        Node.show(head);
        Node.insertSong(head, new Node("Song D"));
        Node.show(head);
        String search = "Song B";
        Node.deleteSong(head, search);
        Node.show(head);
    }
}
