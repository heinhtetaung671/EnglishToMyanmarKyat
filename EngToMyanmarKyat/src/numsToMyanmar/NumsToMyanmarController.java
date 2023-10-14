package numsToMyanmar;

import java.util.Scanner;

public class NumsToMyanmarController extends NumsToMyanmar {

	Scanner sc = new Scanner(System.in);

	public String showMessage(String str) {
		
		System.out.println(str);
		return sc.nextLine();

	}

	public String chgNum(char ch) {
//		if (Character.getNumericValue(ch) == 0) {
//			return "";
//		}
		return getNums()[Character.getNumericValue(ch)];

	}

	public String chgMyn(int i) {

		return getMyan()[((getUserInput().length() - 1) - i)];

	}

	public void run() {
		do {
			setUserInput(showMessage("enter a price that u want to change to MYANMAR KYATS : "));
			for (int c = 0; c < getUserInput().length(); c++) {
				if (getUserInput().charAt(c) == ' ') {
					System.out.println("you entered space, please retype.");
					setUserInput(showMessage("enter a price that u want to change to MYANMAR KYATS : "));
				}
				if(getUserInput().charAt(c) == '.') {
					System.out.println("this system can't calculate decimal prices, please retype.");
					setUserInput(showMessage("enter a price that u want to change to MYANMAR KYATS : "));
				}

			}

			if (getUserInput().length() > 6) {
				System.out.println("SORRY, this system can't calculate more than 999999.");
				setUserInput(showMessage("enter a price that u want to change to MYANMAR KYATS : "));
			}
			if (Character.getNumericValue(getUserInput().charAt(0)) < 0) {
				System.out.println("you entered less than or equal 0, please retype.");
				setUserInput(showMessage("enter a price that u want to change to MYANMAR KYATS : "));
			}
			for (int i = 0; i < getUserInput().length(); i++) {

				if (Character.getNumericValue(getUserInput().charAt(i)) != 0) {
					setOutPut(getOutPut() + chgNum(getUserInput().charAt(i)));
					setOutPut(getOutPut() + chgMyn(i));
				}

			}
			
			System.out.println(getOutPut());
			setOutPut("");
		} while (showMessage("do you want to restart?(enter \"y\" for yes)").equalsIgnoreCase("y"));

	}

}
