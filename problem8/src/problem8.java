import java.util.ArrayList;

/**
 * Created by salinn on 10/20/14.
 */
public class problem8 {
    public static void main(String args[]){
        ArrayList<Integer> int_nums = new ArrayList();
        int_nums = return_array();
        System.out.println(largest_product(int_nums));
    }
    public static ArrayList return_array(){
        ArrayList<String> string_nums = new ArrayList();
        ArrayList<Integer> int_nums = new ArrayList();
        string_nums.add("73167176531330624919225119674426574742355349194934");
        string_nums.add("96983520312774506326239578318016984801869478851843");
        string_nums.add("85861560789112949495459501737958331952853208805511");
        string_nums.add("12540698747158523863050715693290963295227443043557");
        string_nums.add("66896648950445244523161731856403098711121722383113");
        string_nums.add("62229893423380308135336276614282806444486645238749");
        string_nums.add("30358907296290491560440772390713810515859307960866");
        string_nums.add("70172427121883998797908792274921901699720888093776");
        string_nums.add("65727333001053367881220235421809751254540594752243");
        string_nums.add("52584907711670556013604839586446706324415722155397");
        string_nums.add("53697817977846174064955149290862569321978468622482");
        string_nums.add("83972241375657056057490261407972968652414535100474");
        string_nums.add("82166370484403199890008895243450658541227588666881");
        string_nums.add("16427171479924442928230863465674813919123162824586");
        string_nums.add("17866458359124566529476545682848912883142607690042");
        string_nums.add("24219022671055626321111109370544217506941658960408");
        string_nums.add("07198403850962455444362981230987879927244284909188");
        string_nums.add("84580156166097919133875499200524063689912560717606");
        string_nums.add("05886116467109405077541002256983155200055935729725");
        string_nums.add("71636269561882670428252483600823257530420752963450");

        for(String current_line: string_nums){
            for(int i = 0; i < current_line.length(); i++){
                int_nums.add(Integer.parseInt(Character.toString(current_line.charAt(i))));
            }
        }
        return int_nums;
    }

    public static long largest_product(ArrayList<Integer> int_nums){
        long largest_num = 0;
        for(int i = 0; i < int_nums.size()-12; i++){
            long temp_num = int_nums.get(i) * int_nums.get(i+1) * int_nums.get(i+2) * int_nums.get(i+3) * int_nums.get(i+4) *
                    int_nums.get(i+5) * int_nums.get(i+6) * int_nums.get(i+7) * int_nums.get(i+8) * int_nums.get(i+9) *
                    int_nums.get(i+10) * int_nums.get(i+11) * int_nums.get(i+12);
            if(largest_num < temp_num){
                largest_num = temp_num;
            }
        }
        return largest_num;
    }
}
