# ProyectoFinal

Proyecto

A continuación, se le presentará el proyecto, el cual tiene un valor de 40% sobre la nota. Esta entrega es individual por lo que, en caso de sospecha o evidencia de plagio, la nota va a ser cero.
Al ser individual, usted deberá concentrarse al máximo para lograr una entrega aceptable.
Este proyecto se va a desarrollar utilizando Java como lenguaje y Netbeans como IDE, y la entrega del proyecto va a ser por medio del campus virtual, con un archivo .ZIP que contenga el proyecto y el link a Github.

Introducción
Para este proyecto, se van a utilizar los nodos y listas genéricas que hemos venido desarrollando. De igual manera, es válido utilizar todo lo desarrollado por nosotros hasta la fecha, si el problema descrito lo permite.
Queda completamente por fuera el método setDato para cualquier estructura y se va a evaluar tanto unit testing como una Javadoc debidamente implementada.


Problema #1

Para poder desarrollar este problema, usted va a implementar un objeto llamado Persona, el cual va a contener los siguientes atributos:
Un String de cédula.
 Un double para edad.
 Un String para nombre, otro para primer apellido y otro para segundo apellido.
Va a contener constructores y métodos set y get.
Una vez implementado el objeto correctamente, usted va a proceder a desarrollar el método de ordenamiento conocido como merge sort, de manera iterativa para ordenar el objeto descrito anteriormente de la siguiente manera:
 Asumiendo que los extranjeros van a utilizar su número de pasaporte para registrarse en su sistema, ellos deberían de quedar de primeros.
 De seguido a los extranjeros, debería ordenarse en primer nivel por provincia y naturalizados (primer número de 1 a 9), luego por folio
(segundo número en la cédula) y, por último, por asiento (último número de la cédula). Un ejemplo de lista ordenada sería el siguiente:
E46758 -> 1-1445-6203 -> 2-1550-0156 -> 2-1551-3625
 Se va a asumir que, en el caso de las cédulas costarricenses, los números después de la provincia son de 4 dígitos máximo.
Este ejercicio es para colas y una lista del tipo que usted prefiera.


Problema #2

Utilizando el mismo objeto del ejercicio anterior, y los mismos criterios para ordenar, implemente el método insertion sort a listas CIRCULARES y SIMPLES, tomando en cuenta que sólo puede utilizar los cinco métodos utilizados para una implementar una cola correctamente.


Problema #3

Esta parte de implica un poco de investigación y aplicación de la misma a la programación, en conjunto con la materia que estudia o estudió en el primer curso de bases de datos.
Usted va a desarrollar un módulo gráfico que se encargue de ejecutar los diferentes algoritmos desarrollados para guardar un historial del nombre del algoritmo, la estructura utilizada, la fecha de ejecución y la duración de la ejecución del algoritmo.
Este módulo gráfico también va a tener una sección para consultar los datos guardados, la cual va a tener una tabla para consultar los datos que se han ido guardando a través del tiempo y otra sección que dependiendo la duración de todos los algoritmos (o los que se hayan ejecutado hasta el momento) me genere un reporte de cuál es el más rápido.


Problema #4

Finalmente, la última parte de este proyecto va a consistir en realizar otro módulo gráfico, el cuál va a mostrar el movimiento de los nodos en cada uno de los algoritmos de ordenamiento desarrollados para listas.
La idea de esta tercera parte es que el comportamiento gráfico sea similar a los gifs que se muestran en cada página de Wikipedia de los algoritmos de ordenamiento, así que el uso de hilos y la sincronización de los mismos es esencial para lograrlo.
