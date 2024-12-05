package com.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        //System.out.println("Hello, World!");
        LinkedList mylinkedList = new LinkedList(1);
        
        mylinkedList.append(2);
        mylinkedList.append(3);
        mylinkedList.append(4);
        //mylinkedList.prepand(1);
        //mylinkedList.printList();
        //System.out.println("last value1= "+mylinkedList.removeLast().value);
        //System.out.println("last value2= "+mylinkedList.removeLast().value);
        //System.out.println("removed first node value =" + mylinkedList.removeFirst().value);
        mylinkedList.printList();
        System.out.println("Index value = " + mylinkedList.get(2).value);

        /** 
        mylinkedList.getHead();
        mylinkedList.getTail();
        mylinkedList.getLength();
        **/
    }   
}
