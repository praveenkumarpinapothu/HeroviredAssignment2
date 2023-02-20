package HVassignmentTwo;
import java.util.Arrays;
public class firstQuestion {
    public static void main(String[] args) {
        int sum = 0;
        int[] x = {25,35,12,4,36,48};
        int i = 0;
        while(i < x.length) {
            sum += x[i];
            x[i] = sum;
            i++;
        }
        System.out.println(Arrays.toString(x));
    }
}