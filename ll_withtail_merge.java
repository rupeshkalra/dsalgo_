import java.util.*;

class ll_withtail_merge
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
    Node head2;
    Node tail2;
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
    public void insert2(int d)
    {
         Node ele=new Node(d);
         if(head2==null)
         {
           head2=ele;
           tail2=ele;
           ele.next=head2;
         }
         else{
            
            tail2.next=ele;
            tail2=ele;
            tail2.next=head2;
         }
    }
    public void disp()
   {
      Node curr =head;
      if(curr==null)
      {
          System.out.print("empty");
      }
      else{System.out.println("elements after merge are:");
      do{   
        System.out.print(curr.data+" ");  
        curr= curr.next;  
        }while(curr!= head); 
      }
   }
   public void merge()
   {  
       tail.next=head2;
       tail2.next=head;
   }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter size of first list:");
        int n=sc.nextInt();
        ll_withtail_merge ob= new ll_withtail_merge();
        for(int i=0;i<n;i++)
        {
            int el=sc.nextInt();
            ob.insert(el);
        }
        System.out.println("Enter size of second list:");
        int n2=sc.nextInt();
        for(int t=0;t<n2;t++)
        {
          int e=sc.nextInt();
          ob.insert2(e);
        }
        ob.merge();
        ob.disp();
        sc.close();
    }    
}