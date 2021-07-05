# Curso de Java ☕ pela MJV 📚 

Exercícios do curso de Java com Ênfase em SpringBoot e API. Neste projeto, contém pastas com exercícios realizados ao decorrer do curso, com exemplos práticos e teóricos. Abaixo estão listados em no conteúdo de suas respectivas pastas, para fácil orientação. 


## Pastas do Projeto 😸🥰
### api
***Exercício em prática***: utilizados exemplos em aula da pasta ***cadastro***, foi utilizado JPA para salvar informações no banco, Swagger para teste de API.

### cadastro
**Exercicio com *SpringBoot***: projeto com exemplos e exercícios em aula, inteitamente feito com springboot e dependencias, foram exercitados conceitos de ***@OneToMany***, ***@OneToOne***, ***@Temporal(TemporalType.DATE)***, ***@JoinColumn***, entre outros, e todos salvos em seus exemplos no banco de dados.

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

### docs_sql
**Código SQL**: compõe exemplos de códigos realizados com o sql Postegres, e exemplos usados com jpa, seguido do Hibernate.

```sql
Hibernate: 
    select
        cadastro0_.id as id1_0_0_,
        cadastro0_.area_atuacao as area_atu2_0_0_,
        cadastro0_.bairro as bairro3_0_0_,
        cadastro0_.cep as cep4_0_0_,
        cadastro0_.cidade as cidade5_0_0_,
        cadastro0_.complemento as compleme6_0_0_,
        cadastro0_.cpf_cnpj as cpf_cnpj7_0_0_,
        cadastro0_.email as email8_0_0_,
        cadastro0_.estado as estado9_0_0_,
        cadastro0_.nome as nome10_0_0_,
        cadastro0_.numero as numero11_0_0_,
        cadastro0_.observacao as observa12_0_0_,
        cadastro0_.pf_pj as pf_pj13_0_0_,
        cadastro0_.rua as rua14_0_0_,
        cadastro0_.site_instagram as site_in15_0_0_,
        cadastro0_.telefone1 as telefon16_0_0_,
        cadastro0_.telefone2 as telefon17_0_0_ 
    from
        tbl_cadastro cadastro0_ 
    where
        cadastro0_.id=?
Hibernate: 
    delete 
    from
        tbl_cadastro 
    where
        id=?
```

### java-collections
**Exercício com List**: atividade focada na collections de List, nele contém um README.md próprio explicando para que ele serve, hierarquia, métodos e ordenação, contendo um breve exemplo, e nele compõe código breve com seu conceito.

### java-project
**Exercício 1**: Este exercicio visa a criação de Cupom Fiscal, ele cria e imprime as informações em um arquivo txt. 

### maven-jdbc
**Exercício 2 com JDBC**: Classes DAO, Model, Conexao, e Utils que foca inteiramente na formatação de objetos como CPF, CNPJ e CEP. Usando o banco Postgres e ambiente do DBeaver. Dependencia do Postgres incluída no arquivo pom.xml.

### maven-jpa
**Exercício 3 com JPA**: utilizando Hibernate, Persistence, **_@Entity_**, **_@Id_**, **_@Table_** e **_@Column_**. Salvando as informações no banco de dados Postgres. Dependencia do Hibernate incluída no pom.xml, e informações do banco de dados no persistence.xml.


### Exemplo de função utilizada com JPA

```java
import model.Cadastro;

public List<Cadastro> busca(){
        return em.createQuery("FROM "+ Cadastro.class.getName()).getResultList();
    }
```

### spring-essentials
**Exercicio com spring**: nele contém framework do *Spring*. Criando, salvando, deletando, e editando objetos em banco de dados.

## Links usados para ajudar a compor o projeto: 

 - [README](https://readme.so/pt/editor)
 - [DevMedia](https://www.devmedia.com.br/jpa-e-hibernate-acessando-dados-em-aplicacoes-java/32711)
 - [MVNRepository](https://mvnrepository.com/artifact/org.postgresql/postgresql/42.2.22)
 - [SpringFramework](https://www.petrikainulainen.net/programming/spring-framework/spring-data-jpa-tutorial-three-custom-queries-with-query-methods/)
 - [SpringIo](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
 - [Hibernate](https://docs.jboss.org/hibernate/stable/annotations/reference/en/html_single/#d0e714)
 - [JavaPersistence](https://en.wikibooks.org/wiki/Java_Persistence)
 - [BootCampSantander](https://web.digitalinnovation.one/track/santander-mobile-developer?tab=path)
 - [Rest](https://spring.io/guides/tutorials/rest/)
 - [Oracle](https://www.oracle.com/br/technical-resources/articles/dsl/crud-rest-sb2-hibernate.html)


## Authors

- [@daliladilazzaro](https://github.com/daliladilazzaro) 💁💖💻👩‍💻
