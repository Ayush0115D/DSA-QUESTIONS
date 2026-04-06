 import java.util.HashMap;
public class Array8 {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                System.out.println("Indices: " + map.get(diff) + ", " + i);
                return;
            }

            map.put(arr[i], i);
        }
    }
}   

