import java.util.Scanner;

public class Student_Score {
	public static void main (String[] agrs) {
		
		Scanner scan = new Scanner (System.in);
		int n;
		int count;
		int i;
		float avg = 0.0f;
		float sum=0.0f;
				
		
		System.out.print(" Number of the student : ");
		n = scan.nextInt();
		
		for(count=1;count<=n;count++) {
			
			System.out.print("Score of Student N0. "+count+" = ");
			i = scan.nextInt();
			
			sum=sum+i;
			
		}	
			avg = sum/n;
			System.out.print("Average Score = " +avg);
		}
	
		}
		
	


