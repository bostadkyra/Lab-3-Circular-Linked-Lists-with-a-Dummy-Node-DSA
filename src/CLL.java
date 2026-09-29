import java.util.LinkedList;

public class CLL<T>{
    private Node head;
    private Node tail;

    public CLL(){
        head=null;
        tail=head;
    }

    public CLL(Node newNode){
        //instantiate LL w/ dummy node
        head=newNode;
        tail=head;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public void addItem(T data){
        head = new Node(data, head);
    }

    public LinkedList showList(LinkedList listName){

    }

    public LinkedList showReverseList(LinkedList listName){
        //write recursively
    }

    public boolean find(LinkedList listName){
        //searches list to see if value is in there
    }

    public void remove(int value){
        //finds the first occurrence of an item in a list and deletes that item
    }
}
