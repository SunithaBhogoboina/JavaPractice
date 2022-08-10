public class RemoveDupsInLinkedList {
     Node head;

     //unsorted list
    void removeDuplicates(Node head) {
        Node node = head;
        while(node != null) {
            Node current = node;
            while(current.next != null) {
                if(node.data == current.next.data) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            node = node.next;
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
