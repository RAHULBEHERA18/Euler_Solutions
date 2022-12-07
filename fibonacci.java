class fibonacci {
    public static void main(String [] args) {
        int a; 
        int b = 0;
        int c = 1;

        for (int i = 0; i < 10; i++) { 
            a = b;
            b = c;
            c = a + b;

            if ( c % 2 == 0) { 
                int sum = 0;
                sum = sum + c;
                System.out.println(sum);
            }
            else {

            }
        }
    }
}