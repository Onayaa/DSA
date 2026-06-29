/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FMT
 */
public class CircularDoublyLinkedList {
    
    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void display() {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to Head)");
    }

    public static void main(String[] args) {

        CircularDoublyLinkedList list =
                new CircularDoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}

