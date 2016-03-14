package array;

public class MaxMin {
	private int max, min;
	private Object tempMax;

	

	public void setMaxMin(int[] arr) {
		int tempMax =arr[0], tempMin =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>tempMax)
			{
				tempMax = arr[i];
			}
			
			
			if(tempMin>arr[i])
			{
				tempMin = arr[i];
			}
			this.max=tempMax;
			this.min=tempMin;
		}
		
		
	}



	@Override
	public String toString() {
		return "최대값 최소값 [max=" + max + ", min=" + min + "]";
	}
	
	
	

}
