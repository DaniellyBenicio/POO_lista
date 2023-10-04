public class reajustesalarial {
    public static void main(String[] args) {
       
    int salario = 1550;

    double r20 = salario * 0.20;
    double r15 = salario * 0.15;
    double r10 = salario * 0.10;
    double r5 = salario * 0.05;

    int porcentagem = 0;
    double reajuste = 0;
    double aumento = 0;

    if (salario <= 280){
        reajuste = salario + r20;
        aumento = r20;
        porcentagem = 20;
    } else if (salario < 700){
        reajuste = salario + r15;
        aumento = r15;
        porcentagem = 15;
    }else if (salario < 1500){
        reajuste = salario + r10;
        aumento = r10;
        porcentagem = 10;
    } else if (salario >= 1500){
        reajuste = salario + r5;
        aumento = r5;
        porcentagem = 5;
    }

    System.out.println("Salário informado: " + salario);
    System.out.println("O percentual de aumento aplicado: " + porcentagem);
    System.out.println("Valor aumentado: " + aumento);
    System.out.println("Salario com reajuste: " + reajuste);
    }
}
