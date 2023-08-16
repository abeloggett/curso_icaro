class Calculadora {
    public int sumar(int operando1, int operando2) {
        return operando1 + operando2;
    }

    public int restar(int operando1, int operando2) {
        return operando1 - operando2;
    }

    public int multiplicar(int operando1, int operando2) {
        return operando1 * operando2;
    }

    public int dividir(int operando1, int operando2) {
        if (operando2 != 0) {
            return operando1 / operando2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
    }
}