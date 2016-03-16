package example;

public class StepSum1 {
	public static void main(String[] args) {
		int i=-1, j=0, sum=0;
		
		for (i= 1;  i<=99 ; i+=2) {	
			
			//System.out.println(i);
			if(i<99)
			{	
				j=j+i;
				//System.out.println(j);
			}
			else
			{
				
				sum=i+j;
			}
			
		}
		System.out.println(sum);
		
	}

}
