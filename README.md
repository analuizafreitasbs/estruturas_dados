# 📚 Estrutura de Dados 2025.1

**Aluna:** Ana Luiza Freitas B Siqueira 👩‍🎓  
**Anotações de Aula e Afins**

---

## 1. Pilhas

**Aulas: 10 e 17 📅**

### 🔠 Contrato CRUD + S

* **C = Create (criar)** ➕
* **R = Read (ler)** 📖
* **U = Update (atualizar)** 🔄
* **D = Delete (apagar)** 🗑️
* **S = Sort (ordenar)** 🔢

### 🔢 Tipos de Dados Numéricos

#### Inteiros:

* `unsigned int`, `tinyint`, `smallint`, `int`, `long`, `LONGINT`, `BIGINT` (SQL)

#### Pontos Flutuantes:

* `FLOAT`, `DOUBLE`

#### Ponto fixo:

* `NUMERIC`, `DECIMAL` (SQL) 💡

#### Outros:

* **String:** `string = "ifba"`, `char = 'A'` 💬
* **Lógico:** `boolean`, `bool`
* **Pessoa:** `pessoa["ana"]`

### 🧮 Vetores e Arrays

* Vetor, array, matriz unidimensional
* Arrays ordinais
* Arrays associativos

### 🔧 Operações Principais

* **Empilhar:** `push()` ⬆️
* **Desempilhar:** `pop()` ⬇️
* **Topo:** `topo()` 🔝

### 🛠️ Operações Auxiliares

* **Está cheia:** `isFull()` ❌
* **Está vazia:** `isEmpty()` ⚠️
* **Imprimir:** `print()` 🖨️

### 🆕 Pilhas Dinâmicas

* Pilhas implementadas com **listas encadeadas** — não tem tamanho fixo.
* Operações `push` e `pop` manipulam ponteiros.
* Vantagem: crescimento dinâmico, não precisa de tamanho máximo.

---

## 2. Filas

**Aula: 24 📅**

> A maioria dos conceitos gerais são os mesmos de pilha!

### 🔧 Operações Principais

* **Enfileirar:** `enqueue()` ⬆️
* **Frente da fila:** `front()` 🔝
* **Atualizar:** `update()` 🔄
* **Desenfileirar:** `dequeue()` ⬇️

### 🛠️ Operações Auxiliares

* **Está cheia:** `isFull()` ❌
* **Está vazia:** `isEmpty()` ⚠️
* **Imprimir:** `print()` 🖨️

### 🏗️ Tipos de Filas

#### 2.1 Fila Simples (Queue) 🏃‍♂️➡️

* **FIFO (First In, First Out)**
* Elementos entram no final e saem pelo início.
* **Exemplo:** Filas de atendimento, processamento de tarefas.

#### 2.2 Fila Circular 🔄

* Último elemento aponta para o primeiro (ciclo).
* **Evita desperdício de espaço.**
* **Exemplo:** Buffers de dados, sistemas de tempo real.

#### 2.3 Fila Duplamente Terminada (Deque) ↔️

* Permite inserção e remoção no início e no fim.
* **Mais flexível.**
* **Exemplo:** Histórico de navegação.

### 🆕 Filas Dinâmicas

* Implementadas com listas encadeadas para permitir tamanho variável.
* Evitam o problema de filas estáticas com espaço fixo.

---

## 3. Listas

**Aulas: 31 e 07 📅**

### 🔁 O que é uma Lista Estática Circular?

* Estrutura onde o **último aponta para o primeiro** formando um ciclo.
* Usa **vetor fixo** com aritmética modular.
* **Evita ponteiros nulos** e percorre a lista infinitamente.
* **Usos:** Buffers, filas, gestão de memória.

### 🔧 Operações Principais

#### Adicionar elementos:

* `anexar(dado)` ➕ – adiciona no final
* `inserir(posição, dado)` 📌 – insere em posição específica

#### Consultar elementos:

