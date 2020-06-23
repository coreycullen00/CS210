import java.util.*;

public class Solution {    
    public static void main(String args[] ){

        Scanner myscanner = new Scanner(System.in);
        int num = Integer.parseInt(myscanner.nextLine());
        int rank = Integer.parseInt(myscanner.nextLine());
        String[] names = new String[num];
        int[] grades = new int[num];

        for(int i=0;i<num;i++){
            names[i]=myscanner.nextLine();
            grades[i]=Integer.parseInt(myscanner.nextLine());
        }
        for(int i=num-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(check(names[j],grades[j],names[j+1],grades[j+1])){
                    String tempname = names[j];
                    int tempgrade = grades[j];
                    names[j]=names[j+1];
                    grades[j]=grades[j+1];
                    names[j+1]=tempname;
                    grades[j+1]=tempgrade;
                }
            }
        }
        System.out.println(names[rank-1]);     
    }
    
    public static boolean check(String firstname, int firstgrade, String secondname, int secondgrade){
        if(secondgrade>firstgrade){
            return true;
        }
        if(firstgrade==secondgrade&&secondname.compareTo(firstname)<0){
            return true;
        }
        return false;
    }
}