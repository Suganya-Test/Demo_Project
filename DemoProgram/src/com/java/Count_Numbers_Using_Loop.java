package com.java;

public class Count_Numbers_Using_Loop {

	public static void main(String[] args) {
int give = 753856;

int num = 0;

while(give>0) {
	give = give/10;//753856/10=75385,75385/10=7538,7538/10=753,753/10=75,75/10=7,7/10
	
	num++; //1+1+1+1+1+1
}
System.out.println(num);
	}

}
