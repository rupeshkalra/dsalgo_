import java.util.*;
class evaluate_postfix
{
    public int eval(String s)
    {     
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++) 
        { 
            char e=s.charAt(i); 
            if(Character.isDigit(e)) 
            {
                st.push(e-'0'); 
            }  
            else
            { 
                int v1 = st.pop(); 
                int v2 = st.pop(); 
                  
                switch(e) 
                { 
                    case '+': 
                    st.push(v2+v1); 
                    break; 
                    case '-': 
                    st.push(v2- v1); 
                    break; 
                    case '/': 
                    st.push(v2/v1); 
                    break; 
                    case '*': 
                    st.push(v2*v1); 
                    break; 
              } 
            } 
        } 
        return st.pop();   
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        evaluate_postfix ev=new evaluate_postfix();
        System.out.println(ev.eval(s));
        sc.close();
    }
}