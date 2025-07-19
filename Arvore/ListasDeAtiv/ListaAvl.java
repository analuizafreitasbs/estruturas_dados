package Arvore.ListasDeAtiv;

public class ListaAvl {
}

//Exercícios com Árvores Binárias (Implementar utilizando recursão, utilizando travessia/percorrimento pré-ordem, in-ordem ou pós-ordem).
//
//        1. Contar o número total de nós
//Dada a raiz de uma árvore, conte quantos nós ela contém.
//Dica: use percorrimento pré-ordem, in-ordem ou pós-ordem.
//
//2. Contar o número de folhas
//Descrição: Dada a raiz de uma árvore binária, retorne quantos nós não possuem filhos (folhas).
//Dica: se o nó for NULL, retorna 0; se ambos filhos são NULL, retorna 1; caso contrário, soma folhas da esquerda e da direita.
//
//        3. Calcular a altura (profundidade máxima) da árvore
//Descrição: Calcule a altura máxima — número de nós no caminho mais longo da raiz até uma folha.
//Dica: altura = 1 + max(altura(esquerda), altura(direita)).
//
//        4. Contar nós folhas
//Descrição: Quantos nós não tem filhos?
//Dica: se um nó não é NULL e não tem filhos, conta 1 + nós recursivamente.
//
//        5. Contar nós internos (não-folhas)
//Descrição: Quantos nós têm pelo menos um filho?
//Dica: se um nó não é NULL e tem pelo menos um filho, conta 1 + filhos internos recursivamente.
//
//6. Encontrar o maior valor em um nó
//Descrição: (Se for árvore de busca binária ou geral com dados numéricos) localize o valor máximo armazenado.
//        Dica: percorra todos os nós recursivamente, retorne o máximo entre eles.
//
//7. Contar quantidade de nós em cada nível
//Descrição: Dada a raiz, retorne um vetor count[level] com a quantidade de nós em cada profundidade.
//Dica: use DFS recursivo passando o nível como parâmetro.
//
//        8. Calcular o diâmetro da árvore
//Descrição: Encontre a maior distância (número de nós no caminho) entre quaisquer dois nós da árvore.
//Dica: para cada nó, soma altura da subárvore esquerda + direita; mantenha a maior.
//
//9. Contar nós à esquerda e direita
//Descrição: Retorne o número de nós na subárvore esquerda e direita da raiz.
//Dica: use a função de contagem de nós (exercício 1) em ambas as subárvores.
//
//        10. Verificar se duas árvores são idênticas
//Descrição: Dadas duas raízes, retorne true se forem estruturalmente idênticas (mesmíssima forma), false caso contrário.
//Dica: se ambos NULL, true; se um é NULL, false; se valores iguais e recursivamente iguais em filhos.
