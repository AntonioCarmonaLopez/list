
package modelo;

public class Lista2 {

    private Nodo primerNodo;
    private Nodo ultimoNodo;

    public Lista2() {
        primerNodo = null;
        ultimoNodo=null;
    }

    public Nodo getPrimerNodo() {
        return primerNodo;
    }

    public Nodo getUltimoNodo() {
        return ultimoNodo;
    }

    public boolean estaVacia() {
        return (primerNodo == null);
    }

    public void insertarAlPrincipio(Object dato) {
        Nodo n = new Nodo(dato);
//si la lista esta vacia el primerNodo y ultimoNodo se encuentran null
//y se le asigna el nuevo dato
        if (estaVacia()) {
            primerNodo = n;
            ultimoNodo=n;
//si no esta vacia hacemos que el nuevo dato apunte al siguiente nodo y asimismo hacemos que el nodo anteror al nuevo nodo apunte al nuevo nodo
        } else {
            n.setSig(primerNodo);
            primerNodo = n;
            n.setAnt(ultimoNodo);
        }
    }

    public void insertarAlFinal(Object dato) {
        Nodo n = new Nodo(dato);
//si esta vacia idem insertarInicio
        if (estaVacia()) {
            ultimoNodo = n;
            primerNodo=n;
        } else {
//si existen datos hacemos que el penultimo nodo ahora apunte al nuevo nnodo y que el nodo insertado apunte al penúltimo nodo
            Nodo aux = primerNodo;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            primerNodo.setSig(n);
            ultimoNodo.setAnt(primerNodo);
        }
    }

    public boolean eliminarDelPrincipio() {
//si esta vacia no hacemos nada
        if (estaVacia()) {
            return false;
//el el caso de que si existan datos en la lista hacemos que el primerNodo
//apunte por un extremo del nodo al siguiente nodo y por el final de la lista hacemos que apunte a null
        } else {
            primerNodo = primerNodo.getSig();
            primerNodo.setAnt(null);
            
            return true;
        }
    }

 public boolean eliminarDelFinal() {
        if (estaVacia()) {
//si esta vacia no hacemos nada
            return false;
        } else {
//si el útimo nodo no apunta a nada(null), simplemente se le asigna el
// valor null a primerNodo
            Nodo aux = primerNodo;
            if (aux.getSig() == null) {
                primerNodo = null;
//si no el el último hacemos que el último nodo apunte a null
            } else {
                ultimoNodo.setSig(null);
            }
            return true;
        }
    }

    public int getTamano() {
        Nodo aux = primerNodo;
        int num = 0;
        while (aux != null) {
            num++;
            aux = aux.getSig();
        }
        return num;
    }

    public Nodo devolverNodo(int pos) {
        Nodo aux = primerNodo;
        int cont = 0;
        if (pos < 0 || pos >= getTamano()) {
            return null;
        } else {
            while (aux != null) {
                if (pos == cont) {
                    return aux;
                }
                aux = aux.getSig();
                cont++;
            }
        }
        return aux;
    }
}
