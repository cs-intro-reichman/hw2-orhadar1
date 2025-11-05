public class Cheers {
        
    public static void main(String[] args) { 
        String word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);

        final String AN_LETTERS = "AEFHILMNORSX";

        for (char ch : word.toCharArray()) {
            boolean needsAn = AN_LETTERS.indexOf(ch) >= 0;
            String prefix = needsAn ? "an " : "a  ";
            System.out.println("Give me " + prefix + ch + ": " + ch + "!");
        }

        System.out.println("What does that spell?");

        String cheer = word + "!!!";
        for (int i = 0; i < times; i++) {
            System.out.println(cheer);
        }
    }
}
