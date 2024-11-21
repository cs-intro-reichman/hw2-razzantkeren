// Computes an approximation of PI.

public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		double dividedown = 3;
		double app = 1;
		if (num==1) {
			System.out.println("pi according to Java: 3.141592653589793");
            System.out.println("pi, approximated:     " + (app * 4.0));
		}
		else{
			boolean check = true;
		for(int i = 1; i<num; i++){
			if (check) {
				app = app-(1/dividedown);
			}
			else{
			app = app+(1/dividedown);
			}
			dividedown = dividedown + 2;
			check=!check;	

		}
		double a = app * 4;
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:     "+ a);
	}
}
}
