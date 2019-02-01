/**
 * PrintAllSubsets
 */
public class PrintAllSubsets {

    public static void main(String[] args) {
        int a[] = {2, 4, 5};
        printSubsets(a);
    }

    public static void printSubsets(int a[]) {
        int N = a.length;

        for(int i=1;i<(1<<N);i++) {
            int temp = i;
            while(temp !=0) {

                // this will simply give me the lsb set position
                int pos = (temp & (-temp));

                // pos will be in terms of power of 2
                pos = (int)(Math.log(pos)/Math.log(2));

                // reducing one bit of number bits from left side
                temp = temp & (temp-1);
                System.out.print(a[pos] + ", ");
            }
            System.out.println();
        }
    }
}