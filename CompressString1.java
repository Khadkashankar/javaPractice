public class CompressString1 {

    public static String compress(String str) {
        StringBuilder compressedStr = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressedStr.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return compressedStr.toString();
    }

    public static void main(String[] args) {
        String str = "abbbccdd";
        System.out.println(compress(str));
    }
}
