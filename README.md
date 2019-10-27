# musicplayce-ws

Aplicação Java Web desenvolvida utilizando Spring Boot e H2DB (In-Memory)


## Instalação
clone o projeto e na pasta raiz utilize:

```bash
mvn clean install
```

## Executando

Na pasta raiz do projeto após a instalação utilize

```bash
java -jar target/musicplayce-0.0.1-SNAPSHOT.jar
```
ou
```bash
mvn spring-boot:run
```

### deploy com docker
Na pasta raiz do projeto após instalação execute:

```bash
docker-compose up
```


## Serviços disponiveis:
### GET
retorna lista de strings cadastradas;

http://localhost:8080/string-mp

### POST
cadastra ou altera string e retorna a string cadastrada;

http://localhost:8080/string-mp
payload:
```bash
{
        "valor": "xpto"
}
```
ou
```bash
{
        "id": 1,
        "valor": "xpto"
}
```

### DELETE
deleta a string por id;
http://localhost:8080/string-mp/delete/{id}
# zssn
