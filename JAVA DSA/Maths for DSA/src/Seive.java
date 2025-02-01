// sieve of Eratosthenes
// used to determine numbers

public class Seive {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    // false in array mean number is prime
    static void sieve(int n, boolean[] primes){
        for(int i =2; i*i<=n;i++){
            if(!primes[i]){
                for(int j = i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println(i+" ");
            }
        }
    }
}

// time complexity:
// n/2+ n/3 + n/5 + n/7 + ...
// n(1/2 + 1/3 + 1/5 + 1/7...)
// harmonic progression for primes
// log(log n) using taylor sees ||
// total time complexity O(n * log(log n)).