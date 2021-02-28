package com.cip.prog;

import java.util.Scanner;

public class ParaGit {


	public static boolean esPrimo(int num) {	//Creamos para comprobar si es primo
		if(num<0) {								//Si es negativo lo cambiamos a positivo
			num=num*-1;
		}
		for(int i=num-1; i>1; i--) {			/*Recorremos desde el número anterior hasta 2
		 										porque entr 1 daría 0 el resto de la división*/
			if(num%i==0) {						/*Si el resto de esta división es 0 no será primo
			 									y devuelve falso*/
				return false;
			}									/*En caso contrario será primo*/
		}return true;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		//Inicializamos la clase Scanner
		
		System.out.println("Introduzca el "			//Pedimos el número
				+ "número natural a comprobar: ");
		int num =sc.nextInt();			
		if(esPrimo(num)) {							//Si es true la llamada a esPrimo()
			System.out.println("Es primo.");		//Indicamos que es primo
		}else {
			System.out.println("No es primo.");		//En caso contrario, indicamos lo contrario
		}
		
	}
	}

