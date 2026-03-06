package wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		String numStr = "123";
		int num = Integer.parseInt(numStr);
		
		int num2 = 456;
		System.out.println(num + num2);
		
		Integer objNum = 933;
		String strNum = objNum.toString();
		System.out.println(strNum.length());

	}

}
