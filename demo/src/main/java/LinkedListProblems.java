public class LinkedListProblems {

    //iteration method using 2 pointers
    public int findKthElement(Node head, int k) {
        if(head == null) {
            return 0;
        }

        Node curr = head;
        while(k > 0) {
            curr = curr.next;
            k--;
        }

        Node sec = head;
        while(curr != null) {
            curr = curr.next;
            sec = sec.next;
        }

        System.out.println(sec.data);
        return sec.data;
    }

    public int findKthElementByRecursion(Node head, int k) {
        if(head == null) {
            return 0;
        }

        int index = findKthElementByRecursion(head.next, k) + 1;
        if(index == k) {
            System.out.println(head.data);
        }

        return index;
    }

    //have access to be deleted node, no access to head
    public boolean deleteMiddleNode(Node node) {
        if(node == null || node.next == null) {
            return false;
        }

        node.data = node.next.data;
        node.next = node.next.next;

        return true;
    }

    public boolean deleteLastNode(Node head) {
        if(head == null) {
            return false;
        }

        Node node = head;
        while(node != null) {
            if(node.next.next == null) { //find 2nd last node and make last node as null
                node.next = null;
            }
            node = node.next;
        }

        return true;
    }

    void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    /*
    Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
    You should preserve the original relative order of the nodes in each of the two partitions.

    Input: head = [1,4,3,2,5,2], x = 3
    Output: [1,2,2,4,3,5]
    Example 2:

    Input: head = [2,1], x = 2
    Output: [1,2]
    */

    public Node partitionList(Node head, int x) {
        // before and after are the two pointers used to create the two list
        // before_head and after_head are used to save the heads of the two lists.
        // All of these are initialized with the dummy nodes created.
        Node before_head = new Node(0);
        Node before = before_head;
        Node after_head = new Node(0);
        Node after = after_head;

        while (head != null) {

            // If the original list node is lesser than the given x,
            // assign it to the before list.
            if (head.data < x) {
                before.next = head;
                before = before.next;
            } else {
                // If the original list node is greater or equal to the given x,
                // assign it to the after list.
                after.next = head;
                after = after.next;
            }

            // move ahead in the original list
            head = head.next;
        }

        // Last node of "after" list would also be ending node of the reformed list
        after.next = null;

        // Once all the nodes are correctly assigned to the two lists,
        // combine them to form a single list which would be returned.
        before.next = after_head.next;

        return before_head.next;
    }
}
