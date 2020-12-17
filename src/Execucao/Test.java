
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execucao;

import Arvore.*;

/**
 *
 * @author Gustavo
 */
public class Test {
    
    public static void main(String[] args) {
        //###### Teste manual da árvore de decisão #####
        // um nó da árvore de decisão possui o operador lógico, e seus filhos os dados usados para a operação
        Condicional a,b,c;
        // A folha representa um nó de resposta;
        Folha e,f,g;
        
        //Por ser manual a árvore é criado das folhas à raiz
        g = new Folha(69);
        f = new Folha(4);
        e = new Folha(32);
        
        b = new Condicional(47, 1, OperadoresLogicos.MAIOR_IGUAL, e, f);
        c = new Condicional(1, 57, OperadoresLogicos.MENOR_IGUAL, null, g);
        a = new Condicional(11, 3, OperadoresLogicos.MAIOR_IGUAL, b, c);
        
        System.out.println(a.processa());
    }
}
