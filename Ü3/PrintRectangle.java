public class PrintRectangle {
    public static void main(String[] args) {
        int n = 3;
        
        if (n < 1) {
            System.out.println("Fehler!");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println("");
                for (int j = 0; j < 2*n; j++) {
                    System.out.print("*");
                }
            }
        }        
    }
}
