/*GUIA
A > 3
A > C
A < C
B < C
B != C
A == 3
A * B == 15
A * B == -30
C / B < A
C / B == -10
C / B == -4
A + B + C == 5
(A+B == 8 ) && (A-B == 2)
(A+B == 8 ) || (A-B == 6)
A > 3 && B > 3 && C < 3
A > 3 && B >= 3 && C < -3*/
var A= 5, B= 3, C= -12;

var respuesta= {
	a: A > 3,
	b: A > C,
	c: A < C,
	d: B < C,
	e: B != C,
	f: A == 3,
	g: A * B == 15,
	h: A * B == -30,
	i: C / B < A,
	j: C / B == -10,
	k: C / B == -4,
	l: A + B + C == 5,
	m: (A+B == 8 ) && (A-B == 2),
	n: (A+B == 8 ) || (A-B == 6),
	o: A > 3 && B > 3 && C < 3,
	p: A > 3 && B >= 3 && C < -3
}

alert("a) A > 3 es "+respuesta.a+"\nb) A > C es "+respuesta.b+"\nc) A < C es "+respuesta.c+"\nd) B < C es "+respuesta.d+"\ne) B != C es "+respuesta.e+"\nf) A == 3 es "+respuesta.f)
alert("g) A * B == 15 es "+respuesta.g+"\nh) A * B == -30 es "+respuesta.h+"\ni) C / B < A es "+respuesta.i+"\nj) C / B == -10 es "+respuesta.j+"\nk) C / B == -4 es "+respuesta.k+"\nl) A + B + C == 5 es "+respuesta.l)
alert("m) (A+B == 8 ) && (A-B == 2) es "+respuesta.m+"\nn) (A+B == 8 ) || (A-B == 6) es "+respuesta.n+"\no) A > 3 && B > 3 && C < 3 es "+respuesta.o+"\np) A > 3 && B >= 3 && C < -3 es "+respuesta.p)