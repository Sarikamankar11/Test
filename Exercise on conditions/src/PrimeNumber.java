//print first 13 prime numbers
public class PrimeNumber 
{
	public static void main(String[] args) {
		int ct=0,n=0,i=1,j=1;
				while(i<=13)
				{
					j=1;
					ct=0;
					while(j<=i)
					{
						if(i % j==0)
							ct++;
							j++;
					}
					if(ct==2)
					{
					
						System.out.printf(" %d ",i);
						n++;
					}
						i++;
					}
				}
	}


