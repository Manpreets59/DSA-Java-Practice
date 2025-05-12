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
// Heapdown method complexity O(logn)
// max heap property is Every node has a value >= All of its children
// leaf node = n/2
// one level above leafnode = n/4
// one level above level 3 = n/8
// root = 1 = log n
// total time complexity n/4* c + n/8*2c + n/16*3c + .....+ 1c*logn
// n/4 = 2^k
// c2^k(1/2^0 + 1/2^1 + ... k+1/2^k ) bound by a constant
// sum of i to infinity  = x/(1-x)^2 = o(n) .


public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(54);
        heap.insert(21);
        System.out.println(heap.remove());
    }
}