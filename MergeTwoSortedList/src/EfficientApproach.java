public class EfficientApproach {
    /*
    *  when both the values are equal - take any one of the value and continue the loop(u wrote another condition for it)
    *  For creating of new node at the end - No need to create a new node inorder to add a node just pass the reference
    * of the new node to present.next
    * also leave the first node empty and pass its next as the head
    *
    * I added all the element when one of the list is empty - no need just pass the link
    *
    * */

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergeNode = new ListNode();
        ListNode cursor = mergeNode;

        while (list1 != null && list2 != null ){
            if (list1.val < list2.val){
                cursor.next = list1;
                cursor = cursor.next;
                list1 = list1.next;
            }else {
                cursor.next = list2;
                cursor = cursor.next;
                list2 = list2.next;
            }
        }
        if (list1 == null){
            cursor.next = list2;
        } else if (list2 == null) {
            cursor.next = list1;
        }

        return mergeNode.next;
    }
}
