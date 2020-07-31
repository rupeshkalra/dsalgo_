import java.util.*;

class ll_withtail_delete
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
      else{System.out.println("elements after deletion are:");
      do{   
        System.out.print(curr.data+" ");  
        curr= curr.next;  
        }while(curr!= head);  
      }
   }
   public void delete(int d)
   {
    int flag=0;
        
         Node curr=head;
         Node prev;
         if(curr.data==d)
         { 
            head=curr.next;
            tail.next=head;
         }
         else{ 
                while(curr.next!=head)
                {    
                 prev =curr;
                 curr=curr.next;
                 if(curr.data==d)
                {   
                    prev.next=curr.next;
                    flag=1;
                    break;
                }
                }
             }
              if(flag==0)
              {
                  System.out.println("not found!");
              }
              
         }
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ll_withtail_delete in =new ll_withtail_delete();
        for(int i=0;i<n;i++)
        {
          int ele=sc.nextInt();
          in.insert(ele);
        }
        System.out.println("Enter element to delete:");
        int k =sc.nextInt();
        in.delete(k);
        sc.close();
        in.disp();
    }
}