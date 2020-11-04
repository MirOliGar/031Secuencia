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
        final double ini = 2.00;
        final double peli = 1.30;
        final double palo = 0.45;
        
        //Operaciones
        
       double gastos = peli + palo;
       double vueltas = ini - gastos;
       
       //Salidas por consola
       
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
        System.out.printf("Dinero inicial .....: %.2f €%n", ini);
        System.out.println("---");
        System.out.printf("Precio película ....: %.2f €%n", peli);
        System.out.printf("Parte palomitas ....: %.2f €%n", palo);
        System.out.println("---");
        System.out.printf("Gastos por persona .: %.2f €%n", gastos);
        System.out.println("---");
        System.out.printf("Dinero restante ....: %.2f €%n", vueltas);

    }
}
