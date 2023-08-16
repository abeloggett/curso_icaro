import java.util.Scanner;

 class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int count = 0;

        while (count < 5) {
            System.out.println("Ingresar primer valor: ");
            int primerValor = scanner.nextInt();

            System.out.println("Ingresar segundo valor: ");
            int segundoValor = scanner.nextInt();

            System.out.println("Ingresar operación (+, -, *, /): ");
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
                    return;
            }

            System.out.println("Resultado: " + resultado);

            if (resultado < 0) {
                System.out.println("El resultado es negativo, ten cuidado!");
            }

            if (resultado > 1000) {
                System.out.println("El resultado es un número grande");
            }

            count++;
        }

        scanner.close();
    }
}