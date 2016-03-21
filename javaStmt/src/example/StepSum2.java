package example;

public class StepSum2 {
	public static void main(String[] args) {
		int i=0, j=0, sum=0;
		
		for ( i = 1; i <=100; i++) {
			j=i%2;
			if(j==0){//짝수
				sum = sum-i;
				//System.out.println(sum);
			}
			else
			{
				sum=sum+i;
				//System.out.println(sum);
			}
			
		}
		System.out.println(sum);
	}

}
