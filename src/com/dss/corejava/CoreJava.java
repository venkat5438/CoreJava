package com.dss.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class CoreJava {

	
	public static void main(String[] args) throws IOException {
		/*int [] a=new int[50];
		 a[0]=1;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=6;
		a[5]=7;
		a[6]=8;
		a[7]=9;
		a[8]=10;
		a[9]=11;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		
		Random r= new Random();
		for (int i = 0; i <50; i++) {
			a[i]=r.nextInt(50);
			}
		for (int n:a) {
			System.out.println(n);
		}
	}
*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter some text");//rattaiah
		String firstText=br.readLine();
		System.out.println("enter same text again");//rattaiah
		int secondText=br.read();
		System.out.println("first entered text "+firstText);//rattaiah
		System.out.println("second entered text "+secondText);//114
		
}}
