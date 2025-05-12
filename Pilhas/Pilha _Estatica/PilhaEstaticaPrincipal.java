package Pilhas;
public class PilhaEstaticaPrincipal {
    public static void main(String[] args) {
        Empilhavel pilha = new PilhaEstatica(30);  // Define a capacidade da pilha
        pilha.empilhar("INSTITUTO");
        pilha.empilhar("FEDERAL");
        System.out.println("Espiar: " + pilha.espiar());

        pilha.empilhar("de");
		pilha.empilhar("Educação");
		pilha.empilhar("Ciência");
		pilha.empilhar("e");		
		System.out.println("Espiar:" + pilha.espiar());		

        Object conteudo = pilha.desempilhar();  // Desempilha um valor
        pilha.desempilhar();  // Desempilha outro valor
        pilha.empilhar("TECNOLOGIA");
        pilha.empilhar("DA");
        pilha.empilhar("SAO PAULO");
        pilha.atualizar("BAHIA");

        pilha.empilhar(pilha.desempilhar());  // Empilha novamente o valor desempilhado
        pilha.empilhar(conteudo);  // Empilha o valor armazenado na variável 'conteudo'
        System.out.println("Pilha: " + pilha.imprimir());  // Imprime o conteúdo da pilha
    }
}
