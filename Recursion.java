public class Recursion {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }
public static void printSum(int n, int sum) {
if(n == 0) {
System.out.println(sum);
return;
}
sum += n;
printSum(n-1, sum);
}
    public static void main(String[] args) {
        printNumbers(5); // You can change 5 to any number you want to test
        printSum(5, 0); // You can change 5 to any number you want to test
    }
}
