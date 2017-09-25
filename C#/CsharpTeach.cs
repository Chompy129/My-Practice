
using System;
using System.Collections.Generic;

namespace CTeach{

	public class Indexer{

		//Fields
		public string nombre;
		public string apellido;
		public string etiqueta;

		//Constructors

		public Indexer(string nombre, string apellido , string etiqueta = "Sin etiqueta"){
			this.nombre = nombre;
			this.apellido = apellido;
			this.etiqueta = etiqueta;
		}

		//Properties (setters and getters)

		/// <summary>
		/// The syntax is the next:
		/// [modifiers] [Type] this [ [type] [variable-name] ]{ statements }
		/// </summary>
		/// <param name="index">Index.</param>

		public String this [int index] {
			get
			{ 
				String[] datos = { nombre, apellido, etiqueta };
				return datos [index];
			}
			set
			{ 
				switch (index) {
				case 0:
					nombre = value;
					break;
				case 1:
					apellido = value;
					break;
				case 2:
					etiqueta = value;
					break;
				}
			}

		}//END PROPERTY

		//METHODS

		public override String ToString(){
			return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEtiqueta: " + etiqueta;
		}//END METHOD

	}//END CLASS

	public class TestIndexer{
		public //static 
		void Main(String[] args){
			Indexer x = new Indexer ("Angel", "Fuenmayor", "Gamer");

			Console.WriteLine (x.ToString () + "\n");

			x [0] = "Dariela";
			x [2] = "Diseñadora";

			Console.WriteLine (x.ToString () + "\n");
		} 
	}//END CLASS

	/*
	public class Actividad{
		public static
		void Main(String[] args){
			int actividad = Convert.ToInt32(Console.ReadLine ());
			switch (actividad) {
			case 0:
				//Actividad 1
				break;
			case 1:
				//Actividad 2
				break;
			case 2:
				//Actividad 3
				break;
			default:
				Console.WriteLine ("No reconocido.");
				break;
			}
		}
	}
	*/

	public class Bucles{
		public //static
		void Main(String[] args){
			Console.Write ("Actividad Nº");
			byte actividad = Convert.ToByte(Console.ReadLine ());
			Console.WriteLine ();

			switch (actividad) {
			case 0:
				act1 ();
				break;
			case 1:
				act2 ();
				break;
			case 2:
				act3 ();
				break;
			case 3:
				act4 ();
				break;
			case 4:
				act5 ();
				break;
			case 5:
				act6 ();
				break;
			case 6:
				act7 ();
				break;
			case 7:
				act8 ();
				break;
			case 8:
				act9 ();
				break;
			case 9:
				act10 ();
				break;
			case 10:
				act11 ();
				break;
			case 11:
				string value = Console.ReadLine ();
				foreach (char l in "23456789") {
					if (value.Contains (l.ToString()))
						value = "0";
				}
				Console.WriteLine (act12 (value) + "\a");
				break;
			default:
				Console.WriteLine ("No reconocido.");
				break;
			}
		}

		static void act1(){
			for (byte i = 0; i < 4; i++) 
				for (byte j = 1; j <= 5; j++) 
					Console.Write (j.ToString ());

			Console.WriteLine ();
		}

		static void act2(){
			int i = 0;
			while (i < 4) {
				int j = 1;
				while (j <= 5) {
					Console.Write (j.ToString());
					j++;
				}
				i++;
			}
			Console.WriteLine ();
		}

		static void act3(){
			for(int i = 10; i <= 20; i++){
				Console.Write ("{0} es divisible entre: ", i);
				for (int j = 2; j <= 7; j++) {
					if (i % j == 0)
						Console.Write ("{0} ", j);
				}
				Console.WriteLine ();
			}
		}

		static void act4(){
			for(char l = 'Z'; l >= 'A'; l--){
				Console.Write ("{0}", l);
			}
			Console.WriteLine();
		}

