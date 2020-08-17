import java.util.*;
class infix_to_prefix
{
    public int prec(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public StringBuilder infixtoprefix(String expression){

        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(expression);
        input.reverse();
        Stack<Character> st = new Stack<Character>();

        char [] charsExp = new String(input).toCharArray();
        for (int i = 0; i < charsExp.length; i++) 
        {
            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            }
            else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }
        for (int i = 0; i <charsExp.length ; i++)
         {
            char c = charsExp[i];
            if(prec(c)>0)
            {
                while(!st.isEmpty() && prec(st.peek())>=prec(c))
                {
                    result.append(st.pop());
                }
                st.push(c);
            }
            else if(c==')')
            {
                char x = st.pop();
                while(x!='('){
                    result.append(x);
                    x = st.pop();
                }
            }
            else if(c=='(')
            {
                st.push(c);
            }
            else
            {
                result.append(c);
            }
        }

        for (int i = 0; i <=st.size() ; i++) {
            result.append(st.pop());
        }
        return result.reverse();
    }

    public static void main(String[] args) {
        String exp = "(a-b/c)*(a/k-l)";
        infix_to_prefix o =new infix_to_prefix();
        System.out.println(o.infixtoprefix(exp));
    }
}