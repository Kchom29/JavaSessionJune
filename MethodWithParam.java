
public class MethodWithParam {
	
	public static void main (String [] args) {
		
		getOne();
		System.out.println(getAll(4,4));
		
		while (i<10) {
			
			System.out.println(whileLoop(i));
			i++;
		}
		
		
		
		
	}
	
	public static void getOne() {
		
		System.out.println("method Test");
		
		
	}
	
	public static int getAll (int a, int b) {
		
		return a + b;
	}
	
	public static int whileLoop (int i) {
		return i;
		
		
	}

}
