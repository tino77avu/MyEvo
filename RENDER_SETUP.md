# Configuración Manual en Render (si render.yaml no funciona)

Si Render no detecta automáticamente el Dockerfile, sigue estos pasos para configurarlo manualmente:

## Pasos de Configuración en Render

### 1. Crear un Nuevo Web Service

1. Ve a [Render Dashboard](https://dashboard.render.com)
2. Haz clic en **"New +"** → **"Web Service"**
3. Conecta tu repositorio de GitHub: `tino77avu/Evo`
4. Selecciona la rama: `main`

### 2. Configuración del Servicio

**IMPORTANTE:** Configura estos valores exactamente:

- **Name:** `evo-app` (o el nombre que prefieras)
- **Environment:** Selecciona **"Docker"** (NO "Node" ni "Maven")
- **Region:** Elige la región más cercana
- **Branch:** `main`
- **Root Directory:** Deja vacío (o `.` si es necesario)

### 3. Configuración de Build y Start

**Build Command:** Deja VACÍO (Render usará el Dockerfile)

**Start Command:** Deja VACÍO (Render usará el Dockerfile)

**Dockerfile Path:** `Dockerfile` (o `./Dockerfile`)

**Docker Context:** `.` (punto, significa la raíz del proyecto)

### 4. Variables de Entorno (Opcional)

Puedes agregar estas variables de entorno si lo deseas:

- `JAVA_OPTS` = `-Xmx512m -Xms256m`
- `SPRING_PROFILES_ACTIVE` = `production`

**NOTA:** Render asignará automáticamente la variable `PORT`, no necesitas configurarla.

### 5. Health Check

- **Health Check Path:** `/`
- Render verificará automáticamente que la aplicación responda

### 6. Plan

- Selecciona el plan que prefieras (Free, Starter, etc.)

### 7. Crear el Servicio

- Haz clic en **"Create Web Service"**
- Render comenzará a construir la imagen Docker

## ⚠️ Solución del Error Actual

Si estás viendo el error de `yarn start`, significa que Render está detectando el proyecto como Node.js. Para solucionarlo:

1. **Edita el servicio existente** en Render
2. Ve a la sección **"Settings"**
3. Busca **"Environment"** y cámbialo a **"Docker"**
4. Asegúrate de que:
   - **Build Command** esté VACÍO
   - **Start Command** esté VACÍO
   - **Dockerfile Path** sea `Dockerfile`
5. Guarda los cambios
6. Render reconstruirá automáticamente con Docker

## Verificación

Una vez configurado correctamente, deberías ver en los logs algo como:

```
==> Building Docker image...
==> Running 'docker build...'
==> Starting container...
==> Running 'java -jar app.jar'
```

En lugar de:

```
==> Running 'yarn start'
```

## Troubleshooting

### Si sigue intentando usar yarn:
- Verifica que el Environment esté en "Docker"
- Asegúrate de que Build Command y Start Command estén VACÍOS
- Elimina y vuelve a crear el servicio si es necesario

### Si el build falla:
- Verifica los logs de build en Render
- Asegúrate de que el Dockerfile esté en la raíz del proyecto
- Verifica que todas las dependencias estén en pom.xml

### Si la aplicación no inicia:
- Revisa los logs de runtime
- Verifica que el puerto esté configurado correctamente en application.properties
- Asegúrate de que la variable PORT esté siendo usada
