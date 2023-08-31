

package array;

import java.util.Scanner;
public class Array {
    Integer [] array;
    Integer [] array2;
    int contador=0;
    Integer [] intersecta;

    public Array (int sizeArray){
        this.contador =0;
        this.array= new Integer[sizeArray];
        this.intersecta = new Integer[sizeArray];
    }

    public void capturarDatos (Scanner scanner , Array array){
        int contador =0;
        System.out.println("Introduce todo el  arreglo:");
        while (contador< array.getElementos().length){
            array.addElemento(scanner.nextInt());
            contador++;
        }
    }

    public void addElemento(Integer elem){
        if (contador < array.length){
            array[contador] = elem;
            contador++;
        }
    }

    public Integer [] getElementos() {
        return array;
    }

    public void recorre(Integer[] array, Integer[] array2){
        int i;
        int j;
        int x=0;
        int ban=0;
        for ( i=0; i <array.length; i++){
            for (j=0; j < array.length; j++){
                if (array[i]==array2[j]){
                    intersecta [x] = array [i];
                    ban=1;
                    x++;
                }
            }
        }if(ban==0) System.out.println("No hay interseccion");
       else{ System.out.println("Tu arreglo es:");
        for (i=0; intersecta[i] !=null; i++)System.out.println(intersecta[i]);}
    }
}

