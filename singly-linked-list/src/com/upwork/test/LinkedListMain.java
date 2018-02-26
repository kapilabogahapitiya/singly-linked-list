package com.upwork.test;

public class LinkedListMain {

    public static void main(String args[])
    {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(2);
        myLinkedlist.insertLast(9);



        myLinkedlist.deleteFirst();

        myLinkedlist.printLinkedList();

        myLinkedlist.deleteAllGreater(6);

        myLinkedlist.printLinkedList();
    }


}