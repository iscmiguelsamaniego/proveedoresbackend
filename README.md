# proveedoresbackend



Aplicación para efectos de evaluación realizada con [Spring Boot](http://projects.spring.io/spring-boot/).

## Requerimientos

Para construir y ejecutar la aplicación necesitarás :

- [Java 22]
- [Maven 4](https://maven.apache.org)
- [Docker con PostgreSQL](https://hub.docker.com/_/postgres)
- [IntelliJ Community Edition](https://www.jetbrains.com/es-es/idea/)

Script de la BD y tabla

CREATE TABLE "proveedores" (
  "id" serial PRIMARY KEY,
  "nombre" varchar,
  "razonsocial" varchar,
  "direccion" varchar
);