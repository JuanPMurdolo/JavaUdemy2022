package src;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
            System.out.println("Hello World from Java");
            String publicidad = "hola";
            System.out.println(publicidad);

        /*Ingresar por teclado desde una ventana*/
        String test = JOptionPane.showInputDialog(null, "ingresa una palabra");
        System.out.println(test);

        /*Inprimir en una ventana*/
        test += "\npalabra abajo de la otra";
        JOptionPane.showMessageDialog(null, test);

        /*Ingresar por teclado desde la terminal*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un  numero");
        /*String numeroStr = scan.nextLine();*/
        int numero = 0;
        try {
            numero =  scan.nextInt();//Integer.parseInt(numeroStr);
        } catch(InputMismatchException e) {
            System.out.println("Error debe ingresar  un numero entero!!!!!!!!!!!");
            main(args);
            System.exit(0);
        }
        double uno = 1 * 1.19 ;

        System.out.println(numero);

    }
}
