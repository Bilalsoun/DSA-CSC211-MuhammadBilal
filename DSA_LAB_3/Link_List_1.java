package DSA_LAB_3;

public class Link_List_1 {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;

    Link_List_1() {
        this.head = null;
    }    
    public void addAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " inserted at head successfully");
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            head = newNode;
            System.out.println(data + " inserted at head successfully as the list was empty");
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        System.out.println(data + " inserted at tail successfully");
    }

    public void addAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            System.out.println(data + " inserted at position " + position);
            return;
        }

        Node tempNode = head;
        for (int i = 1; i < position - 1 && tempNode != null; i++) {
            tempNode = tempNode.next;
        }

        if (tempNode == null) {
            System.out.println("Position is greater than the length of the list");
        } else {
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            System.out.println(data + " inserted at position " + position);
        }
    }

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("The list is empty, can't delete");
            return;
        }
        System.out.println(head.data + " deleted from head successfully");
        head = head.next;
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("The list is empty, can't delete");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data + " deleted from the list");
            head = null;
            return;
        }
        Node tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.next.data + " deleted from tail successfully");
        tempNode.next = null;
    }

    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("The list is empty, can't delete");
            return;
        }
        if (head.data == data) {
            System.out.println(data + " deleted from head");
            head = head.next;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null && tempNode.next.data != data) {
            tempNode = tempNode.next;
        }
        if (tempNode.next == null) {
            System.out.println(data + " not found in the list");
        } else {
            System.out.println(data + " deleted successfully");
            tempNode.next = tempNode.next.next;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node tempNode = head;
        System.out.println("\nCurrent List:");
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }


    public void search(int value) {
        Node tempNode = head;
        int position = 0;
        while (tempNode != null) {
            if (tempNode.data == value) {
          System.out.println(value + " found at position " + position);
             return;
            }
      tempNode = tempNode.next;
       position++;
       }
      System.out.println(value + " not found");
    }
    public void reverse() {
        if (head == null) {
          System.out.println("The list is empty, can't reverse");
          return;
        }
        Node prev = null, current = head, next;
        while (current != null) {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        }
      head = prev;
      System.out.println("The list has been reversed");
    }
    public int countNodes() {
        Node tempNode = head;
        int count = 0;
        while (tempNode != null) {
         count++;
         tempNode = tempNode.next;
      }
      return count;
    }
    public static void main(String[] args) {
        Link_List_1 list = new Link_List_1();

        list.addAtStart(10);
        list.addAtStart(20);
        list.addAtEnd(30);
        list.addAtPosition(25, 2);
        list.display();
        list.deleteFromStart();
        list.deleteFromEnd();
        list.deleteByValue(25);
        list.display();
        list.search(30);
        list.search(100);
        System.out.println("Total Nodes: " + list.countNodes());
        list.reverse();
        list.display();
    }
}
