# Git y Github 
Sistema de control de versiones (version control system VSC)
- Se utiliza para guardar los cambios de un programa.
- Pueden contribuir varios desarrolladores, modificando el codigo.
- Es muy util tambien para encontrar que modificación es la que produjo el problema y solucionarlo.
- Se puede trabajar con repositorio locales y remotos 

**Repositorios**: Es un computador que gestiona tu codigo.
 
 ## Conceptos de git 
-  Te provee la manera de seguir tu codigo
- Te ayuda apoder tomarle una foto ("snapshots") del codigo y luego seguir avanzando. Con la ventaja de que luego podras ver esa foto y podras verlo, alterarlo, etc.
- Podras tomar decisiones cuando hacer los cambios o que es lo que te sirve para desarrollar tu codigo.
- Todo lo mensionado anteriormente lo podras hacer en cualquier punto.

 ## Estados de Git
 1. Working directory -> Donde uno va a estar trabajando con todos tus archivos.
 2. Staging area -> Donde una va a estar agregando todos los archivos que vas a preparar para el guardado.
 3. Repository -> Por ultimo cuando estemos decididos a guardar los cambios lo vamos a pasar a un repositorio.

## Comandos basicos
Git es una herramienta que interactua con tu sistema operativo, por ende manejaras mucho en la terminal.
- git ini-> Manera a decir a git o al sistema operativo que vamos a empezar a usar git en este proyecto.
- git add <file> -> Es para poder pasar los archivos de Working directory a Staging area.
- git status -> Es para ver en que estado se encuentra nuestros archivos
- git commit -> Pasar nuestros achivos de Staging area a Repository. Es para crear un primer snapshot.
- git push -> Es para subir nuestros archivos en repositorio remoto.
- git pull -> En el caso que estemos trabajando con multiples desarroladores, este comando te trae los cambios que han realizado.
- git clone -> Hace una copia de donde esta el servidor a tu computadora.
 