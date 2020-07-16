import java.util.*;

public class left_rotation {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int s=sc.nextInt();
       int a[]=new int[s];
       int ss[]=new int[n-s];
       for(int i=0;i<s;i++)
       {
           a[i]=sc.nextInt();
       }   
    for(int j=0;j<n-s;j++)
    {
        ss[j]=sc.nextInt();
    }
    sc.close();
    for(int i=0;i<ss.length;i++)
    {
    System.out.print(ss[i]+" ");
    }
    for(int y=0;y<a.length;y++)
    {
        System.out.print(a[y]+" ");
    }
    }
}
