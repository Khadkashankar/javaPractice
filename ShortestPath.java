public class ShortestPath {
    public static float getShoretestPath(String str) {
        int x=0, y=0;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            //south
            if(ch=='S'){
                y--;
            }
            else if(ch == 'N'){
                y++;
            }
            else if(ch == 'E'){
                x++;
            }
            else{
                x--;
            }

        }
        int  x1 = x*x;
        int y1 = y*y;
        return (float)Math.sqrt(x1 + y1);
     }
    public static void main(String[] args) {
        String str = "NS";

        System.out.println(getShoretestPath(str));
    }
}
