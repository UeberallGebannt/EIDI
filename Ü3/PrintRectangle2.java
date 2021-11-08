class PrintRectangle2
{
    public static void main(String[] args) {
        int n = 3;
        
        if (n < 1) {
            System.out.println("Fehler!");
        } else {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("");
                    for (int j = 0; j < n; j++) {
                        if (i%2 == 0) {
                            System.out.print("**");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }
        }
    
    }
}
    
