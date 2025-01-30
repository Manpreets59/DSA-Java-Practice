// find the ith bit of a number
// we just and the ith bit with 1, and it gives solution in which all number become 0 except the ith bit
// and we use mask to do so  for example
// if number = n , then i need to create mask with n-1 zeros
// this can be done using left  for example shift 1<<4 => 1000
// n&(1<<(n-1))
// q similar question can be set the ith bit for example if ith bit is zero then turn it 0 and if it 1 then turn it zero
// and for this we can or the ith bit with 1 and similarly create mask for that
// q other question are like reset ith bit
// we can do this by doing and with 0 of ith bit mask : (1<<(n-1))
// q find the position of rightmost set bit
// Range formulae for binary numbers for n bits is -2^n-1 to 2^n-1  -1
// q find the number appearing once in an array having three duplicate of each element
// we will simpley add the digit as the digit appear three times then its set digit also appear three time
// so when when we takes its modulo with 3 it gives the solution of unique number as the number appear three times will become zero
// q find the ith magic number
// 1 = 001 => 5^1 = 5
// 2 = 010 => 5^2 = 25
// 3 = 011 => 5^1 + 5^2 = 30
// 4 = 100 => 5^3 = 125
// and so on and find the nth magic number
// n&1 = it give me last digit in binary , n>>1.


public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans += last * base;
            base = base*5;
        }
        System.out.println(ans);
    }
}



