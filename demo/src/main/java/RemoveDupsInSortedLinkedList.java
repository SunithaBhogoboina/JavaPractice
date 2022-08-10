public class RemoveDupsInSortedLinkedList {
    Node head;

    //sorted list
    void removeDuplicates(Node head) {
        Node node = head;

        while(node.next != null) {
            if(node.data == node.next.data) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
    }

    void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
