import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Ana", 18));
        listaPersonas.add(new Persona("Carlos", 62));
        listaPersonas.add(new Persona("Maria", 27));
        listaPersonas.add(new Persona("Jose", 58));
        listaPersonas.add(new Persona("Sofia", 31));
        listaPersonas.add(new Persona("Diego", 45));
        listaPersonas.add(new Persona("Valentina", 16));
        listaPersonas.add(new Persona("Andres", 39));
        listaPersonas.add(new Persona("Camila", 29));
        listaPersonas.add(new Persona("Javier", 67));
        listaPersonas.add(new Persona("Daniela", 24));
        listaPersonas.add(new Persona("Mateo", 21));
        listaPersonas.add(new Persona("Fernanda", 54));
        listaPersonas.add(new Persona("Miguel", 73));
        listaPersonas.add(new Persona("Paula", 33));
        listaPersonas.add(new Persona("Ricardo", 49));
        listaPersonas.add(new Persona("Natalia", 30));
        listaPersonas.add(new Persona("Esteban", 26));
        listaPersonas.add(new Persona("Gabriela", 61));
        listaPersonas.add(new Persona("Felipe", 28));
        listaPersonas.add(new Persona("Lucia", 64));
        listaPersonas.add(new Persona("Santiago", 41));
        listaPersonas.add(new Persona("Isabel", 56));
        listaPersonas.add(new Persona("Martin", 19));
        listaPersonas.add(new Persona("Elena", 35));
        listaPersonas.add(new Persona("Sebastian", 32));
        listaPersonas.add(new Persona("Patricia", 70));
        listaPersonas.add(new Persona("Nicolas", 17));
        listaPersonas.add(new Persona("Veronica", 60));
        listaPersonas.add(new Persona("Tomas", 25));
        
        PersonaController controller = new PersonaController();

        // Filtrar y) ordenar
        Set<Persona> filtradas = controller.filtrarYOrdernar(listaPersonas, 30);

        System.out.println("=== PERSONAS FILTRADAS Y ORDENADAS ===");
        for (Persona p : filtradas) {
            System.out.println(p.getNombre() + " - " + p.getEdad() + " años");
        }



        // Agrupar por rango de edad
        Map<String, Set<String>> agrupadas = controller.agruparPorRangoEdad(listaPersonas);

        System.out.println("\n=== PERSONAS AGRUPADAS POR RANGO DE EDAD ===");
        for (Map.Entry<String, Set<String>> entry : agrupadas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    
    
    
    
        };

}

