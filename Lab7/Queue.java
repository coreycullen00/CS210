import java.util.Scanner;

public class Queue {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String inputs = new String("");
        while(sc.hasNextLine())
        {
            inputs = inputs + "," + sc.nextLine();
        }

        String[] commands = inputs.split(",");

        Queue myQueue = new Queue(commands.length);

        for(int i = 1; i < commands.length; i++){
            String commands2[] = commands[i].split(" ");

                if(commands2[0].equals("INSERT")){
                    myQueue.insert(commands2[1]);
                }
                else if(commands2[0].equals("REMOVE")){
                    myQueue.remove();
                }
        }

        int p = 0;

        if(myQueue.isEmpty()){
            System.out.println("empty");
            
        }
        //if even
        else if(myQueue.size()%2==0){
            p = (myQueue.size())/2 -1;
            System.out.println(myQueue.position(p));
        }
       
        //if odd
        else{   
            p = (myQueue.size()-1)/2 ;
            System.out.println(myQueue.position(p));
        }

        
        //for(int i = 0; i < myQueue.size();i++){
        //        System.out.println(myQueue.position(i));
        //}
        sc.close();
    }
}

class Queue{
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue (int s){
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean insert(String j) {
        if(isFull()) return false;
        if(rear == maxSize-1){
             rear = -1;
         }
            rear++;
             queArray[rear] = j;
             nItems++;
             return true;
       
    }
   
    public String remove() {
         if(isEmpty()) return null;
         String temp = queArray[front];
         front++;
         if(front == maxSize)
         {
             front = 0;
         }
             nItems--;
             return temp;
         }
     
     public String peekFront(){
        return queArray[front];
    }
    public boolean isEmpty() {
        return (nItems==0);
    }
    public boolean isFull() {
        return (nItems==maxSize);
    }
    public int size() {
        return nItems;
    }
    public String position(int p){
        return queArray[p+front];
    }
}
