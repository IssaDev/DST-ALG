public class Test {
    public static void main(String[] args){
        /*QuickFindUF test = new QuickFindUF(10);
        System.out.println(test.isConnected(0,8));
        test.union(0,8);
        test.union(5,0);
        System.out.println(test.isConnected(5,8));*/
        SinglyLinkedList myList= new SinglyLinkedList();
        /*for(int i =0; i<5; i++){
           myList.addLast(i);
        }*/
        myList.addFirst(2);
        myList.addFirst(2);
        myList.addFirst(2);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);
        myList.addFirst(2);
        myList.addFirst(0);
        myList.printAll();
        //System.out.println("************");
        //myList.addFirst(9);
        //myList.getSize();
       // myList.printAll();
       // System.out.println("************");
        //myList.deleteHead();
       // myList.printAll();
        System.out.println("************");
        //myList.deleteSpecificElement(2);
        myList.removeDuplicates();
        myList.printAll();

    }
}
