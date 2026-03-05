package my_practice;

public class prc {

	public static void main(String[] args) {
		String val = "This is Java program";
		int count = 0;
		String search = "is";
		
		String[] arrVal = val.split(" ");
		
		for (String s: arrVal) {
			if(s.contains(search)) {
				count++;
			}
		}
		System.out.println("Occurrence of '" + search +"' : " + count);

	}

}
