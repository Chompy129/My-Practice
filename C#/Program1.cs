using System;
using System.Collections.Generic;
using AprenderC;

namespace AprenderC
{
	
	struct Cliente{
		public int id;
		public string nombre;
		public double saldo;


		public Cliente(int id, string nombre, double saldo){
			this.id 	= id;
			this.nombre	= nombre;
			this.saldo	= saldo;
		}

		/**
		 * MostrarInf es un metodo sobrecargado que se encarga de mostrar la informacion de un cliente en Consola. Si se le pasa como parametro una lista o un array mostrara la informacion de cada cliente de la lista o array.
		 */
		public void mostrarInf(){
			Console.WriteLine (" " + this.nombre + "\n - Id: " + this.id + "\n - Saldo: " + this.saldo + " Y\n");
		}
		public static void mostrarInf(Cliente[] clienteArray){
			foreach (Cliente cliente in clienteArray) {
				Console.WriteLine (" " + cliente.nombre + "\n - Id: " + cliente.id + "\n - Saldo: " + cliente.saldo + " Y\n");
			}
		}
		public static void mostrarInf(List<Cliente> clienteLista){
			foreach (Cliente cliente in clienteLista) {
				Console.WriteLine (" " + cliente.nombre + "\n - Id: " + cliente.id + "\n - Saldo: " + cliente.saldo + " Y\n");
			}
		}
	}
	class Mascota{
		private string nombre;

		public Mascota(string nombre){
			this.nombre = nombre;
		}

		public void info(){
			Console.WriteLine (this.nombre);
		}

		public string Nombre{
			get{return nombre;}
			set{nombre = value;}
		}
	}



	class MainClass
	{
		public static void Main (string[] args)
		{
			string nombre;
			Console.Title = "EXPERIENCIA PROGRAMADORA";
			Console.WriteLine ("Bienvenido a la experiencia programadora\n¿Cómo te llamas?");
			do {
				Console.ForegroundColor = ConsoleColor.Gray;
				Console.Write("Nombre: ");
				Console.ForegroundColor = ConsoleColor.Green;
				nombre = Console.ReadLine ();

				if (nombre.Equals ("")) {
					Console.Beep ();
					Console.ForegroundColor = ConsoleColor.Red;
					Console.WriteLine ("DIJE, ¿CÓMO TE LLAMAS?");
				}


				Console.ForegroundColor = ConsoleColor.DarkGray;
				nombre = nombre.ToLower();
				switch(nombre){
				case "angel":
					Console.WriteLine("(que original ¬¬)");
					break;
				case "dariela":
					Console.WriteLine("(DARIELA :O)");
					break;
				case "jose":
					Console.WriteLine("(....)");
					break;
				case "dario":
					Console.WriteLine("(¡Hola papi!)");
					break;
				}
				nombre.ToUpperInvariant();
			} while(nombre.Equals (""));

			Console.ForegroundColor = ConsoleColor.Magenta;
			Console.WriteLine ("\nHola " + nombre + ", me llamo BOT.");


			Console.ForegroundColor = ConsoleColor.DarkGray;
			Console.WriteLine ("HOLA {0}, HOLA {1}, HOLA {2}, HOLA {3}, HOLA {4}", "Goku", "Vegeta", "Gohan", "Krillin", "MAMI");
			/*
			Mascota mMascota = new Mascota ("Perro");
			Mascota cMascota = new Mascota ("Perro");

			Cliente mCliente = new Cliente ();
			Cliente cCliente = new Cliente ();

			Console.WriteLine ("¿Nombre de mascota es igual a mascotaCopia? " + String.Equals (mMascota.Nombre, cMascota.Nombre));
			Console.WriteLine ("¿Nombre de cliente es igual a clienteCopia? " + String.Equals (mCliente.nombre, cCliente.nombre));
			Console.ForegroundColor = ConsoleColor.Red;
			Console.WriteLine ("¿Mascota referencia a lo mismo que mascotaCopia? " + mMascota.Equals(cMascota));
			Console.WriteLine ("¿Cliente referencia a lo mismo que clienteCopia? " + mCliente.Equals(cCliente));
			*/
			/*
			List<Cliente> clientes = new List<Cliente> ();
			clientes.Add (new Cliente (1, "Goku", 15));
			clientes.Add (new Cliente (2, "Krillin", 1567.54));
			Console.WriteLine ("Mis clientes son:\n");

			Cliente.mostrarInf (clientes);

			//Array de 2 dimensiones (puede ampliarse)
			int[,] posicion = {
				{45,156,16,18,17},
				{15,165,15,18,64}
			};

			Console.WriteLine (posicion [1, 2]);
			*/
			/*
			List<string> radicales = new List<string> ();

			for (int i = 0; i < 10; i++) {
				radicales.Add (Console.ReadLine ());
			}
			radicales.Sort ();
			radicales.Reverse ();
			Console.WriteLine ("\nSe ha ordenado de la siguiente manera:");
			foreach (string frase in radicales) {
				Console.WriteLine ("- " + frase);
			}
			*/



			/*
			List<string> nombres = new List<string> (new string[]{ "Gohan", "vegeta", "goku" });

			for (int i = 0; i < 4; i++) {
				nombres.Add (Console.ReadLine ());
			}

			Console.WriteLine ("\033Tu lista tiene" + '\x02' + nombres.Count + " elementos");
			Console.Write ("Tu lista tiene: ");
			foreach (string frase in nombres) {
				Console.Write (frase);
			}
			Console.WriteLine ();
			*/







			/*
			string frase = "Makoto es guay";
			foreach (char a in frase) {
				Console.WriteLine (a);
			}/*/
			/**
			 * For se encarga de ejecutar, realizar operacion (la de i++)
			 * y luego comprobar, si se cumple, se repite el proceso
			 *//*
			for (int i = 1; i < frase.Length; i++) {
				Console.WriteLine (frase.Substring (0, i)+i);
			}
			/**
			 * El siguiente bucle demuestra que primero comprueba antes
			 * de ejecutar las instrucciones.
			 *//*
			for (int i = 0; i < 0; i++) {
				Console.WriteLine ("Primero ejecuta, luego comprueba");
			}
			for (double i = 0; i < 1; i += 0.01) {
				Console.WriteLine ("Cargando... " + i + "%");
			}

			Console.WriteLine (frase.Length);
			Console.WriteLine (frase.Substring (0, 14));
			string[] array = { "auto", "telefono", "play4", "switch" };
			Console.WriteLine ("Yo tengo un " + String.Join (", ", array) + ".");
			*//*
			string i = "0";
			Console.WriteLine ("Hello World!");
			i = Console.ReadLine ().ToString ();
			Console.WriteLine ("Thanks!\nMy number is ");
			Console.WriteLine ("Bye");
			Console.Write ("Look my pow.\nJust write some number: ");

			Console.WriteLine (myPow (Int32.Parse (Console.ReadLine ()), 3));
			foreach (char a in "Goku") {
				Console.Write (a);
			}
			Console.WriteLine ();

		}
		public static int myPow(int i, int n){
			int m = i;
			for(int j=1; j<n; j++){
				m = m * i;
			}
			return m;

			*/
		}


		static void miFuncion(){
			int i = 3;
			if (i == 4) {
				Console.WriteLine ("Funciona :3");
			};
			Console.WriteLine ("Hoal");
		}
	}


}
