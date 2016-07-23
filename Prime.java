package Guvi2;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int count=0;
		if(a==0 || a==1)
		{
			System.out.println("The number "+a+" is neither a prime nor a composite number");
		}
		else
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					count=1;
					break;
				}
			}
		}
		if(count==0)
		{
			System.out.println("The number "+a+" is a prime number");
		}
		else
		{
			System.out.println("The number "+a+" is not a prime number");
		}

	}

}
