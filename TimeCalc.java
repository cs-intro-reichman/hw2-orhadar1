public class TimeCalc {
    public static void main(String[] args) {
        String[] time = args[0].split(":");
        int hours = Integer.parseInt(time[0]);
	    int minutes = Integer.parseInt(time[1]); 
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalminutes = (hours * 60) + minutes + minutesToAdd ;
        int totalhours = totalminutes / 60 ;
        int newhours = totalhours % 24 ;
        int newminutes = totalminutes - (totalhours * 60);
        System.out.println(newhours + ":" + newminutes);

    }
}
