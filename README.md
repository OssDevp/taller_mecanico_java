# Taller Mecánico: MOFA

### Captura de Pantalla
![Menu Inicio](/src/main/resources/menu-principal.png)

## Descripción

Esta aplicación Java, desarrollada siguiendo el patrón de diseño MVC (Modelo-Vista-Controlador), está diseñada para la gestión integral de un taller mecánico. Permite administrar clientes, vehículos, servicios, empleados, órdenes de trabajo, facturas y el inventario de productos.

## Características Principales

*   **Gestión de Clientes:** Registro, modificación y consulta de información de clientes (nombre, teléfono, dirección, etc.).
*   **Gestión de Vehículos:** Registro de vehículos asociados a clientes (placa, marca, modelo, etc.).
*   **Gestión de Servicios:** Definición de los servicios ofrecidos por el taller (nombre, descripción, costo).
*   **Gestión de Empleados:** Administración de la información de los empleados (nombre, cargo, habilidades).
*   **Gestión de Órdenes de Trabajo:** Creación, seguimiento y finalización de órdenes de trabajo, asignando vehículos, empleados y servicios.
*   **Gestión de Inventario:** Control del stock de productos y gestión de proveedores.
*   **Facturación:** Generación de facturas a partir de las órdenes de trabajo.

## Arquitectura

Este proyecto sigue el patrón de diseño Modelo-Vista-Controlador (MVC):

*   **Modelo (Entities):** Contiene las clases que representan los datos de la aplicación (Clientes, Vehiculos, Servicios, Empleados, etc.). Estas clases definen la estructura de los datos y su lógica de negocio básica.
*   **Vista (View):** Se encarga de la interfaz de usuario. En este caso, al ser una aplicación Java, probablemente uses Swing, JavaFX o una interfaz de línea de comandos. Esta capa muestra los datos al usuario y recibe sus interacciones.
*   **Controlador (Controller):** Actúa como intermediario entre el Modelo y la Vista. Recibe las acciones del usuario desde la Vista, interactúa con el Modelo para realizar las operaciones necesarias y actualiza la Vista con los resultados.
*   **DAO (Data Access Object):** (Añadido en tu estructura) Esta capa se encarga del acceso a la base de datos, separando la lógica de acceso a datos del resto de la aplicación.

[Puedes incluir un diagrama de clases simplificado aquí si lo consideras útil.]

## Instalación

### Requisitos Previos

*   [Java JDK 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
*   [Maven](https://maven.apache.org/download.cgi)
*   [MySQL Server](https://www.mysql.com/downloads/)
*   [Git](https://git-scm.com/)

### Pasos

1.  Clona el repositorio:

    ```bash
    git clone https://github.com/OssDevp/taller_mecanico_java.git
    ```

2.  Navega al directorio del proyecto:

    ```bash
    cd TallerMecanico
    ```

3.  Crea la base de datos en MySQL usando el script `estructura.sql`:

    ```bash
    mysql -u tu_usuario -p < estructura.sql
    ```
    luego puedes insertar datos de ejemplo con el script `script_insertar_datos.txt`:
 
### Opcional

4.  Compila el proyecto con Maven:

    ```bash
    mvn clean install
    ```

5.  Ejecuta la aplicación:

    *   **Ejemplo con JAR ejecutable (si lo generas):**

        ```bash
        java -jar target/taller-mecanico.jar
        ```

    *   **Ejemplo con IDE:** Importa el proyecto en tu IDE (IntelliJ, Eclipse, NetBeans) y ejecuta la clase `Main` dentro del paquete `tallermecanico.view`.

## Archivos Importantes

*   `ExampleHibernate.cfg.xml.txt`: Importante crear el archivo `hibernate.cfg.xml` y copiar la información de este archivo siguiendo los pasos explicados.
*   `estructura.sql`: Script SQL para crear la base de datos.
*   `script_insertar_datos.txt` (Recomendable): Un script para insertar datos de ejemplo en la base de datos para pruebas.
*   `pom.xml`: Archivo de configuración de Maven (si se usa Maven).