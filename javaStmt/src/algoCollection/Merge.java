package algoCollection;

/**
 *@file : Merge.java 
 *@author inhyeon
 *@date 2016. 3. 20.(미완성)
 *@story 배열 A,B에는 정수가 오름차순으로 정렬되어있다.
 *데이터는 10건 미만이다.
 *배열 A,B에서 0이 들어잇는 다음의 요소에는 데이터가 없는 것으로 간주한다.
 *배열 A,B를 병합시켜 배열 C에 기억시키고 맨 마지막에는 0을 기억시킨다.
 *배열 A와 B에 같은 데이터가 있으면 한번 만 C에 옮긴다.
 */
public class Merge {
	public static void main(String[] args) {
		
		int DataA[] = {1, 3, 5, 6, 0};
		int DataB[] = {2, 3, 5, 8, 9, 10, 12, 13, 0};
		int DataC[] = new int[20];
		
		int i=0, j=0, k=0;
		while(i < DataA.length && j < DataB.length)
		{ 
	       if(DataA[i] <= DataB[j])
	       {
	    	   DataC[k++] = DataA[i++];
	       }
	       else
	       {
	    	   DataC[k++] = DataB[j++];
	       }
	    }
		
		 while(i<DataA.length)//첫번째 배열
		 { 
			 DataC[k++] = DataA[i++];
	     }
	       
		 while(j<DataB.length)//두번재 배열
		 {
	         DataC[k++] = DataB[j++];
	     }
		
	    for(int p = 0; p< DataC.length; p++)
	    {
            System.out.print(DataC[p] + "  ");
        }
		
	}
	

}
