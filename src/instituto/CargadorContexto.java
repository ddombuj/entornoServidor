package instituto;

import anotaciones.Estudiante;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CargadorContexto {

    public static List<Clase> cargaContextoInstituto(){

        //var annotations = Clase.class.getAnnotations();
        Estudiante[] estudianteAannotaions = Clase.class.getAnnotationsByType(Estudiante.class);

        Map<Integer, Clase> integerClaseMap = new HashMap<>();

        for (Estudiante annotation : estudianteAannotaions) {
            System.out.println(annotation.toString());

            int curso = annotation.curso();
            Clase claseBuscada = integerClaseMap.get(curso);

            if(claseBuscada == null){
                //La clase no existe, luego la creo
                claseBuscada = new Clase(curso);
                integerClaseMap.put(curso, claseBuscada);
            }
            claseBuscada.getEstudiantes().add(new instituto.Estudiante(
                    annotation.nombre(),
                    LocalDate.now(),
                    100,
                    annotation.direccion()
            ));
        }
        
        return List.of();
    }
}
