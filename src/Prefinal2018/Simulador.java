package Prefinal2018;

public class Simulador {
    public static void main(String[] args) {

Expresion num2 = new Numero(2);
Expresion num3 = new Numero(3);
Expresion num5 = new Numero(5);

Expresion suma = new Suma(num2, num3);

Expresion multiplicar = new Multiplicacion(suma, num5);
        System.out.println(multiplicar);
        System.out.println(multiplicar.getValor());
        System.out.println(multiplicar.getExpresionInversa()+"="+multiplicar.getValorInverso());

        System.out.println(multiplicar.getNumeros());
        System.out.println(multiplicar+"="+ multiplicar.getValor());
        System.out.println(multiplicar.getOperadores());

    }
}
