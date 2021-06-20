//given  number is armstrong
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	static boolean isArmstrong(int n)
	{
		int temp,digits=0,last=0,sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp=n;
		while(temp>0)
		{
			last=temp % 10;
			sum+=(Math.pow(last, digits));
			temp=temp/10;
		}
		if(n==sum)
			return true;                 //if sum and n are equal
		else return false;               //return false isf sum and n are not equal
	}

	public static void main(String[] args) {
		
	int num;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number:");
	num=sc.nextInt();
		if(isArmstrong(num))
		{
			System.out.print("Armstrong ");
		}
		else
		{
			System.out.print("not Armstrong");
		}

	}

}