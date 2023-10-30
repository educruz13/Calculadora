/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora1;

/**
 *
 * @author braya
 */
public class Operaciones {

    private float n1;
    private float n2;
    public float resultado;

    public Operaciones(){}
    public Operaciones(float n1, float n2, float resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    public float suma(){
        resultado = n1+n2;
        System.out.println(resultado);
        return resultado;
    }
     public float resta(){
        resultado = n1-n2;
        System.out.println(resultado);
        return resultado;
    }
     public float multi(){
        resultado = n1*n2;
        System.out.println(resultado);
        return resultado;
    }
    public float divi(){
        resultado = n1/n2;
        System.out.println(resultado);
        return resultado;
    }     
    
}
