/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopilha;

/**
 *
 * @author PC
 */
public class NoEncadeado {
    int valor;
    NoEncadeado proximo;
    
    public NoEncadeado(int valor, NoEncadeado proximo){
        this.valor = valor;
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEncadeado getProximo() {
        return proximo;
    }

    public void setProximo(NoEncadeado proximo) {
        this.proximo = proximo;
    }
    
    
}
