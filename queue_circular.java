class queue_circular
{
    int front,rear;
    int ar[];
    int size=4;
    queue_circular()
    { ar=new int[size];
      front=-1;
      rear=-1;
    }
    public void enqueue(int x)
    {
               if(front==-1&& rear==-1)
                {
                       front=0;
                       ar[++rear]=x;
                       System.out.println(x+"inserted");
                }
                else if((rear+1)%size==front)
                {
                     System.out.println("overflow!");
                }
                else
                {
                    rear =(rear+1)%size;
                    ar[rear]=x;
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
                 System.out.println(ar[front]+"removed");
                 
                 front=-1;
                 rear=-1;
        }
         else
         {
             System.out.println(ar[front]+"removed");
             front=(front+1)%size;
         }
    }
    public void display()
    {      
        System.out.println("Queue:");
        if(front==-1&&rear==-1)
        {
            System.out.println("empty");
        }
        else{int i=front;
           while(i!=rear)
           {
               System.out.println(ar[i]);
               i=(i+1)%size;
           }
           System.out.println(ar[rear]);
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
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.enqueue(6);
    }
}