/* 
 * Copyright 2020 CicloM.
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

import java.util.Random;

/**
 *
 * @author Brayan Camilo Sanchez Arenas
 */
public class Main {

    //Instanciamos Objeto Random
    public static final Random RND = new Random();

    public static void main(String[] arg) {
        //Constantes y Variables/RND
        final char Letra_Min = 'A';
        final char Letra_Max = 'Z';
        char Letra_RND = (char) (RND.nextInt(Letra_Max - Letra_Min + 1) 
                + Letra_Min);        
        //Salida de consola
System.out.printf("Letra de inicio de examen .: %c%n", Letra_RND);
    }
}
