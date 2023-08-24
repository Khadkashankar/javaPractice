import java.util.*;
public class Average {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      float a = sc.nextInt();
      float b = sc.nextInt();
      float c = sc.nextInt();

      float average = (a + b + c) / 3;
      System.out.println(average);
   }   
}
