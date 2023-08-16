class Calculadora {

    public int operar(int primerValor, int segundoValor, char operacion) {
        int resultado = 0;
        switch (operacion) {
            case '+':
                resultado = primerValor + segundoValor;
                break;
            case '-':
                resultado = primerValor - segundoValor;
                break;
            case '*':
                resultado = primerValor * segundoValor;
                break;
            case '/':
                resultado = primerValor / segundoValor;
                break;
        }
        return resultado;
    }
}