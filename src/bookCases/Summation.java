package bookCases;

public class Summation {
	public static void main(String args[]) {
		String str[] = {"89","12","10","18"};
		int sum = 0;
		for(int i = 0; i < str.length; i++) {
			int myint = Integer.parseInt(str[i]);
			sum = sum + myint;
		}
		System.out.println("数组中元素之和是：" + sum);
		Charac charac = new Charac();
		System.out.println(charac.str);
		System.out.println(charac.str2);
		System.out.println(charac.str3);
		System.out.println(charac.str4);

	}		
}

