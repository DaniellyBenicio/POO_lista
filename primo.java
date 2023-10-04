//Elabore um código que ao informar um número, imprima se este número é primo.

public class primo {
    public static void main(String[] args) {

    int num = 7;
    int contador = 0;
           
	for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contador+=1;
			}
    }
		
	if (contador == 0 && num > 1) {
		System.out.printf("O número %d é primo!", num);
	} else {
		System.out.printf("O número %d não é primo!", num);
    }
		
    }
}