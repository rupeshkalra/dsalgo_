import java.util.*;
class selection_sort
{
    public void sort(int a[])
    { int min=9999999;
      for(int i=0;i<a.length;i++)
      {
          for(int j=i+1;j<a.length;j++)
          {
              if(a[j]<min)
              {
                  min=a[j];
              }
          }
          int temp =min;
          min=a[i];
          a[i]=temp;
      }
      System.out.println("Array:");
      for(int y=0;y<a.length;y++)
      {   
          System.out.println(a[y]);
      }
    }
    public static void main(String[] args)
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter no. of elements:");
     int n =sc.nextInt();  
     int  a[]=new int[n] ;
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     insertion_sort s= new insertion_sort();
     s.sort(a);
     sc.close();
    }
}