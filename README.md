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


## Links usados para ajudar a compor o projeto: 

 - [README](https://readme.so/pt/editor)
 - [DevMedia](https://www.devmedia.com.br/jpa-e-hibernate-acessando-dados-em-aplicacoes-java/32711)
 - [MVNRepository](https://mvnrepository.com/artifact/org.postgresql/postgresql/42.2.22)


## Authors

- [@daliladilazzaro](https://github.com/daliladilazzaro)
