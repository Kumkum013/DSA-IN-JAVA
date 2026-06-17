import java.util.HashSet;

public class Questions {

    void deleteDups(SinglyLinkedList ll) {

        HashSet<Integer> hs = new HashSet<Integer>();

        SinglyLinkedList.Node current = ll.head;
        SinglyLinkedList.Node prev = null;

        while (current != null) {

            int curval = current.value;

            if (hs.contains(curval)) {

                prev.next = current.next;
                ll.size--;

            } else {

                hs.add(curval);
                prev = current;
            }

            current = current.next;
        }
    }
}