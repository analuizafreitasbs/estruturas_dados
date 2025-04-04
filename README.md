# **ESTRUTURA DE DADOS 2025.1** 📚

- **ALUNA:** **ANA LUIZA FREITAS B SIQUEIRA** 👩‍🎓

### **ANOTAÇÕES DE AULA E AFINS:**

### PILHAS:

#### **AULA DIA 10 e 17 - ESTRUTURA DE DADOS** 📅

- **Contrato** 📝  
  - **C** = **CREATE** (criar) ➕  
  - **R** = **READ** (ler) 📖  
  - **U** = **UPDATE** (atualizar) 🔄  
  - **D** = **DELETE** (apagar) 🗑️  
  - **S** = **SORT** (ordenar) 🔢

- **Tipos de Dados Numéricos** 🔢:
  - **INTEIROS**:  
    - unsigned int; // tinyint, smallint, int, long, LONGINT, BIGINT (SQL) 🔢

  - **PONTOS FLUTUANTES**:  
    - **FLOAT**, **DOUBLE**  
    - Ponto fixo: **NUMERIC** ou **DECIMAL** (SQL) 💡

- **String** 💬  
  - **string** = "ifba"  
  - **char** = 'A'  
  - **Lógico** = **boolean**, **bool**  
  - Pessoa: **pessoa["ana"]**

- **Vetores e Arrays** 🧮:
  - Vetor, array, matriz unidimensional  
  - Arrays ordinais  
  - Arrays associativos

- **Operações Principais** 🔧:
  - **Empilhar** = **push** ⬆️  
  - **Desempilhar** = **pop** ⬇️  
  - **Topo** = **topo** 🔝

- **Operações Auxiliares** 🛠️:
  - **Está cheia** = **isFull** (overflow) ❌  
  - **Está vazia** = **isEmpty** (underflow) ⚠️  
  - **Imprimir** = **print** 🖨️

  ### FILAS:

#### **AULA DIA 24 - ESTRUTURA DE DADOS** 📅

##### A maioria dos conceitos gerais são os mesmo de pilha!

- **Operações Principais** 🔧:  
- **Enfileirar** = **enqueue** ⬆️  
- **Frente da fila** = **front** 🔝  
- **Atualizar** = **update** 🔄  
- **Desenfileirar** = **dequeue** ⬇️  

- **Operações Auxiliares** 🛠️:
  - **Está cheia** = **isFull** (overflow) ❌  
  - **Está vazia** = **isEmpty** (underflow) ⚠️  
  - **Imprimir** = **print** 🖨️

### **Tipos de Filas** 🏗️  

**Fila Simples** (Queue) 🏃‍♂️➡️  
- Estrutura FIFO (*First In, First Out*).  
- Elementos entram no **final** e saem pelo **início**.  
- Exemplo: Filas de atendimento, processamento de tarefas.  

**Fila Circular** 🔄  
- O **último elemento aponta para o primeiro**, formando um ciclo.  
- Evita desperdício de espaço quando elementos são removidos.  
- Muito usada em buffers de dados, sistemas de tempo real.  

**Fila com Dupla Terminação (Deque - Double-ended Queue)** ↔️  
- Permite inserção e remoção **tanto no início quanto no fim**.  
- Mais flexível que uma fila simples.  
- Exemplo: Histórico de navegação, onde podemos avançar e voltar.  

### LISTAS:

#### **AULA DIA 31 - ESTRUTURA DE DADOS** 📅

##### **O que é uma Lista Estática Circular?**  

Uma **estrutura de dados estática** onde o **último elemento aponta para o primeiro**, formando um **ciclo contínuo**.  

- Utiliza **um vetor fixo** para armazenar os elementos.  
- O **índice do próximo elemento** é calculado usando aritmética modular.  
- Evita o uso de **ponteiros nulos**, permitindo percorrer a lista **infinitamente**.  
- Muito usada em **buffers circulares**, **sistemas de filas**, e **gestão de memória**.  

---

## **Operações Principais** 🔧  

### **Adicionar elementos:**  
- **Anexar** = `anexar(dado)` ➕ → Adiciona um elemento **no final** da lista.  
- **Inserir** = `inserir(posição, dado)` 📌 → Insere um elemento em uma **posição específica**.  

### **Consultar elementos:**  
- **Selecionar** = `selecionar(posição)` 🔍 → Retorna o elemento na **posição informada**.  
- **Selecionar Todos** = `selecionarTodos()` 📋 → Retorna **todos os elementos** da lista.  

### **Atualizar elementos:**  
- **Atualizar** = `atualizar(posição, novoDado)` 🔄 → Substitui um elemento existente.  

### **Remover elementos:**  
- **Apagar** = `apagar(posição)` ❌ → Remove um elemento de uma **posição específica**.  

---

## **Operações Auxiliares** 🛠️  
- **Está cheia?** = `estaCheia()` ❌  
- **Está vazia?** = `estaVazia()` ⚠️  
- **Imprimir** = `imprimir()` 🖨️  

---

## **Diferenças da Lista Circular para outras Listas** 🔍  
✅ **Caminho contínuo**: O último elemento sempre aponta para o primeiro.  
✅ **Eficiência**: Evita percorrer a lista inteira para achar o final.  
✅ **Ideal para sistemas que precisam repetir ações** sem fim, como **buffers e rodízios de processos**.  

---

## **Operações Extras** ✨  

### **Remover elementos do início ou fim:**  
- `apagarInicio()` 🚪 → Remove o **primeiro elemento**.  
- `apagarFim()` 🔚 → Remove o **último elemento**.  

### **Inserir elementos no início ou fim:**  
- `inserirInicio(dado)` 🔝 → Adiciona um elemento **no começo**.  
- `inserirFim(dado)` ➡️ → Mesmo que `anexar(dado)`.  

### **Obter elementos do início ou fim:**  
- `obterInicio()` 🏁 → Retorna o **primeiro elemento**.  
- `obterFim()` 🏁 → Retorna o **último elemento**.  

### **Busca e Índices:**  
- `indiceDe(dado)` 🔍 → Retorna a **primeira posição** do elemento na lista.  
- `ultimoIndiceDe(dado)` 🔎 → Retorna a **última posição** do elemento na lista.  
- `contem(dado)` ✅ → Verifica se um elemento está presente.  

### **Outras operações:**  
- `limpar()` 🗑️ → Remove **todos os elementos**.  
- `tamanho()` 📏 → Retorna o **número total de elementos**.  



