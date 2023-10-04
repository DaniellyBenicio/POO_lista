public class tabela {
    public static void main(String[] args) {
        int linha = 4;

        for (int i = 1; i <= linha; i ++){
            for (int j = 1; j <= i; j++){
                int num = j * i;
                System.out.print("\t" + num);
            }
            System.out.println();
        }
    }
}
