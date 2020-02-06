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
public class Numero {
     private int Valor;
    private int Base;
    private String ValorStr;
    
    public Numero(int numero){
        this.Valor=numero;
        this.Base=10;
        this.ValorStr=Integer.toString(numero);
    }
    public Numero(int numero, int base){
        this.Valor=numero;
        this.Base=base;
        this.ValorStr=Integer.toString(numero);
    }
    public Numero(String numero){
        this.Valor=0;
        this.Base=16;
        this.ValorStr=numero;
    }
    
    public int getValor(){
        return this.Valor;
    }
    public int getBase(){
        return this.Base;
    }
    public String getString(){
        return this.ValorStr;
    }
}
