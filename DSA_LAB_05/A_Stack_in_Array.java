/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a_stack_in_array;

/**
 *
 * @author AaMaN Computer
 */
public class A_Stack_in_Array {
    int size;
    int top;
    int[] array;

    public A_Stack_in_Array(int size) {
        this.size = size;
        array = new int[this.size];
        top = -1;
    }
    // push Method
    public void push(int data) {
        if (top >= size - 1) {
            System.out.println("Stack is full");
            return;
        }
        array[++top] = data;
    }
       // POP Method
    public int pop() {
        if (top < 0) {
            System.out.println("Underflow - Stack is empty");
            return -1;
        }
        return array[top--];
    }
    //  Peek Method
    public int peek() {
        if (top < 0) {
            System.out.println("Underflow - Stack is empty");
            return -1;
        }
        return array[top];
    }
    // Check Empty
    public boolean isEmpty() {
        return top == -1;
    }
       public int size() {
        return top + 1;
    }
       // Dislpay Method
      public void display() {
        if (top < 0) {
         System.out.println("Underflow - Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--){
        System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        A_Stack_in_Array stack = new A_Stack_in_Array(5);
       
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Element pop: "+stack.pop());
        stack.display();
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("stack empty " + stack.isEmpty());
    }
}
