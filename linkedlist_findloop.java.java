import java.util.*;
class linkedlist_findloop
{
    class Node
    {
        int data;
        Node next;
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
    public void findloop()
    {
        Node slow = head, fast = head; 
        int flag = 0; 
        while (slow != null && fast!=null && fast.next != null) { 
            slow= slow.next; 
            fast= fast.next.next; 
            if (slow== fast) { 
                flag = 1; 
                break; 
            } 
        } 
        if (flag == 1) 
            System.out.println("loop found!!"); 
        else
            System.out.println("loop not found"); 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        linkedlist_findloop ob= new linkedlist_findloop();
        for(int i=0;i<n;i++)
        {
            int el=sc.nextInt();
            ob.insert(el);
        }
        ob.findloop();
        sc.close();
    }
}