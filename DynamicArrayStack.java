/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FMT
 */
public class DynamicArrayStack {
    
    private int[] stack;
    private int top;

    public DynamicArrayStack() {
        stack = new int[2];
        top = -1;
    }

    public void push(int data) {

        if (top == stack.length - 1) {
            resize(stack.length * 2);
        }

        stack[++top] = data;
    }

    public int pop() {

        if (top == -1) {
            System.out.println("Stack Empty");
            return -1;
        }

        int value = stack[top--];

        if (top > 0 && top < stack.length / 4) {
            resize(stack.length / 2);
        }

        return value;
    }

    private void resize(int newSize) {

        int[] newArray = new int[newSize];

        for (int i = 0; i <= top; i++) {
            newArray[i] = stack[i];
        }

        stack = newArray;
    }

    public static void main(String[] args) {

        DynamicArrayStack s = new DynamicArrayStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.pop());
    }
}

