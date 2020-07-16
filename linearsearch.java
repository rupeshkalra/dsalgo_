import java.util.*;
class linearsearch
{
 public static void main(String[] args)
 {  Scanner sc =new Scanner (System.in);
     int n = sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
     }
     int x=sc.nextInt();
     sc.close();
     int j;
     int flag=0;
     for(j = 0; j < n; j++) 
    { 
        if(a[j] == x) 
          { 
            flag=1;
        break;}
    } 
    if(flag==1)
    System.out.print("found at"+" "+j);
    else
    System.out.print("not found");
 }
}