
class stack_2in_array
{
    int top1, top2;
    static int n=8;
    int a[];
    stack_2in_array()
    {
        top1=-1;
        top2=n;
        a = new int[n];    
    }
    public void push1(int x) 
    { 
        if (top1 < (top2-1)) 
        { 
            a[++top1] = x; 
            System.out.println(x+" pushed in stack 1");  
        } 
        else 
        { 
            System.out.println("Overflow!"); 
        } 
    } 
    public void push2(int x) 
    { 
        if (top1 < (top2-1)) 
        { 
            a[--top2] = x; 
            System.out.println(x+" pushed in stack 2"); 
        } 
        else 
        { 
            System.out.println("Overflow!");  
        } 
    } 
    public void pop1()
    {
        if (top1 >= 0) 
        { 
            int x = a[top1--]; 
            System.out.println(x+" removed from stack 1");
        } 
        else {  
            System.out.println("Stack 1 Underflow!");
        } 
    }
    public void pop2()
    {
        if (top2 < n) 
        { 
            int x = a[top2++]; 
            System.out.println(x+" removed from stack 2");
        } 
        else
        {  
             System.out.println("Underflow! stack 2");
        } 
    }

public static void main(String args[])
{
    
    stack_2in_array s=new stack_2in_array();
        s.push1(1); 
        s.push2(11); 
        s.push2(5); 
        s.push1(3); 
        s.push2(4); 
        s.pop1();
        s.pop1();
        s.pop1();
        
}
}