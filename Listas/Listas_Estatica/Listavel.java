package Listas;
public interface  Listavel {
    // esse aqui vai anexar/inserir no final da lista um novo dado
    void anexar(Object dado);

    // inserir novo dado em uma posicao logica informada
    void inserir(int posicao, Object dado);

    // retorma elemento que esta em uma posicao logica informada
    Object selecionar(int posicao);

    // faz a mesma coisa do de cima 
    Object[] selecionarTodos();

    // susbtitui elemento por um novo elemento fornecido de uma posicao informada
    void atualizar(int posicao, Object novoDado);

    // remove elemento de uma posicao informada
    Object apagar(int posicao);

    boolean estaCheia();
    boolean estaVazia();
    String imprimir();


    //a++: 

    //Object apagarFim();
	//Object apagarInicio();
	//void inserirInicio(Object dado);
	//void inserirFim(Object dado); mesmo que void anexar(Object dado);
	//Object obterInicio();
	//Object obterFim();	
	//int indiceDe(Object dado);
	//int ultimoIndiceDe(Object dado);
	//boolean contem(Object dado);
	//Object[] limpar();
	//int tamanho();


}
