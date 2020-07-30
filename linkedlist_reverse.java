import java.util.*;
class linkedlist_reverse
{   
    class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node head;
    public void insert(int d)
    {
         Node ele=new Node(d);
         if(head==null)
         {
           head=ele;
         }
         else{
            Node last =head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=ele;
         }
    }
    public void disp()
    {
        Node curr =head;
      if(curr==null)
      {
          System.out.print("empty");
      }
      else{System.out.println("elements are:");
          while(curr !=null)
          {
              System.out.print(curr.data+ " ");
              curr=curr.next;
          }
          System.out.println();
      }
    }
    public void reverse()
    {   
       Node curr=head;
       Node prev=null;
       Node next=null;
       while(curr!=null)
       {
        next = curr.next; 
        curr.next = prev; 
        prev = curr; 
        curr = next; 
       }
       head=prev;
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          linkedlist_reverse in =new linkedlist_reverse();
          for(int i=0;i<n;i++)
          {
              int e=sc.nextInt();
              in.insert(e);
          }
          sc.close();
          in.reverse();
          in.disp();
    }
}