/*
JAVA
1. Historia
- Creado por Sun Microsystems Inc.
- Fue presentedao en la segunda mitad de 1995
- Fue creado por un grupo de trabajo liderado por james Gosling
- El nombre "Java" surgió de una de la reuniones creativas celebradas por el equipo de desarrollo de lenguaje.

2. Que es Java?
Java es un lenguaje de desarrollo de propósito general, y como tal es válido para realizar todo tipo de aplicaciones profesionnales.

3. Qué lo hace distitno a los demás lenguajes?
- Los programas breados por java son independientes de la arquitectura; esto quiere decir a que son portables.
- Permite escribir Applets. Los Apples son pequeños programas que se insertan en una pagina web.
- Se pueden escribir aplicaciones para intraredes.
- Aplicaciones cliente/servidor.
- Aplicaciones distribuidas en redes locales y en internet.
- Es facil de aprender y esta bien estructurado.

4. Qué se puede programar con Java?
- Aplicaciones independientes
- Applets

5. Caracteristicas del lenguaje
- Es instrinsecamente orientado a objetos.
- Funciona perfectamente en red.
- Tiene gran funcionalidad gracias a sus librerias (clases).
- No tiene punteros manejables por el programador, aunque los maneja la maquina interna y transparentemente.
- Genera aplicaciones con pocos errores posibles.
- Incorpora Multi-Theanding (Multi-Hilos). Sirve para que las operaciones concurrentes se ejecuten ordenadamente.

6. Tipos de comentarios
- De una linea que se realizan con //
- De multiples lineas que se realizan (/*)
Los comentarios:
   - Ayudan a documentar los programas
   - Mejorar la legibilidad
   - Ayudan a otras personas a leer y comprender el programa
   - Se usan por convención antes de cada programa para explicar la funcion del mismo
   - El compilador ignora los comentarios

7. Mi primer programa */
// Programa para imprimir texto
public class java_deitel // *1
{ // *2
   // El metodo main empieza la ejecucion de la aplicacion en Java *3
   public static void main(String args[]) // *4
   {
      System.out.println("Bienvenido a la programacion en Java!"); // *5
   } // Fin del metodo main *6

} // Fin de la clase java_deitel *7

/*
*1 "public class java_detiel" 
   Todo programa en java consiste de una declaración clase que uno define. La palabra class introduce a una declaración de clase en java, la cual debe ir seguida por el nombre de la clase (java_detiel).
   Las palabras claves se reservan para el uso exclusivo de java.
   Por convención todos los nombres de clases en javava comienxan conmayusscula de la misma forma que la primera letra de cada palabra. 
   En Java, el nombre de una clase se conoce como identtificador: una serie de caracteres que pueden ser letras, digitos, guiones bajos y signos de moneda. Pero no puede comenzar con un digito y no puede tener espacios. Por lo gral el identificador NO comienza con una letra mayuscula.
   Java es sensible a la mayusculas y a las minusculas.
   Una clase public debe colocarse en un archivo que tenga el mismo nombre que la clase (en terminos de ortografia y de uso de mayuscula) y la extensión del archivo debe ser .java; de lo contrario ocurre un error de complilación.
---

*2 "{"
   Llave izquierda { comienza el cuerpo de todas las declaraciones de clases. Su correspondiente llave derecha (*7 ln 52) debe terminar cada declaración de una clase.


*/