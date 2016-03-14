package forloop;


/**
 *@file : OddSum.java 
 *@author inhyeon
 *@date 2016. 3. 10.
 *@story
 */
public class OddSumMain {
	public static void main(String[] args){
			
		int sum=0;
		System.out.println("1번째방법");
		for (int i = 0; i <=10; i+=2) {
			
			sum += i;
			
		}
		System.out.println(sum);
		/*System.out.println("2번째방법");
		for (i = 0; i <10; i++) {
			
			if(i % 2 ==1)
			{
			sum += i;
			}
		}
		System.out.println(sum);*/
		
	}

}
