package ifelse;

//Big b = new Big
//{} :메모리 영역, BigNumber:
public class BigNumber {
		//public BigNumber() {} 생략되있다.
		private int a, b, c, big;
		

		public int getA() {
			return a;
		}


		public void setA(int a) {
			this.a = a;
		}


		public int getB() {
			return b;
		}


		public void setB(int b) {
			this.b = b;
		}


		public int getC() {
			return c;
		}


		public void setC(int c) {
			this.c = c;
		}


		public int getBig() {
			
			return big;
		}


		public void setBig() {
			
			 int temp =a;
			   
		      if (b > temp) {
		         temp = b;
		      } 
		      if(c > temp){
		         temp = c;
		      }
		      this.big = temp;
			
		}


		@Override
		public String toString() {
			return "BigNumber [a=" + a + ", b=" + b + ", c=" + c + ", big=" + big + "]";
		}

			
}



