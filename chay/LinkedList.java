import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
}
}
    public class LinkedList {
        Node head;
        void insertAtBegan(int data){
            Node newnode= new Node(data);
            if(head==null){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;

            }
        }
        void insertAtEnd(int data){
            Node node = new Node(data);
             if(head==null){
                head=node;
            }
            else if(head.next==null){
                head.next=node;
            }
            else{
                Node temp=head;
                while ((temp.next!=null)){
                    temp=temp.next;
                }
                temp.next=node;
            }
            
        }
        int countNodes(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                temp=temp.next;
                count+=1;
            }
            return count;

        }
        void insertAtPosition(int pos,int data){
            Node node=new Node(data);
            Node temp=head;
            int c=countNodes();
            if(pos>c+1 ||pos <=0){
                System.out.println("Invalid position");
                return;
            }
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;

        }
        void deleteAtbegan(){
            if(head==null){
                System.out.println("Dletion not possible LL is empty");
            }
            else{
                head=head.next;
            }
        }
        void delteAtEnd(){
            if(head==null){
                System.out.println("Dletion not possible LL is empty");
            }
            else{
                Node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;

            }
        }
        void deleteAtPosition(int pos){
            Node temp=head;
            int c=countNodes();
            if(pos>c ||pos<=0){
                System.out.println("deletion not possible Invalid position");
                return;
            }
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        boolean SearchEle(int val){
            Node temp=head;
            while(temp!=null){
                if(temp.data==val){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
        void reverse(Node node){
            if(node ==null){
                return;
            }
            reverse(node.next);
            System.out.print(node.data+"--->");
        }
        int middleEle(){
            int n=countNodes();
            Node temp=head;
            for(int i=0;i<n/2;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void display(){
            if(head==null){
                System.out.println("LinkedList is Empty");
            }
            else{
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+"--->");
                    temp=temp.next;
                }
            }

        }
public static void main(String[] args){
    LinkedList c=new LinkedList();
    c.deleteAtbegan();
    c.insertAtBegan(9);
    c.insertAtBegan(99);
    c.insertAtBegan(999);
    c.insertAtBegan(9999);
    c.insertAtEnd(13);
    c.insertAtEnd(11);
    c.insertAtBegan(6);
    c.insertAtPosition(3,16);
    c.deleteAtbegan();
    c.delteAtEnd();
    c.deleteAtPosition(3);
    System.out.println("ele found or not: "+c.SearchEle(9));
    int n=c.countNodes();
    System.out.println("CountofNodes is: "+n);
    System.out.print("Reverse of the LL is: ");
    c.reverse(c.head);
    System.out.println("-----------------------");
    
    c.display();
    System.out.println("-------------------");
    System.out.println("Middle element is:"+c.middleEle());
}
    }