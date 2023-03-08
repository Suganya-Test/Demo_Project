package com.java;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 7543;

int rem = 0;

while(num!=0) {
	
	rem = rem*10+num%10;//0+3=3,30+4=34,340+5=345,3450+7=3457
	num=num/10;
}
System.out.println(rem);
	}

}
