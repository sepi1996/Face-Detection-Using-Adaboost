# Face-Detection-Using-Adaboost
En este proyecto voy a implementar el algoritmo AdaBoost
para poder predecir con gran exactitud si una imagen que recibe este algoritmo es una
cara o por el contrario no lo es.
Para ello dispondremos de una base de datos de imágenes en escala de grises, dividida
en dos tipos de imágenes, caras y no caras. Esta base de datos nos servirá para entrenar
a nuestro algoritmo y más tarde probar su correcto funcionamiento.
La finalidad del algoritmo AdaBoost es encontrar una hipótesis fuerte a partir de utilizar
hipótesis débiles y simples. Por tanto, para esta práctica, en el proyecto facilitado por el
profesor, hemos tenido que añadir tres nuevas clases, Hiperplano, ClasificadorFuerte y
ClasificadorDébil. El diagrama UML de las tres clases quedaría de la siguiente manera:

![alt text](https://user-images.githubusercontent.com/18005114/70988662-c551e400-20b1-11ea-9bb7-7da11ccb6bad.png)
## Hiperplano

La clase hiperplano representará cada uno de los hiperplanos que más tarde generará el
clasificador débil. Esta clase está compuesta por un array de puntos y de vectores que
formarán el hiperplano, la variable C, y el error de dicho hiperplano. Cabe destacar que
este plano estará compuesto por 576 puntos y vectores, debido a que estamos trabajando
con imágenes de 24x24. Por tanto, esta clase se encargará de generar planos aleatorios

## Clasificador Débil
El algoritmo AdaBoost propone entrenar una serie de clasificadores débiles de manera
iterativa, de modo que cada clasificador nuevo se enfoque en los datos que fueron
erróneamente clasificados por su predecesor. Por tanto, esta clase estará compuesta por
un array de hiperplanos, el mejor de estos y por último el valor de confianza que
tendremos en este clasificador.
El constructor de esta clase recibirá el número de hiperplanos a generar y los arrays de
puntos mínimo y máximos. A partir de estos datos, construirá los hiperplanos
solicitados apoyándose en el constructor de la clase hiperplano.
Una vez generados los hiperplanos debemos entrenar el clasificador, para ello, a partir
de un array de imágenes de entrenamiento, evaluamos lo bien que clasifica dicho array
de imágenes. Para ello, comprobamos donde se encuentra la imagen a partir de nuestro
hiperplano y lo comparamos con su valor real. Si ambos valores coinciden, esto
significa que el hiperplanos clasifica correctamente esta imagen sino, deberemos
sumarle un error. Finalmente calculamos la tasa de error del hiperplano.

## ClasificadorFuerte
El clasificador fuerte será el encargado de implementar el algoritmo AdaBoost, cuyo
pseudocódigo es el siguiente:
![alt text](https://user-images.githubusercontent.com/18005114/70990243-a143d200-20b4-11ea-9c84-9ca21d59e4fd.png)

## Resultados
Con 900 hiperplanos y 26 iteraciones hemos obtenido la siguientes tasa de acierto
![alt text](https://user-images.githubusercontent.com/18005114/70990551-54143000-20b5-11ea-9088-ea4d639f46e1.png)
