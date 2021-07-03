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

***Caracterizado*** como o segundo da hierarquia, ele indexa os objetos e às vezes é chamada de sequência e por iniciar em 0 seus indices como um vetor. Ele contém métodos que manipulam elementos baseados em sua posição da lista, remove um determinado elemento, procura ocorrências de um elemento e percorre sequencialmente (ListIterator) todos os elementos da lista. A interface List é implementada por várias classe, incluídas as classes ArrayList (implementada como vetor), LinkedList e Vector, podendo, tambén receber elementos iguais, exemplo x1 e x2, onde x1.equals(x2) retorna verdadeiro, além de múltiplos null. O ArrayList implementa de forma dinamica, uma lista de objetos em vetor, sendo seu uso de forma mais adequada em momentos que o acesso é aleatório aos elementos é mais frequente. Já o *LinkedList*, implementa uma lista de objetos sob a forma de uma lista ligada, seu uso é melhor quando o acesso aleatório não é freqüente sendo o tamanho da lista variado. Com uma visão voltada para API, como ele é utilizado, o Vector e o ArayList são parecidos, podendo fácilmente confundilos por parecerem identicos. Quando não se tem domínio sobre eles, poderam ser usados como se fossem o mesmo, sem notar nenhuma diferença.



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

![Logo](https://lh3.googleusercontent.com/proxy/eaQJjLTC_GV1qOzgH7DYNtbEW1fI2SwdJ0b_PUpjN47fgZuyn_OaEnKnem19qO53esvacuqUsSWEEOXBr_74bvo-EJseA05Btc3SGVyN8yxY2-tTE4Sb0xgyoHHPU1l9_HciB7r3-HT4ogWvow-Pww)

## Fontes

- [DevMedia](https://www.devmedia.com.br/java-collections-set-list-e-iterator/29637)
- [DevMedia](https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298)
- [DevMedia](https://www.devmedia.com.br/colecoes-em-java-list/6026)
- [Unicamp](https://www.ic.unicamp.br/~vanini/mc202/apresentacoes/Collections.pdf)
- [Imagem](https://lh3.googleusercontent.com/proxy/eaQJjLTC_GV1qOzgH7DYNtbEW1fI2SwdJ0b_PUpjN47fgZuyn_OaEnKnem19qO53esvacuqUsSWEEOXBr_74bvo-EJseA05Btc3SGVyN8yxY2-tTE4Sb0xgyoHHPU1l9_HciB7r3-HT4ogWvow-Pww)
- [DevMedia](https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162)


## Authors

- [@daliladilazzaro](https://www.github.com/daliladilazzaro) 🧟‍♀️💖👩‍💻


