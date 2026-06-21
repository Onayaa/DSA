/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Stack;

/**
 *
 * @author FMT
 */
public class StackQueueEnqueueFriendly {
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data) {
        s1.push(data);
    }

    public int dequeue() {

        if (s2.isEmpty()) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public static void main(String[] args) {

        StackQueueEnqueueFriendly q =
                new StackQueueEnqueueFriendly();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
    }
}

