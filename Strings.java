import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first_name = sc.nextLine();
        String last_name = sc.nextLine();
        String full_name = first_name + " " + last_name;
        System.out.println(full_name);
        System.out.println(full_name.length());

        //print the all letters of full_name using charAt
        for (int i = 0; i < full_name.length(); i++) {
            System.out.println(full_name.charAt(i));
        }
        //1st case s1 > s2 reurn +ve
        //2nd case s1 < s2 reurn -ve
        //3rd case s1‍‍‍‍ == s2 reurn 0
        if (first_name.compareTo(last_name) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");

        }
        //string are immutable. string are not modified, add, changed
    }
}