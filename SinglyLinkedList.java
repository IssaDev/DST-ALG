public class SinglyLinkedList <T extends Comparable<T>> implements Cloneable {
    private int size =0;
    private Node<T> head = null;

    public SinglyLinkedList() {

    }

    public void addLast(T val){
        Node<T> element = new Node<T>(val);
        if(head == null){
            head = element;
            size++;
        }
        else{
            Node<T> tempHead = head;
            while (tempHead.getNext() !=null){
                tempHead = tempHead.getNext();
            }
            tempHead.setNext(element);
            size++;
        }
    }

    public void deleteHead(){
        if(head == null) System.out.println("List is empty cannot delete");
        else{
            head = head.getNext();
            size--;
        }
    }

    public void deleteTail(){
        if(head == null || head.getNext() == null) System.out.println("List is empty or only one item in list");
        else {
            Node<T> tail = head;
            while (tail.getNext().getNext() != null){
                tail = tail.getNext();
            }
            tail.setNext(null);
            size--;
        }


    }

    public void deleteSpecificElement(T val){
        if (head == null) System.out.println("List is empty");
        else if(head.getData() == val){
            if (head.getNext() !=null){ head = head.getNext(); return;}
            head =null;
        }
        else{
            Node<T> currHead = head;
            while(currHead.getNext() != null){
                if(currHead.getNext().getData() == val){
                    //not the tail
                    currHead.setNext(currHead.getNext().getNext());
                    size--;
                    return;
                }
                currHead = currHead.getNext();
            }
            System.out.println(val + " not found");
        }
    }

    private boolean isEmpty(){
        if (size == 0) return true;
        else return false;
    }

    public void printAll(){
        Node<T> tempHead = head;
        while(tempHead !=null){
            System.out.println(tempHead.getData());
            tempHead = tempHead.getNext();
        }
    }

    public int getSize() {
        System.out.println("size is " + size);
        return size;
    }

    public void addFirst(T val){
        Node<T> newHead = new Node<T>(val);
        if(isEmpty()){
            head = newHead;
            size++;
        }
        else {
            newHead.setNext(head);
            head = newHead;
            size++;
        }
    }

    public void removeDuplicates(){
        if (head==null) return;
        Node<T> previous = head;
        Node<T> current = previous.getNext();
        while (current != null){
            Node<T> runner = head;
            while (runner != current){
                if(runner.getData() == current.getData()){
                    previous.setNext(current.getNext());
                    current = current.getNext();
                    break;
                }
                runner = runner.getNext();
            }
            if(runner == current){
                previous = current;
                current = current.getNext();

            }
        }
    }
}
