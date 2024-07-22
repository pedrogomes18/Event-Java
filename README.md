# Projeto de Gerenciamento de Eventos

Este projeto é uma aplicação desenvolvida com Java 21 e Spring Boot, que permite a criação, leitura, atualização e exclusão (CRUD) de eventos. Além disso, possui funcionalidades de filtragem para facilitar a busca de eventos específicos. A aplicação também integra com a AWS para o armazenamento de imagens.

## Funcionalidades

- **Criar Evento**: Permite a criação de novos eventos com detalhes específicos.
- **Ler Eventos**: Visualização de todos os eventos cadastrados.
- **Atualizar Evento**: Atualização das informações de eventos existentes.
- **Excluir Evento**: Remoção de eventos do sistema.
- **Filtrar Eventos**: Busca de eventos com base em critérios específicos.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação utilizada para desenvolver a aplicação.
- **Spring Boot**: Framework que facilita a criação de aplicações Java.
- **Maven**: Gerenciador de dependências e build.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenamento persistente.
- **Spring Data JPA**: Abstração para facilitar a interação com o banco de dados.
- **DevTools**: Ferramenta para melhorar a experiência de desenvolvimento.
- **AWS S3**: Serviço da Amazon para armazenamento de imagens.

## Uso

Após iniciar a aplicação, você pode acessar a interface web através do seguinte URL:


Aqui você pode criar, visualizar, atualizar, excluir e filtrar eventos conforme necessário.

## Contribuição

Se você quiser contribuir para este projeto, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma nova branch (git checkout -b feature/nova-funcionalidade).
3. Commit suas alterações (git commit -m 'Adicionei nova funcionalidade').
4. Faça um push para a branch (git push origin feature/nova-funcionalidade).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Dependências

Certifique-se de que as seguintes dependências estão presentes no arquivo `pom.xml`:

```xml
<dependencies>
    <!-- Dependências do Spring Boot -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>

    <!-- Banco de dados PostgreSQL -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
    </dependency>

    <!-- AWS SDK para Java -->
    <dependency>
        <groupId>com.amazonaws</groupId>
        <artifactId>aws-java-sdk-s3</artifactId>
    </dependency>

    <!-- Testes -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
