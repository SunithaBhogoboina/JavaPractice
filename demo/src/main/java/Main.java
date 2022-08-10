import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        /*CheckPermutation cp = new CheckPermutation();
        System.out.println(cp.checkPermutation("God   ", "dog"));
        System.out.println(cp.checkPermutation("Dog", "dog"));
        System.out.println(cp.checkPermutation("dog", "dog"));
        System.out.println(cp.checkPermutation("odg", "dog"));*/

        /*PermutationInString ps = new PermutationInString();
        System.out.println(ps.isInclusion("od", "eidbaoodo"));*/

        /*URLify obj = new URLify();
        System.out.println(obj.urlify("Mr John Smith"));*/

        /*PalindromePermutation pp = new PalindromePermutation();
        System.out.println(pp.isPalindromePermutation("tact coa"));*/

        /*OneAway oa = new OneAway();
        System.out.println(oa.isOneAway("pale", "ple"));
        System.out.println(oa.isOneAway("pales", "pale"));
        System.out.println(oa.isOneAway("pale", "bale"));
        System.out.println(oa.isOneAway("pale", "bae"));
        System.out.println(oa.isOneAway("apple", "aple"));*/

        /*StringCompression sc = new StringCompression();
        System.out.println(sc.getStringCompression("aabcccccaaa")); //a2b1c5a3
        System.out.println(sc.getStringCompression("abcd"));*/

        /*RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(rm.rotateMatrix(matrix));*/

        /*StringRotation sr = new StringRotation();
        System.out.println(sr.isStringRotation("waterbottle", "erbottlewat"));*/

        /*StringRotation2 leftRotation = new StringRotation2();
        System.out.println(leftRotation.getLeftRotation("ABCD", 5));
        System.out.println(leftRotation.getLeftRotation("ABCD", 3));
        System.out.println(leftRotation.getLeftRotation("ABCD", 4));
        System.out.println(leftRotation.getLeftRotation("ABCD", 2));
        System.out.println(leftRotation.getLeftRotation("ABCD", 1));
        System.out.println();
        System.out.println(leftRotation.getRightRotation("ABCD", 5));
        System.out.println(leftRotation.getRightRotation("ABCD", 3));
        System.out.println(leftRotation.getRightRotation("ABCD", 4));
        System.out.println(leftRotation.getRightRotation("ABCD", 2));
        System.out.println(leftRotation.getRightRotation("ABCD", 1));*/

        /*RemoveDupsInLinkedList list = new RemoveDupsInLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(12);
        list.head.next.next = new Node(11);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(12);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(10);

        list.printList(list.head);
        list.removeDuplicates(list.head);
        list.printList(list.head);*/

        /*RemoveDupsInSortedLinkedList sortedList = new RemoveDupsInSortedLinkedList();
        sortedList.head = new Node(10);
        sortedList.head.next = new Node(10);
        sortedList.head.next.next = new Node(11);
        sortedList.head.next.next.next = new Node(11);
        sortedList.head.next.next.next.next = new Node(11);
        sortedList.head.next.next.next.next.next = new Node(12);
        sortedList.head.next.next.next.next.next.next = new Node(12);
        sortedList.head.next.next.next.next.next.next.next = new Node(13);

        sortedList.printList(sortedList.head);
        sortedList.removeDuplicates(sortedList.head);
        sortedList.printList(sortedList.head);*/

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(8);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(4);

        LinkedListProblems obj = new LinkedListProblems();
        //obj.findKthElement(head, 3);
        //obj.findKthElementByRecursion(head, 5);
        obj.printList(head);
        obj.deleteMiddleNode(head);
        obj.deleteMiddleNode(head.next.next.next.next.next.next);
        obj.deleteLastNode(head);
        obj.printList(head);
        obj.deleteLastNode(head);
        obj.printList(head);
    }
}
