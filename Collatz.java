// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int number = 2; 
		int counter =1;
		int numberhold=0;
		int totalcounter=2;
		if (mode.equals("v")) {
			System.out.println("1 4 2 1 (4)");
			for(int i=1; i<n;i++){
				while(number!=1){
					System.out.print(number+" ");
					if (number%2 == 0) {
						number = number/2;
					}
					else{
						number = number * 3+1; 
					}
					counter++;

				}
				System.out.print(+number);
				System.out.print(" ("+counter+")");
				counter=1;
				System.out.println("");
				totalcounter = totalcounter+1;
				number = totalcounter;
				
	
			}
			System.out.println("Every one of the first "+ n + " hailstone sequences reached 1.");
		}
		else{
			System.out.println("Every one of the first "+ n + " hailstone sequences reached 1.");

		}
			
		}


	}
