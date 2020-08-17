import java.util.*;
class infix_to_postfix
{   public int prec(char c)
    {    
           switch(c)
           {
               case '*':
               case '/':
               return 2;

               case '+':
               case '-':
               return 1;

               case '^':
               return 3;
           }
           return -1;
    }
    public String infixtopostfix(String s)
    {  
        String res=new String();
        Stack<Character> st =new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {   
            char e=s.charAt(i);
            if(e=='(')
            {
                st.push(e);
            }
            else if(Character.isLetterOrDigit(e))
            {
                res+=e;
            }
            else if(e==')')
            {
                   while(!st.isEmpty() && st.peek()!='(')
                   {
                       res+=st.pop();
                   }
                   st.pop();
            
            }
            else
            {
                while(!st.isEmpty() && prec(st.peek())>=prec(e))
                {
                    res+=st.pop();
                }
                st.push(e);
            }
        }
        while(!st.isEmpty())
            {
                res+=st.pop();
            }
        return res;
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String l=sc.nextLine();
    infix_to_postfix r= new infix_to_postfix();
    System.out.println(r.infixtopostfix(l));  
    sc.close();   
    }
}