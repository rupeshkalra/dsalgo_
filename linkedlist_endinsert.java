import java.util.*;

class linkedlist_endinsert
{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    void push(int e)
    {
        Node n=new Node(e);
        if(head==null)
        {
            head=n;
        }
        else{
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
    }
    }
    void disp()
    {
        Node curr=head;
        while(curr.next!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.print(curr.data);
    }
       public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      linkedlist_endinsert ll=new linkedlist_endinsert();
      for(int i=0;i<n;i++)
      {
            int a=sc.nextInt();
            ll.push(a);
      }
      sc.close();
      ll.disp();
    }
}