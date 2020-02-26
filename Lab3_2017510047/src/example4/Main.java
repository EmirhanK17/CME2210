package example4;

public class Main {

	public static void main(String[] args) {
		Clock clk1 = new Clock("14:50");
		System.out.println(clk1.convert());
		Clock clk2 = new Clock("01:40");
		System.out.println(clk2.convert());
	}
}
