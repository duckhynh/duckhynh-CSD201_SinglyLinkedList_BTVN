package mylinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
//0
  public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        }else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    //BTVN: viet code cho cac ham sau
    //1. public int lenght()
    //2. public void display()
    //3. public void deleteFirst()

    public int lenght(){
        if (head ==null)
            return 0;
        Node temp = head;
         int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
    }
    return count;
 }
    public void display(){
        if (head == null)
            return ;
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("\n");
    }

    public void deleteFirst(){
       if (head == null)
            return;
       head = head.next;
    }

    
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("addFirst");
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.display();
        // 3->2->1

        System.out.println("addLast");
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.display();
        System.out.println("Lenght : ");
        System.out.println(linkedList.lenght());
        // 1->2->3

      
    }
}