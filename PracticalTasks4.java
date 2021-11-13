package tasks;

import java.util.Scanner;

public class PracticalTasks4 {

	public static void main(String[] args) {

		/**
		 * ����: �����������, ���� ������, ����������. ����� 2 ������� 1 ������������
		 * ������ � ���������� ��� �����. ���������� ������� �����, ���������� ���
		 * �����. ��������, ���� � ���������� ������� 7, 3, 8, ����� ����� ������������
		 * ����� 738.
		 */

		// 1 solution
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter one digit !");
		int one = sc.nextInt();
		System.out.println("Enter two digit !");
		int two = sc.nextInt();
		System.out.println("Enter three digit !");
		int three = sc.nextInt();
		if (two >= 10 && two <= 99) {
			int numberContainingThePreviousThree = ((one * 100) + two) * 100 + three;
			System.out.println(numberContainingThePreviousThree);
		} else {
			int numberContainingThePreviousThree = (one * 100) + (two * 10) + three;
			System.out.println(numberContainingThePreviousThree);
		}

		// 2 solution System.out.println("Enter one digit !"); int one1 =
		System.out.println("Enter one digit !");
		int one1 = sc.nextInt();
		System.out.println("Enter two digit !");
		int two1 = sc.nextInt();
		System.out.println("Enter three digit !");
		int three1 = sc.nextInt();
		String one2 = Integer.toString(one1);
		String two2 = Integer.toString(two1);
		String three2 = Integer.toString(three1);
		System.out.println(one2 + two2 + three2);

		/**
		 * ������� 2 ������������ ������ � ���������� �����, ��������� �� ������� ����.
		 * ��������� ����� ������������ ����. ��������, ���� � ���������� ������� 1324,
		 * ����� ��������� ������������ 1*3*2*4 = 24.
		 */
		System.out.println("Enter one digit from four number !");

		int digit = sc.nextInt();
		int digit1 = digit % 10;
		digit /= 10;
		int digit2 = digit % 10;
		digit /= 10;
		int digit3 = digit % 10;
		digit /= 10;
		int digit4 = digit % 10;
		int productOfNumbers = digit1 * digit2 * digit3 * digit4;
		System.out.println("Product of number = " + productOfNumbers);

		/**
		 * ������� 3 ������������ ������ � ���������� ���������� ������. ���������
		 * ������� ��������� �������� ������ � ����������, ���������, ����������, ����.
		 */

		System.out.println("Enter the number of meters !");

		int numberMeters = sc.nextInt();
		int cm = numberMeters * 100;
		int dc = numberMeters * 10;
		int mm = numberMeters * 1000;
		double mile = numberMeters / 1609.0;
		System.out.println("In " + numberMeters + " meters : " + cm + " centimeters ");
		System.out.println("In " + numberMeters + " meters : " + dc + " decimeters ");
		System.out.println("In " + numberMeters + " meters : " + mm + " millimeters ");
		System.out.println("In " + numberMeters + " meters : " + mile + " miles ");

		/**
		 * ������� 4 �������� ���������, ����������� ������� ������������. ������������
		 * � ���������� ������ ������ ��������� ������������ � ������ ������. //
		 */
		System.out.println("Enter base size !");
		int baseSize = sc.nextInt();
		System.out.println("Enter height !");
		int height = sc.nextInt();
		double square = 0.5 * baseSize * height;// s=0.5*a*h(������� ������������ ����� ��������� � ������)
		System.out.println("Square of the triangle is : " + square);

		/**
		 * ������� 5 ������������ � ���������� ������ ������������� �����. ����������
		 * ����������� ����� � ���������� ���������. ��������, ���� ������� 4512,
		 * ��������� 2154.
		 */

		System.out.println("Enter a four-digit number !");
		int number = sc.nextInt();
		int reversNumber = 0;
		while (number != 0) {
			int divisionRemenderIs = number % 10;
			number /= 10;
			reversNumber = reversNumber * 10 + divisionRemenderIs;
		}
		System.out.println(reversNumber);
		sc.close();
	}

}
