import java.util.Scanner;

public class findmax {
public static void main(String[] args)
{
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int max=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		if(a[i]>max)
			max=a[i];
    }
    sc.close();
	System.out.print(max);
}
}
