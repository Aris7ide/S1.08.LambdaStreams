# Nivel 1: Lambdas y Streams

## 📌 Enunciat del exercici
En este nivel te familiarizarás con las expresiones lambda y el uso básico de la API de Streams para trabajar con colecciones. Aprenderás a filtrar, transformar y ordenar datos de forma mucho más escueta que con bucles tradicionales. También empezarás a entender cómo las Functional Interfaces permiten encapsular comportamientos. Es el primer paso para pensar en código más declarativo.

Para todos los ejercicios debe utilizarse la API de Java Lambdas and Streams de Java 8+.

## ✨ Funcionalitats
- lambda
- API Streams
- functional Interfaces

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution
### Ejercicio 1
#### A partir de una lista de Strings, escribe un método que devuelve una lista de todas las cadenas que contienen la letra 'o'. Imprime el resultado.
- he creado una lista con Arrays.toList() y he usado mas comandos para llegar a una lista imprimible: stream().filter().toList();
- el .filter lleva la estructura lambda (elemento -> elemento.startsWith())
- #### el elemento es un elemento de la lista y devuelve lo que està en la segunda parte.
### Ejercicio 2
#### Tienes que hacer lo mismo que en el punto anterior, pero ahora, el método debe devolver una lista con los Strings que además de contener la letra 'o' también tienen más de 5 letras. Imprime el resultado.
- he añadido otro .filter especificando el .length() del elemento
- esta vez he metido el resultado en un List<String> result y imprimido con un System.out.println().
### Ejercicio 3
#### Crea una lista con los nombres de los meses del año. Imprime todos los elementos de la lista con una lambda.
- he creado la lista y las he imprimida con System.out.println(listMonths.stream().toList());
### Ejercicio 4
#### Realizar la misma impresión del punto anterior, pero mediante method reference.
- para usar un method reference he tenido que cambiar la manera de imprimir los meses a un .forEach(month -> System.out.println(month);
- y de aqui a la otra forma method reference: .forEach(System.out::println); que ademas IntelliJ sugiere automaticamente
### Ejercicio 5
#### Crea una Functional Interface con un método llamado getPiValue()que debe devolver un double. Desde el main()de la clase principal, instancia la interfaz y asíñale el valor 3.1415. Invoca el método getPiValue()e imprime el resultado.
- He credo la interfaz con @FunctionalInterface y he llamado el metodo desde el main
### Ejercicio 6
#### Crea una lista con números y cadenas de texto y ordena la lista con las cadenas de más corta a más larga.
- he creado una lista object mixta de numeros y Strings
- he llamado el metodo streams()
- de ahi .filter con un instanceOk para separar los strings
- he convertido todos los valores en String con .map(elemento -> (String) elemento)
- de ahi con un .sorted(Comparator.comparing(String::length))
- y en fin un .toList() para poderlo imprimir
### Ejercicio 7
#### Con la lista del ejercicio anterior, ahora ordénala al revés, de cadena más larga a más corta.
- esto sol hace falta meterle un .reverse al final del Comparator.
### Ejercicio 8
#### Crea una Functional Interface que contenga un método llamado reverse(). Este método debe recibir y debe devolver un String. En el main()de la clase principal, inyecta a la interfaz creada mediante una lambda, el cuerpo del método, de modo que devuelva la misma cadena que recibe como parámetro pero al revés. Invoca la instancia de la interfaz pasándole una cadena y comprueba si el resultado es correcto.
- He creado la functional Interface usando el @FunctionalInterface y especificando que tiene que recibir un String y devolver un String
- en el main he creado la funcion para que ponga al reverse un String dado, creando un objeto StringInverter inverter y dandole la logica text -> new StringBuilder(text).reverse().toString()