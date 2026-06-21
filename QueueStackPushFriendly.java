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

public class QueueStackPushFriendly {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int data) {
        q1.add(data);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int popped = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }

    public static void main(String[] args) {
        QueueStackPushFriendly s = new QueueStackPushFriendly();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
    }
}