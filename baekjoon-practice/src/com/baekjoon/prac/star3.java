package com.baekjoon.prac;

import java.util.Scanner;

public class star3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		for(int j=0; j<A*2;j++) {
			if((j%2)==0 || j==0) {
				for(int i =0; i<A;i++) {
					if((i%2)==0 || i==0) {
					System.out.print("*");
					}else {
						System.out.print(" ");						
					}
				}
			}else {
				if((j%2)!=0) {
					for(int i =0; i<A;i++) {
							if((i%2)==0 || i==0) {
							System.out.print(" ");
							}else {
								System.out.print("*");						
							}	
					}
				}
			}
			System.out.println("");
		}
	
	}

}
