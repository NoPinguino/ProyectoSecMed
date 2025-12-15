# Sistema de Gestión Hospitalaria – SecMed

Proyecto de gestión hospitalaria desarrollado en Java para la asignatura **Sistemas y Procesos** del segundo curso del Ciclo Superior de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

El proyecto ha sido desarrollado con fines puramente educativos por el dueño del repositorio ➩ [github.com/NoPinguino](https://github.com/NoPinguino)

Siéntete libre de utilizar este proyecto para tus propios fines si te resulta útil.

---

## Descripción general

El proyecto se ha desarrollado con el objetivo de aprender y aplicar el patrón de diseño **MVC (Modelo–Vista–Controlador)**, además de repasar conceptos y fundamentos de la **Programación Orientada a Objetos (POO)**.

La aplicación permite:

- Crear usuarios del sistema (administrativos y personal sanitario).
- Crear pacientes.
- Asignar médicos a pacientes.
- Registrar entradas en el historial médico (pruebas médicas y recetas).
- Mostrar la información por consola.

---

## Estructura del proyecto

El proyecto ha sido estructurado siguiendo el patrón de diseño **MVC**, por lo que los archivos se dividen principalmente en los siguientes directorios:

- **src/app/** ➩ Contiene la clase `Main`, encargada de iniciar la ejecución del programa.
- **src/controller/** ➩ Contiene la lógica de control de la aplicación y coordina la comunicación entre el modelo y la vista.
- **src/model/** ➩ Contiene las entidades del dominio, enums y la lógica relacionada con los datos del sistema.
- **src/view/** ➩ Contiene la vista encargada de mostrar la información por consola.

Árbol de los archivos del proyecto:

```text
proyecto/
├─ src/
│  ├─ app/
│  │  └─ Main.java
│  ├─ controller/
│  │  └─ Controlador.java
│  ├─ model/
│  │  ├─ entities/
│  │  │  ├─ Administrativo.java
│  │  │  ├─ EntradaHistorial.java
│  │  │  ├─ HistorialMedico.java
│  │  │  ├─ Medico.java
│  │  │  ├─ Paciente.java
│  │  │  ├─ Persona.java
│  │  │  ├─ PersonalSanitario.java
│  │  │  ├─ PruebaMedica.java
│  │  │  ├─ Receta.java
│  │  │  └─ Usuario.java
│  │  └─ enums/
│  │     ├─ Especialidad.java
│  │     └─ TipoPrueba.java
│  └─ view/
│     └─ Vista.java
├─ doc/        ➩ Documentación JavaDoc generada
└─ README.md
```

---

## Ejecución del proyecto

La aplicación se ejecuta desde la clase `Main` y no requiere argumentos de entrada ni ninguna configuración adicional.

El programa ha sido desarrollado con **JDK 25** y ha sido probado en entornos con versiones recientes de OpenJDK, garantizando su correcta ejecución y compatibilidad en sistemas modernos.

---

## Ejemplos de uso

En esta sección se muestran ejemplos de uso del sistema mediante fragmentos de código reales y su correspondiente salida por consola.

### Ejecución de la aplicación

La aplicación se inicia ejecutando la clase `Main`, la cual crea una instancia del controlador y lanza el método `iniciar()`:

```java
public static void main(String[] args) {
    Controlador controlador = new Controlador();
    controlador.iniciar();
}
```

### Creación de usuarios del sistema

Durante la ejecución del método `iniciar()` de la clase `Controlador` se crean usuarios de tipo `Administrativo` y `Medico`:

```java
Administrativo admin = new Administrativo(
    "Admin", "12345678A", "admin@hospital.com",
    "Calle Principal 1", "adminUser", "hash", "salt", "ADM001"
);

Medico medico = new Medico(
    "Dr. García", "12345678B", "doctor@hospital.com",
    "Calle Secundaria 2", "doctorUser", "hash", "salt",
    "COL001", Especialidad.CARDIOLOGIA
);
```

Estos usuarios se muestran por consola utilizando la clase `Vista`.

### Asignación de médico a paciente

Un usuario de tipo administrativo puede asignar un médico a un paciente:

```java
admin.asignarMedico(paciente, medico);
```

Esta acción establece la relación entre ambas entidades dentro del modelo.

### Registro en historial médico

Se pueden registrar pruebas médicas y recetas en el historial de un paciente mediante un usuario de tipo `Administrativo`:

```java
PruebaMedica prueba = new PruebaMedica(
    LocalDate.now(),
    medico.getNumeroColegiado(),
    "Dolor de oído",
    TipoPrueba.PRUEBA_ESFUERZO,
    "Resultado favorable"
);

admin.asignarPrueba(paciente, prueba);
```

### Ejemplos de salida por consola

Así se ve una salida por consola al realizar pruebas por el motivo 'Oídos inflamados'.

```text
Administrativo ha asignado prueba médica...

Médico realiza pruebas...
Objeto PruebaMedica{ tipoPrueba = 'Prueba de esfuerzo',
 resultado = 'Oídos inflamados',
 fecha = '2025-12-14',
 idMedico = 'nCol_001',
 causa = 'Dolor en los oídos'
}

Médico receta en base al resultado de las pruebas...
Objeto Receta {
 medicamentos = '[Líquido para oídos, Paracetamol 1g]'
}
Objeto HistorialMedico {
 entradas = '[Objeto PruebaMedica{ tipoPrueba = 'Prueba de esfuerzo',
 resultado = 'Oídos inflamados',
 fecha = '2025-12-14',
 idMedico = 'nCol_001',
 causa = 'Dolor en los oídos'
}]'
}
```

Recordemos que estos mensajes se imprimen utilizando la clase `Vista`.

---

## Documentación

El repositorio contiene documentación JavaDoc ya generada, en la carpeta `src/doc/...`. Sumado a ello, junto al entregable encontrarás un pdf con una explicación a mayor profundidad del **Modelo-Vista-Controlador** y diagramas **UML** que muestran gráficamente las clases, sus atributos y métodos, y las relaciones entre ellas.

Si no eres el profesor, pero quieres acceder al documento mencionado, contacta al encargado de la gestión del repositorio.