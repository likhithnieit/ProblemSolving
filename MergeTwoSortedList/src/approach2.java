public class approach2 {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode mergeNode = new ListNode();
        ListNode mergerPointer = mergeNode;

        while (pointer1 != null || pointer2 != null){
            while (pointer1 == null){
                    if (mergerPointer == null)
                    mergerPointer = new ListNode();
                    else {
                        mergerPointer.next = new ListNode();
                        mergerPointer = mergerPointer.next;
                    }

                mergerPointer.val = pointer2.val;

                pointer2 = pointer2.next;
                if (pointer2 == null)
                    break;
            }if (pointer1 == null || pointer2 == null){
                break;
            }

            while (pointer2 == null){
                    mergerPointer.next = new ListNode();
                    mergerPointer = mergerPointer.next;
                    mergerPointer.val = pointer1.val;
                pointer1 = pointer1.next;
                if (pointer1 == null)
                    break;
            }
            if (pointer1 == null || pointer2 == null){
                break;
            }

            if (pointer1.val < pointer2.val) {
                    mergerPointer.next = new ListNode();
                    mergerPointer = mergerPointer.next;
                    mergerPointer.val = pointer1.val;

                pointer1 = pointer1.next;
            } else if (pointer1.val == pointer2.val) {

                    mergerPointer.next = new ListNode();
                    mergerPointer = mergerPointer.next;
                    mergerPointer.val = pointer1.val;
                    mergerPointer.next = new ListNode();
                    mergerPointer = mergerPointer.next;
                    mergerPointer.val = pointer2.val;
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            } else if (pointer1.val > pointer2.val) {
                    mergerPointer.next = new ListNode();
                    mergerPointer = mergerPointer.next;
                    mergerPointer.val = pointer2.val;
                pointer2 = pointer2.next;
            }
        }

        return mergeNode;
    }
}
