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
//  https://www.w3schools.com/dsa/dsa_data_hashmaps.php.

public class Main {
    public static void main(String[] args) {

    }
}