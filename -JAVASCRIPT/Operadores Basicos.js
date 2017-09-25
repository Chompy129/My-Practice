/*Crea un código JavaScript para pedir al usuario que introduzca dos números 
(mediante el uso de prompt como hemos visto en anteriores epígrafes del curso) y devuelva mensajes informativos con:

a)      El resto (módulo) de dividir el primer número entre 5.

b)      El resultado de dividir el primer número entre el segundo.

c)       El resultado de sumar los dos números.
*/

var userNumber= parseInt(prompt("Por favor, escribe un número:")),
	userNumber1= parseInt(prompt("Ahora escribe otro:")),
	a= userNumber % 5,
	b= userNumber / userNumber1,
	c= userNumber + userNumber1;

alert("a) El resto (módulo) de dividir el primer número entre 5.\nb) El resultado de dividir el primer número entre el segundo.\nc) El resultado de sumar los dos números.");
alert("El resultado de A es "+a+", el resultado de B es "+b+" y el resultado de C es "+c+".");