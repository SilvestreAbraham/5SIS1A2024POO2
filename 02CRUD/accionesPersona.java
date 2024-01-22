
import java.util.*;

public class accionesPersona {

    public ArrayList<Persona> listaPersona = new ArrayList<Persona>();

    public ArrayList<Persona> mostrarPersonas(){

        return listaPersona;
    }

    public void agregarPersona(Persona p){

        listaPersona.add(p);
    }

    public Persona buscarPersona(int id){
        Persona encontrada = new Persona();

        for(Persona p : listaPersona){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona encontrada");
            }
        }
        return encontrada;
    }

    public void actualizarPersona(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());
        listaPersona.remove(actualizar); 
        listaPersona.add(actualizar);
    }

    public void eliminarPersona(Persona eliminar){
        listaPersona.remove( eliminar);
    }
    
}
