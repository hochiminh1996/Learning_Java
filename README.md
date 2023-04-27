# Fundamentos da Linguagem Java


<p align="justify">Java é uma linguagem de programação orientada a objetos, criada em 1995 pela Sun Microsystems, atualmente pertencente à Oracle Corporation. É uma das linguagens de programação mais populares do mundo e é utilizada em uma ampla gama de aplicações, desde aplicativos de desktop até sistemas empresariais complexos.
</p>

<p align="justify">O Java é conhecido por sua portabilidade, o que significa que o mesmo código pode ser executado em diferentes plataformas, como Windows, macOS e Linux, sem a necessidade de reescrevê-lo. Isso é possível graças à sua plataforma de execução, conhecida como a Máquina Virtual Java (JVM), que interpreta o código Java em tempo de execução.
</p>



<p align="justify">Além disso, o Java é uma linguagem de programação robusta, segura e escalável, com um grande ecossistema de bibliotecas e frameworks que facilitam o desenvolvimento de software. Ele é amplamente utilizado em empresas de tecnologia e em projetos open source em todo o mundo.
</p>

<p align="justify">Durante minha jornada, fui apresentado aos conceitos básicos de programação Java, como variáveis, tipos de dados, estruturas de controle de fluxo e orientação a objetos. Além disso, vi estudei os fundamentos da  plataforma Java, incluindo a Máquina Virtual Java (JVM) e o ecossistema de bibliotecas e frameworks.</p>


<div align="center" id="">
<img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" title="Javinha" height="200" alt="Java" width="200">
</div>

<h2>Tópicos Estudados</h2>

- [x] Variáveis e tipos de dados
- [x] Operadores aritméticos, lógicos e de atribuição
- [x] Estruturas de controle de fluxo (condicionais e loops)
- [x] Programação orientada a objetos (classes, objetos, encapsulamento, herança, polimorfismo)
- [x] Tratamento de exceções
- [x] Arrays e Collections
- [x] Entrada e saída de dados
- [x] Desenvolvimento de interfaces gráficas com Swing
- [ ] Conexão com bancos de dados (JDBC)
- [ ] Desenvolvimento web com Servlets e JSP
- [ ] Introdução ao framework Spring (IoC, DI, AOP)


<h2> Definições</h2>
<h3>Objeto</h3>
<p align="justify">Em Java, um objeto é uma instância de uma classe. Ele é uma representação concreta de um conceito, entidade ou coisa no mundo real, que pode ter atributos (variáveis) e comportamentos (métodos) associados a ele. </p>

<h3>Wrapper Class</h3>
<p align="justify">São conhecidos na linguagem Java como classes especiais que possuem métodos capazes de fazer conversões em variáveis primitivas e também de encapsular tipos primitivos para serem trabalhados como objetos. Ou seja, são representações equivalentes aos tipos primitidos de variáveis.</p>

* <strong>Number :</strong>  Classe que consegue representar tipos primitivos como int, long, double, float.
* <strong>Integer :</strong> Classe que representa tipos inteiros, faz o trabalho do int no escopo de objetos.
* <strong>Boolean :</strong> Classe que representa tipos boolean, faz o trabalho do boolean no escopo de objetos.

Há diferentes tipos de classes Wrapper que representam outros primitivos : Double, Float, Long e etc.

<h3>Boxing</h3>
<p>É o processo de conversão de um objeto do tipo valor para o tipo referência.</p>
Exemplo:

```
  int x = 20;
  Object obj = x;
  //obj apontará para um local do heap que terá o valor 20
 ```
<h3>Unboxing</h3>
<p align="justify">É o processo inverso do Boxing, ou seja, converter um objeto do tipo referência para um objeto do tipo valor.</p>

Exemplo:
```
    int x = 20;
    Object obj = x;  
    
    int y = (int)obj;
    //o obj será será convertido para um tipo inteiro.
```

<h3>List </h3>
<p align="justify">Uma lista é uma <strong>interface</strong> que representa uma coleção ordenada de elementos, onde cada elemento pode ser acessado por sua posição (índice) na lista. A interface List faz parte do pacote java.util e é uma das principais estruturas de dados usadas para armazenar e manipular coleções de elementos em Java.</p>

```
  List<String> lista = new ArrayList<>();
  
  //Observe que temos uma interface (list) e estamos utilizando uma classe(ArrayList) p/ implementar a interface. Além disso, estamos utilizando um tipo de dado não primitivo (String) p/ trabalhar com a interface list.
```