* `selecionar(posição)` 🔍 – retorna elemento da posição
* `selecionarTodos()` 📋 – retorna todos os elementos

#### Atualizar elementos:

* `atualizar(posição, novoDado)` 🔄 – substitui elemento existente

#### Remover elementos:

* `apagar(posição)` ❌ – remove elemento da posição

### 🛠️ Operações Auxiliares

* `estaCheia()` ❌
* `estaVazia()` ⚠️
* `imprimir()` 🖨️

### 🔍 Diferenças das Listas Circulares

* ✅ Caminho contínuo
* ✅ Mais eficiência ao navegar
* ✅ Ideal para ações repetitivas

### ✨ Operações Extras

#### Remover:

* `apagarInicio()` 🚪 – remove o primeiro
* `apagarFim()` 🔚 – remove o último

#### Inserir:

* `inserirInicio(dado)` 🔝 – adiciona no início
* `inserirFim(dado)` ➡️ – mesmo que `anexar(dado)`

#### Obter:

* `obterInicio()` 🏁 – retorna o primeiro
* `obterFim()` 🏁 – retorna o último

#### Buscar:

* `indiceDe(dado)` 🔍 – retorna a primeira posição do dado
* `ultimoIndiceDe(dado)` 🔎 – retorna a última posição do dado
* `contem(dado)` ✅ – verifica se está presente

#### Outros:

* `limpar()` 🗑️ – remove todos os elementos
* `tamanho()` 📏 – retorna o número total de elementos

### 🆕 Listas Dinâmicas

* Implementadas com nós que apontam para o próximo (e anterior no caso de listas duplamente encadeadas).
* Permitem inserção e remoção em qualquer posição sem realocar elementos (como vetor).

---

## 4. Árvores Binárias Heap

### O que é Heap?

* Estrutura árvore binária completa que satisfaz a propriedade de heap:
    - **Max-heap:** o valor do nó pai é maior ou igual aos valores dos filhos.
    - **Min-heap:** o valor do nó pai é menor ou igual aos valores dos filhos.

### Aplicações

* Implementação eficiente de **filas de prioridade**.
* Base para o algoritmo **Heapsort**.

### Operações Principais

* **Inserção:** adiciona um elemento e corrige a posição para manter heap.
* **Remoção (extração):** remove a raiz (máximo ou mínimo) e reorganiza.

---

## 5. Métodos de Ordenação 🔢

**Aula: 14 📅**

### 5.1 Dividir para Conquistar

#### 5.1.1 Heapsort

* Usa um heap para ordenar.
* Constrói um max-heap e extrai o maior elemento repetidamente.

#### 5.1.2 Quicksort

* Escolhe um pivô, particiona o array em dois grupos.
* Recursivamente ordena as partes menores e maiores.

#### 5.1.3 Mergesort

* Divide a lista em duas metades.
* Ordena cada metade e depois mescla ordenadamente.

---
## 6. Assuntos Complementares

#### 6.1 Teste de Software
* Testes unitários: verificam o funcionamento isolado de métodos e classes.

* Usam frameworks como JUnit no Java.

* Exemplo: testar se push() realmente adiciona um elemento à pilha.

#### 6.2 Generics
+ Permitem criar classes e métodos parametrizados por tipo.

* Exemplo: class Pilha<T> { ... } aceita qualquer tipo T.

* Evita código duplicado para diferentes tipos.

#### 6.3 Exceções
* Tratamento de erros em tempo de execução.

* Blocos try { ... } catch (Exception e) { ... } finally { ... }

* Criar exceções personalizadas para casos específicos (ex: PilhaVaziaException).

#### 6.4 JavaDoc
- Documentação padronizada em comentários.

#### Sintaxe básica:
---

[//]: # (/**)

[//]: # (* Descrição do método.)

[//]: # (* @param parametro Descrição do parâmetro.)

[//]: # (* @return Descrição do valor retornado.)

[//]: # (  */)
---