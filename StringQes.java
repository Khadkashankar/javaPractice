public class StringQes {
    public static void main(String[] args) {
        String str1 = "shankar";
        String str2 = "shankar";
        
        
        str1.compareTo(str2);
        String fruits[] = { "mango", "apple", "orange" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0)
            largest = fruits[i];
        }
        System.out.println(largest);
    }
}