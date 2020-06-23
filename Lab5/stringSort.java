import java.util.Scanner;

public class stringSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sentenceNo = sc.nextInt();
        int sentenceRank = sc.nextInt()-1;
        String[] sentenceArray = new String[sentenceNo];
        for(int i = 0; i<sentenceNo; i++){
            sentenceArray[i] = sc.next();
        }
        String temp = "";
        for(int j =0; j<sentenceNo; j++){
            for(int i = 0; i<sentenceNo-1; i++){
                if(sentenceArray[i].length()>sentenceArray[i+1].length()){
                    temp = sentenceArray[i];
                    sentenceArray[i] = sentenceArray[i+1];
                    sentenceArray[i+1] = temp;
                }
            }
        }
        //for(int i = 0; i<sentenceNo; i++){
        //    System.out.println(sentenceArray[i]);
        //}
        
        String temp2 = "";
        for(int j =0; j<sentenceNo; j++){
            for(int i = 0; i<sentenceNo-1; i++){
            if(sentenceArray[i].length()==(sentenceArray[i+1].length())){
                if(sentenceArray[i].compareTo(sentenceArray[i+1])<0){
                    temp2 = sentenceArray[i];
                    sentenceArray[i] = sentenceArray[i+1];
                    sentenceArray[i+1] = temp2;
                }
            }
            }
            }
            System.out.println(sentenceArray[sentenceRank]);
    }
}
