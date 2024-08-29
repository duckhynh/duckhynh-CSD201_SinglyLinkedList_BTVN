package mylinkedlist;

import java.lang.classfile.components.ClassPrinter;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }
// 0
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()
    public void display(Node head) {
        if(head == null){
            System.out.println("danh sach trong!");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
                if(temp != null)
                System.out.print("->");
            }else{
                System.out.println();
            }
        } 
    }

    public static Node deleteFirst(Node heaNode){
        if(heaNode != Null){
            return headNode.next;
        }
        return headNode;
    }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        // 3->2->1
        linkedList.display(); 

        linkedList.addLast(4);
        linkedList.addLast(5);
        // 3->2->1->4->5
        linkedList.display(); 

        linkedList.deleteFirst();
      
        linkedList.display(); 
    }
