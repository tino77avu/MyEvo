# EVO ↑

EVO es un espacio personal diseñado para acompañarte en tu día a día. Aquí puedes reflexionar, expresar lo que sientes y dar seguimiento a tu proceso con calma. La herramienta analiza tus avances a lo largo del tiempo, reconoce tus logros y te orienta sobre aquello que puedes reforzar, siempre desde un enfoque humano, respetuoso y sin juzgarte.

## 🚀 Características

- **Espacio personal**: Reflexiona y expresa tus pensamientos a tu ritmo
- **Análisis de progreso**: La herramienta analiza tus avances a lo largo del tiempo
- **Reconocimiento de logros**: Identifica y valora tus avances
- **Enfoque humano**: Acompañamiento respetuoso y sin juicios
- **Interfaz intuitiva**: Diseño moderno y fácil de usar

## 🛠️ Tecnologías

- **Spring Boot 4.0.1**: Framework de aplicación web
- **Thymeleaf**: Motor de plantillas para las vistas HTML
- **Java 17**: Lenguaje de programación
- **Maven**: Gestión de dependencias y construcción del proyecto

## 📋 Requisitos

- Java 17 o superior
- Maven 3.6 o superior

## 🔧 Instalación

### Opción 1: Ejecución Local

1. Clona el repositorio:
```bash
git clone git@github.com:tino77avu/Evo.git
cd Evo
```

2. Compila el proyecto:
```bash
mvn clean install
```

3. Ejecuta la aplicación:
```bash
mvn spring-boot:run
```

4. Abre tu navegador en:
```
http://localhost:8080
```

### Opción 2: Usando Docker

1. Construye la imagen Docker:
```bash
docker build -t evo-app .
```

2. Ejecuta el contenedor:
```bash
docker run -p 8080:8080 evo-app
```

3. Abre tu navegador en:
```
http://localhost:8080
```

## 🚀 Despliegue en Render

Para desplegar la aplicación en Render, consulta la [Guía de Despliegue](DEPLOY.md).

La aplicación está lista para desplegarse en Render usando Docker. Simplemente conecta tu repositorio de GitHub en Render y sigue las instrucciones.

## 📁 Estructura del Proyecto

```
Evolucion/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/admin/evolucion/
│   │   │       ├── controller/
│   │   │       │   └── EvolucionController.java
│   │   │       └── EvolucionApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── images/      # Imágenes del sitio
│   │       ├── templates/        # Plantillas Thymeleaf
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## 🌐 Páginas Disponibles

- **Inicio** (`/`): Página principal con información sobre EVO
- **El Cambio** (`/evolucion4/el-cambio`): Descripción del cambio que ofrece EVO
- **Cómo Funciona** (`/evolucion4/como-funciona`): Explicación del funcionamiento
- **Lo que logras** (`/evolucion4/lo-que-logras`): Beneficios y resultados
- **Por qué EVO** (`/evolucion4/por-que-evo`): Para quién es y diferencias
- **Contacto** (`/evolucion4/contacto`): Formulario de contacto

## 📝 Desarrollo

El proyecto utiliza Spring Boot con Thymeleaf para el renderizado de vistas. Las imágenes se encuentran en `src/main/resources/static/images/` y las plantillas HTML en `src/main/resources/templates/`.

## 📄 Licencia

Este proyecto es privado y está bajo derechos reservados.

## 👥 Contacto

Para más información, visita la página de contacto en la aplicación o escribe a través del formulario disponible.

---

**EVO ↑ © 2026. Todos los derechos reservados.**
