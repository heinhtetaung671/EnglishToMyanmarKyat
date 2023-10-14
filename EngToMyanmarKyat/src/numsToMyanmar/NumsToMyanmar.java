package numsToMyanmar;

public abstract class NumsToMyanmar {

	private String userInput;
	private String outPut = "";
	private String[] myan = { "ကျပ်", "ဆယ်", "ရာ", "ထောင်", "သောင်း", "သိန်း" };
	private String[] nums = { "" , "တစ်", "နှစ်", "သုံး", "လေး", "ငါး", "ခြောက်", "ခုနှစ်", "ရှစ်", "ကိုး" };

	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public String[] getMyan() {
		return myan;
	}

	public String[] getNums() {
		return nums;
	}

	public String getOutPut() {
		return outPut;
	}

	public void setOutPut(String outPut) {
		this.outPut = outPut;
	}

	public abstract String showMessage(String str);
	public abstract String chgNum(char ch);
	public abstract String chgMyn(int i);
	public abstract void run();
}
