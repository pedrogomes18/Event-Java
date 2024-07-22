# Projeto de Gerenciamento de Eventos

Este projeto é uma aplicação desenvolvida com Java 21 e Spring Boot, que permite a criação, leitura, atualização e exclusão (CRUD) de eventos. Além disso, possui funcionalidades de filtragem para facilitar a busca de eventos específicos.

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
- **H2 Database**: Banco de dados em memória utilizado para desenvolvimento e testes.
- **Spring Data JPA**: Abstração para facilitar a interação com o banco de dados.
- **PostgreSQL**: Banco de dados relacional.
- **DevTools**: Ferramente para o desenvolvimento

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

    <!-- Banco de dados H2 -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Testes -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```
## Configuração

1. **Clone o repositório**:

    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. **Navegue até o diretório do projeto**:

    ```bash
    cd seu-repositorio
    ```

3. **Compile e execute a aplicação**:

    ```bash
    mvn spring-boot:run
    ```

## Uso

Após iniciar a aplicação, você pode acessar a interface web através do seguinte URL:


Aqui você pode criar, visualizar, atualizar, excluir e filtrar eventos conforme necessário.

## Contribuição

Se você quiser contribuir para este projeto, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-funcionalidade`).
3. Commit suas alterações (`git commit -m 'Adicionei nova funcionalidade'`).
4. Faça um push para a branch (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.


