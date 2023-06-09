# Fundamentos da Linguagem Java

<p align="justify">Java é uma linguagem de programação orientada a objetos, criada em 1995 pela Sun Microsystems, atualmente pertencente à Oracle Corporation. É uma das linguagens de programação mais populares do mundo e é utilizada em uma ampla gama de aplicações, desde aplicativos de desktop até sistemas empresariais complexos.</p>

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
  //Adicionando um elemento em uma posição especifica.
  
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
  - Acesso eficiente aos elementos: Com uma matriz, é possível acessar os elementos de forma eficiente usando índices de linha e coluna. Isso torna mais fácil recuperar e atualizar valores específicos dentro da estrutura de dados.
* Desvantagens:
  - Acesso menos eficiente: O acesso a elementos em uma matriz bidimensional pode ser menos eficiente do que em um vetor, pois requer dois índices para acessar um único elemento.
  - Complexidade de iteração: Iterar em uma matriz bidimensional pode ser mais complexo do que em um vetor, pois requer o uso de loops aninhados para percorrer todas as linhas e colunas.
  

  Exemplo:
  ```
  //definição da matriz (bidimensional)
  
  int[][] matriz = new int[3][3]; // 3l x 3c  
  ```

<h3>Data-hora</h3>
<p align="justify">ISO 8601 é um padrão internacional que define um formato para representar datas e horários em um formato não ambíguo e fácil de entender. A data é representada como AAAA-MM-DD e o horário é representado como HH:MM:SS. A combinação de data e hora é representada como AAAA-MM-DDTHH:MM:SS. O padrão é amplamente utilizado em várias indústrias e na programação de computadores para evitar erros e confusão na troca de dados entre diferentes sistemas e organizações.</p>

Exemplo em Java : 
  ```
LocalDate d01 = LocalDate.now();
// pegando a data atual

LocalDateTime d02 = LocalDateTime.now();
// pegando a data/hora + segundos

Instant d03 = Instant.now();
// retorna a data do GMT ou UTC global;
		
LocalDate d04 = LocalDate.parse("2023-04-30");
//gerando um objeto data a partir de uma string
	
Instant d05 = Instant.parse("2023-04-30T22:13:26Z");
// 2023-04-30T22:13:26Z -> A letra "Z" no final da string de data e hora representa o fuso horário UTC (Tempo Universal Coordenado), também conhecido como GMT
	
Instant d06 = Instant.parse("2023-04-30T22:13:26-03:00");
//-03:00 está especificando o GMT. Nesse caso, ele vai pegar a data passada e converter p/ o de Londres.
	
 ```
  
<h3>Trabalhando com data/hora em Java</h3>

```
LocalDate data_atual = LocalDate.now();
//pegando data atual : ANO-MÊS-DIA

LocalDateTime data_atual1 = LocalDateTime.now();
//pegando data atual + hora : ANO-MÊS-DIA-HH-mm

DateTimeFormatter formato_de_data = DateTimeFormatter.ofPattern("ddd/MM/yyyy");
//Padrão de data pt-br

DateTimeFormatter formato_de_data1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//Cria um formato ANO-MÊS-DIA-HH-mm, no modo pt-br


System.out.println("Data formatada : " + data_atual.format(formato_de_data));
//Irá colocar a data capturada, no padrão internacional, e converterá para o formato pt-br na exibição.

System.out.println("Data/hora : " + data_atual1.format(formato_de_data1));
//Irá colocar a data capturada, no padrão internacional, e converterá para o formato pt-br na exibição : ANO-MÊS-DIA-HH-mm
	
------------------------------------------------------------------------------------------------------------------------------------------------------
LocalDateTime d05 = LocalDateTime.parse("2023-05-01T22:12:20");
//Passando uma data/hora (t-> time)
	
Instant d06 = Instant.parse("2023-05-01T01:12:20Z");
//A letra "Z" no final da string de data e hora representa o fuso horário UTC (Tempo Universal Coordenado), também conhecido como GMT
	
ZoneId.getAvailableZoneIds();
//retorna uma coleção com os nomes dos fusos horários customizados

for(String s:ZoneId.getAvailableZoneIds()) {
	System.out.println(s);
	//percorrendo a coleção dos fusos -> há + de 600
}
	
LocalDate conver = LocalDate.ofInstant(d06, ZoneId.systemDefault());
//Converte a data Universal p/ a data local.O ZoneId.SystemDefault() pega o fuso do computador.
				
LocalDate conver1 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
//Converte a data Universal p/ o data de Portugal.Lembre-se : há uma lista de fusos no ZoneId
		
LocalDateTime conver3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
// Convertendo a data/hora universal p/ local, com base no fuso do computador
		
LocalDateTime conver4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
// Convertendo a data/hora universal p/ a data/hora de Portugal, com base no fuso do computador
	
System.out.println(d05.getDayOfMonth());
//Pegando o dia de uma data passada (numérico).
		
System.out.println(d05.getMonthValue());
//Pegando o mês de uma data (numérico)
		
System.out.println(d05.getYear());
//Pegando o ano de uma data.
		
System.out.println(d05.getHour());
//Pegando a hora
	
System.out.println(d05.getMinute());
//Pegando os minutos
		
System.out.println(d05.getSecond());
//Pegando os segundos
	
```

