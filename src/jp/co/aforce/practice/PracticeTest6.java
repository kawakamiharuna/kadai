package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {

		//練習問題１
		Random random = new Random();

		int fortune = random.nextInt();

		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;

		case 2:
			System.out.println("中吉です");
			break;

		case 3:
			System.out.println("大吉です");
			break;

		default:
			System.out.println("凶です");
			break;
		}

		//練習問題２
		int x = 1;
		while (x <= 100) {
			if (x % 7 == 0 && x < 97) {
				System.out.print(x + ",");
				x++;
			} else if (x % 7 == 0 && x > 97) {
				System.out.print(x);
			}
			x++;
		}
		System.out.println();

		//練習問題３
		for (int y = 1; y <= 9; y++) {
			for (int z = 1; z <= 9; z++) {
				int i = y * z;
				System.out.print("");
				if (10 > i)
					System.out.print(" ");
				System.out.print(" ");
				System.out.print(i);

			}
			System.out.println();
		}

	}

}
