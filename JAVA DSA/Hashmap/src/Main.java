// HashMap: We can access data in constant amount of time
// Key value pair we are not traversing we just get data in O(1) time complexity
// it is used in network router where we have to access data in constant time and also used in cryptography
// we have hash table in form of an array and also a hashcode that is used to determine key and access data in O(1) complexity (amortized constant time complexity )
// https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/
// 1) we need all element as positive number for hashcode function
// 2) Hashcode can be very large so reduce it are also called hashing and these two are problems of hashmap
//  when two key point to same index then it is called colling and is resolve using different method 1) Chaining 2) open addressing
//  In chaining we add element to index they point and use linkedlist so that all element point to same index will add at the same index
//  simple uniform hashing n = no of keys in table
//  m = size of table
//  local factor = alpha = n/m = expected keys per slot
//  O(1+ alpha), alpha = O(1) this happen when time of table is bigomega of (n)
//  hash function used to achieve this thing are 1) division method h(k) = k% m  m is size of array
//  2) multiplication method = h(k) = [(a.k) % 2^m] >> (w-r)  a = random numbeer, w = no of bit in k , m = 2^r  this is practical when a is odd number && 2^w-1 <a < 2^w a is not close to 2^w-1 or 2^w
//  universal hashing : h(k) = [(ak + b) % p] %m
//  a & b are random numbers and belongs to [0 to p-1]
//  https://www.w3schools.com/dsa/dsa_data_hashmaps.php
//  when you double the table , the cost to insert n items is O(n) average
//  and for 1 item the cost to insert is O(1) amortized constant time

//  open addressing one item per slot prob
//  probing strategies
//  linear probing, double hashing,


//  When to use which ?
//  open addressing : better cache performance (pointers are not needed)
//  chaining : less sensitive to hash function .

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("kunal", 89);
        map.put("manpreet", 99);
        map.put("kamal", 91);
        System.out.println(map.get("kamal"));
        System.out.println(map.getOrDefault("kalam",81));
        System.out.println(map.containsKey("kamal"));

        HashSet<Integer> set = new HashSet<>();
        set.add(59);
        set.add(61);
        set.add(91);
        set.add(2);
        set.add(96);
        set.add(59);
        System.out.println(set);

        TreeMap<String, Integer> tree = new TreeMap<>();    //internally it is different but the way we are using it is same
        map.put("kunal", 89);
        map.put("manpreet", 99);
        map.put("kamal", 91);
        System.out.println(map.get("kamal"));
        System.out.println(map.getOrDefault("kalam",81));
        System.out.println(map.containsKey("kamal"));
    }
}
// hashmap is not safe because it can't be used between multiple threads without proper synchronous tool
// and whereas hashtable is safe because it is synchronized as it can be used between multiple threads
