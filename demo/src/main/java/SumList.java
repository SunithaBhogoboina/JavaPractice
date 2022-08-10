/*Sum Lists: You have two numbers represented by a linked list, where each node contains a single
        digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
        function that adds the two numbers and returns the sum as a linked list.
        EXAMPLE
        Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
        Output: 2 -> 1 -> 9. That is, 912.
        FOLLOW UP
        Suppose the digits are stored in forward order. Repeat the above problem.
        EXAMPLE
        lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
        Output: 9 -> 1 -> 2. That is, 912.*/

public class SumList {

    public Node addTwoNumbers(Node node1, Node node2) {
        Node sum_node = new Node(0);
        Node sum = sum_node;
        int carry = 0;
        int data = 0;
        int value = carry;

        while(node1 != null && node2 != null) {
            value = carry + node1.data + node2.data;
            data = value >= 10 ? value % 10 : value;
            carry = value >= 10 ? value / 10 : 0;
            sum_node.next = new Node(data);;
            sum_node = sum_node.next;
            node1 = node1.next;
            node2 = node2.next;
        }

        if(carry > 0) {
            sum_node.next = new Node(carry);
        }

        return sum.next;
    }

    void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);

        Node node2 = new Node(5);
        node2.next = new Node(9);
        node2.next.next = new Node(2);

        SumList obj = new SumList();
        obj.printList(obj.addTwoNumbers(node1, node2));
    }
}
