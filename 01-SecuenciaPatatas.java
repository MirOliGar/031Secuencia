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

        //variables
        final String n_persona = "Jaimito";
        final String n_encargo = "Patatas";
        final String n_antojo = "Piruleta";
        final int cantidad_enc = 3;
        final double dinero_ini = 1.00;
        final double dinero_antojo = 0.20;
        final double dinero_patata = 0.30;

        //operaciones
        
        double vueltas = dinero_ini - dinero_antojo; //lo que le queda.
        int patatas = (int) (vueltas / dinero_patata);
        double devuelto = vueltas % dinero_patata;
        
        
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");

        System.out.printf("Persona encargada .....: %s%n", n_persona);
        System.out.printf("Artículo encargado ....: %s kg%n", n_encargo);
        System.out.printf("Cantidad encargada ....: %d%n", cantidad_enc);

        System.out.println("---");

        System.out.printf("Precio encargo ........: %.2f €%n", dinero_patata);
        System.out.printf("Dinero suministrado ...: %.2f €%n", dinero_ini);

        System.out.println("---");

        System.out.printf("Artículo imprevisto ...: %s%n", n_antojo);
        System.out.printf("Precio imprevisto .....: %.2f €%n", dinero_antojo);

        System.out.println("---");

        System.out.printf("Cantidad comprada .....: %d kg%n", patatas);
        System.out.printf("Dinero devuelto .......: %.2f €%n", devuelto);

    }
}
