/**
 * GCD_HCF
 */
public class GCD_HCF {

    static int gcd(int a, int b) {
        if(a==0 || b==0)
            return 0;
        else if(a==b)
            return a;
        else if(a>b)
            return gcd(a-b,b);
        else 
            return gcd(a,b-a);
    }

    static int lcm(int a,int b) {
        return ((a*b)/gcd(a,b));
    }

    static int LcmWOGcd(int a, int b) {
        int large = Math.max(a, b);
        int small = Math.min(a, b);

        for(int i=large;i<=(large*small);i+=large) {
            if(i%small == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(35,50));
        System.out.println(lcm(35,50));
    }
}