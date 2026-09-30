import java.util.LinkedList;

public class CLL<T>{
    protected Node<T> dummy; //replaces head

    public CLL(){
        dummy = new Node<T>(null); //empty list where dummy Node holds no value and points to itself
        dummy.next = dummy;
    }

    public void addItem(T data){
        Node<T> newNode = new Node<T>(data);
        Node <T> current = dummy;

        while (current.next != dummy){ //traverses to the last node in the LinkedList
            current = current.next;
        }

        current.next = newNode; //last node now points to new node
        newNode.next = dummy; //new node now points to dummy node

    }

    public void showList(){
        Node<T> current = dummy.next; //start after dummy otherwise null will be printed first

        while(current != dummy){ //current.next not used here as it would skip printing the data of last node
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println(); //if nothing is in the LinkedList, a blank line is printed
    }

    public void showReverseList(){
        showReverseListHelper(dummy.next);
        System.out.println();//if nothing is in the LinkedList, only blank line printed
    }

    private void showReverseListHelper(Node<T> current){
        if (current == dummy){
            return;
        }
        showReverseListHelper(current.next);//goes to end of LinkedList via recursion
        System.out.println(current.data + " ");//prints on way back from each recursion
    }

    public boolean find(T data){
        Node<T> current = dummy.next;
        while (current != dummy){
            if (current.data instanceof String && data instanceof String) {
                String nodeData = ((String) current.data).trim();//removes spaces before and after String
                String searchData = ((String) data).trim();
                if (nodeData.equalsIgnoreCase(searchData)) {//ignores case of String
                    return true;
                }
            }
            if (current.data.equals(data)){
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void remove(T data){
        Node<T> current = dummy;
        while(current.next != dummy){
            boolean shouldRemove = false;

            if (current.next.data instanceof String && data instanceof String) {
                String nodeData = ((String) current.next.data).trim();
                String searchData = ((String) data).trim();
                shouldRemove = nodeData.equalsIgnoreCase(searchData);
            } else{
                shouldRemove = current.next.data.equals(data);
            }
            if (shouldRemove){
                current.next = current.next.next;//points over node to remove it (skips it)
                return;
            } else {
                current = current.next;
            }
        }
    }
}

