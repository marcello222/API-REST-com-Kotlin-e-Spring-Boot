# API-REST-com-Kotlin-e-Spring-Boot

Aprendemos nesse projeto: Parte 1

1- Criação de classes de domínio que representam os recursos da API;
A trabalhar com requisições GET na API utilizando a anotação @GetMapping;
A criar uma camada Service na API para isolar as regras de negócio;
Como receber um parâmetro pela URI utilizando a anotação @PathVariable.

2- Como trabalhar com requisições POST na API com as anotações @PostMapping e @RequestBody;
Como testar a API utilizando a ferramenta Postman para disparar requisições HTTP;
A criar classes DTO para representar os dados da API;
A criar classes Mapper para a conversão de objetos DTO;
Como realizar validações utilizando o Bean Validation com as anotações @Valid, @NotEmpty e @Size.

3- A trabalhar com requisições PUT na API com a anotação @PutMapping;
A trabalhar com requisições DELETE na API com a anotação @DeleteMapping;
A seguir boas práticas do REST nos retornos da API, com a utilização correta dos códigos HTTP.

4-As classes dos códigos HTTP e seus significados;
A criar uma classe Controller Advice para tratamento de erros na API, utilizando as anotações @RestControllerAdvice e @ExceptionHandler;
A realizar o tratamento de erros 500 que ocorrerem na API;
A realizar o tratamento de erros 400 que ocorrerem na API.

Aprendemos nesse projeto: Parte 2

1- Adicionar o Spring Data JPA na API, incluindo suas dependências no arquivo pom.xml;
Configurar o Spring Data JPA via propriedades no arquivo application.yml;
Mapear as classes de domínio como entidades JPA, utilizando as anotações @Entity, @Id, @ManyToOne e @OneToMany;
Criar interfaces repository para acesso ao banco de dados, herdando da interface JpaRepository do Spring Data JPA;
Testar as mudanças na API utilizando o Postman para envio de requisições HTTP.

2- Que utilizar o recurso de migrations ajuda a manter um histórico da evolução do schema do banco de dados da API;
Como adicionar o Flyway como ferramenta de migration na API, via dependência no arquivo pom.xml;
Como definir as migrations da API, criando scripts SQL na pasta src/main/resources/db/migrations;
Como validar a criação correta do schema do banco de dados pelas migrations, analisando a estrutura do banco de dados que foi gerada pelo Flyway.

3- A criar métodos de consultas com filtros nos repositórios da API, utilizando o padrão de nomenclatura findBy do Spring Data JPA;
Como realizar paginação e ordenação nas consultas ao banco de dados utilizando a interface Pageable do Spring Data JPA;
Como disparar requisições no Postman utilizando os parâmetros size, page e sort para o retorno de dados paginados;
A modificar os parâmetros default de paginação e ordenação com a utilização da anotação @PageableDefault.

4- A adicionar o módulo de cache do Spring Boot via dependência no arquivo pom.xml;
Que devemos habilitar o uso de cache na API utilizando a anotação @EnableCaching;
A realizar cache de consultas no banco de dados utilizando a anotação @Cacheable em métodos dos controllers;
Que podemos invalidar um cache ao alterar os registros de uma tabela no banco de dados, utilizando a anotação @CacheEvict em métodos dos controllers.

5- As propriedades que precisamos declarar no arquivo application.yml para habilitar o console do banco de dados H2;
Como acessar e navegar pelo console do banco de dados H2 via browser;
Que é possível escrever consultas personalizadas nos repositórios da API, com a utilização da anotação @Query do Spring Data JPA;
Que é possível utilizar injeção de dependências para ter acesso à interface do EntityManager na API.
