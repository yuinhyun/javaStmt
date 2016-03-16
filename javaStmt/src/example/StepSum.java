package example;

public class StepSum {
	public static void main(String[] args) {
		
		int i=0, j=0, sum=0;
		
		for ( i = 1; i <= 100; i++) 
		{
			if (i<100)
			{		
				j=j+i;
				//System.out.println(j);
			}
			else
			{
					sum=j+i;
			}
				
		}
		System.out.println(sum);
		
	}

}
