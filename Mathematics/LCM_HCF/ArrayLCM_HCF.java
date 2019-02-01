/**
 * ArrayLCM
 */
public class ArrayLCM_HCF {

    static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

    static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    static int ArrayLCM(int array[]) {

        int lcmVal = array[0];

        for(int i=1;i<array.length;i++) {
            lcmVal = lcm(lcmVal,array[i]);
        }
        return lcmVal;
    }


    static int ArrayGCD(int array[]) { 
        int result = array[0];
        for (int i = 1; i < array.length; i++) 
            result = gcd(array[i], result); 
    
        return result; 
    } 

    public static void main(String[] args) {
        
        System.out.println(ArrayLCM(new int[] {2, 7, 3, 9, 4}));
        System.out.println(ArrayGCD(new int[] {2, 4, 6, 8, 16}));
        
    }
}