package ua.com.foxminded.integerdivision;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divider;

		System.out.println("Enter the dividend:");
		dividend = scanner.nextInt();
		System.out.println("Enter the divider:");
		divider = scanner.nextInt();

		scanner.close();

		IntegerDivision integerDivision = new IntegerDivision();

		ArrayList<ArrayList<Integer>> result = integerDivision.divide(dividend, divider);

		DivisionFormatter formatter = new DivisionFormatter();

		System.out.println(formatter.format(result, dividend, divider));
	}

}