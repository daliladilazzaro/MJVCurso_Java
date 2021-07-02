# Exercicio Java ☕ Collections -> **List** ✔️

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

***Caracterizado*** como o segundo da hierarquia, ele indexa os objetos e às vezes é chamada de sequência e por iniciar em 0 seus indices como um vetor. Ele contém métodos que manipulam elementos baseados em sua posição da lista, remove um determinado elemento, procura ocorrências de um elemento e percorre sequencialmente (ListIterator) todos os elementos da lista. A interface List é implementada por várias classe, incluídas as classes ArrayList (implementada como vetor), LinkedList e Vector, podendo, tambén receber elementos iguais, exemplo x1 e x2, onde x1.equals(x2) retorna verdadeiro, além de múltiplos null.

## Fontes

- [DevMedia](https://www.devmedia.com.br/java-collections-set-list-e-iterator/29637)
- [DevMedia](https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298)
- [DevMedia](https://www.devmedia.com.br/colecoes-em-java-list/6026)


## Authors

- [@daliladilazzaro](https://www.github.com/daliladilazzaro)


