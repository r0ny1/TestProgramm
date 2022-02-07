package num5;
import java.util.ArrayList;
import java.util.Objects;
/**
 * Задача о сейфе
 */
public class Vault {public static void main(String[] args) {

    Integer[] weight = {1,  2, 3, 4, 5};
    Integer[] price = {2, 3, 9, 5, 8};

    int max_weight = 10;
    int count = price.length;

    Integer[][] table = new Integer[count + 1][];

    for (int i = 0; i < count + 1; i++) {
        table[i] = new Integer[max_weight + 1];
    }

    for (int i = 0; i < count + 1; i++) {
        for (int j = 0; j < max_weight + 1; j++) {
            if(i == 0 || j == 0){
                table[i][j] = 0;
            }
            else{
                if (j >= weight[i-1]){
                    table[i][j] = Math.max(

                            table[i-1][j],

                            table[i-1][j - weight[i-1]] + price[i-1]
                    );
                }
                else {//превышает
                    table[i][j] = table[i-1][j];
                }
            }
        }
    }

    ArrayList<Integer> res = new ArrayList<>();
    findPath(table, weight, res, count, max_weight);
    res.forEach(System.out::println);

}

    private static void findPath(Integer[][] table, Integer[] weight_list, ArrayList<Integer> res, int i, int j){

        if(table[i][j] == 0){
            return;
        }
        if(Objects.equals(table[i - 1][j], table[i][j])){
            findPath(table, weight_list, res, i-1, j);
        }
        else {
            findPath(table, weight_list, res, i-1, j-weight_list[i-1]);
            res.add(i);
        }

    }


}


