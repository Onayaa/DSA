/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author FMT
 */
public class QueueStackPopFriendly {
    
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int data) {

        q2.add(data);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.remove();
    }

    public static void main(String[] args) {

        QueueStackPopFriendly s = new QueueStackPopFriendly();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
    }
}


