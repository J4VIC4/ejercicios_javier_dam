import java.util.Scanner;

public class Ejercicios {

    public void ejecicio_inicial (){


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

        int resultado = num1 + num2;

        System.out.println("El resultado es:"+resultado);





    }
}
