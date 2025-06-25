# Recetario

Proyecto de evaluación — Unidad 3  
Asignatura: Patrones de Diseño  
Nombre: Cristóbal Martínez   
Fecha: 25-06-2025

## Descripción del Sistema

Recetario es una aplicación desarrollada en Java que permite gestionar recetas de cocina de forma sencilla. El sistema permite:

- Crear recetas con sus ingredientes.
- Clonar recetas existentes.
- Adaptar recetas a otro contexto cultural.
- Recorrer las recetas almacenadas de forma ordenada.

Este proyecto integra cuatro patrones de diseño GoF aplicados de manera coherente en una solución funcional.

## Problema que resuelve

En una aplicación de recetas es común:

- Tener un único gestor central de recetas.
- Clonar recetas sin modificar las originales.
- Adaptar recetas para distintos países o públicos.
- Recorrer una colección de recetas de forma ordenada.

Este proyecto soluciona estos problemas mediante la aplicación de patrones de diseño, lo que permite un código más limpio, modular y reutilizable.

### 1. Singleton – `GestorRecetas`
Permite que solo exista una única instancia encargada de gestionar las recetas. Evita tener múltiples objetos dispersos que administren datos duplicados. La clase tiene un constructor privado y un método estático que devuelve siempre la misma instancia.

**Ubicación:** `patterns.singleton.GestorRecetas`  
**Justificación:** El sistema solo necesita un punto central de acceso a las recetas.
![image](https://github.com/user-attachments/assets/e003916a-333c-4808-a05e-3143f95c9b1f)

---

### 2. Prototype – `Receta.clonar()`
Permite crear una copia de una receta existente para reutilizarla con cambios. Esto es útil cuando se desea modificar una receta base sin alterar la original.

**Ubicación:** `model.Receta` + `patterns.prototype.ClonableReceta`  
**Justificación:** Se usa para duplicar objetos sin crear uno nuevo desde cero y conservar los datos base.
![image](https://github.com/user-attachments/assets/a7f25783-fad9-47c1-bb82-bfb8342eee36)

---

### 3. Adapter – `AdaptadorMexicano`
Adapta una receta original con ciertos ingredientes a una versión distinta según un contexto cultural. Por ejemplo, cambia “Palta” por “Aguacate”.

**Ubicación:** `patterns.adapter.AdaptadorMexicano`  
**Justificación:** Permite adaptar el formato o contenido sin modificar la receta original, cumpliendo con el principio de abierto/cerrado.
![image](https://github.com/user-attachments/assets/b0ea9e5a-c37c-4877-b473-31d40267fb07)

---

### 4. Iterator – `IteradorRecetas`
Permite recorrer la lista de recetas de manera controlada, sin exponer directamente la estructura de la colección.

**Ubicación:** `patterns.iterator.IteradorRecetas`  
**Justificación:** Se usa para iterar las recetas sin necesidad de usar directamente un bucle `for` sobre la lista, encapsulando la lógica de recorrido.
![image](https://github.com/user-attachments/assets/d0055fa5-3adb-4d6d-8407-5f6424fcaf74)

---

## Instrucciones de Compilación y Ejecución

### Requisitos
- Java Development Kit (JDK) 8 o superior
- Visual Studio Code, NetBeans o consola
