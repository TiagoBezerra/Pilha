package trabalhopilha;

public interface InterfacePilha {
    void criarPilha();
    boolean eVazia (); //verificar se está vazia a pilha
    int tamanho(); //retorna o número de itens da pilha 
    void limpar(); //esvaziar pilha
    NoEncadeado push(int valor); //insere um valor no topo da pilha
    NoEncadeado pop(); //retira o valor no topo da pilha
    int pegarTopo(); //retorna o valor atual do topo da pilha
    void listar();//retorna todos os valores da pilha 
    
}
