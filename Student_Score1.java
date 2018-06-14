import java.util.Scanner;
public class Student_Score1 {
	

	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int n;
		int count=1;
		int score;
		int sum=0;
	
		
		while(count<=5) {
			System.out.println("Score of Student No. " +count+ "= ");
			score= scan.nextInt();
		
			
			if (score>100 || score<0 ) {
				
				
				System.out.println(score+ "  is Invalid Score ");
				break;
				
			}	
				
				System.out.println(score+ " is Valid Score ");
				
				count++;
				
				
				sum += score;
				
				
				
				}
		
		System.out.println("Result is = "+sum);
		
			}
	
	
			}
		
			
			
			
			
		
		
		
		
	

