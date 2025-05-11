// Heap data structure , priority Queue , Heapsort
// 1) It is complete binary tree
// 2) Every node has a value >= All of its children
// Rules for Heap sort .
// root = i = 1
// parent(i) = i/2
// left(i) = 2*i
// right(i) = 2*i + 1
// height = log(n)
// Upheap method complexity  O(logn)
// Heapdown method complexity O(logn).
public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(54);
        heap.insert(21);
        System.out.println(heap.remove());
    }
}