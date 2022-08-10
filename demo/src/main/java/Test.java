import java.lang.reflect.Array;
import java.util.Arrays;

//Write java function to find number of occurrences of some number in given array of numbers
public class Test {

    public int findOccurrences(int[] arr, int num) {
        //Arrays.sort(arr);
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(num == arr[i]) {
                count++;
            }
        }

        Arrays.stream(arr).filter((i)-> i == num).count();
       // count = (int) arr.stream().count(i: num);

        return count;
    }
}
