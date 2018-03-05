
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
        if (estaVacia()) {
            primerNodo = n;
            ultimoNodo=n;
        } else {
            n.setSig(primerNodo);
            primerNodo = n;
            n.setAnt(ultimoNodo);
        }
    }

    public void insertarAlFinal(Object dato) {
        Nodo n = new Nodo(dato);
        if (estaVacia()) {
            ultimoNodo = n;
            primerNodo=n;
        } else {
            Nodo aux = primerNodo;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            primerNodo.setSig(n);
            ultimoNodo.setAnt(n);
        }
    }

    public boolean eliminarDelPrincipio() {
        if (estaVacia()) {
            return false;
        } else {
            primerNodo = primerNodo.getSig();
            primerNodo.setAnt(null);
            
            return true;
        }
    }

 public boolean eliminarDelFinal() {
        if (estaVacia()) {
            return false;
        } else {
            Nodo aux = primerNodo;
            if (aux.getSig() == null) {
                primerNodo = null;
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
