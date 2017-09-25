using System;
using System.Collections.Generic;

namespace RETOSc
{
	/// <summary>
	/// Muestra la suma de los valores dados por el usuario que seran
	/// separados por espacios y en una sola linea.
	/// </summary>
	class Reto001
	{
		public //static
		void Main (string[] args)
		{
			long resultado = 0;
			foreach (string number in Console.ReadLine ().Split(' ')) {
				if (!number.Equals ("")) {
					resultado += int.Parse (number);
				}
			}
			Console.WriteLine (resultado);
		}
	}

	/// <summary>
	/// Muestra el mayor de dos numeros.
	/// </summary>
	class Reto002
	{
		public //static
		void Main(string[] args){
			int n1 = Int32.Parse( Console.ReadLine () );
			int n2 = Int32.Parse( Console.ReadLine () );

			Console.WriteLine ( (n1 > n2) ? n1 : n2 );
			/*
			if (n1 > n2) {
				Console.WriteLine (n1);
			} else {
				Console.WriteLine (n2);
			}
			*/
		}
	}

	/// <summary>
	/// Factores primos
	/// </summary>
	class Reto003
	{
		public //static
		void Main(string[] args)
		{
			string number = Console.ReadLine ();
			while (!number.Equals ("")) {

				Console.Write (number + " = ");

				foreach (int n in Primo( Int32.Parse(number) )) {
					Console.Write (n + " ");
				}
				Console.WriteLine ();

				number = Console.ReadLine ();
			}

		}

		public static int[] Primo(int n){
			List<int> resultados = new List<int> ();
			int i = 2;

			//Realiza los procesos solo si el valor aun no ha llegado a 1.
			while (n != 1) { 
				while (! (n % i == 0) ) {
					i++; 
					//Busca que numero es multìplo de n para
					//anotar el numero.
				}
				//Si se encontro, se divide n por el numero
				//primo para buscar el siguiente.
				n /= i; resultados.Add (i);
			}

			return resultados.ToArray ();
		}

	}

	/// <summary>
	/// Fracciones irreducibles.
	/// </summary>
	class iFraccion{
		public //static
		void Main (string[] args){
			
			double number = Convert.ToDouble (Console.ReadLine ());
			int divisor = 1;
			int multiplo = -1;

			while (number.ToString().Length != multiplo && !number.ToString ().Substring (multiplo, 1).Equals (".") ) {
				//Aumenta multiplo progresivamente
				multiplo++;
			}

			number *= Math.Pow (10, multiplo);
			divisor = Convert.ToInt32(Math.Pow (10, multiplo));

			Console.WriteLine ( number / (rFraccion.mcd(Convert.ToInt32(number), divisor)) + "/" + divisor/rFraccion.mcd(Convert.ToInt32(number), divisor));
		}
	}

	public class rFraccion{
		public //static
		void Main (String[] args) {
			int numerador = Convert.ToInt32 (Console.ReadLine ()),
			    denominador = Convert.ToInt32 (Console.ReadLine ());

			int n = mcd (numerador, denominador);

			if (denominador < 0) {
				numerador *= -1;
				denominador *= -1;
			}

			Console.WriteLine (numerador/n + " / " + denominador/n);
		}

		public static int mcd(int num, int den) {
			if (den == 0) {
				return num;
			}
			return mcd (den, num % den);
		}
	}



	class Practica{
		public //static
		void Main (String[] args){
			Fib(Convert.ToInt32 (Console.ReadLine ()));

		}

		public static int Fib(int n){
			int a = 0, b = 1; 
			while (a < n) { // fn = fn-1 + fn-2
				Console.WriteLine (a);
				b = a+b;
				a = b;

			}

			return a;
		}
	}


}
