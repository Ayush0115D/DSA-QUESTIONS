public class String5 {
    public static void main(String[] args) {
        String str = "programming";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i) + " appears " + count + " times");
            }
        }
    }
}
