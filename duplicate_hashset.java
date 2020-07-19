import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class duplicate_hashset
{
    public static void main(String[] args) 
    {   Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         sc.close();
        Set<Integer> hash = new HashSet<Integer>();
         
        for(int i=0;i<n;i++) 
        {
     
            if(hash.add(a[i]) == false) 
            {
                System.out.println("duplicate "+a[i]);
            }
        }
    }
}