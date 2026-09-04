#Project requirements
## 1. Requerimientos generales
El sistema debe de poder:
1. Permitirle a los usuarios apartar tutorias.
2. Conectarse con sistemas externos para validación de datos y envío de notificaciones.

### 1.1 Requerimientos funcionales
1. Se debe permitir al usuario iniciar el proceso de apartado de una tutoría.
2. El sistema debe de permitir al estudiante una preferencia del tutor, como:
-1.FASTES_AVAILABLE, no importa la persona, el que esté disponible más rápido.
-2.EXPERT_FIRST, primero se busca entre los profesores, escogiendo el más próximo, si no hay, se escoge de los estudiantes de posgrado.
-3.PEER_TUTORING, no se toman en cuenta los profesores, sólo se piden estudiantes.
3. Se debe hacer la conexión con el sistema de NotifyMe para el envío de notificaciones a estudiantes.

### 1.2 Requerimientos no funcionales
1. El sistema debe seguir la paleta de colores de la universidad e ingeniería de sistemas.
2. El sistema debe ser responsive.


## Especificación de requerimientos
### 2.1 Requerimiento Funcional 1
| Campo | Descripción |
|------|-------------|
| **ID** | RF-01 |
| **Nombre del requerimiento** |Iniciar proceso de apartado|
| **Descripción** |El sistema debe permitirle al estudiante iniciar un proceso de apartado de una tutoría.|
| **Precondiciones** | Ninguna |
| **Actor** | Estudiante|
| **Flujo principal** | 1. El estudiante ingresa a la opción de apartar una tutoría. |
| **Diagrama de caso de uso** | (![Caso1](../uml/Case1.png))|
| **Poscondiciones** | Al estudiante le aparece un mensaje de ingreso de datos para validar su usuario y materias.|


### 2.2 Requerimiento Funcional 2

| Campo | Descripción |
|------|-------------|
| **ID** | RF-02 |
| **Nombre del requerimiento** | Escoger preferencia de tutoría|
| **Descripción** | El estudiante debe poder escoger la preferencia de una tutoría para poder apartarla.|
| **Precondiciones** |El estudiante ya debe de haber abierto un proceso de apartado, el sistema ya debió haber validado las credenciales y está en el proceso de especificar los datos. |
| **Actor** | Estudiante |
| **Flujo principal** |1. El estudiante ingresa a la opción de apartar una tutoría.<br>2. El sistema solicita el id del estudiante.<br>3. El estudiante ingresa su id.<br>4. Se valida con enlace si puede seguir con el proceso.<br>5. El estudiante ingresa a la matería y llega al momento de ingresar su preferencia.<br>6. Dependiendo de la preferencia se escoge el tutor. |
| **Diagrama de caso de uso** | (![Caso2](../uml/Case2.png))|
| **Poscondiciones** |El sistema realiza las validaciones, guarda los datos y termina el proceso de apartado.|