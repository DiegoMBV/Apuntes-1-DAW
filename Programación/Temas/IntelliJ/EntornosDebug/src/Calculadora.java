public class Calculadora {
    public static void main(String[] args) {

    }
    private final int num1;
    private final int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        int result = num1 + num2;
        return result;
    }

    public int resta() {
        int result = num1 - num2;
        return result;
    }

    public int multiplicacion() {
        int result = num1 * num2;
        return result;
    }

    public int divide() {
        int result = num1 / num2;
        return result;
    }
}
