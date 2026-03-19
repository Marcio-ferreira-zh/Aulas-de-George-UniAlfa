
# 📚 20 Questões Objetivas sobre Pilhas em Java (com comentário)

---

### 1

Uma pilha (Stack) segue qual princípio?

B) **LIFO**

✅ **Resposta correta: B**

**Comentário:**
A pilha segue o princípio **LIFO (Last In, First Out)**, ou seja, **o último elemento inserido é o primeiro a ser removido**.

---

### 2

O princípio **LIFO** significa:

B) **Último que entra é o primeiro que sai**

✅ **Resposta correta: B**

**Comentário:**
No modelo LIFO, o elemento inserido mais recentemente na pilha é o primeiro a ser removido.

---

### 3

Qual classe da biblioteca padrão Java implementa uma pilha?

B) **Stack**

✅ **Resposta correta: B**

**Comentário:**
A classe `Stack` faz parte da biblioteca padrão do Java e fornece métodos para manipular pilhas.

---

### 4

A classe `Stack` pertence a qual pacote?

A) **java.util**


✅ **Resposta correta: A**

**Comentário:**
A classe `Stack` está localizada no pacote **java.util**, que contém diversas estruturas de dados.

---

### 5

Qual método adiciona um elemento na pilha?


C) **push()**

✅ **Resposta correta: C**

**Comentário:**
O método `push()` é utilizado para **inserir um novo elemento no topo da pilha**.

---

### 6

Qual método remove o elemento do topo da pilha?

A) **pop()**


✅ **Resposta correta: A**

**Comentário:**
O método `pop()` remove e retorna **o elemento que está no topo da pilha**.

---

### 7

Qual método retorna o elemento do topo sem removê-lo?


B) **peek()**


✅ **Resposta correta: B**

**Comentário:**
O método `peek()` permite **visualizar o elemento do topo da pilha sem removê-lo**.

---

### 8

Qual método verifica se a pilha está vazia?

B) **isEmpty()**


✅ **Resposta correta: B**

**Comentário:**
O método `isEmpty()` retorna **true se a pilha estiver vazia** e **false caso contrário**.

---

### 9

Qual exceção ocorre ao tentar remover elemento de uma pilha vazia?

C) **EmptyStackException**

✅ **Resposta correta: C**

**Comentário:**
Se `pop()` for chamado em uma pilha vazia, o Java lança a exceção **EmptyStackException**.

---

### 10

Qual estrutura é utilizada internamente pela classe `Stack`?


B) **Vector**


✅ **Resposta correta: B**

**Comentário:**
A classe `Stack` herda da classe **Vector**, que utiliza uma estrutura baseada em vetor dinâmico.

---

### 11

A pilha é frequentemente usada em:


B) **Controle de chamadas de métodos**


✅ **Resposta correta: B**

**Comentário:**
A pilha é utilizada no **controle de chamadas de funções e métodos**, formando a chamada **Call Stack**.

---

### 12

Em Java, o uso da pilha está associado ao conceito de:


B) **Stack Memory**



✅ **Resposta correta: B**

**Comentário:**
A **Stack Memory** é usada para armazenar chamadas de métodos e variáveis locais.

---

### 13

Qual alternativa representa corretamente uma pilha?

B)

```
Topo
 4
 3
 2
 1
Base
```


✅ **Resposta correta: B**

**Comentário:**
Na pilha, os elementos são empilhados verticalmente e **apenas o topo pode ser acessado diretamente**.

---

### 14

Qual operação adiciona um elemento no topo da pilha?

A) **push**

✅ **Resposta correta: A**

**Comentário:**
A operação **push** insere um novo elemento no topo da pilha.

---

### 15

Qual operação remove o elemento do topo?

B) **pop**

✅ **Resposta correta: B**

**Comentário:**
A operação **pop** remove e retorna o elemento que está no topo.

---

### 16

Qual estrutura de dados pode ser usada para implementar uma pilha?

A) Vetor
B) Lista encadeada
C) Array
D) **Todas as alternativas**

✅ **Resposta correta: D**

**Comentário:**
Pilhas podem ser implementadas usando **arrays, vetores ou listas encadeadas**.

---

### 17

Qual é a complexidade da operação `push` em uma pilha?


C) **O(1)**


✅ **Resposta correta: C**

**Comentário:**
A operação `push` tem **complexidade constante**, pois apenas adiciona o elemento no topo.

---

### 18

Qual aplicação clássica utiliza pilhas?

B) **Avaliação de expressões matemáticas**

✅ **Resposta correta: B**

**Comentário:**
Pilhas são muito usadas para **avaliar expressões matemáticas e converter notações (infixa, prefixa e pós-fixa)**.

---

### 19

Qual estrutura utiliza pilha para controlar chamadas recursivas?

B) **Call Stack**

✅ **Resposta correta: B**

**Comentário:**
A **Call Stack** registra todas as chamadas de métodos durante a execução do programa.

---

### 20

Qual código cria corretamente uma pilha em Java?

B)

```java
Stack<Integer> pilha = new Stack<>();
```

✅ **Resposta correta: B**

**Comentário:**
A forma moderna utiliza **Generics**, garantindo **tipagem segura**, como `Stack<Integer>`.

---
