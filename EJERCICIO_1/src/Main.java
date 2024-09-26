import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Como te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("A que curso vas?");
        String curso = entrada.next();

        System.out.println("Hola" + nombre + "Bienvenido a" + curso + ".");

        System.out.println("Introduce un número ");
        int num1 = entrada.nextInt();

        System.out.println("Introduce otro número ");
        int num2 = entrada.nextInt();

        while (num1 == 0 || num2 == 0) {
            {

                System.out.println("Introduce otro número ");


            }
        }
    }
}