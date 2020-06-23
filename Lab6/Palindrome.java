import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        	Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		Stack stack = new Stack(input.length());
		String original = "";
		String reverse = "";
		for(int i = 0; i<input.length();i++)
		{
			if(input.charAt(i) != ' ')
			{
				stack.push(input.charAt(i));
				original = original + input.charAt(i);
			}
		}
		for(int i = 0; i<original.length();i++)
		{
			reverse = reverse+stack.pop();
		}
		if(original.equals(reverse))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
    }
} 

