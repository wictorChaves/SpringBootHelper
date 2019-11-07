# TravisCI - oraclejdk8 para openjdk8

Devido a alterações na licença da JDK da Oracle, o TravisCI passou a gerar um erro.

# Solução

Altere o arquivo `.travis.yml` desta forma:

    language: java
    jdk:
      - openjdk8

Para evitar problemas com permissão no Windows acrescente mais duas linhas, deixando o arquivo desta forma:

    language: java
    jdk:
      - openjdk8
    before_install:
      - chmod +x mvnw

> Obs: A tabulação deve ter 2 espaços