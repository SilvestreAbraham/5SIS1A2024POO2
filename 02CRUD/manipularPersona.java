

import java.util.*;

public class manipularPersona{

    public void menu(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido a este Programa");
        System.out.println("Elija una Opcion Valida");
        System.out.println("1.- Mostrar todos los registros de personas");
        System.out.println("2.- Registrar un nuevo objeto");
        System.out.println("3.- Editar ese Objeto");
        System.out.println("4.- Borrar el Objeto");
        System.out.println("5.- Salir");
        package arrarypersona;
        
        opcion = Integer.parseInt(entrada.nextLine());
        
        switch (opcion) {
            case 1:
                
                ArrayList<Persona> listadePersonas = crud.mostrarPersonas();
                
                for(Persona objeto : listadePersonas){
                    System.out.println("El id:" + objeto.getId() + "El nombre: " + objeto.getNombre()+ "La edad es: " + objeto.getEdad() + "\n");
                }
                
                break;
            case 2:
                
                System.out.println("Ingresa el id de la persona: ");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingresa el nombre de la persona: ");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingresa la edad de la persona: ");
                int edadpersona = Integer.parseInt(entrada.nextLine());
                Persona personaNueva = new Persona(idpersona, nombrepersona, edadpersona);
                crud.registrarPersona(personaNueva);
                break;
            case 3:
                
                System.out.println("Ingrese el ID de la persona que desea actualizar sus datos");
                int id = entrada.nextInt();
                Persona personaSeleccione = crud.buscarPersona(id);
                System.out.println("La informacion de la persona es la siguiente: ");
                System.out.println("Id: " + personaSeleccione.getId() + "Nombre: " + personaSeleccione.getNombre() + "Edad: " + personaSeleccione.getEdad());
                System.out.println("Ingrese el nuevo nombre del registro");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingrese la nueva edad del registro");
                int edadnueva = entrada.nextInt();
                personaSeleccione.setNombre(nuevonombre);
                personaSeleccione.setEdad(edadnueva);                
                crud.actualizarPersona(personaSeleccione);
                
                break;
            case 4:
                
                System.out.println("Ingrese el ID de la persona que desea actualizar sus datos");
                int ideliminar = entrada.nextInt();
                Persona personaEliminar = crud.buscarPersona(ideliminar);
                crud.eliminarPersona(personaEliminar);
                System.out.println("Registro eliminado exitosamente");
                
                break;
            default:
                System.out.println("Digite una opcion correcta");
        }
        }while(opcion !=5);
    }
        
    
}

    }
}
