public class Question4 {
    static void main(String[] args) {
        int n = 123321333;

        int count = 0 ;
        while (n > 0) {
            int rem = n % 10 ;
            if ( rem == 3) {
                count++;
            }
            n = n / 10 ;
        }
        System.out.println(count);

    }
}
