# Proyecto Call Center - Momento 3

## Descripción

Proyecto desarrollado en Java Spring Boot utilizando JPA/Hibernate y SQL Server para gestionar empleados de un Call Center.

El sistema permite:

- Registrar empleados
- Consultar empleados
- Buscar empleados por ID
- Eliminar empleados
- Persistencia real en base de datos SQL Server

---

# Tecnologías utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- SQL Server
- Maven

---

# Configuración de Base de Datos

Editar el archivo:

src/main/resources/application.properties

Configuración usada:

```properties
spring.application.name=ventas

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=CallCenterDB;encrypt=true;trustServerCertificate=true
spring.datasource.username=sa
spring.datasource.password=123456789

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

//Integración Frontend y Backend

El Backend desarrollado en Spring Boot expone endpoints REST que pueden ser consumidos por cualquier Frontend web o móvil.

Un desarrollador Frontend puede:

Obtener información mediante peticiones GET
Registrar empleados usando POST
Eliminar empleados usando DELETE
Mostrar la información en interfaces gráficas web

El Backend se conecta directamente con SQL Server mediante Hibernate y JPA, realizando persistencia real de los datos.

El Frontend consumiría estos servicios usando tecnologías como:

HTML/CSS/JavaScript
React
Angular
Vue

La arquitectura utilizada separa:

Frontend → Interfaz visual
Backend → Lógica y acceso a datos
Base de Datos → Persistencia de información