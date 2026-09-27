#Tarea S1.08 - Lambdas & Stream

## 📌 Enunciat del exercici
Las  expresiones lambda  y la API de Streams  son dos de las incorporaciones más potentes de Java 8. Estas funcionalidades permiten escribir código más  conciso ,  expresivo  y  declarativo , haciendo que la manipulación de datos sea más clara y eficiente.

En esta tarea aprenderás a transformar, filtrar y ordenar colecciones mediante  funciones lambda , así como a utilizar  interfaces funcionales  para definir comportamientos reutilizables. También descubrirás cómo combinar estas herramientas para escribir código funcional y legible, acercándote a paradigmas muy utilizados en el desarrollo moderno.

El objetivo principal es ganar fluidez en el uso de lambdas y streams mediante ejercicios prácticos, de menor a mayor complejidad, y poner en práctica los nuevos hábitos de pensamiento funcional que aportan estas herramientas.

### 🧠 Clasificación según la interfaz funcional
En Java, las  expresiones lambda  siempre se asocian a una  interfaz funcional , es decir, una interfaz que contiene  sólo un método abstracto .

El lenguaje proporciona muchas interfaces funcionales ya preparadas dentro del paquete:


          java.util.function

Estas interfaces permiten escribir código más conciso y flexible, sobre todo cuando se trabaja con colecciones o con la API de  streams .

Algunas de las más utilizadas son:

- Consumer<T> → recibe un argumento de tipos  T y  no devuelve ningún valor .

Se utiliza para “consumir” datos, por ejemplo, imprimir por consola o añadir elementos a una colección.

- Supplier<T> →  no recibe ningún argumento , pero  devuelve un objeto  de tipos  T.

Se utiliza para generar o inicializar objetos (por ejemplo, crear valores por defecto).

- Function<T, R> → recibe un objeto de tipos  T y  devuelve un resultado  de tipos  R.

Se utiliza para aplicar transformaciones o conversiones sobre datos.

- Predicate<T> → recibe un objeto de tipo  T y  devuelve un valor booleano ( true o  false) .

Es muy común en filtros, por ejemplo dentro de  stream().filter(...).

- BiFunction<T, U, R> → funciona igual que  Function, pero  acepta dos argumentos  (de tipos  T y  U) y devuelve un resultado de tipos  R.

Se utiliza cuando es necesario combinar o comparar dos valores para obtener uno nuevo.