<h3>Realizando cálculos com data e hora</h3>

```
LocalDate d04 = LocalDate.parse("2022-07-20");
//definindo uma data. Para pegar a data atual, apenas retire o parse e adiciona .now();
	
LocalDateTime d05 = LocalDateTime.parse("2023-05-01T22:12:20");
//definindo uma data/hora.

		
LocalDate pastWeekLocalDate = d04.minusDays(100);
//Pegando a data em d04 menos 100 dias. Retorna uma data correspondente a - 100 dias : 2020-05-11.
		
LocalDate nextWeekLocalDate = d04.plusDays(100);
//Pegando a data em d04 e adicionando 100 dias. Retorna uma data correspondente a + 100 dias : 2022-10-28.
		
LocalDate nextYearsLocalDate = d04.plusYears(100);
//adicionando 100 anos com base no ano atual.
	
LocalDateTime pastWeekDateTime = d05.plusDays(10);
//Adicionando 10 dias, só que dessa vez considerando data/hora. Funciona com Dias, anos, meses, horas...
	
LocalDate pastWeekLocalDate = d04.minusDays(100);
// Pegando a data em d04 menos 100 dias. Retorna uma data correspondente a - 100 dias : 2020-05-11.
	
LocalDate pastWeekLocalDate2 = d04.minusDays(7);
//adicionando dias (no formato sem tempo)

LocalDate nextWeekLocalDate = d04.plusDays(100);
// Pegando a data em d04 e adicionando 100 dias. Retorna uma data correspondente a + 100 dias : 2022-10-28.

LocalDate nextYearsLocalDate = d04.plusYears(100);
// Adicionando 100 anos com base no ano atual.

LocalDateTime pastWeekDateTime = d05.plusDays(10);
// Adicionando 10 dias, só que dessa vez considerando data/hora. Funciona com Dias, anos, meses, horas...
	
Duration t1 = Duration.between(LocalDateTime.now(), pastWeekDateTime);
// irá pegar a diferença entre duas datas/horas. Data atual e data passada.
System.out.println(t1.toDays());// irá retornar a diferença de dias.
	
Duration t2 = Duration.between(pastWeekLocalDate2.atStartOfDay(), d04.atStartOfDay());
// realizando a operação de diferença entre datas. O método atStartOfDay é usado porque é necessário setar os segundos para ser compatível.	
```
	
<h3>Enumeração (ENUM)</h3>
	
<p align="justify">ENUM em Java é uma classe especial que representa um conjunto fixo de valores constantes. </p>	
	
```
public enum OrderStatus{
	PENDING_PAYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED
}
```

