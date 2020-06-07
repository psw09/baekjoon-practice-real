package com.baekjoon.prac;
import java.util.Scanner;

public class no5543 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int ham = 0;
		int drk = 0;
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			num= sc.nextInt();
			if(num>=100 && num<=2000) {
			arr[i]= num;
			}
		}
		if(arr[0]<arr[1] && arr[0]<arr[2]) {
			ham = arr[0];
		}else if(arr[1]<arr[0] && arr[1]<arr[2]) {
			ham = arr[1];			
		}else {
			ham = arr[2];	
		}
		
		if(arr[3]>arr[4]) {
			drk=arr[4];
		}else {
			drk=arr[3];
		}
		
		System.out.println(ham+drk-50);
	}
	
}