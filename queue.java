class queue
{   int front,rear;
    int ar[];
    int size=4;
    queue()
    { ar=new int[size];
      front=-1;
      rear=-1;
    }
    public void enqueue(int x)
    {
               if(rear==size-1)
               {
                   System.out.println("overflow!");
               }
               else if(front==-1&& rear==-1)
                {
                       front=0;
                       ar[++rear]=x;
                       System.out.println(x+"inserted");
                }
                else
                {
                     ar[++rear]=x;
                     System.out.println(x+"inserted");
                }
    }
    public void dequeue()
    {
          if(front==-1&&rear==-1)
          {
              System.out.println("empty");
          }
          else if(front==rear)
        {
                 System.out.println(ar[front]+"removed"+" now empty!");
                 
                 front=-1;
                 rear=-1;
        }
         else
         {
             System.out.println(ar[front]+"removed");
             front++;
         }
    }
    public void display()
    {      
        System.out.println("Queue:");
           for(int i=front;i<rear+1;i++)
           {
               System.out.println(ar[i]);
           }
    }
    public void peek()
    {
        System.out.println(ar[front]+" at peek");
    }
    public static void main(String args[])
    {
        queue q=new queue();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(9);
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.enqueue(6);
    }
}