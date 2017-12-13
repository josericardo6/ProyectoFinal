/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import da.Cola;
import da.ListaInsertion;
import da.ListaMerge;
import ui.Principal;

/**
 *
 * @author Jose Ricardo Rodriguez Moya
 * @version 1.0
 * 
 * Descripcion: Parcial 2/ Proyecto 2 de programación 3.
 * 
 * Se implemento el metodo de ordenamiento Merge Sort en una lista simple y una cola.
 * Se implemento el metodo de ordenamiento Insertion Sort en una lista simple y circular.
 * 
 * Creacion: 12 / 12 / 2017
 * Ultima revision: 12 / 12 / 2017
 */

public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Definición de las listas y cola vacias.
        
        Cola cola = new Cola();                                                //Cola Merge Sort
        ListaMerge simpleM = new ListaMerge();                  //Lista simple Merge Sort                 
        ListaInsertion simpleIn = new ListaInsertion();         //Lista simple Insertion Sort
        ListaInsertion circularIn = new ListaInsertion();       //Lista circular Insertion Sort
        
        //MERGE SORT LISTA SIMPLE
        
        simpleM.add("Ricardo", "Rodriguez", "Moya", "2-0740-0314", 22.0);
        simpleM.add("Juan", "Perez", "Mora", "1-1121-0507", 29.0);
        simpleM.add("Brayan", "Oconer", "Splinner", "M12378", 34.0);
        simpleM.add("Obama", "Barack", "Simion", "E78072", 56.0);
        
        System.out.println("***************MERGE SORT LISTA SIMPLE: \n\n Original: \n"+simpleM.toString());
        simpleM.mergeSort(simpleM.getCabeza());
        simpleM.pasaportePrimero();
        System.out.println("Ordenada:\n"+simpleM.toString());
        
        //MERGE SORT COLA
        
        cola.queue("Santiago", "Mora", "Valverde", "7-0740-0314", 6.0);
        cola.queue("Jose", "Carballo", "Flores", "1-1354-0621", 18.0);
        cola.queue("Alexander", "Ramirez", "Varela", "1-1224-0247", 55.0);
        cola.queue("Jeylin", "Smith", "Jones", "M12378", 24.0);
        
        System.out.println("***************MERGE SORT COLA: \n\n Original: \n"+cola.toString());
        cola.mergeSort(cola.top());
        cola.pasaportePrimero();
        System.out.println("Ordenada:\n"+cola.toString());
        
        //INSERTION SORT LISTA SIMPLE
        
        simpleIn.add("Javier", "Moya", "Prendas", "4-0621-0115", 12.0);
        simpleIn.add("Xinia", "Portugues", "Aviles", "2-1354-0621", 46.0);
        simpleIn.add("Julio", "Ramirez", "Ventega", "2-1224-0247", 40.0);
        simpleIn.add("Jhonson", "Williams", "Fallen", "R73950", 86.0);
        
        System.out.println("***************INSERTION SORT LISTA SIMPLE: \n\n Original: \n"+simpleIn.toString());
        simpleIn.insertionSort();
        System.out.println("Ordenada:\n"+simpleIn.toString());
        
        //INSERTION SORT LISTA CIRCULAR
        
        circularIn.addCircular("David", "Angulo", "Tivas", "9-0461-0872", 25.0);
        circularIn.addCircular("Heylin", "Rodriguez", "Flores", "5-2454-0621", 19.0);
        circularIn.addCircular("Alexander", "Ramirez", "Varela", "6-2454-0247", 50.0);
        circularIn.addCircular("Williams", "Smith", "Tomatito", "E12658", 31.0);
        
        System.out.println("***************INSERTION SORT CIRCULAR: \n\n Original: \n"+circularIn.toString());
        circularIn.insertionSortCircular();
        System.out.println("Ordenada:\n"+circularIn.toString());
        
        //MODULOS GRAFICOS
        
        Principal p = new Principal();
        
        p.setVisible(true);
        
    }
    
}
