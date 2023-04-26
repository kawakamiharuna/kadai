package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String args[]) {
		//連取問題２
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");

		//練習問題３
		String animal = animals.get(3);
		if (animals.contains(animal)) {
			System.out.println(animal + "はリストに含まれています。");
		} else {

			System.out.println(animal + "はリストに含まれていません。");
		}

		//練習問題4
		Calendar calendar = Calendar.getInstance();
		calendar.getTime();
		int dayOfMonth = calendar.get(Calendar.MONTH);

		switch (dayOfMonth) {

		case 0:
			System.out.println("冬物セール");
			break;

		case 1:
			System.out.println("春物を売る");
			break;

		case 2:
			System.out.println("春物を売る");
			break;

		case 3:
			System.out.println("春物を売る");
			break;

		case 4:
			System.out.println("春物セール");
			break;

		case 5:
			System.out.println("夏物を売る");
			break;

		case 6:
			System.out.println("夏物を売る");
			break;

		case 7:
			System.out.println("夏物セール");
			break;

		case 8:
			System.out.println("秋物を売る");
			break;

		case 9:
			System.out.println("冬物を売る");
			break;

		case 10:
			System.out.println("冬物を売る");
			break;

		case 11:
			System.out.println("冬物を売る");
			break;
			
		default:
			System.out.println("不正な月です");
			break;
		}

	}
}