		static void act5(){
			for (int i = 0; i < 5; i++)
				for (char l = 'L'; l <= 'N'; l++)
					Console.Write(l);
			Console.WriteLine();
		}

		static void act6(){
			for (int i = 2; i <= 106; i = i+2) {
				if (i % 10 == 0) {
					continue;
				}
				Console.Write ("{0} ", i);
			}
			Console.WriteLine ();
		}

		static void act7(){
			int i = 1;
			repeat: Console.Write ("{0} ", i);
			i++;
			if(i <= 10)
				goto repeat;
			Console.WriteLine ();
		}

		static void act8(){
			int a_R = 0;
			foreach (char l in Console.ReadLine ()) {
				if (l.Equals ('A') || l.Equals ('a')) {
					a_R++;
				}
			}
			Console.WriteLine ("La letra 'A' se repite {0} veces.", a_R);
		}

		static void act9(){
			Console.Write ("Ancho: ");
			int ancho = Convert.ToInt32 (Console.ReadLine ());
			Console.Write ("Alto: ");
			int alto = Convert.ToInt32 (Console.ReadLine ());
			Console.WriteLine ();

			for(int i=0; i < alto; i++){
				for (int j = 0; j < ancho; j++) {
					Console.Write ("{0}", (i == 0 || i == alto-1) || (j == 0 || j == ancho - 1) ? "*" : " ");
				}
				Console.WriteLine ();
			}

			Console.WriteLine ();
		}

		static void act10(){
			Console.Write ("Alto: ");
			int alto = Convert.ToInt32 (Console.ReadLine ());

			for (int i = 0; i < alto; i++) {
				int coin = alto - i;
				for (int j = 0; j < alto; j++) {
					Console.Write ("{0}", j < coin - 1 ? " " : "*");
				}
				Console.WriteLine ();
			}
		}

		static void act11(){
			int n = Convert.ToInt32 (Console.ReadLine ());
			Console.Write ("{0}: ", n);
			while(n > 1){
				int value = 0;
				for (int i = 7; i >= 2; i--) {
					if (i == 6 || i == 4)
						continue;
					if (n % i == 0)
						value = i;
				}
				Console.Write ("{0} ", value);
				n /= value;
			}
			Console.WriteLine ();
		}

		static int act12(string Hash){
			int ax = Hash.Length -1;
			if (ax < 0)
				return 0;

			return ( Convert.ToInt32(Hash.Substring(0,1))*((int)Math.Pow(2.0, (double)ax)) + act12(Hash.Substring(1)));
		}
	}

