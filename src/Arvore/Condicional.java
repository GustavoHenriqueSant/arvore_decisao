/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;

/**
 *
 * @author Gustavo
 */
public class Condicional implements Programa {
    private int variavel;
    private int constante;
    private OperadoresLogicos operador;
    private Programa nofilhoI;
    private Programa nofilhoII;
    
    public Condicional(int variavel, int constante, OperadoresLogicos op, Programa nofioI, Programa nofioII){
        this.variavel = variavel;
        this.constante = constante;
        this.operador = op;
        this.nofilhoI = nofioI;
        this.nofilhoII = nofioII;
    }

    @Override
    public int processa() {
        if(this.operador == OperadoresLogicos.MAIOR_IGUAL){
            if(this.variavel >= this.constante){
                return this.nofilhoII.processa();
            } else {
                return this.nofilhoI.processa();
            }
        } else {
            if(this.variavel <= this.constante){
                return this.nofilhoII.processa();
            } else {
                return this.nofilhoI.processa();
            }
        }
    }

    public int getVariavel() {
        return variavel;
    }

    public void setVariavel(int variavel) {
        this.variavel = variavel;
    }

    public int getConstante() {
        return constante;
    }

    public void setConstante(int constante) {
        this.constante = constante;
    }

    public OperadoresLogicos getOperador() {
        return operador;
    }

    public void setOperador(OperadoresLogicos operador) {
        this.operador = operador;
    }

    public Programa getNofilhoI() {
        return nofilhoI;
    }

    public void setNofilhoI(Programa nofilhoI) {
        this.nofilhoI = nofilhoI;
    }

    public Programa getNofilhoII() {
        return nofilhoII;
    }

    public void setNofilhoII(Programa nofilhoII) {
        this.nofilhoII = nofilhoII;
    }
}
