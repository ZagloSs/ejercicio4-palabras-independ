package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int maxChar = 50;
	
		try {
			
			File txt = new File("palabras.txt");
			RandomAccessFile archivo = new RandomAccessFile("palabras.txt", "rw");
			Scanner sc = new Scanner(System.in);
			Scanner nxtLine = new Scanner(txt);
			String palabra = "";
			do{
				
				System.out.println("Introduce una palabra de maximo 50 caracteres: ");
				palabra = sc.nextLine();
				
			}while((palabra.length() > 50) );
			
			
			int charsCorrecto = palabra.length();
			String[] p = palabra.split("");
			
			//+56 para la siguiente linea
			int comprobarLetras = 0;
			int palabrasIguales = 0;
			
			for(int i = 0; i<charsCorrecto; i++) {
				String caracter = String.valueOf((char) archivo.read());
				System.out.println(caracter);
				
				if(caracter.equals(p[i])) {
					comprobarLetras++;
					if(comprobarLetras == charsCorrecto) {
						palabrasIguales++;
					}
				}else {
					
				
				}
					
				
					
					
			}
			
				
			
			System.out.println(palabrasIguales);
			
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int contarLineas(File txt) {
		int lines = 0;
		try {
			Scanner sc = new Scanner(txt);
			;
			 while(sc.hasNextLine()) {
				 sc.nextLine();
				 lines++;
			 }
			 return lines;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("No se ha podido contar las lineas");
			return lines;
		}
	}

}
