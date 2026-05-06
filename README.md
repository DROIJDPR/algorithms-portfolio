# Algorithms Portfolio

## Descripción

Este repositorio contiene algoritmos y conceptos de programación aprendidos durante el curso. El proyecto incluye algoritmos de ordenamiento, algoritmos de búsqueda y ejemplos de programación orientada a objetos desarrollados en Java.

---

## Integrante del Grupo

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
- Student Records Program

---

# Algoritmos de Ordenamiento 
## Bubble Sort

Bubble Sort compara valores vecinos y los intercambia si estan en el orden incorrecto. Este proceso se repite hasta que el areeglo queda completamente ordenado.

### Fortaleza
- Fácil de entender e implementar.

### Limitación
- Muy lento para grandes cantidades de datos.

---

## Insertion Sort

Insertion Sort construye el arreglo ordenado un elemento a la vez insertando valores en su posición correcta.

### Fortaleza
- Eficiente para conjuntos pequeños de datos.

### Limitación
- Ineficiente para grandes cantidades de datos.

---

## Merge Sort

Merge Sort divide el arreglo en partes pequeñas, las ordena y luego las combina nuevamente.

### Fortaleza
- Muy eficiente para grandes cantidades de datos.

### Limitación
- Requiere memoria adicional.

---

## Quick Sort

Quick Sort selecciona un elemento y organiza el arreglo alrededor de ese elemento.

### Fortaleza
- Generalmente muy rápido.

### Limitación
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

### Fortaleza
- Funciona con arrays ordenados y desordenados

### Limitación
- Muy lento en arrays grandes porque puede revisar todos los elementos

---

## Binary Search

Binary Search trabaja dividiendo el área de búsqueda a la mitad repetidamente hasta encontrar el valor deseado.

### Fortaleza
- Muy rápido en arrays grandes

### Limitación
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
-------------------------------------------
---

## Resultados: Programa 2

Buscando el último elemento en arrays de distintos tamaños:

| Tamaño | Linear Search | Binary Search  |
|--------|---------------|----------------|
| 50     | 50 pasos      | 7 pasos        |
| 1,000  | 1,000 pasos   | 11 pasos       |
| 10,000 | 10,000 pasos  | 15 pasos       |
-------------------------------------------
---

## Observaciones

La diferencia entre ambos algoritmos aumenta significativamente cuando el tamaño de los arrays crece. Linear Search aumenta sus pasos de forma proporcional al tamaño del array, mientras que Binary Search solo necesita algunos pasos adicionales incluso cuando la cantidad de datos aumenta considerablemente.

Aunque Binary Search es mucho más eficiente, requiere que los datos estén ordenados. En algunos casos, ordenar primero el array puede tomar más tiempo que simplemente utilizar Linear Search.

---

# Tabla Comparativa de Algoritmos

|Algoritmo       |  Fácil de Entender  |  Rápido con Grandes Datos  |  Requiere Memoria Extra  |
|----------------|---------------------|----------------------------|--------------------------|
| Bubble Sort    |       Sí            |            NO              |           NO             |
| Insertion Sort |       Sí            |            NO              |           NO             |
| Merge Sort     |     MODERADO        |            Sí              |           Sí             |
| Quick Sort     |     MODERADO        |       GENERALMENTE Sí      |      GENERALMENTE NO     |
------------------------------------------------------------------------------------------------

# Explícado para un Principiante

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

## Goals of this project
- Practice using GitHub
- Organize code professionally
- Explain algorithms clearly
- Compare differente algorithms
- Improve programming and teamwork skills
