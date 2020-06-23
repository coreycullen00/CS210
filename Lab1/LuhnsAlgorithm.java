import java.util.*;

public class LuhnsAlgorithm {
    public static void main(String args[] ) throws Exception {
        Scanner myscanner = new Scanner(System.in);
        String input = myscanner.nextLine();
        int total = 0;
        for(int i=input.length()-1;i>=0;i--){
            int digit=Integer.parseInt(""+input.charAt(i));
            if((input.length()-1-i)%2==1){
                digit=digit*2;
                if(digit>9){
                    digit=digit-9;
                }
            }
            total=total+digit;
        }
        if(total%10==0){
            System.out.println("VALID");
        }else{
            System.out.println("INVALID");
        }
    }
}