import java.util.Scanner;

public class Square {
	// TODO Auto-generated constructor stub
			
	public static void main(String[]args){
				
		Scanner userInput = new Scanner(System.in);
				
		double userNum;
		double userNumRoot;
				
		do{
			System.out.println("Please enter a Positive Number");
			userNum = userInput.nextInt();
			userNumRoot = Math.sqrt(userNum);
					
				
			if (userNum < 0){
				System.out.println("Please Enter A Valid Number");
			}
				
		}while (userNum < 0);
		System.out.println("Your Numbers Square Root is:" + userNumRoot);
	}
		
}
		
		
	


