package com.javaassignment;

public class BubbleSort {
	public static void main(String[] args) {

		int [] arr= {10,-25,-60,45,62};
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<arr.length ;j++) {
				
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
			}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	 }
