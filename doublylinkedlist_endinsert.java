import java.util.*;
class doublylinkedlist_endinsert
{   class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int d)
        {
            data=d;
            next=null;
            prev=null;
        }
    }
    Node head;
    public void insert(int da)
    {   Node d =new Node(da);
         if(head==null)
         {
             head=d;
             d.prev=null;
         }
         else{
               Node curr=head;
               while(curr.next!=null)
               {
                   curr=curr.next;
               }
               curr.next=d;
               d.prev=curr;
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
    public static void main(String args[])
 {
   Scanner sc= new Scanner(System.in);
   int n =sc.nextInt();
   doublylinkedlist_endinsert in =new doublylinkedlist_endinsert();
   for(int i=0;i<n;i++)
   {
           int a=sc.nextInt();
           in.insert(a);
   }
   sc.close();
   in.disp();
 }
}