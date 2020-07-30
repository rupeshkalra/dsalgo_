import java.util.*;
class doublylinkedlist_beginsert
{   
    class Node
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
    public void beginsert(int d)
    {   Node  el=new Node(d);
        
        if(head==null)
        {
            head=el;
            el.prev=null;
        }
        else{
            el.next=head;
            el.prev=null;
            head=el;
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        doublylinkedlist_beginsert on=new doublylinkedlist_beginsert();
        for(int i=0;i<n;i++)
        {
            int e=sc.nextInt();
            on.beginsert(e);
        }
        sc.close();
        on.disp();
    }
}