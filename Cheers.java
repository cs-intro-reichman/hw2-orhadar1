public class Cheers {
        
    public static void main(String[] args) {
        String word = args[0].toUpperCase();         
        int times = Integer.parseInt(args[1]);

        
        final String IsAn = "AEFHILMNORSX";

       
        for (char ch : word.toCharArray()) 
        {
            String aoran = (IsAn.indexOf(ch) >= 0) ? "an" : "a"; 
            System.out.println("Give me " + aoran + " " + ch + ": " + ch + "!");
        }

        
        System.out.println("What does that spell?");

        
        String cheer = word + "!!!";
        for (int i = 0; i < times; i++) {
            System.out.println(cheer);
        }
    }
}
