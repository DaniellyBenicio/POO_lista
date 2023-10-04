public class fatorial {
    public static void main(String[] args) {
        
        int fat = 1;
        int n = 7;

        for (int i = 1; i <=n; i++){
            fat *= i;
        }
        System.out.println(fat);
    }
}
