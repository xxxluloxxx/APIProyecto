# APIProyecto
API realizada con spring boot, cuyo unico fin es guardar informacion del sitio https://jsonplaceholder.typicode.com, que expone un servico Rest de usuarios, albumes y fotos, para asi agreghar una nueva
funcionalidad que es compartir albumenes de fotos entre usuarios.

### Datos básicos del aplicativo ###

* Puerto: 8080
* Versión: 1.0

### Datos básicos de la BD POSTGRESQL ###

* database=POSTGRESQL
* datasource.url=jdbc:postgresql://dbpostgresql:5432/apidatos
* username=postgres
* password=sistemas

### Datos de la persona ###

Los datos del usuario que se manejan son los siguientes:

* **id**
* * Id del usuario
* **name**
* * Nombres del usuario
* **username**
* * Usuario
* **email**
* * Email del usuario

### Servicios REST expuestos ###

Como funcionalidad se necesita compartir albums a los usuarios, por lo que vamos a realizar lo siguiente:
* **Compartir**
* * URL: http://localhost:8080/usuarios/compartir/15/50

Esto lo quer va a realizar es:

Buscar a la persona con id 5 de la base de https://jsonplaceholder.typicode.com y guardarlo en nuestra base local.

Buscar el album con id 50 de la base de https://jsonplaceholder.typicode.com y guardarlo en nuestra base local.

Y finalmente asignarlos entre sí para darles permisos de visualizacion del album.


Se necesita verificar cuales son los usuarios que pueden ver un album o tienen permiso al mismo, para esto lo realizaremos de la siguiente forma:
* **Traer a los usuarios que tienen permisos sobre un álbum.**
* * Metodo: PUT
* * URL: http://localhost:8080/albums/usuarios/40

Esto lo quer va a realizar es:

Ver todos los usuarios que pueden acceder al album con id 40
