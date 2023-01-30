import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        int repeat=1;
        String operation;
        do{
        System.out.println("Captura operación:");
        Scanner sc = new Scanner(System.in);
        operation = sc.nextLine();
        if(     Objects.equals(operation, "SUMA") ||
                Objects.equals(operation, "RESTA") ||
                Objects.equals(operation, "MULTIPLICACION") ||
                Objects.equals(operation, "DIVISION")) {
            System.out.println("Operando 1:");
            num1=sc.nextInt();
            System.out.println("Operando 2:");
            num2=sc.nextInt();
            switch (operation) {
                case "SUMA" -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case "RESTA" -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case "MULTIPLICACION" -> System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                case "DIVISION" -> {
                    if (num2 != 0) {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("no es posible dividir entre 0");
                    }
                }
            }
        }else{
            System.out.println("Operación no soportada");
            repeat=0;
        }}while (repeat==1);

    }
}