/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Josue
 */
public class ArregloService {

    public void inicializarA(double[] arreglo) {
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextDouble() * 10;
        }
    }

    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
    }

    public void ordenarYMostrar(double[] arreglo) {
        Arrays.sort(arreglo);
        for (double d : arreglo) {
            System.out.println(d);
        }
    }

    public void convirtiendoYOrdenando(double[] arreglo) {
        Arrays.sort(arreglo);
        double aux = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }

            }
        }
        System.out.println(Arrays.toString(arreglo));
    }

    public void convirtiendoYOrdenando2(double[] arreglo) {
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
        }
        for (double d : arreglo) {
            System.out.println(d);
        }

    }

    public void inicialiarB(double[] A, double[] B) {
        for (int i = 0; i < B.length; i++) {
            if (i < 10) {
                B[i] = A[i];
            } else {
                B[i] = 0.5;
            }
        }
    }
}
