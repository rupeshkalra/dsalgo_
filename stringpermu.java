import java.util.*;
public class stringpermu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        perm(s,"");
        sc.close();
    }
    public static void perm(String s,String osf)
    {
        if(s.length()==0)
        {
            System.out.println(osf);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String ros =s.substring(0, i)+s.substring(i+1);
            perm(ros, osf+ ch);
        }
    }
}
