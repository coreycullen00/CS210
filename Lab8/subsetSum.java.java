import java.util.*;
import java.lang.Math;
public class subsetSum{
    public static void main(String args[]){

Scanner myScanner = new Scanner(System.in);
        Random rd = new Random();
        int items = myScanner.nextInt();

        int[] contents = new int[items];

        for(int i=0;i<items;i++){
            contents[i]=myScanner.nextInt();
        }

        char[] solution = solve(contents);
        long subset1 = 0;
        long subset2 = 0;

        for(int i = 0; i<items; i++){
                if(solution[i] =='-'){
                        subset1+=contents[i];
                }
                else{
                        subset2+=contents[i];
                }
        }
        System.out.println(Math.abs(subset1-subset2));
        }

        public static char[] solve(int[] contents){
            Random rd = new Random();

            char[] temp = new char[contents.length];
            int[] numTemp = new int[contents.length];

            int [] contentsCopy = new int[contents.length];

            for(int i = 0; i < contents.length; i++){
                contentsCopy[i] = contents[i];
            }

            long hold = 0;
            int rounds = 0;
            long keep = 1999999999;
            char[] tempKeep = new char[contents.length];

       
            while(rounds<15000000){
                for(int i = 0; i <contents.length; i++){

                    //Assign either 43 or 45 to each position in the array and then convert that to its corresponding ASCII character
                    numTemp[i] = rd.nextInt((44 - 43) + 1) + 43;
                    temp[i] = (char) numTemp[i];

                    if(numTemp[i] == 44){
                        numTemp[i] = 45;
                        temp[i] = (char)numTemp[i];
                    }
                }

                    //Use code in main method to check what returning the random char array would give you
                    long pos = 0;
                    long neg = 0;
                    
                    for(int i = 0; i<contents.length; i++){
                    if(temp[i] =='-'){
                        pos+=contents[i];
                        }
                    else{
                        neg+=contents[i];
                    }
                }
                    hold = Math.abs(pos-neg);
                    
                    //Keep track of what the smallest number is
                    if(hold<keep){
                        keep = hold;
                        for(int i = 0; i < contents.length; i ++){
                            tempKeep[i] = temp[i];
                            rounds++;
                        }
                    }
                    else{
                        rounds++;
                    }
                }
                
                //Return the array that gave the smallest number
                return tempKeep;
            }
        }