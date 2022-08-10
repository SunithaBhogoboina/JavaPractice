package PayPal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ContactList {

    static int addNumbers(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int a;
        // a = in.nextInt();
        // int b;
        // b = in.nextInt();
        // int sum;

        // sum = addNumbers(a, b);
        // System.out.println(sum);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<num; i++) { //O(n)--> O(n*l) - time complexity, O(l) - space complexxity
            String[] data = br.readLine().split(" ");
            if(data[0].equals("add")) { // add pack
                for(int j=1; j<= data[1].length(); j++) { //packet // O(l)
                    String ele = data[1].substring(0, j); //p, pa, pac, pack
                    if(map.get(ele) == null) {
                        map.put(ele,1); //(p, 1) (pa, 1) (pac, 1) (pack, 1)
                    } else {
                        map.put(ele, map.get(ele) + 1); //[(p, 3) (pa, 3) (pac, 3) (pack, 3) (packe, 2) (packed, 1) (packet, 1)]
                    }
                }
            } else { // find pac
                // int count = 0;
                // Iterator itr = map.keySet().iterator();
                // if(itr.hasNext()) {
                //     if(itr.next().toString().startsWith(data[1])) {
                //         count++;
                //     }
                // }
                // System.out.println(count);
                if(map.get(data[1] == null)) {
                    System.out.println(0);
                } else {
                    System.out.println(map.get(data[1]));
                }
            }
        }

    }
}
// Your old code in javascript has been preserved below.
// // We're going to make our own Contacts application! The application must perform two types of operations:
// // add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
// // find partial, where  is a string that denotes a partial name to search the application for. It must count the number of contacts starting with  and print the count on a new line.
// // Given  sequential add and find operations, perform each operation in order.

// // Input Format

// // The first line contains a single integer, , the number of operations to perform.
// // Each line  of the  subsequent lines contains an operation in one of the two forms defined above.

// // Constraints

// // 1 <= name <= 21
// // 1 <= partial <= 21
// // It is guaranteed that name and partial contain lowercase English letters only.
// // The input does not have any duplicate  for the  operation.
// // Output Format

// // For each find partial operation, print the number of contact names starting with  on a new line.

// // Sample Input

// // 4
// // add pack
// // add packed
// // find pac
// // find nothing

// // Sample Output

// // 2
// // 0
// add packet



