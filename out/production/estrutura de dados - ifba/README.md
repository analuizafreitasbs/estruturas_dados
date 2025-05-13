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

---

## 3. Listas

**Aula: 31 e 07 📅**

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

---

## 4. Métodos de Ordenação 🔢

**Aula: 14 📅**

### 4.1 Bubble Sort 🫧

* Compara pares adjacentes e troca se estiverem fora de ordem.
* Repete até não haver mais trocas.

```python
def bubble_sort(lista):
    n = len(lista)
    for i in range(n):
        for j in range(0, n - i - 1):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
```

---

### 4.2 Selection Sort ✅

* Encontra o menor elemento e coloca na posição correta.
* Repete para todas as posições.

```python
def selection_sort(lista):
    n = len(lista)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if lista[j] < lista[min_idx]:
                min_idx = j
        lista[i], lista[min_idx] = lista[min_idx], lista[i]
```

---

### 4.3 Insertion Sort 📝

* Insere cada elemento na posição correta da parte ordenada da lista.

```python
def insertion_sort(lista):
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0 and chave < lista[j]:
            lista[j + 1] = lista[j]
            j -= 1
        lista[j + 1] = chave
```