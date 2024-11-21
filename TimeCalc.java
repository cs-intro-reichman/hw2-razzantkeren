public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int mintoadd = Integer.parseInt(args[1]);
        int totalmin = hours*60+minutes+mintoadd;
        int totalnewhour = (totalmin/60);
        int hourstoprint = totalnewhour%24;
        int newminutes = totalmin - (totalnewhour*60);
        if (newminutes==0|newminutes<10) {
            if (hourstoprint==0|hourstoprint<10) {
                System.out.println("0"+hourstoprint + ":0"+ newminutes);
            }
            else{
            System.out.println(hourstoprint + ":0"+ newminutes);
            }
        }
        else{
            if (hourstoprint==0|hourstoprint<10) {
                System.out.println("0"+hourstoprint + ":"+ newminutes);
                
            }
            else{
        System.out.println(hourstoprint + ":"+ newminutes);
            }
        }



    }
}
