/* 
 * Copyright 2020 Mireia Oliver García - mireia.oliver.11@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        //Variables
        //Vaca
        final String animal01 = "Vaca";
        final int cant01 = 3;

        //Oveja
        final String animal02 = "Oveja";
        final int cant02 = 14;

        //Burro
        final String animal03 = "Burro";
        final int cant03 = 2;

        //Gallina
        final String animal04 = "Gallina";
        final int cant04 = 18;

        //patas
        final int pata1 = 4;
        final int pata2 = 2;

        //Operaciones
        //Número de patas
        int vaca = cant01 * pata1;
        int ovej = cant02 * pata1;
        int burr = cant03 * pata1;
        int gall = cant04 * pata2;
        //Total
        int t_pat = vaca + ovej + burr + gall;
        int t_par = t_pat / 2;

        // Salida por consola
        System.out.println("Secuencia de Patas");
        System.out.println("==================");
        //Vaca
        System.out.printf("Animal ........: %s%n", animal01);
        System.out.printf("Cantidad ......: %d%n", cant01);
        System.out.printf("Patas .........: %d%n", vaca);
        System.out.println("---");
        //Oveja
        System.out.printf("Animal ........: %s%n", animal02);
        System.out.printf("Cantidad ......: %d%n", cant02);
        System.out.printf("Patas .........: %d%n", ovej);
        System.out.println("---");
        //Burro
        System.out.printf("Animal ........: %s%n", animal03);
        System.out.printf("Cantidad ......: %d%n", cant03);
        System.out.printf("Patas .........: %d%n", burr);
        System.out.println("---");
        //Gallina
        System.out.printf("Animal ........: %s%n", animal04);
        System.out.printf("Cantidad ......: %d%n", cant03);
        System.out.printf("Patas .........: %d%n", gall);
        System.out.println("---");
        //Total
        System.out.printf("Total de patas.: %d%n", t_pat);
        System.out.printf("Total de pares.: %d%n", t_par);
    }
}
