package com.upwork.test;

public class SinglyLinkedList {
    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    // used to insert a node at the start of linked list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    // used to delete node from start of linked list
    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    // For printing Linked List
    public void printLinkedList() {
        System.out.println("Printing LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

    // delete all greater than given value
    public void deleteAllGreater(int value) {

        Node current = head;
        Node previousNode = null;
        while (current != null) {

            if(current.data>value){

                if(previousNode==null){
                    head = current.next;
                    current = current.next;
                    continue;
                }else{
                    previousNode.next=current.next;
                    current = current.next;
                    continue;
                }
            }else{
                previousNode=current;
                current = current.next;
            }

        }

    }
}