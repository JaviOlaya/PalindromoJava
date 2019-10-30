package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        int k=0;
        System.out.println("Programa para comprobar Palíndromos ");
        char[] palabra=(scanner.nextLine()).toCharArray();
        char[] prueba= new char[palabra.length];
        for(int i=0;i<palabra.length;i++) prueba[(palabra.length-1)-i]=palabra[i];
        System.out.print("palabra invertida :");
        System.out.println(prueba);

        for (int j=0;j<palabra.length;j++) {
            if (palabra[j] == prueba[j]) k++;
            else break;
        }
          String resultado=(k==(palabra.length))?"Es un palindromo":"No es un palindromo";
            System.out.println(resultado);


    }
}
