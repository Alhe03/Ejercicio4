package org.example;

import java.util.Scanner;
import array.Array;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual seria el tamaño de tus arreglos: ");
        int sizeArray = scanner.nextInt();
        Array array = new Array(sizeArray);
        array.capturarDatos(new Scanner(System.in), array);
        //suma(array.getElementos());
        Array array1 = new Array(sizeArray);
        array1.capturarDatos(new Scanner(System.in), array1);
        array.recorre(array.getElementos(),array1.getElementos());

    }
}