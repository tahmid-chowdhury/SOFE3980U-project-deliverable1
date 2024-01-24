package com.ontariotechu.sofe3980U;

import java.util.Scanner;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary number: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second binary number: ");
        String input2 = scanner.nextLine();
        Binary binary1=new Binary(input1);
        System.out.println( "First binary number is "+binary1.getValue());
        Binary binary2=new Binary(input2);
        System.out.println( "Second binary number is "+binary2.getValue());
        
        LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());
        System.out.println( "The OR of the two binary numbers is "+Binary.or(binary1,binary2).getValue());
        System.out.println( "The AND of the two binary numbers is "+Binary.and(binary1,binary2).getValue());
        System.out.println("Their product is "+Binary.multiply(binary1,binary2).getValue());

        scanner.close();
    }
}