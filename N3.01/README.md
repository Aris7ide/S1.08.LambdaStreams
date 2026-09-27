# Nivel 3: Streams con objetos

## 📌 Enunciat del exercici
Este nivel introduce el uso de lambdas y streams aplicados a una clase propia, Alumne, para simular situaciones reales. Filtrarás y transformarás listas de objetos, aplicando múltiples condiciones y acciones. Esto te ayudará a ver el valor práctico de estas herramientas en proyectos más realistas, con datos más estructurados.

## Ejercicio 1
Crear una clase Alumnecon los atributos: nombre, edad, curso y nota.

Llena una lista con 10 alumnos

- Muestra por pantalla el nombre y la edad de cada alumno/a.
- Filtra la lista por todos los alumnos cuyo nombre comienza por 'a'. Asigna a estos alumnos a otra lista y muestra por pantalla la nueva lista (todo con lambdes).
- Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o superior.
- Filtra y muestra por pantalla a los alumnos que tienen una nota de 5 o más, y que no son de PHP.
- Muestra a todos los alumnos que hacen JAVA y son mayores de edad.

## ✨ Funcionalitats
- Stream con Objects

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Execution
- he creado la clase Alumns
- he instanciado desde el Main 10 alumnos
- he creado otra clase que lleva la lista de alumnos y instancia todos los alumnos
- He conseguido crear un metodo en la clase Methods que llama la lista de alumnos y imprime nombres y edades
- he usado un forEeach(alumns -> System.out.println())
- he creado un segundo metodo para enseñar solo los nombres que empiezan con A
- he creado una newList filtrando la otra lista con los nombres que empezan con A
- 