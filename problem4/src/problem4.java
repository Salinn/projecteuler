import java.util.ArrayList;

/**
 * Created by salinn on 10/15/14.
 */
public class problem4 {
    public static void main(String[] args){
        int largest_palindrome = int_generator();
        System.out.println(largest_palindrome);
    }

    public static int int_generator(){
        int current_largest = 0;
        int ii = 0;
        int jj =0;
        int current_number;
        for(int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                current_number = i * j ;
                if(is_palindrome(current_number)){
                    if (current_number > current_largest) {
                        current_largest = current_number;
                        ii = i;
                        jj = j;
                    }
                }
            }
        }
        System.out.println(ii);
        System.out.println(jj);
        return current_largest;
    }

    public static boolean is_palindrome(int current_number){
        ArrayList current_int = new ArrayList();
        while (current_number > 0) {
            current_int.add(current_number%10);
            current_number/=10;
        }
        int length_of_number = current_int.size() -1;
        for(int i=0; i < length_of_number; i++){
            if (current_int.get(i) != current_int.get(length_of_number-i)){
                return false;
            }
        }
        return true;
    }
}
