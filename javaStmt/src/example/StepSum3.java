package example;

public class StepSum3 {
	public static void main(String[] args) {
		int i=0, j=0, sum=0;
		
		for (i = 1; i <=99; i++) {
			j=i%2;
			if(j==0)
			{
				sum=sum-i;
				
			}
			else
			{
				sum=sum+i;
			}
			//System.out.println(sum);
		}
		System.out.println(sum);
	}
}
