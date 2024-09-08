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
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
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
    public int length(){
        int count = 0;
        if(head != null){
            Node temp = head;
            while(temp != null){
                count ++;
                temp = temp.next;
            }
        }
        return count;
    }
    
    public void display(){
        if(head != null){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.getData() + " --> ");
                temp = temp.next;
            }
        }
        System.out.println("null");
    }
    
    public void deleteFirst(){
        if(head == null) 
            return;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null)
            return;
        if(head.next == null){
            deleteFirst();
        }
        Node temp = head; 
        Node previous = null; 
        while(temp.next != null){ 
            previous = temp; 
            temp = temp.next; 
        }
        previous.next = null; 
    }
    //public void delete(int index){
    //    if(index == 0){
    //        deleteFirst();
    //        return;
    //    } else if(index == length()-1){
    //        deleteLast();
    //        return; 
    //    } else{
    //        Node preNodeDelete = head; 
    //        for (int i = 1; i < index; i++) {
    //            preNodeDelete = preNodeDelete.next;
    //        }
    //        preNodeDelete.next = preNodeDelete.next.next;
    //        // BTVN1: Viết hàm delete theo while. Hint: dùng count++;
    //    }
    //}
        public void delete(int index){
            if(index<0) return;
            if(index == 0){
                deleteFirst();
                return;
            }
            else{
                Node preNodeDelete = head;
                int count = 0;
                while(preNodeDelete.next != null){
                    if(index -1 == count)
                    break;
                    preNodeDelete = preNodeDelete.next;
                    count++;
                }
                if(preNodeDelete.next == null){
                    return;
                }

            }

        }
    public boolean search(int data){
        if(head == null)
            return false;
        Node temp = head;
        while(temp != null){
            if(temp.getData() == data)
                return true;
        }
        return false;
    }

    public Node searchAtPosition(int index){
        if(index < 0 || index >= length())
            return null;
        Node temp = head;
        for (int i = 0; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

// BTVN2: Viết cho anh hàm sort()
    public void sort(){
        if(head != null) return;
        if(head == null) return;
        for(Node i = head; i.next!=null; i=i.next){
            for(Node j = i.next; j!= null; j=j.next){
                if(i.data>j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }        
    }
// BTVN3: 
    public static void main(String[] args) {
       MyLinkedList linkedList = new MyLinkedList();
       linkedList.addFirst(1);
       linkedList.addFirst(2);
       linkedList.addFirst(3);
        //
       linkedList.addLast(1);
       linkedList.addLast(2);
       linkedList.addLast(3);
        //3 - 2 - 1 - 1->2->3
       // linkedList.delete(4);
       // linkedList.display();
        
    }

}