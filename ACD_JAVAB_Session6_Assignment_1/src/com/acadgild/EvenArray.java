package com.acadgild;

public class EvenArray {

	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=i;
		}
		
		System.out.println("Below are the even numbers from the array:");
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				System.out.println(arr[i]);
			}
		}
		

	}

}
