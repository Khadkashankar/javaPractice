public class stringBuilder {
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();
        // StringBuilder sb = new StringBuilder("Shankar");
        // System.out.println(sb);

        // //print the character at index 0
        // System.out.println(sb.charAt(0));
    

        // //set the character at index 0
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);

        // //insert
        // sb.insert(2, 'Z');
        // System.out.println(sb);

        //delete
        // sb.delete(3, 3);
        // System.out.println(sb);

        sb.append("e");//it doesnot occupy memory.. str= str+ "e"
        sb.append("y");//str= str+ "y"
        sb.append("e");//str= str+ "e"
        System.out.println(sb.length());
    }
}
