//Imprima a soma de 1 até 1000.

public class somanum {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <=1000; i++){
            soma += i;
        }
        
        System.out.println("A soma dos números entre 1 e 1000 é: " + soma);
    }
}
