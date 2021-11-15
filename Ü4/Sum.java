public class Sum
{
    public static void main(String[] args) {
        // Variable for the final result
        double sum = 0;
        
        // Should be an input
        int m = 2, n = 3;
        
        // Execute the following code m*m-1 times:
        for (double i = 0; i <= m*m -1; i++) {
            // Execute the following code n-1 times
            for (double j = 1; j <= n; j++) {
                // Add i/2+2*j to the sum
                sum = sum + i/2 + 2*j;
            }
        }
        // Print the sum
        System.out.println(sum);
    }
}
