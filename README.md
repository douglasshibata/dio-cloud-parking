# dio-cloud-parking
Projeto desenvolvido com a aula da plataforma da Digital Innovation One para o aprendizado de uma API utilizando spring

## Dependências
* Spring web
* Swagger
* Postgresql
* modelmapper
* spring-boot-starter-data-jpa
* spring-boot-starter-security


## Run database
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:12

## Start and Stop

### Stop Database
docker stop parking-db

### Start Database
docker start parking-db