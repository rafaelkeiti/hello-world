# Projeto de Aprendizado Spring Boot - Hello World

Este primeiro projeto foi criado com o objetivo de aprender os conceitos básicos do Spring Boot e implementar um simples "Hello World".

## Passos Iniciais

1. **HelloWorldController:**
   - Iniciei criando o `HelloWorldController` para definir o endpoint do projeto e entender o funcionamento básico.

####

2. **CheckHTTPResponse Test:**
   - Em seguida, realizei a criação do `CheckHTTPResponse`, um teste para verificar se o controller está retornando as informações conforme o esperado.

####

3. **Endpoints utilizados:**
   - http://localhost:8080/helloworld (Rota inicial)
   - http://localhost:8080/helloworld/other?person=rafael (Rota com parâmetros)

- **Foi utilizado somente o método HTTP GET no desenvolvimento.**

## Como Executar o Projeto

Para executar o projeto, siga os passos abaixo:

1. Clone o repositório:

   ```bash
   git clone https://github.com/rafaelkeiti/hello-world.git
   ```

2. Navegue até o diretório do projeto pela sua IDE:

   ```bash
   cd pasta-do-projeto
   ```

3. Execute o projeto usando o Gradle Wrapper:

   ```bash
   ./gradlew clean build bootRun 
   ```

    - No Windows, use `gradlew.bat` em vez de `./gradlew`.

4. Agora basta acessar as rotas, por exemplo: [http://localhost:8080/helloworld](http://localhost:8080/helloworld).