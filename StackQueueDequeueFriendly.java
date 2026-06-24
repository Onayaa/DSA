/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    import java.util.Stack;

/**
 *
 * @author FMT
 */
public class StackQueueDequeueFriendly {
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enqueue(int data) {

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        s1.push(data);

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }

    public int dequeue() {

        if (s2.isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return s2.pop();
    }

    public static void main(String[] args) {

        StackQueueDequeueFriendly q =
                new StackQueueDequeueFriendly();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
    }
}

