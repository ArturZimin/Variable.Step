package tasks;

import java.util.Scanner;

public class PracticalTasks3Variable {

	public static void main(String[] args) {

		/**
		 * ������� 1 �������� �� ����� ������� �Fall seven times and stand up eight� ��
		 * ������ �������. ������ ������: Fall seven times and stand up eight.
		 */

		Scanner sc = new Scanner("Fall seven times \n" + "and stand  \n" + "up eight.");

		String s = sc.nextLine();
		System.out.println(s);
		s = sc.nextLine();
		System.out.println(s);
		s = sc.nextLine();
		System.out.println(s);

		/**
		 * ������� 2 �������� �� ����� ������� �"Your time is limited, so don�t waste it
		 * living someone else�s life" Steve Jobs� �� ������ �������. ������ ������:
		 * "Your time is limited, so don�t waste it living someone else�s life" Steve
		 * Jobs
		 */
		StringBuilder sb = new StringBuilder();
		sc = new Scanner("Your time is limited,\n\t" + " so don�t waste it \n\t\t"
				+ " living someone else`s life \n\t\t\t" + " Steve Jobs.");

		while (sc.hasNextLine()) {
			String str1 = sc.nextLine();
			System.out.println(str1);
		}

		/**
		 * ������� 3 ������������ ������ � ���������� ��� �����. ���������� ����� �����
		 * �����, ������� �����, ������������ �����. ��������� ���������� ������� ��
		 * �����.
		 */

		System.out.println("Enter 1 number ");
		sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int oneNumber = sc.nextInt();
			System.out.println("Enter 2 number ");
			int twoNumber = sc.nextInt();
			int temp;
			if (oneNumber > twoNumber) {
				temp = oneNumber;
			} else {
				temp = oneNumber;
				oneNumber = twoNumber;
				twoNumber = temp;
			}
			int sum = oneNumber + twoNumber;
			System.out.println("Sum of two numbers: " + sum);
			int differenceNumber = oneNumber - twoNumber;
			System.out.println("Difference of number:  " + differenceNumber);
			int productNumbers = oneNumber * twoNumber;
			System.out.println("Product of numbers:  " + productNumbers);
			break;
		}

		/**
		 * ������� 4 ������������ ������ � ���������� ��� �����. ������ ����� � ���
		 * ��������, ������ ����� �������, ������� ���������� ���������. ��������, ��
		 * ����� � ���������� 50 � 10. ��������� ������� �� ����� 10 ��������� �� 50.
		 * ���������: 5
		 */
		System.out.println("Enter 1 number ");
		int one = sc.nextInt();
		System.out.println("Enter percent of number ");
		int percent = sc.nextInt();
		double percentFromNumber = (one / 100.0) * 10;
		int percentNumber = (int) percentFromNumber;
		System.out.println("Percent from number =  " + percentNumber);

		/**
		 * ������� 5 �������� ���������, ����������� ������� ��������. ������������ �
		 * ���������� ������ ������ ������� ��������
		 */
		System.out.println("Enter the size of the first side of the square !");
		int sizeOfSide1 = sc.nextInt();
		System.out.println("Enter the size of the second side of the square !");
		int sizeOfSide2 = sc.nextInt();

		double squareArea = sizeOfSide1 * sizeOfSide2;
		System.out.println("The area of the square is: " + squareArea);
		sc.close();
	}
}
