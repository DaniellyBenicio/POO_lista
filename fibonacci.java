public class fibonacci{
    public static void main(String[] args) {

    int n = 13;
    int fib1=0;
    int fib2=1;

    System.out.println("Sequência de Fibonacci!");
    for (int i = 0; i < n; i++){
        System.out.print(fib1 + " "); 
        int aux = fib1;
        fib1 = fib2;
        fib2 = aux + fib2;

        }
    }
}


    /*
    com recursividade

    for (int i = 0; i < n; i++){
        System.out.println(fib(i) + " ");

    }

    }

    public static int fib(int n){
        if (n <= 1){
            return n;
        } else {
            return fib (n - 1) + fib (n - 2);
        }
    }

}
*/
