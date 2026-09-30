import java.util.LinkedList;

public class CLL<T>{
    protected Node<T> dummy; //replaces head

    public CLL(){
        dummy = new Node<T>(null, dummy); //empty list where dummy Node holds no value and points to itself
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

        System.out.println("List: ");
        while(current != dummy){ //current.next not used here as it would skip printing the data of last node
            System.out.println(current.data + ", ");
            current = current.next;
        }
        System.out.println(); //if nothing is in the LinkedList, a blank line is printed
    }

    public void showReverseList(){
        System.out.println("Reverse List: ");
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
            if (current.data == data){
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
            if (current.next.data == data){
                current.next = current.next.next;//points over node to remove it (skips it)
            } else {
                current = current.next;
            }
        }
    }
}
