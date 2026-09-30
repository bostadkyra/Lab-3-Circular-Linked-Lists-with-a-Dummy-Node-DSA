public class Node<T> {
    protected T data;
    protected Node<T> next;

    private Node(){}

    public Node(T data){
        this.data=data;
        next=null;
    }

    public Node(T data, Node<T> next){
        this.data=data;
        this.next=next;
    }

    public T getData(){
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setData(T data){
        this.data=data;
    }

    public void setNext(Node<T> next){
        this.next=next;
    }
}
