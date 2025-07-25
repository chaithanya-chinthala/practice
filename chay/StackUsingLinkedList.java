import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class StackUsingLinkedList{
    Node head=null;
    int size;
    int count=0;
     StackUsingLinkedList(int size) {
        this.size = size;
    }
    void push(int ele){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        Node newnode = new Node(ele);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        count++;
    }
    
int pop() {
    if (isEmpty()) {
        System.out.println("Stack is underflow");
        return -1; 
    }
    int val;
    if (head.next == null) {
        val = head.data;
        head = null;
    } else {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        val = temp.next.data;
        temp.next = null;
    }
        count--;
        return val;
}
    boolean isEmpty(){
        return head==null;
    }
    boolean isFull(){
        return count ==size;
    }
    int countNodes(){
         int count=0;
        Node temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    void display(){
        if(head==null){
            System.out.println("Stack is empty Nothing to display");
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.data+"-->");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array:");
         int size=sc.nextInt();
         int ec=0;int oc=0;
         StackUsingLinkedList n=new StackUsingLinkedList(size);
          System.out.println("Enter Array elements to push");
         for( int i=0;i<size;i++){
            n.push(sc.nextInt());
         }
         for(int i=0;i<size;i++){
            int pop=n.pop();
            if(pop%2==0){
                ec+=1;
            }
            else{
                oc+=1;
            }
         }
         System.out.println("even count:"+ec);
         System.out.println("odd count: "+oc);

        }
    }
