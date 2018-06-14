
public class methodEX {
	
	//the parameter weekday is true if it is weekday and parameter is true if we are on vacation,
	//we sleep in if is not a weekday
	//vacation Return true if we are sleep in
	//sleepIn F F -T
	//T F - F
	//F T - T
	
	
	
	
	public static void main (String[] args) {
		
		System.out.println(sleepIn(false,false));
		System.out.println(sleepIn(true,false));
		System.out.println(sleepIn(false,true));
		
		
		
	}
	
	public static boolean sleepIn(boolean weekday , boolean vacation) {
		if (weekday== true && vacation == false) {
			return false;
		}else {
			return true;
		}
	}
	

}
