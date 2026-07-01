
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PersonaController {
    public Set<Persona> filtrarYOrdernar(List<Persona> personas, int edad){
          Set<Persona> personasFiltradas = new TreeSet<>(
            (p1,p2) ->{
                int compEdad = Integer.compare(p1.getEdad(), p2.getEdad());
                if(compEdad != 0){    
                    return compEdad;
                }    
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());

            });

        
        return personasFiltradas;

    }


        public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas) {
        
        Map<String, Set<String>> agrupacion = new TreeMap<>();
        
      
        agrupacion.put("ADULTO", new LinkedHashSet<>());
        agrupacion.put("JOVEN", new LinkedHashSet<>());
        agrupacion.put("MAYOR", new LinkedHashSet<>());

        for (Persona p : personas) {
            String categoria;
            int edad = p.getEdad();

            if (edad < 30) {
                categoria = "JOVEN";
            } else if (edad >= 30 && edad < 60) {
                categoria = "ADULTO";
            } else {
                categoria = "MAYOR";
            }

            String[] nombre = p.getNombre().split(" ");
            String primNombre = nombre[0];

            agrupacion.get(categoria).add(primNombre);
        }

        return agrupacion;
    }
}





















