import java.util.*;
class prefix_to_postfix
{
public boolean isop(char x)  
 { 
    switch (x)  
    { 
        case '+': 
        case '-': 
        case '/': 
        case '*': 
        return true; 
    } 
    return false; 
 } 
   
public String pretopost(String st) 
{ 
    Stack<String> s= new Stack<String>();  
    int length =st.length(); 
    for (int i = length - 1; i >= 0; i--)  
    {  
        if (isop(st.charAt(i)))  
        {  
            String op1 = s.peek(); 
            s.pop(); 
            String op2 = s.peek(); 
            s.pop();
            String temp = op1 + op2 + st.charAt(i); 
   
            s.push(temp); 
        }  
        else
        {  
            s.push(st.charAt(i)+""); 
        } 
    } 
   
    return s.peek(); 
} 
   
public static void main(String args[])  
{ 
    String pre_exp = "*-A/BC-/AKL"; 
    prefix_to_postfix p= new prefix_to_postfix();
    System.out.println("Postfix : " + p.pretopost(pre_exp)); 
} 
}