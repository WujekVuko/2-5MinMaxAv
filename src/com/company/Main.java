package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	int [] pair = new int[2];
	int a;
	Scanner in = new Scanner(System.in);
	System.out.print("Podaj ciąg liczb oddzielonych przecinkami i spacjami, 0 kończy działanie programu:");
	String input = in.nextLine();
	Scanner s = new Scanner(input).useDelimiter("\\u002C\\s");

	    do {
	        a = s.nextInt();
	        if (a == 0){
	            System.out.println(pair[0]);
	            System.out.println(pair[1]);
	            System.out.println(pair[0]+pair[1] + " - suma min. i maks.");
                System.out.println((pair[1]+pair[0])/2 + " - średnia");}
	        else if (pair[0] == 0){pair[0] = a; pair[1] = a;}
	        else if (pair[0] >= a){pair[0] = a;}
	        else if (pair [1] <= a){pair[1] =a;}
            }

        while(a != 0);

    }
}
