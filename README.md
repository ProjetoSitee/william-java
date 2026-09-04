# william-java

API Spring Boot usada para aprender CI/CD com Jenkins e, em uma etapa posterior, deploy na AWS.

## Pipeline

O `Jenkinsfile` executa checkout, testes, empacotamento do JAR e criação da imagem Docker na branch `main`.

## Endpoints

- `GET /` — resposta da aplicação
- `GET /actuator/health` — verificação de saúde

Nenhuma credencial deve ser salva neste repositório.

