import java.util.Scanner;

public class PrimesInRange {
    public static void main(String args[] ) throws Exception {
        Scanner myscanner = new Scanner(System.in);
        int one = myscanner.nextInt();
        int two = myscanner.nextInt();
        
        int lower = Math.min(one,two);
        int upper = Math.max(one,two);
        int count=0;
        for(int i=Math.max(lower,2);i<=upper;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime=false;
                }
            }
            if(isprime){
                count++;
            }
        }
        System.out.println(count);
    }
}