public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // insertion using recursion
    public void insertRec(int val , int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public int deleteLast(){
        if(size<= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i<index;i++){
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // question to find the duplicate in linked list
    public void duplicates(){
        Node node = head;
        while(node.next != null){
            if( node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // question to merge the two sorted list
    public static LL merge (LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f= f.next;
            }else{
                ans.insertLast(s.value);
                s = f.next;
            }
        }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    // Calculate the length of cyclic linkedlist
//    public int lengthCycle(ListNode headd){
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while(fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                // Calculate the lenght
//                ListNode temp = slow;
//                int lenght = 0;
//                do{
//                    temp = temp.next;
//                    lenght++;
//                }while(temp != slow){
//                    return lenght;
//                }
//                return lenght;
//            }
//
//        }
//    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }

        public Node (int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        first.display();
        second.display();

        LL ans = LL.merge(first, second);
        ans.display();
    }
}
