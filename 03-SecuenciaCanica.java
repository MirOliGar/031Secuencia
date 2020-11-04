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
        final String canica = "Ruperta";
        int can_ini = 5;
        int can_fin = 1;
//Operaciones
        int perdidas = can_ini - can_fin;
//Salida por consola

        System.out.println("Secuencia de Canicas");
        System.out.println("====================");
        
        System.out.printf("Nombre de la canica ........: %s%n", canica);
        System.out.println("---");
        System.out.printf("Número de canicas inicial ..: %d%n", can_ini);
        System.out.printf("Número de canicas final ....: %d%n", can_fin);
        System.out.println("---");
        System.out.printf("Número de canicas perdidas .: %d%n", perdidas);
    }
}
