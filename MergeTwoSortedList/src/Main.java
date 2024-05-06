import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ListNode list1 = takeInput();
        ListNode list2 = takeInput();


        //ListNode mergerList = approach2.mergeTwoLists(list1,list2);
       // ListNode mergerList = Approach3.mergeTwoLists(list1,list2);
            ListNode mergerList = EfficientApproach.mergeTwoLists(list1,list2);

        while (mergerList!= null) {
            System.out.println(mergerList.val);
            mergerList = mergerList.next;
        }


    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode head = mergedList;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                while (list2 != null) {
                    mergedList.val = list2.val;
                    mergedList.next = new ListNode();
                    mergedList = mergedList.next;
                    list2 = list2.next;
                }
            }
            if (list2.next == null) {
                while (list1 != null) {
                    mergedList.val = list1.val;
                    mergedList.next = new ListNode();
                    mergedList = mergedList.next;
                    list1 = list1.next;
                }
            }

            if (list1.val < list2.val) {
                mergedList.val = list1.val;
                mergedList.next = new ListNode();
                mergedList = mergedList.next;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                mergedList.val = list2.val;
                mergedList.next = new ListNode();
                mergedList = mergedList.next;
                list2 = list2.next;
            } else {
                mergedList.val = list1.val;
                mergedList.next = new ListNode();
                mergedList = mergedList.next;

                mergedList.val = list2.val;
                mergedList.next = new ListNode();
                mergedList = mergedList.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        return head;
    }

    public static ListNode takeInput(){
        System.out.println("hii");
        ListNode list = new ListNode();
        ListNode pointer = list;
        int x = 0;
        while (true){
            System.out.println("Enter the value");
            int value = sc.nextInt();
            if (value == 65){
                break;
            }else {
                pointer.val = value;
            }
            pointer.next = new ListNode();
            pointer = pointer.next;

        }
        return list;
    }
}