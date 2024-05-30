# FINTONIC CHALLENGE 👨🏻‍💻

## Descripción 📃
<p style="text-align: justify;">
Esta aplicación Spring Boot con Arquitectura Hexagonal proporciona un servicio REST para crear tareas y listar.</p>

<p>Tecnologías y herramientas usadas:</p>
1. SpringBoot<br/>
2. JPA<br/>
3. SpringData<br/>
4. Lombok<br/>
5. OpenAPI<br/>
6. Docker<br/>

## Instrucciones ✏️

### Construcción del Proyecto
1. Clona este repositorio.
2. Aseguraese de tener Docker y Docker Compose instalados.
3. Abre una terminal y navega al directorio del proyecto.
4. Ejecuta el siguiente comando para construir e iniciar la aplicación:
```bash
docker compose up -d --build
```

### Ejecución de Tests 🔍
1. Pruebas Unitarias: Ejecuta las pruebas unitarias desde tu entorno de desarrollo o mediante el siguiente comando:
```bash
mvn test
```
2. Pruebas de Integración: Ejecuta las pruebas de integración con el siguiente comando:
``` bash
mvn test -Dtest=TaskRestAdapterIntegrationTest
```

### Documentación de la API 📘
La API está documentada con OpenAPI y Swagger. Puedes acceder a la documentación de la API a través de la siguiente URL después de iniciar la aplicación: `http://localhost:9292/swagger-ui.html`