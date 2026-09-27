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
#### Crea una lista que contenga algunas cadenas de texto y números.
#### Ordénalas por:

- #### Alfabéticamente por su primer carácter. (Nota: charAt(0)devuelve el código numérico del primer carácter)
- #### Las cadenas que contienen una "e" primero, el resto de cadenas después. Pone el código directamente en la lambda.
- #### Modifica todos los elementos de la lista que tienen una 'a'. Modifica la 'a' por un '4'.
- #### Muestra sólo los elementos que son numéricos. (Aunque estén guardados como Strings).

- Para empezar he creado la lista en el main
- He ordenado con un Compare.comparing transformando todo a String y todo a minuscolas, para que con un charAt(0) poder reordenar la lista
- Para ordenar las palabras que empiezan con e antes he usado igualmente .sorted con un Comparator.comparing, pero ahi en el Comparator he buscado todos los elementos que tenian una e al principio con .startsWith()
- Para cambiar todos las e en 4 he podido usar un replaceAll(), he tenido que pasar todos los elementos a String antes.
- Ya que la lista era mixta de object he podido usar un .Filter con un instanceOf Integer