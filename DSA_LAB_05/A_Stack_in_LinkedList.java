/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a_stack_in_linkedlist;

/**
 *
 * @author AaMaN Computer
 */
public class A_Stack_in_LinkedList {

    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    private int size;
    public A_Stack_in_LinkedList() {
        this.top = null;
        this.size = 0;
    }
    // Push Method
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    // Pop Method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow - Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        size--;
        return poppedData;
    }
    // Peek Method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow - Stack is empty");
            return -1;
        }
        return top.data;
    }
    // Check Eempty
    public boolean isEmpty() {
        return top == null;
    }
    public int size() {
        return size;
    }
    // Display Method
    public void display() {
        if (isEmpty()) {
            System.out.println("Underflow - Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        A_Stack_in_LinkedList stack = new A_Stack_in_LinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
       
        System.out.println("Element pop : "+stack.pop());
        stack.display();
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("stack empty " + stack.isEmpty());
    }
}
