import java.util.ArrayList;

/**
 * Created by salinn on 10/15/14.
 */
public class problem3 {
    public static void main(String[] args){
        long number = 600851475143L;
        int prime_number = largest_prime(number);
        System.out.println(prime_number);
    }
    public static int largest_prime(long number){
        int i;
        for(i = 2; i <= number ; i++){
            if(number % i == 0){
                System.out.println("Divdied by " + i);
                number /= i;
                i--;
            }
        }
        return i;
    }
}
