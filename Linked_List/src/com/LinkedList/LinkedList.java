package com.LinkedList;

public class LinkedList 
{
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        this.length = 1; 
    }
    
    
    class Node
    {
        public int value;
        public Node next;  //variable "next" is of type Node.Which means it can point to a Node.

        public Node(int value)
        {
            this.value=value;
        }

    }    


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
}
