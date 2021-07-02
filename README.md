# Exercicios de Java ☕ pela MJV 📚 

### java-project
**Exercicio 1**: Este exercicio visa a criação de Cupom Fiscal, ele cria e imprime as informações em um arquivo txt. 

### maven-jdbc
**Exercicio 2 com JDBC**: Classes DAO, Model, Conexao, e Utils que foca inteiramente na formatação de objetos como CPF, CNPJ e CEP. Usando o banco Postgres e ambiente do DBeaver. Dependencia do Postgres incluida no arquivo pom.xml.

### maven-jpa
**Exercicio 3 com JPA**: utilizando Hibernate, Persistence, **_@Entity_**, **_@Id_**, **_@Table_** e **_@Column_**. Salvando as informações no banco de dados Postgres. Dependencia do Hibernate incluida no pom.xml, e informações do banco de dados no persistence.xml.


### Exemplo de função utilizada com JPA

```java
import model.Cadastro;

public List<Cadastro> busca(){
        return em.createQuery("FROM "+ Cadastro.class.getName()).getResultList();
    }
```

### java-collections
**Exercicio com List**: atividade focada na collections de List, nele contém um READEME.md próprio explicando para que ele serve, contendo um breve exemplo, e nele compõe código breve com seu conceito.

### spring-essential
**Exercicio com spring**: nele contém framework do *Spring*. Criando, salvando, deletando, e editando objetos em banco de dados.

## cadastro
**Exercicio com *SpringBoot***: projeto inteitamente feito com springboot e dependencias, foram exercitados conceitos de ***@OneToMany***, ***@OneToOne***, ***@Temporal(TemporalType.DATE)***, ***@JoinColumn***, entre outros, e todos salvos em seus exemplos no banco de dados.

### Exemplo de função utilizada com SpringBoot

```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_endereco")
public class Endereco {

    @Id
    private int id;
    private String logradouro;
    private String numero;

    @ManyToOne
    @JoinColumn(name = "tab_cep")
    private CEP cep;   
```

## Links usados para ajudar a compor o projeto: 

 - [README](https://readme.so/pt/editor)
 - [DevMedia](https://www.devmedia.com.br/jpa-e-hibernate-acessando-dados-em-aplicacoes-java/32711)
 - [MVNRepository](https://mvnrepository.com/artifact/org.postgresql/postgresql/42.2.22)


## Authors

- [@daliladilazzaro](https://github.com/daliladilazzaro) 💁💖💻
