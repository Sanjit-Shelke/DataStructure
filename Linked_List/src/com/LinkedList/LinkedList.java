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
    
    /*Node inner class */
    class Node
    {
        public int value;
        public Node next;  //variable "next" is of type Node.Which means it can point to a Node.

        public Node(int value)
        {
            this.value=value;
        }

    }    

    /* Getters Method */
    public void getHead() {
        if(head == null)
        {
            System.out.println("Head = NULL");
        }
        else
        {
            System.out.println("Head = " + head.value);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail = NULL");
        }
        else
        {
            System.out.println("Tail = " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length = " + length);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value)
    {   Node newNode = new Node(value);

        if(head == null)
        {
            head = newNode;
            tail = newNode;   
        }
        else{
            tail.next = newNode;
            tail = newNode;        
        }
        length++;
    }

    public void prepand(int value)
    {
        Node newNode = new Node(value);

        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    
}
