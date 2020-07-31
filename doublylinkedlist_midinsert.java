import java.util.*;

class doublylinkedlist_midinsert
{
    class Node
    {
        Node next;
        Node prev;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
            prev=null;
        }
    }
    Node head;
    public void midinsert(int d,int p)
    {    int i=1;
         Node ele =new Node(d);
         Node curr=head;
         while(i<p)
         {
             i++;
             curr=curr.next;
         }
         ele.next=curr.next;
         ele.prev=curr;
         curr.next.prev=ele;
         curr.next=ele;
         
    }
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
            ele.prev=last;
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
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        doublylinkedlist_midinsert in =new doublylinkedlist_midinsert();
        for(int i=0; i<n;i++)
        {
            int e=sc.nextInt();
            in.insert(e);
        }
        System.out.println("enter element to be inserted:");
        int ele =sc.nextInt();
        System.out.println("position:");
        int pos=sc.nextInt();
        
        in.midinsert(ele,pos);
        sc.close();
        in.disp();
    }
}