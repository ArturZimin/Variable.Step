package tasks;

import java.util.Scanner;

public class PracticalTasks4 {

	public static void main(String[] args) {

		/**
		 * Тема: «Переменные, типы данных, операторы». Часть 2 Задание 1 Пользователь
		 * вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти
		 * цифры. Например, если с клавиатуры введено 7, 3, 8, тогда нужно сформировать
		 * число 738.
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
		 * Задание 2 Пользователь вводит с клавиатуры число, состоящее из четырех цифр.
		 * Требуется найти произведение цифр. Например, если с клавиатуры введено 1324,
		 * тогда результат произведения 1*3*2*4 = 24.
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
		 * Задание 3 Пользователь вводит с клавиатуры количество метров. Требуется
		 * вывести результат перевода метров в сантиметры, дециметры, миллиметры, мили.
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
		 * Задание 4 Напишите программу, вычисляющую площадь треугольника. Пользователь
		 * с клавиатуры вводит размер основания треугольника и размер высоты. //
		 */
		System.out.println("Enter base size !");
		int baseSize = sc.nextInt();
		System.out.println("Enter height !");
		int height = sc.nextInt();
		double square = 0.5 * baseSize * height;// s=0.5*a*h(площадь треугольника через основание и высоту)
		System.out.println("Square of the triangle is : " + square);

		/**
		 * Задание 5 Пользователь с клавиатуры вводит четырёхзначное число. Необходимо
		 * перевернуть число и отобразить результат. Например, если введено 4512,
		 * результат 2154.
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
