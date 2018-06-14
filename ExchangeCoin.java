import java.util.Scanner;
public class ExchangeCoin {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		int coin;
		int sum=0;
		int ten=10;
		
		System.out.println("Total Money : ");
		coin = scan.nextInt();
		
		//if (coin/10==0) {
			sum = coin%ten ;
			System.out.println(" Ten coin = "+sum);
			
		}
			
	
		
	}
	

