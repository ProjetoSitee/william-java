# william-java

API Spring Boot usada para aprender CI/CD com Jenkins e, em uma etapa posterior, deploy na AWS.

## Pipeline

O `Jenkinsfile` executa checkout, testes, validação de cobertura, empacotamento do JAR e criação da imagem OCI na branch `main`.

O JaCoCo exige no mínimo 70% de cobertura de linhas. A classe de inicialização do Spring é excluída por não conter regra de negócio. O relatório HTML é gerado em `target/site/jacoco/index.html` e arquivado pelo Jenkins.

## Endpoints

- `GET /` — resposta da aplicação
- `GET /actuator/health` — verificação de saúde

Nenhuma credencial deve ser salva neste repositório.
