
package m.repaso2doparcial1;

public class Aviones {
    private int id;
    private String piloto;
    private int capacidad_pasajeros;

    public Aviones() {
    }

    public Aviones(int id, String piloto, int capacidad_pasajeros) {
        this.id = id;
        this.piloto = piloto;
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    @Override
    public String toString() {
        return "Aviones{" + "id=" + id + ", piloto=" + piloto + ", capacidad_pasajeros=" + capacidad_pasajeros + '}';
    }
    
}
