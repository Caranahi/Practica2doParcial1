/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package m.repaso2doparcial1;

/**
 *
 * @author Carla
 */
public class CapacidadInsuficienteExcepcion extends Exception{

    private int capacidadAeropuerto;

    public CapacidadInsuficienteExcepcion(int capacidadAeropuerto) {
        this.capacidadAeropuerto = capacidadAeropuerto;
    }

    public int getCapacidadAeropuerto() {
        return capacidadAeropuerto;
    }
      public CapacidadInsuficienteExcepcion(String message) {
        super(message);
    }
}
