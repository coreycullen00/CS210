public class Directions {

public static void main(String args[] ) throws Exception { 
        Scanner scan = new Scanner(System.in);
        Stack st = new Stack();
        String line[] = scan.nextLine().split(" ");

        while(line[0].matches("Arrived") == false){
            if(line[1].matches("Back")){
                st.pop();
            }
            else{
                st.push(line[1]);
            }
            line = scan.nextLine().split(" ");
        }

        while(st.isEmpty() == false){
            String s = st.pop();
            if(s.matches("North")) System.out.println("Go South");
            else if(s.matches("South")) System.out.println("Go North");
            else if(s.matches("West")) System.out.println("Go East");
            else if(s.matches("East")) System.out.println("Go West");
        }
    }

    public static class Node {
        String data;
        Node next;       
        public Node(String s){
            data = s;
        }
    }
 
    public static class Stack {
        Node head;       
        public void push(String s){
            if(head==null){
                head = new Node(s);
                return;
            }
            Node oldhead = head;
            head = new Node(s);
            head.next = oldhead;
            return;
        }
       
        public String pop(){
            if(head ==null){
                return " ";
            }
            Node returnHead = head;
            head = head.next;
            return returnHead.data;
        }

        public boolean isEmpty(){
            return (head==null);
        }
    }
}

