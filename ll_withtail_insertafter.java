import java.util.*;

class ll_withtail_insertafter
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
    Node tail;
    public void insert(int d)
    {
         Node ele=new Node(d);
         if(head==null)
         {
           head=ele;
           tail=ele;
           ele.next=head;
         }
         else{
            
            tail.next=ele;
            tail=ele;
            tail.next=head;
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
      do{   
        System.out.print(curr.data+" ");  
        curr= curr.next;  
        }while(curr!= head); 
      }
   }
   public void insertafter(int e,int pos)
   {  Node el=new Node(e);
       Node curr=head;
       int i=1;
       while(i<pos)
       {
           curr=curr.next;
           i++;
       }
      el.next=curr.next;
      curr.next=el;
   }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        ll_withtail_insertafter ob= new ll_withtail_insertafter();
        for(int i=0;i<n;i++)
        {
            int el=sc.nextInt();
            ob.insert(el);
        }
        System.out.println("enter element");
        int e=sc.nextInt();
        System.out.println("enter postion");
        int pos=sc.nextInt();
        ob.insertafter(e,pos);
        ob.disp();
        sc.close();
    }
}