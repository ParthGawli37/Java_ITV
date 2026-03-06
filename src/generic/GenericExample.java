package generic;



class Box<T> {
	T val;
	
	void set(T value) {
		val = value;
	}
	
	T get() {
		return val;
	}
	void printArray(T[] arr){
		for(T elm: arr) {
			System.out.println(" " + elm);
		}
	}
}


public class GenericExample {

	public static void main(String[] args) {
		Box<Integer> boxInt = new Box<>();
		boxInt.set(123);
		System.out.println(boxInt.get());
		Integer[] arrInt = {1,2,3,4,5};
		boxInt.printArray(arrInt);
		
		Box<Boolean> boxBool = new Box<>();
		boxBool.set(true);
		System.out.println(boxBool.get());
		
		Box<String> boxStr = new Box<>();
		boxStr.set("India");
		System.out.println(boxStr.get());
		

	}

}
