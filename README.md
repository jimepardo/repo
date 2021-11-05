# Proyecto de Taller de Produccion de Software: JAVA

Practica 6 - Spring CORE

Integrantes:
- Lautaro Mondati
- Jimena Pardo

Importante:
● Antes de comenzar a trabajar en esta práctica, se sugiere contar con la estructura de
DAO genérico.
● Esta práctica se realizará usando lo que ya tiene implementado del proyecto final
Sistema de Reservas de Servicios.
● Dado que el framework Spring aún no es compatible con la versión 10 de Tomcat,
utilizaremos la versión 9.

1. Importe el proyecto ttps-spring.zip con la opción “Import MavenProject”. Las clases
anotadas, provistas en el proyecto proveen la configuración del sistema. Luego renombre este
proyecto.

2. Agregue en este proyecto las siguientes dependencias para trabajar con el framework Spring

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.3.12</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.12</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-orm</artifactId>
    <version>5.3.12</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.12</version>
</dependency>

3. Note que el proyecto importado no contiene una carpeta src/main/java. Analice el archivo de
configuración de Maven y verifique cual es la nueva carpeta que contiene el código fuente.

4. Analice la clase que provee la configuración para persistencia. Si su proyecto agrega un nuevo
paquete con clases de modelo, llamado: ttps.spring.model2021, qué modificaciones
realizaría?

5. Copie las clases de su proyecto original a este nuevo proyecto y modifique las clases DAO
para delegar en Spring la administración del EntityManager y de las transacciones.