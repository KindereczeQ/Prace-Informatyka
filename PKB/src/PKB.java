
import java.util.Scanner;

public class PKB {
	public static void showEverything(int[] pkb) {
		for (int i = 9; i < pkb.length && i != -1; i--) {

			System.out.println("200" + i + " " + "rok" + " " + "-" + " " + pkb[i] + " mln z³");
		}
	}

	public static void showOne(int[] pkb) {
		Scanner read = null;
		try {
			read = new Scanner(System.in);
			System.out.print("Wybierz rok: 200");
			int year = read.nextInt();

			if (year <= 9) {
				System.out.println("200" + year + " rok" + " - " + pkb[year] + " mln z³");
			} else {
				System.out.println("Podano z³y rok!");
			}
		} finally {
			if (read != null)
				read.close();
		}
	}

	public static void showMaximum(int[] pkb) {

		for (int i = 9; i < pkb.length; i++) {

			System.out.println("Najwy¿sza wartoœæ PKB" + " - " + pkb[i] + " mln z³ " + "[200" + i + " " + "r.]");
		}

	}

	public static void showMinimum(int[] pkb) {
		for (int i = 0; i < pkb.length && i != -1; i--) {

			System.out.println("Najwy¿sza wartoœæ PKB" + " - " + pkb[i] + " mln z³ " + "[200" + i + " " + "r.]");
		}

	}

	public static void showMean(int[] pkb) {

		int sum, i;
		float mean = pkb.length;

		sum = 0;

		for (i = 0; i < mean; i++) {
			sum += pkb[i];
		}
		System.out.println("Œrednia wartoœæ PKB - " + sum / mean + " mln z³");
	}

	public static void main(String[] args) {

		int pkb[] = { 19527, 20391, 21203, 22148, 24438, 25955, 28056, 31158, 33741, 35966 };

		showEverything(pkb);
		showOne(pkb);
		showMaximum(pkb);
		showMinimum(pkb);
		showMean(pkb);

	}

}
