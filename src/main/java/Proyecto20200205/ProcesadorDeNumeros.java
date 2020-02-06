/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto20200205;

/**
 *
 * @author aleja
 */
public class ProcesadorDeNumeros {
    public String descomponerNumero(Numero numero){
        String listaDeNumeros = "";
        for (int i = 0; i < numero.getString().length(); i++) {
            listaDeNumeros += numero.getString().charAt(i) + " en la posicion " + i + '\n';
        }
        return listaDeNumeros;
    }
    public String invertirNumero(Numero numero){
        String invertido = "";
        for(int i = numero.getString().length()-1; i>=0; i--){
            invertido+=numero.getString().charAt(i);
        }
        return invertido;
    }
    public int convertirDecimalABinario(Numero numero){
        int binario = conversorDeBases(numero, 2);
        return binario;
    }
    public int convertirCualquierBaseADecimal(Numero numero){
        int decimal = conversorDeBases(numero, 10);
        return decimal;
    }
    public int conversorDeBases(Numero numero, int baseDestino){
        int resultado = 0;
        int valorNumero=numero.getValor();
        int exp = 0;
        if (numero.getBase()==16)
            return conversorHexADecimal(numero);
        while(valorNumero!=0){
            resultado += (valorNumero%baseDestino)*Math.pow(numero.getBase(), exp);
            exp++;
            valorNumero/=baseDestino;
        }
        return resultado;
    }
    public int conversorHexADecimal(Numero numero){
        String Hexdiccionario = "0123456789ABCDEF";
        String numStr = numero.getString();
        numStr = numStr.toUpperCase();
        int decimal = 0;
        for (int i=0; i<numStr.length(); i++){
           char c = numStr.charAt(i);
           int aux = Hexdiccionario.indexOf(c);
           decimal = 16*decimal + aux;
        }
        return decimal;
    }
    public String conversorAsciiATexto(int [] input){
        String mensaje = "";
        for(int i = 0; i<input.length; i++){
            mensaje+= Character.toString((char)input[i]);
        }
        return mensaje;
    }
}
