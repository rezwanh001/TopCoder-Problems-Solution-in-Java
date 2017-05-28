import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class TestTaking {
	static int actual1  = 0, k ;
	//protected int ans = 0;
	public static int findMax(int questions, int guessed, int actual) {
//		int ans  = 0;
		if(guessed == actual){
			actual1 = questions;
		}
		else if ((questions == guessed) && actual == 0 ) {
			actual1 = questions;
		}
		else if ((questions == actual) && guessed == 0) {
			actual1 = questions;
		}
		else {
			k = Math.abs(guessed - actual);
			actual1 = Math.abs(questions - k);
		}
		return actual1;
	}
	
	/**
	public static void main(String[] args){ 
		prln(findMax(7, 2, 3)); 
	}
	
	static void prln(Object anObject){ 
		System.out.println(anObject); 
	}
	*/
	

}
