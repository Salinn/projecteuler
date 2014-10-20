/**
 * Created by salinn on 10/20/14.
 */
public class problem6 {
    public static void main(String args[]){
        long sum_of_squares = 0;
        long square_of_sums = 0;

        sum_of_squares = sum_of_squares();
        square_of_sums = square_of_sum();

        System.out.println(square_of_sums-sum_of_squares);

    }
    public static long sum_of_squares(){
        long total = 0;
        for(int i=1; i<101;i++){
            total += (i*i);
        }
        return total;
    }

    public static long square_of_sum() {
        long total = 0;
        for(int i=1; i<101;i++){
            total += i;
        }
        total = total * total;
        return total;
    }
}
