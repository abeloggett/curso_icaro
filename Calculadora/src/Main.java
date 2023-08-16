public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int primerValor = obtenerEnteroPorConsola("Primer valor: ");
            int segundoValor = obtenerEnteroPorConsola("Segundo valor: ");
            char operacion = obtenerOperacionPorConsola("Operación (+, -, *, /): ");

            int resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = Calculadora.suma(primerValor, segundoValor);
                    break;
                case '-':
                    resultado = Calculadora.resta(primerValor, segundoValor);
                    break;
                case '*':
                    resultado = Calculadora.multiplicacion(primerValor, segundoValor);
                    break;
                case '/':
                    resultado = Calculadora.division(primerValor, segundoValor);
                    break;
                default:
                    System.out.println("Operación no válida");
                    break;
            }

            System.out.println("Resultado: " + resultado);

            if (resultado < 0) {
                System.out.println("El resultado es negativo, ten cuidado!");
            }

            if (resultado > 1000) {
                System.out.println("El resultado es un número grande");
            }
        }
    }

    public static int obtenerEnteroPorConsola(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(System.console().readLine());
    }

    public static char obtenerOperacionPorConsola(String mensaje) {
        System.out.print(mensaje);
        return System.console().readLine().charAt(0);
    }
}
