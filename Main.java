package t09p01;

import modelo.Cola;
import modelo.Lista2;
import modelo.Nodo;
import modelo.Pila;

public class T09p01 {

    public static void main(String[] args) {
        System.out.println("Pila simplemente enlazada");   
        Pila pila = new Pila();
        pila.insertarAlFinal(2);
        pila.insertarAlFinal(3);
        pila.insertarAlFinal(1);
        pila.eliminarDelFinal();
        System.out.println("Tamano: " + pila.getTamano());
        System.out.print("Elementos: ");
        Nodo aux = pila.getPrimerNodo();
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            aux = aux.getSig();
        }
        System.out.println("\n");
        
        System.out.println("cola simplemente enlada");
        Cola cola = new Cola();
        cola.insertarAlPrincipio(2);
        cola.insertarAlPrincipio(3);
        cola.insertarAlPrincipio(1);
        cola.eliminarDelFinal();
        System.out.println("Tamano: " + cola.getTamano());
        System.out.print("Elementos: ");
        Nodo auxC = cola.getPrimerNodo();
        while (auxC != null) {
            System.out.print(auxC.getDato() + " ");
            auxC = auxC.getSig();
        }
        System.out.println("\n");
        
        
        System.out.println("--------------Lista enlazada doble----------------");
        Lista2 lista = new Lista2();
        System.out.println("Crear Lista vacia");
        lista.insertarAlPrincipio(2);
        System.out.println("Insertar elemento al principio");
        System.out.println("Tamano: " + lista.getTamano());
        System.out.print("Elementos: ");
        Nodo aux1 = lista.getPrimerNodo();
        while (aux1 != null) {
            System.out.print(aux1.getDato() + " ");
            aux1 = aux1.getSig();
        }
        System.out.println("\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        lista.insertarAlFinal(3);
        System.out.println("insertar elemento al final");
        System.out.println("Tamano: " + lista.getTamano());
        System.out.print("Elementos: ");
        Nodo aux2 = lista.getPrimerNodo();
        while (aux2 != null) {
            System.out.print(aux2.getDato() + " ");
            aux2 = aux2.getSig();
        }
        System.out.println("\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        lista.insertarAlPrincipio(1);
        System.out.println("Insertar elemento al principio");
        System.out.println("Tamano: " + lista.getTamano());
        System.out.print("Elementos: ");
        Nodo aux3 = lista.getPrimerNodo();
        while (aux3 != null) {
            System.out.print(aux3.getDato() + " ");
            aux3 = aux3.getSig();
        }
        System.out.println("\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        lista.eliminarDelFinal();
        System.out.println("eliminar elemento del final");
        System.out.println("Tamano: " + lista.getTamano());
        System.out.print("Elementos: ");
        Nodo aux4 = lista.getPrimerNodo();
        while (aux4 != null) {
            System.out.print(aux4.getDato() + " ");
            aux4 = aux4.getSig();
        }
        System.out.println("\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        lista.eliminarDelPrincipio();
        System.out.println("eliminar elemento del principio");
        System.out.println("Tamano: " + lista.getTamano());
        System.out.print("Elementos: ");
        Nodo aux5 = lista.getPrimerNodo();
        while (aux5 != null) {
            System.out.print(aux5.getDato() + " ");
            aux5 = aux5.getSig();
        }
        System.out.println("\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("");
    }
}
