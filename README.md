# Portafolio de Algoritmos

## Descripción

Este repositorio contiene algoritmos y conceptos de programación aprendidos durante el curso. El proyecto incluye algoritmos de ordenamiento, algoritmos de búsqueda y ejemplos de programación orientada a objetos desarrollados en Java.

---

## Integrantes del Grupo

- David Rios Rivera
- Alejandro Jose Vargas Pedroza
- Gabriel A. Rondon Davila
- Israel A. Duran Madera
- Juan A. Peña Rivera
---

## Estructura del Repositorio
```text
/sorting
/searching
/oop
README.md
```
---

## Programas Incluidos

### Sorting Algorithms
- Bubble Sort
- Insertion Sort

### Searching Algorithms
- Sequential Search
- Binary Search

### Object-Oriented Programming
- Programa de Figuras Geométricas

---

## Objetivo de este Proyecto
- Practicar el uso de GitHub para almacenar y compartir codigo.
- Organizar programas y algoritmos de manera profesional.
- Explicar algoritmos utilizando lenguaje claro y ejemplos simples.
- Comparar distintos algoritmos según su eficiencia y funcionamiento.
- Mejorar habilidades de programación documentación y trabajo en equipo.
- Aplicar conceptos de programación orientada a objetos y algoritmos vistos en clase.

---

# Algoritmos de Ordenamiento 

## Bubble Sort

Bubble Sort es un algoritmo de ordenamiento que compara números vecinos y los intercambia si están en el orden incorrecto. Este proceso se repita varias veces hasta que todos los elementos quedan ordenados.

El programa desarrollado en Java utiliza dos métodos principales:
- `bubbleSort()` para ordenar el arreglo
- `printArray()` para mostrar los elementos antes y después del ordenamiento

### Ventajas
- Fácil de entender e implementar.
- Bueno para aprender conceptos básicos de ordenamiento.

### Desventajas
- Muy lento para grandes cantidades de datos.
- Realiza muchas comparaciones innecesarias.

---

## Insertion Sort

Insertion Sort construye el arreglo ordenado un elemento a la vez insertando valores en su posición correcta.

### Ventajas
- Fácil de implementar.
- Funciona bien con listas pequeñas o parcialmente ordenadas.

### Desventajas
- Ineficiente para grandes cantidades de datos.
- Puede realizar muchos movimientos en listas largas.

---

## Merge Sort

Merge Sort divide el arreglo en partes pequeñas, las ordena y luego las combina nuevamente.

### Ventajas
- Muy eficiente para grandes cantidades de datos.

### Desventajas
- Requiere memoria adicional.

---

## Quick Sort

Quick Sort selecciona un elemento y organiza el arreglo alrededor de ese elemento.

### Ventajas
- Generalmente muy rápido.

### Desventajas
- En algunos casos puede volverse lento.

---

# Algoritmos de Búsqueda

En esta parte del proyecto trabajamos dos algoritmos de búsqueda: Linear Search y Binary Search. Se desarrollaron dos programas distintos en Java para compararlos desde diferentes perspectivas: uno usando un array pequeño con varios valores objetivo y otro analizando cómo cambia el rendimiento cuando el tamaño del array aumenta.

Los archivos se encuentran en la carpeta `searching/`:

- `SearchComparison.java`: array de 10 elementos con varios targets
- `SearchScaling.java`: pruebas con arrays de 50, 1,000 y 10,000 elementos

---

## Linear Search

Linear Search revisa el array elemento por elemento, comenzando desde el primero hasta encontrar el valor deseado o llegar al final.

### Ventajas
- Funciona con arrays ordenados y desordenados

### Desventajas
- Muy lento en arrays grandes porque puede revisar todos los elementos

---

## Binary Search

Binary Search trabaja dividiendo el área de búsqueda a la mitad repetidamente hasta encontrar el valor deseado.

### Ventajas
- Muy rápido en arrays grandes

### Desventajas
- Requiere que el array esté ordenado previamente

---

## Resultados: Programa 1

Usando el array:

```text
{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}
```

