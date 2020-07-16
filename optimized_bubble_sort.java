import java.util.Scanner;

class optimized_bubble_sort
{
    public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
      }
      sc.close();
      int flag=0;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n-i-1;j++)
		  {
			  if(a[j]>a[j+1])
			  {   flag=1;
				  int temp=a[j];
				  a[j]=a[j+1];
				  a[j+1]=temp;
			  }
          }
          if(flag==0)
          {break;}
	  }
	  
	  for(int i=0;i<n;i++)
	  {
		  System.out.print(a[i]);
	  }
  }
}