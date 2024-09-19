/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSA_LAB_04;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly_link_list {
    private Node head;
    private Node tail;

    Doubly_link_list() {
        this.head = null;
        this.tail = null;
    }
    public void AddAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            AddAtStart(data);
            return;
        }

        Node current = head;
        int count = 1;
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
        if (newNode.next == null) {
            tail = newNode;  
        }
    }
    public void DeleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
    public void DeleteEnd() {
        if (tail == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head == tail) {
            head = tail = null; 
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public void reverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    public void DeleteValue(int position) {
        if (head == null || position <= 0) {
            System.out.println("Invalid position or List is empty.");
            return;
        }
        Node current = head;
        int count = 1;
        while (current != null && count != position) {
            current = current.next;
            count++;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; 
            }
        }
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
     
        else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }
    public int Searching(int key) {
        Node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == key) {
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1; 
    }
    public void Display() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void DisplayFromEnd() {
        if (tail == null) {
            System.out.println("Doubly Linked List is Empty");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    public int countNodes() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Doubly_link_list list = new Doubly_link_list();
        list.AddAtStart(10);
        list.AddAtStart(20);
        list.AddAtStart(30);
        
        list.insertAtTail(40);
        list.insertAtTail(50);

        list.insertAtPosition(35, 3);
        System.out.print("After inserting 35 at position 3: ");
        list.Display();

        System.out.print("Original list: ");
        list.Display();

        System.out.print("List from end: ");
        list.DisplayFromEnd();

        System.out.print("Reversed list: ");
        list.reverse();


        list.DeleteValue(2); 
        System.out.print("After deleting node at position 2: ");
        list.Display();

        int position = list.Searching(30);
        if (position == -1) {
            System.out.println("Element not found in Linked List");
        } else {
            System.out.println("Element found at position: " + position);
        }
        System.out.println("Total number of nodes: " + list.countNodes());
    }
}
