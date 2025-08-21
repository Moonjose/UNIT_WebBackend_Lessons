package ATV_001;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FirstAlgorithm();
        //SecondAlgorithm();
        //ThirdAlgorithm();
        //FourthAlgorithm();
        //FifthAlgorithm();
        //SixthAlgorithm();
    }

    public static void FirstAlgorithm() {
        double num1 = Math.random() * 10, num2 = Math.random() * 10, num3 = Math.random() * 10;

        double med = (num1 + num2 + num3) / 3;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Num3: " + num3);
        System.out.println("Média: " + med);
    }

    public static void SecondAlgorithm() {
        int num4 = 10, num5 = 7;

        System.out.println("Resultado Exato: " + (double) num4 / (double) num5);
        System.out.println("Parte Inteira: " + num4/num5);
        System.out.println("Resto: " + num4 % num5);
    }

    public static void ThirdAlgorithm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de carros vendidos: ");
        int carAmount = scanner.nextInt();

        System.out.println("Digite o valor total de vendas: ");
        double sellTotalAmount = scanner.nextDouble();

        System.out.println("Digite o valor do salário: ");
        double salary = scanner.nextDouble();

        System.out.println("Digite a quantida da comissão por carro: ");
        double saleComission = scanner.nextDouble();

        double finalSalary = salary + (carAmount * saleComission) + (0.05 * sellTotalAmount);
        System.out.printf("Valor do salário final: R$ %.2f%n", finalSalary);
    }

    public static void FourthAlgorithm() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número a ser verificado: ");
        int numberToCheck = scanner.nextInt();

        if(numberToCheck > 0) {
            System.out.println("O numero é POSITIVO");
        } else if (numberToCheck < 0) {
            System.out.println("O número é NEGATIVO");
        } else {
            System.out.println("O número é ZERO");
        }
    }

    public static void FifthAlgorithm() {
        for (int i = 1; i <= 10; i ++) {
            for (int k = 1; k <= 10; k++) {
                System.out.println(i + " * " + k + " = " + (i*k));
            }
        }
    }

    public static void SixthAlgorithm() {
        Scanner scanner = new Scanner(System.in);

        int firstValue, secondValue, thirdValue;
        int smaller, bigger, mid;

        System.out.println("Digite o primeiro número: ");
        firstValue = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        secondValue = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        thirdValue = scanner.nextInt();

        if (firstValue < secondValue && firstValue < thirdValue ) {
            smaller = firstValue;
            if(secondValue < thirdValue) {
                mid = secondValue;
                bigger = thirdValue;
            } else {
                mid = thirdValue;
                bigger = secondValue;
            }
        } else if (secondValue < firstValue && secondValue < thirdValue) {
            smaller = secondValue;
            if(firstValue < thirdValue) {
                mid = firstValue;
                bigger = thirdValue;
            } else {
                mid = thirdValue;
                bigger = firstValue;
            }
        } else {
            smaller = thirdValue;
            if (firstValue < secondValue) {
                mid = firstValue;
                bigger = secondValue;
            } else {
                mid = secondValue;
                bigger = firstValue;
            }
        }
        System.out.println("Ordem Crescente: " + smaller + ", " + mid + ", " + bigger);
    }
}
