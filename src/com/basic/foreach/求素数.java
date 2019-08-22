package com.basic.foreach;

public class 求素数 {

	/**求3-100之间所有素数
	 * @param args
	 */
	public static void main(String[] args) {
		
		int max=3;
		int min=100;
		countPrime(min,max);
		System.out.println();
		//countPrime(max,min);
	}

	private static void countPrime(int min, int max) {
		if (min>max) {
			int temp=max;
			max=min;
			min=temp;
		}
		int count=0;
		System.out.println(min+"-"+max+"之间的所有素数：");
		for (int i = min; i <= max; i++) {
			boolean isPrime=true;//标志位，true是素数；false不是素数
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				System.out.print(i+" ");
				count++;
				if (count%5==0) {
					System.out.println();
				}
			}
		}
	}

}
