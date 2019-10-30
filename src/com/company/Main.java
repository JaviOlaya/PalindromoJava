package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para comprobar Palíndromos ");
        char[] palabra=(scanner.nextLine()).toCharArray();
        char[] prueba= new char[palabra.length];
        for(int i=0;i<palabra.length;i++) prueba[(palabra.length-1)-i]=palabra[i];
        System.out.print("palabra invertida :");
        System.out.println(prueba);
    }
}
