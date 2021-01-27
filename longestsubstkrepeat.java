import java.util.*;

public class longestsubstkrepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int k=sc.nextInt();
        subs(n,k);
    }
    public static void subs(String n,int k)
    {
          if(n.length()==0)
          return;

          subs(n.substring(0, n.length()-1),k);
          
          System.out.println(n);
        }
}
