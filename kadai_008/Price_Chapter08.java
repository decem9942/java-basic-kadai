package kdai_008;

import java.util.Scanner;

public class Price_Chapter08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("年齢を入力してください:");
		int age = scanner.nextInt();

		double fee = calculateFee(age);

		System.out.println("年齢: " + age);
		System.out.println("料金: " + fee + " 円");

		scanner.close();
	}

	public static double calculateFee(int age) {
		int fee = 0;
		switch (age) {
		case 10 -> fee = 1000;
		case 20 -> fee = 2000;
		case 30, 40 -> fee = 3000;
		case 50, 60, 70 -> fee = 4000;
		case 80 -> fee = 5000;
		default -> fee = 500;
		}
		return fee;

	}
}
