// .


public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(31);

        list.insertLast(99);

        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst() + " Is deleted ");
        list.display();
        System.out.println(list.deleteLast() + " Is deleted");
        list.display();

        System.out.println(list.delete(3) + " is deleted element at index 3");
        list.display();
    }
}