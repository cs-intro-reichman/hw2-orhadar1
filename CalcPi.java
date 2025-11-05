// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args) { 
        int n = Integer.parseInt(args[0]);
        double sum = 1;
        double divide = 3;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + (1 / (divide)); 
                divide = divide + 2;
            } else {
                sum = sum - (1 / (divide));
                divide = divide + 2; 
            }
        }
        System.out.println("pi according to Java: " + Math.PI);
        System.out.printf("pi, approximated: %22.15f%n", sum * 4);
    }
}