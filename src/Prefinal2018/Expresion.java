package Prefinal2018;

import java.util.List;

public abstract class Expresion {
   public static int valorError = -23;

   public abstract double getValor();
   public abstract Expresion getExpresionInversa();
   public double getValorInverso(){
      return this.getExpresionInversa().getValor();
   }

   public abstract List<Integer> getNumeros();
   public abstract List<String> getOperadores();
}
