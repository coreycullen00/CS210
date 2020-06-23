import java.util.*;

public class Spaghetti{
    public static void main (String[] args){        
        int count=0;

        for(int i=0;i<100000000;i++){    
        double nibble=43;
        double one = Math.random();
        double two = Math.random();
        
        double first = Math.min(one,two);
        double second = Math.max(one,two) - first;
        double third = 1 - second - first;
        
        double max = Math.max(Math.max(first, second), Math.max(second, third));
        double remainder = 1 - max;
        max = (max*(100.0-nibble))/100;
        if(max<remainder){
            count++;
        }
    }
    System.out.println(count);
    }
} 