	public class Recursividad{
		public static
		void Main(string[] args){
			Console.Write ("Actividad Nº");
			byte actividad = Convert.ToByte (Console.ReadLine ());
			Console.WriteLine ();

			switch (actividad) {
			case 1:
				Console.WriteLine(act1 (Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine())) + "\n");
				break;
			case 2:
				Console.WriteLine(act2 (Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine())) + "\n");
				break;
			case 3:
				Console.WriteLine ("Fibonacci:");
				for (int i = 1; i < 20; i++)
					Console.WriteLine (" "+ act3 (i));
				Console.WriteLine ();
				break;
			case 4:
				foreach (int y in new int[]{ 2, 4, 8, 9, 5, 4, 7, 6, 1 })
					Console.Write (" {0}", y);
				Console.WriteLine ("\nPlus: {0}", act4(new int[]{ 2, 4, 8, 9, 5, 4, 7, 6, 1 }));
				break;
			case 5:
				foreach (int y in new int[]{ 2,5,7,15,12,48, 4, 8, 9, 5, 4, 7, 6, 1 })
					Console.Write (" {0}", y);
				Console.WriteLine ("\nMax: {0}", act5(new int[]{ 2,5,7,15,12,48, 4, 8, 9, 5, 4, 7, 6, 1 }));
				break;
			case 6:
				if (true) {
					string x = Console.ReadLine ();
					Console.WriteLine (act6 (x));
				}
				break;
			case 7:
				if (true) {
					string x = Console.ReadLine ();
					Console.WriteLine (act7 (x));
				}
				break;
			case 8:
				if (true) {
					int x = Convert.ToInt32(Console.ReadLine ());
					int y = Convert.ToInt32(Console.ReadLine ());
					Console.WriteLine (act8 (x, y));
				}
				break;
			case 9:
				if (true) {
					string x = Console.ReadLine ();
					string y = Console.ReadLine ();
					Console.WriteLine (act9 (x, y));
				}
				break;
			case 10:
				if (true) {
					string x = Console.ReadLine ();
					string y = Console.ReadLine ();
					Console.WriteLine (act10 (x, y));
				}
				break;
			default:
				Console.WriteLine ("No reconocido.");
				break;
			}
		}

		//Potencia de 'x' a la 'n'
		static int act1(int x, int n){
			if (n == 0)
				return 1;
			return x * act1 (x, n-1);
		}

		//potencia de 'x' a la 'n' (iterada)
		static int act2(int x, int n){
			int result = 1;
			for (int i = 1; i <= n; i++)
				result *= x;
			return result;
		}

		//Secuencia de Fibonacci
		static int act3(int n){
			if (n < 2)
				return n;
			return act3(n-1) + act3(n - 2);
		}

		//Suma de valores del array
		static int act4(int[] numbers){
			if(numbers.Length == 1){return numbers[0];}
			int[] x = new int[numbers.Length-1];
			for (int i = 0; i < numbers.Length - 1; i++)
				x [i] = numbers [i];
			return numbers[numbers.Length-1] + act4(x);
		}

		//Obtener el mayor de un array
		static int act5(int[] numbers){
			if(numbers.Length == 2){
				return Math.Max (numbers [0], numbers [1]);
			} else if(numbers.Length == 1){
				return numbers [0];
			}

			int[] l1 = new int[(int)Math.Ceiling((float)numbers.Length/2F)];
			int[] l2 = new int[(int)Math.Floor((float)numbers.Length/2F)];
			for (int i = 0; i < l1.Length; i++) {
				l1 [i] = numbers [i];
			}
			for (int i = 0; i < l2.Length; i++) {
				l2 [i] = numbers [l1.Length + i];
			}
			return Math.Max (act5(l1), act5(l2));
		}

		//Invertir frase
		static string act6(string s){
			if (s.Length == 1)
				return s;
			return act6 (s.Substring (1)) + s [0]; 
		}

		//Es palindromo(simetrico)
		static bool act7(string value){
			if (value.Length == 1) {
				return true;
			} else if (value.Length == 2) {
				return value [0].Equals(value [1]);
			}

			return act7(value [0] + value [value.Length - 1].ToString()) && act7(value.Substring(1, value.Length - 2));
		}

		//MCD (Maximo comun divisor)
		static int act8(int m, int n){
			int r = m % n;
			if (r == 0) {
				return n;
			}
			return act8 (n, r);
		}

		//Contains
		static bool act9(string text, string sub_text){
			if (text.Length > 0 && sub_text.Length <= text.Length) {
				return text.Substring (0, sub_text.Length).Equals (sub_text) || act9(text.Substring(1), sub_text);
			}

			return false;	
		}

		//Contains (iterada)
		static bool act9It(string text, string sub_text){
			int i = -1;
			if(text.Length >= sub_text.Length)
			while (i <= text.Length) {
				if (text.Substring (++i, sub_text.Length).Equals (sub_text))
					return true;
			}

			return false;
		}

		//Cuantas veces aparece una palabra en una frase
		static int act10(string s, string sub_s){
			if (sub_s.Length > 0) {
				int x = 0;
				for(int i = 0; i < s.Length; i++) {
					if (s[i]. Equals (sub_s [0])) {
						x++;
					}
				}
				return x * 1 + act10 (s, sub_s.Substring (1));
			}

			return 0;

		}
	}

}//END NAMESPACE
