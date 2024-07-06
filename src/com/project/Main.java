package com.project;

public class Main 
{
	public static void main(String[] args) 
	{
		//Linear Search : Iterate through a collection one element at a time.
		
		int[] array = {0,1,2,3,4,5,6};
		int index = linearSearch(array,1);
		
		if(index==-1) System.out.println("Element not found");
		else System.out.println("Element found at index : " + index +" & position : " + (index+1));

	}

	private static int linearSearch(int[] array, int value) 
	{
		for (int i=0; i<array.length; i++)
		{
			if (array[i]==value) return i;
		}
		return -1;
	}

}
