public class Approach3 {


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode mergePointer = null;
        ListNode mergeHead = mergePointer;

        while (pointer1 != null || pointer2 != null)
        {
            while (pointer2 == null) {// new list, already existing list
                if (mergePointer == null) {
                    mergePointer = new ListNode();
                    mergeHead = mergePointer;
                } else {
                    mergePointer.next = new ListNode();
                    mergePointer = mergePointer.next;
                }
                mergePointer.val = pointer1.val;
                pointer1 = pointer1.next;
                if (pointer1 == null)
                    return mergeHead;
            }
            while (pointer1 == null) {
                if (mergePointer == null) {
                    mergePointer = new ListNode();
                    mergeHead = mergePointer;
                } else {
                    mergePointer.next = new ListNode();
                    mergePointer = mergePointer.next;
                }
                mergePointer.val = pointer2.val;
                pointer2 = pointer2.next;
                if (pointer2 == null)
                    return mergeHead;
            }
            if (pointer1.val < pointer2.val) {
                if (mergePointer == null) {
                    mergePointer = new ListNode();
                    mergeHead = mergePointer;
                } else {
                    mergePointer.next = new ListNode();
                    mergePointer = mergePointer.next;
                }
                mergePointer.val = pointer1.val;
                pointer1 = pointer1.next;
            } else if (pointer1.val == pointer2.val) {
                if (mergePointer == null) {
                    mergePointer = new ListNode();
                    mergeHead = mergePointer;
                } else {
                    mergePointer.next = new ListNode();
                    mergePointer = mergePointer.next;
                }
                mergePointer.val = pointer1.val;

                mergePointer.next = new ListNode();
                mergePointer = mergePointer.next;

                mergePointer.val = pointer2.val;

                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            } else if (pointer1.val > pointer2.val) {
                if (mergePointer == null) {
                    mergePointer = new ListNode();
                    mergeHead = mergePointer;
                } else {
                    mergePointer.next = new ListNode();
                    mergePointer = mergePointer.next;
                }
                mergePointer.val = pointer2.val;
                pointer2 = pointer2.next;
            }
        }
        return mergeHead;
    }
}
