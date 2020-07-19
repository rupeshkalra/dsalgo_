import java.util.*;

class binary_search
{
    public static void main(String[] args) 
    {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
                 a[i]=sc.nextInt();
         }    
         int x=sc.nextInt();
         sc.close();
         int up=n-1,flag=0,low=0,mid=0;
        while(low<=up)
        {
           mid=(low+up)/2;
           if(a[mid]==x)
           {flag=1;
        break;}
           else if(a[mid]>x)
           {up = mid-1;}
           else
           {
               low=mid+1;
           }
        }
        if(flag==0)
        System.out.print("not found");
        else
        System.out.print("found at"+" "+mid);
    }
}