import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresar primer valor: ");
            int primerValor = scanner.nextInt();

            System.out.print("Ingresar segundo valor: ");
            int segundoValor = scanner.nextInt();

            System.out.print("Ingresar operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);

            int resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = calculadora.sumar(primerValor, segundoValor);
                    break;
                case '-':
                    resultado = calculadora.restar(primerValor, segundoValor);
                    break;
                case '*':
                    resultado = calculadora.multiplicar(primerValor, segundoValor);
                    break;
                case '/':
                    resultado = calculadora.dividir(primerValor, segundoValor);
                    break;
                default:
                    System.out.println("Operación no válida. Saliendo del programa.");
                    continuar = false;
                    break;
            }

            if (continuar) {
                System.out.println("Resultado: " + resultado);

                if (resultado < 0) {
                    System.out.println("El resultado es negativo, ten cuidado!");
                }

                if (resultado > 1000) {
                    System.out.println("El resultado es un número grande");
                }
            }
        }

        scanner.close();
    }
}

