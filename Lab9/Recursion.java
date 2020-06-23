//EUCLIDS ALGORITHM  
public static long euclidMethod(long x, long y){
        //base case
        if(y==0){
                return x;
        } else {
                return euclidMethod(y, x%y);
             }
        }

//COMPOUND INTEREST
public static double interest(double balance, double interestRate, int years){
        if(years==0){
            return balance;
        } else {
            double newBalance = balance + (balance*interestRate);
            years--;
            return interest(newBalance, interestRate, years);
        }
    }

//UNIQUE CHARACTER
import java.util.*;
public class unique{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toLowerCase();
		int count = UniqueString(input);
		System.out.println(count);
	}
	public static int UniqueString(String input){
		if(input.length()==1)
		{
			return 1;
		}
		else
		{
			char first = input.charAt(0);
			if (UniqueChar(input.substring(1),first) == true)
			{
				return 1 + UniqueString(input.substring(1));
			}
			else
			{
				return 0 + UniqueString(input.substring(1));
			}
		}
	}
	public static boolean UniqueChar(String input, char first){
		if(input.charAt(0) == first)
		{
			return false;
		}
		else if(input.length() ==1)
		{
			return true;
		}
		else
		{
			return UniqueChar(input.substring(1),first);
		}	
	}
}

//LONG DIVISION
public static int decimal(int numerator, int divisor, int n){
        if (numerator%divisor==0) return 0;
        if (n==0)return numerator/divisor;
        return decimal((numerator%divisor)*10, divisor,n-1);
   } 

//COUNTING 8'S
 public static int count8s(long input){
        if(input<1){
            return 0;
        }
        if(input%100==88){
            return 2 + count8s(input/10);
        }
        if(input%10==8){
            return 1 + count8s(input/10);
        }
        return count8s(input/10);
    }