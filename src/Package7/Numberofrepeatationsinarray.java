package Package7;

import java.util.Scanner;

public class Numberofrepeatationsinarray {

	public static void main(String[] args) {
		// 1. Finding number of repeatations in array
		int a [] = {3,4,5,3,2,3,6,5,4,3,8};
		int num = 6;
		int count = 0;
		for (int x: a) {
			if( x == num) {
				count++;
			}
		}
		System.out.println("The count of the number "+ num +" is "+count);

	}

}
