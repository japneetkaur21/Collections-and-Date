import java.util.ArrayList;
import java.util.List;

public class Define_list_and_insert_5_floating_point_numbers {
    public static void main(String[] args) {

        List<Float> listFloat = new ArrayList<>();
        listFloat.add(3.14f);
        listFloat.add(2.76f);
        listFloat.add(6.45f);
        listFloat.add(4.3f);
        listFloat.add(3.76f);

        float sum = 0;
            for (Float i : listFloat) {
                sum += i;
            }
        System.out.println("The sum of 5 float numbers is: "+ sum);
        }
    }