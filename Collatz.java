public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // הגבול העליון לזרע
        String mode = args[1];             // "v" או "c"
        boolean verbose = mode.equals("v");

        if (verbose) {
            for (int seed = 1; seed <= N; seed++) {
                int x = seed;
                int steps = 0;

                // מדפיסים את הראשון בלי רווח
                System.out.print(x);
                steps = 1;

                // ממשיכים להדפיס עם רווח לפני כל ערך הבא,
                // עד שמגיעים שוב ל-1 אחרי לפחות צעד אחד (כולל seed=1 -> 1 4 2 1)
                while (!(x == 1 && steps > 1)) {
                    if (x % 2 == 0)
					{ 
						x = x / 2;
					}

                    else x = 3 * x + 1;     

                    System.out.print(" " + x);
                    steps++;
                }

                System.out.println(" (" + steps + ")");
            }
        }

    
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}