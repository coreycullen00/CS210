import java.util.*;
import java.math.*;

public class PriorityQueue {
     public static void main(String args[]) throws Exception {
            Scanner myscanner = new Scanner(System.in);
            int size = Integer.parseInt(myscanner.nextLine());
            Queue PQ = new PQueue(size);

            for (int i = 0; i < size; i++) {
                String input = myscanner.nextLine();

                if (input.equals("REMOVE")) {
                    PQ.remove();
                } 
		else {
                    PQ.insert(input.substring(7, input.length()));
                }
            }
            System.out.println(PQ.peek());
        }
}

class PQueue {
        private int maxSize;
        private String[] queArray;
        private int nItems;

        public PQueue(int s) { // constructor
            maxSize = s;
            queArray = new String[maxSize];
            nItems = 0;
        }

        public void insert(String item) { // insert item
		if (nItems == 0) { // if no items,
			 queArray[0] = item; // insert at 0
		} else { // if some items,
	                int j = nItems; // start at end

                while (j > 0 && bigger(queArray[j - 1], item)) { // while new item larger
                    queArray[j] = queArray[j - 1]; //  shift upward
                     j--; // decrement j
                }

                queArray[j] = item; // insert it
            }
             nItems++; // increase items
        }

        public boolean bigger(String one, String two) {
            if (one.length() < two.length()) {
                return true;

            } else if (one.length() == two.length() && one.compareTo(two) < 0) {
                return true;
            }
            return false;
        }

        public String remove() { // take item from front of queue
            if (!isEmpty()) {
                String temp = queArray[nItems];// get value and incr front
                nItems--; // one less item
                return temp;
            } else {
                return null;
            }
        }

        public String peek() { // peek at front of queue
            if (!isEmpty()) {
                return queArray[nItems - 1];
            } else {
                return null;
            }
        }

        public boolean isEmpty() { // true if queue is empty
            return (nItems == 0);
        }

        public boolean isFull() { // true if queue is full
            return (nItems == maxSize);
        }

        public int size() { // number of items in queue
            return nItems;
        }
 }

