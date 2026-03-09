package my_practice;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet <String> objHHS = new HashSet <String>();
		
		objHHS.add("Fire");
		objHHS.add("Wind");
		objHHS.add("Water");
		
		
		if(objHHS.contains("Fire")) {
			System.out.println("yes");
			
		} else {
			System.out.println("no");
		}

	}

}
