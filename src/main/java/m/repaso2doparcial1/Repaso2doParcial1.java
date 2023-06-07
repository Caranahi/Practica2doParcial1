

package m.repaso2doparcial1;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class Repaso2doParcial1{
    
      public static List<Aeropuertos> filtrarAeropuertosPorCapacidad(List<Aeropuertos> aeropuertos, int capacidadMinima) throws CapacidadInsuficienteExcepcion {
        List<Aeropuertos> aeropuertosFiltrados = new ArrayList<>();

        for (Aeropuertos aeropuerto : aeropuertos) {
            if (aeropuerto.getCapacidad() > capacidadMinima) {
                aeropuertosFiltrados.add(aeropuerto);
            } else {
                throw new CapacidadInsuficienteExcepcion(aeropuerto.getCapacidad());
            }
        }

        return aeropuertosFiltrados;
    }
    

    public static void main(String[] args) {
        
        
        Aeropuertos aero= new Aeropuertos();
        //Aeropuertos aero2 = new Aeropuertos();
        List <Aeropuertos> aeros = aero.extraerJson("Aviones.json");
        
        System.out.println(aeros);
                   
         try {
           List<Aeropuertos> aeropuertosFiltrados = filtrarAeropuertosPorCapacidad(aeros, 300);
           for (Aeropuertos aeropuerto : aeropuertosFiltrados) {
                System.out.println(aeropuerto.getNombre() + " - Capacidad: " + aeropuerto.getCapacidad());
            }
        } catch (CapacidadInsuficienteExcepcion e) {
            System.out.println("Error: Capacidad insuficiente en el aeropuerto. Capacidad: " + e.getCapacidadAeropuerto());
        }       
         
        GenericPilotosYTags<String> pilotos= new GenericPilotosYTags<>();
        int i=0;
        int j=0;
        while(i<aeros.size()){
            for(j=0; j< aeros.get(i).getAviones().size(); j++){
                pilotos.agregar(aeros.get(i).getAviones().get(j).getPiloto());
            }
           
            i++;
        }
        
         System.out.println(pilotos.toString());
        
       /* System.out.println("Pilotos almacenados:");
        for (int p = 0; p < pilotos.getElementos().size(); p++) {
            System.out.println(pilotos.toString());
        }*/

    
         
    }
  
}


/*public static List<Aeropuerto> filtrarAeropuertosPorCapacidad(List<Aeropuerto> aeropuertos, int capacidadMinima) throws CapacidadInsuficienteException {
        List<Aeropuerto> aeropuertosFiltrados = new ArrayList<>();

        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCapacidad() > capacidadMinima) {
                aeropuertosFiltrados.add(aeropuerto);
            } else {
                throw new CapacidadInsuficienteException(aeropuerto.getCapacidad());
            }
        }

        return aeropuertosFiltrados;
    }*/