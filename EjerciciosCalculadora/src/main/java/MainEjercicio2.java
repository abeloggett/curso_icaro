public class MainEjercicio2 {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int primerValor = ("Primer valor: ");
            int segundoValor = ("Segundo valor: ");
            char operacion = ("Operación (+, -, *, /): ");

            int resultado = 0;

            switch (operacion) {
                case '+':
                    resultado = suma(primerValor, segundoValor);
                    break;
                case '-':
                    resultado = .resta(primerValor, segundoValor);
                    break;
                case '*':
                    resultado = Calculadora.multiplicacion(primerValor, segundoValor);
                    break;
                case '/':
                    resultado = Calculadora.division(primerValor, segundoValor);
                    break;
                default:
                    System.out.println("Operación no válida. Fin del programa.");
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
    }
}