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
public class PilhaEncadeada implements InterfacePilha{
    private int tamanho = 0;
    private NoEncadeado topo;

    @Override
    public void criarPilha() {
        topo = new NoEncadeado(-1, null);
    }

    @Override
    public boolean eVazia() {
        return tamanho >0;
    }

   
    @Override
    public int tamanho() {
        return tamanho;
    }
    
    @Override
    public void limpar() {
        topo.setProximo(null);
    }
    
    @Override
    public NoEncadeado push(int valor) {
        NoEncadeado elemento = new NoEncadeado(valor, null);
        elemento.setProximo(topo.getProximo());
        topo.setProximo(elemento);
        tamanho++;
        return elemento;
    }

    @Override
    public NoEncadeado pop() {
        NoEncadeado aux = topo.getProximo().getProximo();
        topo.setProximo(topo.getProximo().getProximo());
        tamanho--;
        return aux;
    }
    @Override
    public int pegarTopo() {
        if(topo.getProximo()!= null){
            return topo.getProximo().getValor();
        }
        else {
            return -1;
        }
    }

    @Override
    public void listar() {
        if(eVazia()){
            NoEncadeado aux = topo.getProximo();
            while (aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
    }
        else{
            System.out.println("Vazia");
        }
    
}
}

        

   
    