<h3>Relacionamentos entre objetos</h3>
	
	
* <strong>Associação:</strong> É uma forma de relacionamento entre objetos em que o objeto (todo) pode estar apenas associado a um objeto (parte), segundo a definição do professor : "Na associação, o objeto (todo) só pode estar associado a um único objeto (parte)". Além disso, esses objetos também são independentes entre si. Por exempo, duas classes : Pessoa e Cidade. Nesse cenário, uma pessoa (todo) pode ter residência em APENAS UMA cidade. Se, porventura, uma pessoa tiver residência em mais de uma cidade, esse relacionamento se torna uma agregação, não mais uma associação. 
* <strong>Composição:</strong> é uma forma de relacionamento entre objetos em que um objeto é composto por outros. Esses objetos componentes são partes essenciais do objeto todo e não existem de forma independente. Em outras palavras, o objeto todo é responsável pela criação (via construtor) e destruição dos objetos parte. Se o objeto (todo) for excluído, os objetos (parte) também serão. Vale ressaltar que esse tipo de relacionamento é, geralmente, 1 -> N, sendo o objeto (parte) um arraylist do tipo especificado. Por exemplo, duas classes : Funcionário(todo) e Dependentes(parte). Nesse cenário, teremos um atributo chamado dependentes, sendo um arraylist do tipo Dependentes, dentro da classe Funcionário. Se o todo (funcionário) for excluído, as partes (dependentes) também serão.
* <strong>Agregação:</strong> Na agregação, você tem um objeto (todo) que contém outros objetos (parte) como atributos, mas esses objetos (parte) podem existir de forma independente do objeto (todo). Em outras palavras, o objeto (parte) pode pertencer a vários objetos todo ao mesmo tempo e não é destruído quando um objeto (todo) é excluído. Vale ressaltar, assim como na composição, que esse tipo de relacionamento é, geralmente, 1 -> N, sendo o objeto (parte) um arraylist do tipo especificado. Porém, diferente da composição, ao excluir o objeto (todo), as (partes) permancem existindo. Por exemplo, duas classes : Cesta de Produtos(todo) e Produtos(parte). Uma cesta de produto é, geralmente, constituida de 1 -> N produtos. No entanto, ambas funcionam como entidades autônomas. Logo, um produto pode existir em diversas cestas e, se eu excluir o mesmo da Cesta de Produto, ele apenas será removido; não será uma exclusão do objeto em si. 
Observação: o produto será adicionado por métodos específicos (add) dentro da classe Cesta de Produtos, já que o mesmo não é criado no momento da instanciação (via construtor) da classe Cesta, mas feito à parte.

Associação:

* Relação genérica entre objetos de classes diferentes.
* Indica uma conexão ou interação entre os objetos.
* Os objetos associados são independentes e podem existir separadamente.
* Não implica uma dependência forte entre os objetos.
* Exemplo: uma pessoa possui um carro, mas o carro pode pertencer a diferentes pessoas.

Composição:

* Relação de "todo-parte" entre objetos, em que um objeto todo é composto por objetos parte.
* Os objetos parte são componentes essenciais do objeto todo.
* Existe uma dependência forte, em que a existência do objeto parte está intimamente ligada ao objeto todo.
* Se o objeto todo for excluído, os objetos parte também serão.
* Exemplo: um computador possui uma CPU, memória e disco rígido, e esses componentes são partes essenciais do computador.

Agregação:

* Uma forma específica de associação que também envolve uma relação de "todo-parte".
* O objeto todo é composto por objetos parte, mas estes podem existir independentemente do objeto todo.
* Os objetos parte podem estar associados a outros objetos além do objeto todo.
* Existe uma dependência mais fraca em comparação com a composição.
* Exemplo: uma universidade possui estudantes, mas os estudantes podem existir fora do contexto da universidade e podem ser associados a * outras instituições de ensino.

Diferenças:

<p align="justify">Na associação, os objetos são independentes e podem existir separadamente, enquanto na composição os objetos parte são componentes essenciais do objeto todo e na agregação os objetos parte podem existir independentemente do objeto todo.
Na composição, a existência do objeto parte está fortemente ligada ao objeto todo, e se o objeto todo for excluído, os objetos parte também serão. Na agregação, os objetos parte podem existir independentemente do objeto todo e não são excluídos quando o objeto todo é excluído.
Na composição, a criação e gerenciamento dos objetos parte são responsabilidade do objeto todo. Na agregação, os objetos parte podem ser criados separadamente e associados ao objeto todo por meio de métodos específicos.A composição é uma relação mais forte e mais restritiva do que a agregação.</p>



