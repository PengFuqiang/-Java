package highCode;

public class Override {
	public static void main(String[] args) {
		//����ת��
		Base base = new Sub();
		base.fun(100,50);
		Sub sub = new Sub();
		sub.fun(100,50);
 	}

}
