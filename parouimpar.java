public class parouimpar {
    public static void main(String[] args) {
        int x = 13;

        while(x > 1){
            if (x % 2 == 0){
                x = x/ 2;
            } else {
                x = 3 * x + 1;
            }
            int novox = x;
            System.out.println(novox + "");
        }
    }
    
}
