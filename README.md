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