* Vantagem : é altamente flexível e de tamanho variável que auxília no processo de inserção e deleção de elementos (diferente de um array, que possui tamanho fixo e de difícil deleção e inserção).
* Desvantagem : Acesso sequencial, já que cada "nó"(ou nodo) aponta para o próximo elemento.

<p align="justify"><strong>Observação : List, por ser uma interface,  não aceita tipos primitívos. Ou seja, teremos que utilizar wrapper class (ou uma classe específica) quando trabalharmos com a sua implementação.<strong></p>

Métodos do List:
  
```
  List<String> lista = new ArrayList<>();
  
  lista.add("Brasil");
  //Adiciona um elemento na lista.

  lista.add(2, "China");
  //Adicionando um elemento em uma posição especifica
  
  System.out.println(lista.size());
  //Retorna o tamanho da lista.
  
  lista.remove("China");
  //Remove o elemento que tenha o valor definido.
  
  lista.remove(1);
  //Remove o elemento com base no indice.
  
  lista.removeIf(x -> x.charAt(0) == 'B');
  //Removendo elemento com base em predicado. Neste caso, ele irá remover da lista qualquer elemento que comece com B (função lambda).
  
  System.out.println(l.indexOf("China"));
  //Localizando a posição de um elemento. Se localizar, retorna a posição. Caso contrário, retorna -1.
  
  String pais = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
  //Localizando o 1º elemento, com base na lista, que começa com uma letra especifica. Se não encontrar, retorne null (função lambda).
```
  
  
  <h3>Array</h3>
  <p alig="justify">Em Java, um array é uma estrutura de dados que pode armazenar múltiplos elementos do mesmo tipo em uma única variável. Os arrays podem ser unidimensionais (também conhecidos como vetores) ou bidimensionais (também conhecidos como matrizes), e possuem vantagens e desvantagens distintas.
</p>
  
  
1. Array Unidimensional (Vetor)
* Definição: Um array unidimensional, ou vetor, é uma coleção de elementos do mesmo tipo de dados que são armazenados em uma única variável, acessados por um índice inteiro não negativo.
* Vantagens:
  - Acesso rápido aos elementos: Os elementos em um vetor são armazenados em sequência na memória, o que permite um acesso rápido e eficiente aos elementos usando um       índice inteiro.
  - Fácil de percorrer: Vetores são ideais para iterações e loops, tornando mais fácil percorrer todos os elementos do vetor usando um loop simples.
* Desvantagens
  - Tamanho fixo: O tamanho de um vetor é fixo durante a sua criação e não pode ser alterado posteriormente. Se for necessário adicionar ou remover elementos, é preciso criar um novo vetor com o tamanho desejado e copiar os elementos do vetor antigo.
  - Ineficiente em inserção/deleção: Inserir ou deletar elementos em um vetor pode ser ineficiente, pois pode exigir a realocação de elementos na memória, especialmente quando feito no início ou meio do vetor.
  
  
  Exemplo:
  ```
    //definição do vetor (unidimensional)
  
    int[] matriz = new int[3];
  ```
  
2. Array Bidimensional (Matriz):
* Definição: Um array bidimensional, ou matriz, é uma coleção de elementos organizados em linhas e colunas, formando uma tabela de elementos. É acessado por um par de índices inteiros que representam a posição na matriz.
* Vantagens:
  - Estrutura tabular: Matrizes são ideais para representar dados tabulares, como tabelas em banco de dados ou imagens, onde os elementos são organizados em linhas e     colunas.
  - Flexibilidade de tamanho: Ao contrário de um vetor, as matrizes podem ter tamanho variável em suas dimensões. É possível alterar o número de linhas e colunas em      uma matriz após a sua criação.
* Desvantagens:
  - Acesso menos eficiente: O acesso a elementos em uma matriz bidimensional pode ser menos eficiente do que em um vetor, pois requer dois índices para acessar um único elemento.
  - Complexidade de iteração: Iterar em uma matriz bidimensional pode ser mais complexo do que em um vetor, pois requer o uso de loops aninhados para percorrer todas as linhas e colunas.
  

  Exemplo:
  ```
  //definição da matriz (bidimensional)
  
  int[][] matriz = new int[3][3]; // 3l x 3c  
  ```


  

  
  
