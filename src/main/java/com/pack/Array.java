package com.pack;

import java.util.Arrays;

public class Array {

	int ar[]; 
	
	public String createArray(int a) {
		 ar =  new int[a];
		
		return "Array is Created";
	}
	
	/*public void addValue(int val,int ind) {
		
		if(ind<=ar.length-1) {
			ar[ind] = val;
		}
		
	}*/
public void addValue(int x) {
		int a;
		for(int i=0;i<ar.length;i++)
		{
			 a=(x*(i+1));
			 ar[i]=a;
			
		}	
	}
	public String readArray() {
		return Arrays.toString(ar);
	}
}
