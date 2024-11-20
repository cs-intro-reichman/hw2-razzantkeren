// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double dividedown = 3;
		double app = 1;
		for(int i = 0; i<num; i++){
			if (i%2==0) {
				app = app-(1/dividedown);
			}
			else{
			app = app+(1/dividedown);
			}
			dividedown = dividedown + 2.0;	

		}
		app = app * 4;
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("approximated:     "+ app);
	}
}
