package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANOS

        //PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE :
        //MEDALLAS DE ORO
        //MEDALLAS DE PLATA
        //MEDALLAS DE BRONCE

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS
        // INFORMAR CUAL ES EL PAIS CON MAS NUMERO DE MEDALLAS
        // INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS
        // TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE LOS PAISES SURAMERICANOS

        ////////////////////////////////////////////////////////////////////////

        ArrayList<String> paises = new ArrayList<>();
        ArrayList<Integer> medallas =new ArrayList<>();

        Scanner leerTeclado = new Scanner(System.in);

        System.out.println("***OLIMPICOS 2024***");

        for (int i = 0; i < 2; i++) {
            String pais;
            int sumatoriaMedallas=0;
            System.out.print("Ingrese un pais: ");
            pais = leerTeclado.nextLine();
            paises.add(pais);
            System.out.print("Digita el numero de medellas de oro de " +pais+": ");
            int medallasOro= leerTeclado.nextInt();
            System.out.print("Digite el numero de medallas de plata de " +pais+": ");
            int medallasPlata=leerTeclado.nextInt();
            System.out.print("Digite el numero de medallas de bronce de "+pais+": ");
            int medallasBronces=leerTeclado.nextInt();
            sumatoriaMedallas=medallasBronces+medallasOro+medallasPlata;
            System.out.println(pais+" Obtuvo en total: " +sumatoriaMedallas+ " Medallas en paris");
            leerTeclado.nextLine();
            medallas.add(sumatoriaMedallas);

        }
        int paisMayor=medallas.get(0);

        for (Integer medalla:medallas){
            if (medalla>paisMayor);{
                paisMayor=medalla;
            }
        }
        System.out.println("El pais con mas medallas obtuvo un total de: " +paisMayor);

        //QUIERO PREGUNTAR CUAL ES EL CAJON (INDICE) DONDE SE GUARDO
        //LA CANTIDAD DE MEDALLAS MAYOR

        int indiceGanador=medallas.indexOf(paisMayor);
        System.out.println("El indice ganador: " +indiceGanador);

        System.out.println("Asi pues, el pais ganador fue: " +paises.get(indiceGanador));

        //PAIS CON MENOR PUESTO



    }
}