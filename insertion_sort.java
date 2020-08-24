import java.util.*;
class insertion_sort
{   
    public void sort(int a[])
    { 
      for(int i=0;i<a.length;i++)
      {
             int val=a[i];
             int j=i-1;
             while(j>=0&&a[j]>=val)
             {
                 a[j+1]=a[j];
               j--;
             }
             a[j+1]= val;
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