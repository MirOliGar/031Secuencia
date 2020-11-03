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
        final String nombre = "Marta";
        final double dinero_ini = 1.00;
        final String articulo = "Pulsera hippy";
        final double p_art = 0.70;

        //Operaciones
        double resto = dinero_ini - p_art;

       //Salida por pantalla
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");
        
        System.out.printf("Nombre de la niña ...: %s%n", nombre);
        System.out.printf("Dinero inicial .....: %.2f €%n", dinero_ini);
        
        System.out.println("---");
        
        System.out.printf("Artículo a comprar ..: %s%n", articulo);
        System.out.printf("Precio artículo .....: %.2f €%n", p_art);
        
        System.out.println("---");
        
        System.out.printf("Dinero restante .....: %.2f €%n", resto);
        

    }
}
