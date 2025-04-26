import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        Calculadora cal = new Calculadora(10,20);
        int exprespu = 30;
        int resultado = cal.suma();
        assertEquals(exprespu,resultado);
    }

    @org.junit.jupiter.api.Test
    void resta() {
        Calculadora cal = new Calculadora(20,10);
        int exprespu = 10;
        int resultado = cal.resta();
        assertEquals(exprespu,resultado);
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        Calculadora cal = new Calculadora(10,20);
        int exprespu = 200;
        int resultado = cal.multiplicacion();
        assertEquals(exprespu,resultado);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculadora cal = new Calculadora(2,2);
        int exprespu = 1;
        int resultado = cal.divide();
        assertEquals(exprespu,resultado);
    }
}