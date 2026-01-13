# Guía de Despliegue en Render

Esta guía te ayudará a desplegar la aplicación EVO en Render usando Docker.

## 📋 Requisitos Previos

- Cuenta en [Render](https://render.com)
- Repositorio de GitHub con el código (ya configurado)
- Acceso SSH configurado para GitHub (opcional, pero recomendado)

## 🚀 Pasos para Desplegar

### Opción 1: Usando render.yaml (Recomendado)

1. **Conectar el repositorio en Render:**
   - Ve a [Render Dashboard](https://dashboard.render.com)
   - Haz clic en "New +" y selecciona "Blueprint"
   - Conecta tu repositorio de GitHub: `tino77avu/Evo`
   - Render detectará automáticamente el archivo `render.yaml`

2. **Render configurará automáticamente:**
   - Tipo: Web Service
   - Dockerfile: `./Dockerfile`
   - Puerto: Asignado automáticamente
   - Health Check: Configurado automáticamente

3. **Despliegue:**
   - Render construirá la imagen Docker automáticamente
   - La aplicación estará disponible en la URL proporcionada por Render

### Opción 2: Configuración Manual

1. **Crear un nuevo Web Service:**
   - Ve a [Render Dashboard](https://dashboard.render.com)
   - Haz clic en "New +" y selecciona "Web Service"
   - Conecta tu repositorio de GitHub: `tino77avu/Evo`

2. **Configurar el servicio:**
   - **Name:** `evo-app` (o el nombre que prefieras)
   - **Environment:** `Docker`
   - **Dockerfile Path:** `./Dockerfile`
   - **Docker Context:** `.` (raíz del proyecto)
   - **Plan:** `Free` (o el plan que prefieras)

3. **Variables de Entorno (opcionales):**
   - `JAVA_OPTS`: `-Xmx512m -Xms256m`
   - `SPRING_PROFILES_ACTIVE`: `production`
   - `PORT`: Render lo asigna automáticamente

4. **Configurar Health Check:**
   - **Health Check Path:** `/`
   - Render verificará automáticamente que la aplicación responda

5. **Desplegar:**
   - Haz clic en "Create Web Service"
   - Render comenzará a construir y desplegar la aplicación

## 🔧 Configuración del Puerto

La aplicación está configurada para usar la variable de entorno `PORT` que Render asigna automáticamente. Esto está configurado en `application.properties`:

```properties
server.port=${PORT:8080}
```

Si Render no asigna un puerto, la aplicación usará el puerto 8080 por defecto.

## 📝 Notas Importantes

- **Primer despliegue:** Puede tardar varios minutos mientras Render construye la imagen Docker
- **Despliegues automáticos:** Render desplegará automáticamente cuando hagas push a la rama `main`
- **Logs:** Puedes ver los logs en tiempo real desde el dashboard de Render
- **Variables de entorno:** Puedes agregar variables de entorno desde el dashboard si necesitas configuraciones adicionales

## 🐛 Solución de Problemas

### La aplicación no inicia
- Verifica los logs en el dashboard de Render
- Asegúrate de que el Dockerfile esté en la raíz del proyecto
- Verifica que el puerto esté configurado correctamente

### Error de compilación
- Verifica que todas las dependencias estén en `pom.xml`
- Revisa los logs de build en Render

### Health check falla
- Verifica que la aplicación esté respondiendo en la ruta `/`
- Ajusta el `healthCheckPath` en `render.yaml` si es necesario

## 🔗 URLs

Una vez desplegado, Render te proporcionará una URL como:
- `https://evo-app.onrender.com` (o el nombre que hayas elegido)

## 📚 Recursos Adicionales

- [Documentación de Render](https://render.com/docs)
- [Docker en Render](https://render.com/docs/docker)
- [Health Checks en Render](https://render.com/docs/health-checks)
