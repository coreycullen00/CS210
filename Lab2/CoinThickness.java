import java.util.Scanner;

public class CoinThickness{   
    public static void main (String[] args){
        Scanner myscanner = new Scanner(System.in);
        double radius = myscanner.nextDouble();
        double thickness = myscanner.nextDouble();
        double target = myscanner.nextDouble();
       
        double current = 0;
        int coins=0;
        while(current*radius<target){
            coins++;
            current=current+1.0/coins;
        }
        System.out.println(Math.round(coins*thickness));
    }
}

