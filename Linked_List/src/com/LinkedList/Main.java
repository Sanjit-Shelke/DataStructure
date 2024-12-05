package com.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        //System.out.println("Hello, World!");
        LinkedList mylinkedList = new LinkedList(2);
        
        
        mylinkedList.append(3);
        mylinkedList.prepand(1);
        mylinkedList.printList();
        System.out.println("last value1= "+mylinkedList.removeLast().value);
        //System.out.println("last value2= "+mylinkedList.removeLast().value);
        mylinkedList.printList();

        /** 
        mylinkedList.getHead();
        mylinkedList.getTail();
        mylinkedList.getLength();
        **/
    }
}
