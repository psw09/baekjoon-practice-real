package com.baekjoon.prac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no10818 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String str = null;		
		str = br.readLine();
		st = new StringTokenizer(str, " ");		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());	
		int C = Integer.parseInt(st.nextToken());
		
		if(A>=B) {
			if(A<=C) {
				System.out.println(A);
			}else if(B>C) {
				System.out.println(B);
			}else {
				System.out.println(C);
			}
		}else if(B>=A) {
			if(B<=C) {
				System.out.println(B);
			}else if(A>C) {
				System.out.println(A);				
			}else {
				System.out.println(C);
			}
		}else {
			System.out.println(C);
		}
			
	}
	
}