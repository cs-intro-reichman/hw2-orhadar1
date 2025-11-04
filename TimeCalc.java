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

        String minutesToPrint = "";
        String hoursToPrint = "";
        if(newhours < 10)
        {
            hoursToPrint = "0" + newhours;
        }
        if(totalhours >= 10){
            hoursToPrint = "" + newhours;
        }
        if( newminutes < 10)
        {
            minutesToPrint = "0" + newminutes;
        }
        if(newminutes >= 10){
            hoursToPrint = "" + newminutes;

        }
            System.out.println(hoursToPrint + ":" + minutesToPrint);

        
         
        
        
        
        // if(totalminutes < 10 && totalhours == 0)
        // {
        //     System.out.println("0" + newhours + ":0" + newminutes);
        //     if(totalminutes < 10 && totalhours != 0)
        //     {
        //         System.out.println(newhours + ":" + newminutes);
        //     }
        // }
        // else System.out.println(newhours + ":" + newminutes);


        

    }
}
