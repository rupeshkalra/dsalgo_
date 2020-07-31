import java.util.*;
class ll_withtail_insertend
{
    class Node
    {
    int data;
    Node next;
    Node(int d)
    {
        data =d;
        next=null;
    }
    }
     Node head;
     Node tail;
   public void insert(int d)
   {
      Node ele =new Node(d);
      if(head==null)
      {
      head =ele;
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ll_withtail_insertend in =new ll_withtail_insertend();
        for(int i=0;i<n;i++)
        {
          int ele=sc.nextInt();
          in.insert(ele);
        }
        sc.close();
        in.disp();
    }
}