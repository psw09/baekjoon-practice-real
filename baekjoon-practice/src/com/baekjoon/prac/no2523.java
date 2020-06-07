package com.baekjoon.prac;
import java.util.Scanner;


public class no2523 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int j;
		for(j =1; j<=A;j++) {
			for(int i =0; i<j;i++)	{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(j=A-1; j>0;j--) {
			for(int i =j; i>0;i--)	{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
}