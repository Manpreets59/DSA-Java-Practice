// calculate a^b
// 3^6 = 3^(2+4) = 3^2 * 3^4 = 3^(110)
// .

public class power {
    public static void main(String[] args) {
        int base =3;
        int power = 6;

        int ans =1;

        while(power>0){
            if((power & 1)  == 1){
                ans *= base;
            }

            base  *= base;
            power = power>>1;
        }
        System.out.println(ans);
    }
}

