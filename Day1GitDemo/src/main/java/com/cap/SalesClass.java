package com.cap;

public class SalesClass {
	int[] arr= {1,2,3,40,50};
	int sum=0;
	public void show() {
	
		// TODO Auto-generated method stub
		for(int num:arr)
		{
			sum+=num;
			System.out.println(num);
		}
		System.out.println(sum);
	}
	
}
