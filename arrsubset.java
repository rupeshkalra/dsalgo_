import java.util.*;
public class arrsubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         subst(a,0,n,"");
         sc.close();
    }
    public static void subst(int [] a,int i,int n,String osf)
    {
        if(i==n)
        {
            System.out.println("["+osf+"]");
            return;
        }
        
        subst(a,i+1,n,osf+(Integer.toString(a[i])));
        subst(a,i+1,n,osf);
    }
}
