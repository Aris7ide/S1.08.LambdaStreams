# Nivel 2: Manipulación funcional de datos

## 📌 Enunciat del exercici
Ahora que ya tienes los cimientos, te centrarás en transformar colecciones de forma más compleja y expresiva. Trabajarás con condiciones más específicas , operaciones combinadas y modificaciones directas de los elementos. Además, crearás interfaces funcionales para representar operaciones aritméticas como funciones reutilizables, acercándote al paradigma funcional .

## ✨ Funcionalitats


## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
### Exercise 1
#### Crea una lista de cadenas con nombres propios. Escribe un método que devuelve una lista de todas las cadenas que comienzan con la letra 'A' (mayúscula) y tienen exactamente 3 letras. Imprime el resultado.
- he creado la clase Main y una lista de nombres, de ahi con strem() y un par de .filter() he filtrado los nommbres
### Exercise 2
#### Programa un método que devuelve una cadena separada por comas, basada en una lista de Integers. Cada elemento debe ir precedido por letra “e” si el número es par, o por la letra “o” si el número es impar. Por ejemplo, si la lista de entrada es (3, 55, 44), la salida debe ser “o3, o55, e44”. Imprime el resultado.
- He creado una clase utils llamada Methods para separar los metodos del Main
- en el metodo he usado el .stream para transformal la lista en un stream
- con .map he cambiado los numeros en String añadiendole "e" e "o" dependiendo del ser par o no
- y de ahi algo nuevo que es el .collect(Collector.joining(",")) que te permite separar los elementos con algo
- en el main he creado un List de Integer y he llamado el metodo Methods.numbersWithCommas()
### Exercise 3
#### Crea una Functional Interface que contenga un método llamado operacio(). Este método debe devolver un float. Inyecta a la interfaz creada mediante una lambda, el cuerpo del método, de forma que se pueda transformar la operación con una suma, una resta, una multiplicación y una división.
- He creado la Functional Interface Operations que pida dos Integer y devuelva un float
- en el main he creado las logicas de suma, resta, multiplicacion y resta. 
- La logica aqui creo que es demonstrar que la Functional Interfaces pueden ser adaptadas a diferentes logicas.
### Exercise 4
####