| Target | Linear Search | Binary Search  |
|--------|---------------|----------------|
| 8      | 3 pasos       | 3 pasos        |
| 23     | 6 pasos       | 1 paso         |
| 91     | 10 pasos      | 4 pasos        |
| 100    | 10 pasos      | 4 pasos        |

---

## Resultados: Programa 2

Buscando el último elemento en arrays de distintos tamaños:

| Tamaño | Linear Search | Binary Search  |
|--------|---------------|----------------|
| 50     | 50 pasos      | 7 pasos        |
| 1,000  | 1,000 pasos   | 11 pasos       |
| 10,000 | 10,000 pasos  | 15 pasos       |

---

## Observaciones

La diferencia entre ambos algoritmos aumenta significativamente cuando el tamaño de los arrays crece. Linear Search aumenta sus pasos de forma proporcional al tamaño del array, mientras que Binary Search solo necesita algunos pasos adicionales incluso cuando la cantidad de datos aumenta considerablemente.

Aunque Binary Search es mucho más eficiente, requiere que los datos estén ordenados. En algunos casos, ordenar primero el array puede tomar más tiempo que simplemente utilizar Linear Search.

---

# Programación Orientada a Objetos (OOP)

## Programa de Figuras Geométricas

Este programa fue desarrollado utilizando conceptos de Programación Orientada a Objetos en Java. El proyecto utiliza una clase abstracta llamada `Figura` y varias subclases para representar diferentes figuras geométricas.

Las subclases implementadas son:
- `Circulo`
- `Rectangulo`
- `Cuadrado`

Cada figura tiene su propia implementación del método `area()` y del método `toString()`.

El programa permite:
- Crear diferentes tipos de figuras
- Calcular áreas
- Mostrar información específica de cada figura
- Aplicar herencia y polimorfismo

### Conceptos de OOP utilizados

- Clases abstractas
- Herencia
- Polimorfismo
- Encapsulación
- Sobreescritura de métodos (`@Override`)

### Ventajas
- El código está organizado y es fácil de mantener
- Permite reutilizar métodos y estructuras

### Desventajas
- Puede ser más complejo para principiantes y cuando el codigo es más grande.

---

# Tabla Comparativa de Algoritmos

|Algoritmo       |  Fácil de Entender  |  Eficiente con Grandes Datos  |  Requiere Memoria Extra  |
|----------------|---------------------|-------------------------------|--------------------------|
| Bubble Sort    |       Sí            |            NO                 |           NO             |
| Insertion Sort |       Sí            |            NO                 |           NO             |
| Merge Sort     |     MODERADO        |            Sí                 |           Sí             |
| Quick Sort     |     MODERADO        |       GENERALMENTE Sí         |      GENERALMENTE NO     |
| Linear Search  |       Sí            |            NO                 |           NO             |
| Binary Search  |     MODERADO        |            Sí                 |           NO             |

---
# Explícalo para un Principiante

## Explicación de Bubble Sort

Bubble Sort funciona comparando dos números vecinos.
Si el número de la izquierda es mayor que el de la derecha, el algoritmo los intercambia.
Este proceso continúa varias veces hasta que todos los números quedan ordenados.

### Ejemplo

Lista original:
```text
[5, 2, 4]
```
Comparar 5 y 2 -> intercambiar

```text
[2, 5, 4]
```
Comparar 5 y 4 -> intercambiar

```text
[2, 4, 5]
```
Ahora la lista está ordenada.

---

# Resultados y Observaciones
Observamos que los algoritmos simples son más fáciles de entender y implementar, pero no son eficientes para grandes cantidades de datos. Algoritmos como Merge Sort, Quick Sort y Binary Search muestran un mejor rendimiento cuando el tamaño de la información aumenta.

---

# Reflexión
Este proyecto nos ayudó a comprender cómo funcionan diferentes algoritmos y cómo GitHub puede utilizarse para organizar proyectos colaborativos. También mejoramos nuestras habilidades de programación, documentación y trabajo en equipo.

---

# Conclusión
Este portafolio demuestra los conocimientos y habilidades desarrollados durante el curso CCO 140 001 en temas de algoritmos, programación OOP y uso de GitHub.

---

Gracias por revisar nuestro portafolio de algoritmos. 
