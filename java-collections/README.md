# Exercício Java ☕ Collections -> **List** ✔️

O **List** é uma interface que a implementa o *ArrayList* de uma classe. O **List** é quem garante a flexibilidade de uma aplicação, permitindo que o mesmo objeto possa ser instanciado de maneiras diferentes em pontos diferentes da aplicação.
Uma interface **List**, se tem certeza dos métodos que seu objeto tem, mesmo estando instanciado por uma classe como *ArrayList*. 

### Exemplo de uma List com SpringBoot

```java
import java.util.List;
import javax.persistence.JoinColumn;

@JoinColumn(name ="tab_cadastro")
    private List<Cliente> cliente;
```

Visando a ***Hirarquia*** do Collections, podemos enquadrar **List** em segundo (conforme imagem), elas são um objeto em sua estrutura de dados, capazes de armazenar ou agrupar referências a outros objetos. Estas classes e interfaces ``` java.util.List<E>``` são membros do pacote java.util, herdados de uma Collection.



![Logo](https://www.devmedia.com.br/imagens/articles/268250/ArrayListI.png)

***Caracterizado*** como o segundo da hierarquia, ele indexa os objetos e às vezes é chamada de sequência e por iniciar em 0 seus indices como um vetor. Ele contém métodos que manipulam elementos baseados em sua posição da lista, remove um determinado elemento, procura ocorrências de um elemento e percorre sequencialmente (ListIterator) todos os elementos da lista. A interface List é implementada por várias classe, incluídas as classes ArrayList (implementada como vetor), LinkedList e Vector, podendo, tambén receber elementos iguais, exemplo x1 e x2, onde x1.equals(x2) retorna verdadeiro, além de múltiplos null. O ArrayList implementa um Array dimensionada dinamicamente, uma lista de objetos em vetor, sendo seu uso de forma mais adequada em momentos que o acesso é aleatório aos elementos é mais frequente, tendo seu tamanho aumentado sempre que está cheia, ele permite que elementos sejam acessados diretamente pelos métodos get() e set(), e adicionados pelo add() e remove(). Já o *LinkedList*, implementa uma lista de objetos sob a forma de uma lista ligada, seu uso é melhor quando o acesso aleatório não é freqüente sendo o tamanho da lista variado, permitindo listas duplamente "linkada", a principal diferença entre o ArrayList é na performance entre os métodos add, remove, get e set, sendo eles melhores performados no LinkedList do que no ArrayList, como por exemplo: get(int index): LinkedList -> O(n) e ArrayList -> O(1); add(E element): LinkedList -> O(1) e ArrayList -> O(n) no pior caso, visto que o array será redimensionado e copiado para um novo array; add(int index, E element): LinkedList -> O(n) e ArrayList -> O(n); remove(int index): LinkedList -> O(n) e ArrayList -> O(n-index), se remover o último elemento então fica O(1). Agora, com uma visão voltada para API, como ele é utilizado, o Vector e o ArayList são parecidos, podendo fácilmente confundilos por parecerem identicos. Quando não se tem domínio sobre eles, poderam ser usados como se fossem o mesmo, sem notar nenhuma diferença, o *Vector* é sincronizado, ele possui uma aplicação  que precisa thread-safe em determinado ponto, sua locação dinâmica é diferente das demais, ele duplica seu tamanho quando está cheio, mais que o ArrayList, o que pode ser útil se a aplicação precisa de constantemente ser aumentada.



Com o **Collections** manipulando duas categorias estruturadas *Coleções* e *Map*, tendo como disponibilidade da Interface Collection diversos métodos para que possamos trabalhar, como: 

- size()
- isEmpty()
- clear()
- add(Object)
- contains(Object)
- remove(Object)
- containsAll(Collection)
- removeAll(Collection)
- retainAll(Collection)
- toArray()

Para o ***List***, ele dispões de métodos como: 
- get(int) 
- set(Object,int) 
- add(Object,int)
- remove(int) 
- indexOf(Object)

***Método add:*** adiciona um elemento ao final de um *ArrayList*, que é redimensionado automaticamente;

***Método remove:*** exclui um elemento de um ArrayList, e reordena seus elementos de maneira automática;

***Método inserir:*** insere um elemento usando índice e o ArrayList é redimensionado;

***Método addRange:*** adiciona um array ou um *ArrayList* no final da coleção;

***Método indexOf:*** retorna o índice de um elemento se ele estiver na coleção;

***Método clone:*** duplica a ArrayList;

***Método insert:*** insere um elemento na coleção, no local especificado pelo usuário;


![Logo](https://lh3.googleusercontent.com/proxy/eaQJjLTC_GV1qOzgH7DYNtbEW1fI2SwdJ0b_PUpjN47fgZuyn_OaEnKnem19qO53esvacuqUsSWEEOXBr_74bvo-EJseA05Btc3SGVyN8yxY2-tTE4Sb0xgyoHHPU1l9_HciB7r3-HT4ogWvow-Pww)


O ***ArrayList*** tem sua forma de ordenação, como uma lista de objetos em Java, ele pode ser facilmente ordenada utilizando o método sort da *Collections*. Ele utilizar um método int compareTo(Object) para ordenar a lista, que retorna zero, quando o objeto comparado for igual a este objeto, se é negativo, se é menor, se é positivo, ou se este objeto for maior que o objeto dado. Este método está na interface Comparable, que pode ser implementado na classe que será ordenado em uma lista, ao chamar o método sort pode também ser passado como parâmetro além da lista que será ordenada um método que fará a ordenação. A classe string já implementa a interface Comparable que ordena em ordem alfabética seus elementos.

As ***ArrayLists*** também podem ser inseridas entre si, pois quando utilizamos arrays se faz necessário realizar uma cópia de seu conteúdo para realizar algum tipo de processamento, como implementando um laço com o comando for, utilizando o método clone, utilizando System.arraycopy, utilizando Arrays.copyOf.

## Fontes

- [DevMedia](https://www.devmedia.com.br/java-collections-set-list-e-iterator/29637)
- [DevMedia](https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298)
- [DevMedia](https://www.devmedia.com.br/colecoes-em-java-list/6026)
- [Unicamp](https://www.ic.unicamp.br/~vanini/mc202/apresentacoes/Collections.pdf)
- [Imagem](https://lh3.googleusercontent.com/proxy/eaQJjLTC_GV1qOzgH7DYNtbEW1fI2SwdJ0b_PUpjN47fgZuyn_OaEnKnem19qO53esvacuqUsSWEEOXBr_74bvo-EJseA05Btc3SGVyN8yxY2-tTE4Sb0xgyoHHPU1l9_HciB7r3-HT4ogWvow-Pww)
- [DevMedia](https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162)
- [DevMedia](https://www.devmedia.com.br/exemplos-com-arraylists-e-suas-propriedades-e-metodos-colecoes-estrutura-da-linguagem-parte-2/19255)
- [Sippulse](https://www.sippulse.com/ordenando-lista-de-objetos-em-java/#:~:text=Uma%20lista%20de%20objetos%20em%20Java%20pode%20ser%20facilmente%20ordenada,lista%20para%20ver%20sua%20ordem.)
- [DevMedia](https://www.devmedia.com.br/copiando-o-conteudo-de-um-array-em-java/26732)


## Authors

- [@daliladilazzaro](https://www.github.com/daliladilazzaro) 🧟‍♀️💖👩‍💻


