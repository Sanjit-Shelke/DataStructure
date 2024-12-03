package com.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        //System.out.println("Hello, World!");
        LinkedList mylinkedList = new LinkedList(2);
        
        
        mylinkedList.append(3);
        mylinkedList.prepand(1);
        mylinkedList.printList();

        mylinkedList.getHead();
        mylinkedList.getTail();
        mylinkedList.getLength();

        
    }
}
