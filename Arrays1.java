public class Arrays1{
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2};

        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}