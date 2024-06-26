# Backend Proveedores

Aplicación para efectos de evaluación realizada con [Spring Boot](http://projects.spring.io/spring-boot/).

## Apis disponibles

- Se recomienda utilizar Postman https://www.postman.com/ ó Bruno https://www.usebruno.com/

#### Obtener todos los usuarios (GET)
http://localhost:8080/datosdelsistema/getAll
<br/>
#### Crear proveedor (POST)
http://localhost:8080/proveedores/create
#### Parámetros (JSON)
{ 
    "nombre" : "asignarparametro",
    "razonsocial" : "asignarparametro",
    "direccion" : "asignarparametro"
}
<br/>
#### Obtener todos los proveedores (GET)
http://localhost:8080/proveedores/getAll
<br/>
#### Actualizar proveedor (PUT)
http://localhost:8080/proveedores/update
#### Parámetros (JSON)
{ 
    "id": 1 //Asignar id a modificar
    "nombre" : "asignarparametro",
    "razonsocial" : "asignarparametro",
    "direccion" : "asignarparametro"
}
<br/>
#### Borrar proveedor (POST)
http://localhost:8080/proveedores/delete
#### Parámetros (JSON)
{ 
    "id": 1 //Asignar id a eliminar  
}
<br/>
<br/>
## Requerimientos

Para construir y ejecutar la aplicación necesitarás :

- [Java 22] (https://openjdk.org/projects/jdk/22/)
- [Docker con PostgreSQL](https://hub.docker.com/_/postgres)
- [IntelliJ Community Edition](https://www.jetbrains.com/es-es/idea/)
- [pgAdmin](https://www.pgadmin.org/)

Pasos para ejecutar el proyecto :

## Docker y PostgreSQL

* Instalar Docker
  https://www.docker.com/products/docker-desktop/

* Previamente instalado docker hacer pull a la imagen de BD PostgreSQL (ejecutar el comando desde terminal)
 <br/>
  	__docker pull postgres__

* Ejecutar la imagen de docker desde terminal, favor de considerar agregar usuario y contraseña de su preferencia
 <br/>
  	__docker run -itd -e POSTGRES_USER=myuser -e POSTGRES_PASSWORD=mypassword -p 5432:5432 -v__ 

* Abrir pgAdmin, debera iniciar sesión con su usuario y contraseña de perferencia previamente asignada
  <br/>
  https://www.pgadmin.org/

* También desde pgAdmin  ubique la herramienta QueryTool
    - Desde el ObjectExplorer (ubicado en la esquina izquierda de la ventana pgAdmin) de clic derecho del mouse sobre la opcion localhost, seleccione la opcion Create Database del menu contextual.
    - Asigne un nombre de la BD y pulse sobre el botón Guardar (Save)
    - También desde ObjectExplorer de clic derecho del mouse sobre la base de datos, seleccione la opcion Query Tool del menu contextual.
    - Ejecute la siguiente consulta para crear las tablas proveedores y datosdelsistema
 
      __Tabla Proveedores__
      
        CREATE TABLE "proveedores" (
          "id" serial PRIMARY KEY,
          "nombre" varchar,
          "razonsocial" varchar,
          "direccion" varchar
        );
      
      __Tabla Datos del Sistema__
      
        CREATE TABLE "datosdelsistema" (
        "id" serial PRIMARY KEY,
        "msg_al_usuario" varchar,
        "version" varchar
        );

      __Insertar los Datos del Sistema__
        
        INSERT INTO public.proveedores(nombre, razonsocial, direccion)
	      VALUES ('nombre del proveedor', 'razon social del proveedor', 'dirección del proveedor');
      
## Descargar repositorio de Github
* Descargar Git para utilizar la linea de comandos
  https://git-scm.com/

* Clone el proyecto desde la linea de comandos  
  git clone https://github.com/iscmiguelsamaniego/proveedoresbackend.git

## IntelliJ y SpringBoot

* Instalar IntelliJ Community Edition
  https://www.jetbrains.com/idea/download/?section=windows

* Nota : El proyecto fue creado con (utilizando maven)
  https://start.spring.io/

* Ejecute intelliJ, ubique el proyecto previamente clonado desde GitHub

* Cambie las propiedades de conexion a bd del archivo application.properties
  
  * Asigne la base de datos a utilizar
    - spring.datasource.url= jdbc:postgresql://localhost/nombredelabasededatos
      
  * Asigne el usuario 
    - spring.datasource.username= myusername
      
  * Asigne la contraseña
    - spring.datasource.password= mypassword
   
  * Tomar en cuenta la configuración para ejecutar Springboot desde IntelliJ  
  <br><br>
<img src="https://github.com/iscmiguelsamaniego/proveedoresbackend/blob/main/springbootrunconfigintellij.PNG" width="793" height="680">
<br><br>
  
  
