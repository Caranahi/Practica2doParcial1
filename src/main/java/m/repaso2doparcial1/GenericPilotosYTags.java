
package m.repaso2doparcial1;
import java.util.ArrayList;
import java.util.ArrayList;

public class GenericPilotosYTags <T> {
    
    private ArrayList<T> elementos;
    
    public GenericPilotosYTags() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        this.elementos.add(elemento);
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<T> elementos) {
        this.elementos = elementos;
    }

    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < elementos.size()) {
            elementos.remove(posicion);
        } else {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
    }
    public T recuperar(int posicion) {
        if (posicion >= 0 && posicion < elementos.size()) {
            return elementos.get(posicion);
        } else {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
    }

    @Override
    public String toString() {
        return "GenericPilotosYTags{" + "elementos=" + elementos + '}';
    }
    
    
}


