import java.util.List;

@Estudiante(
        nombre = "Diego",
        fechaNacimiento = "01/01/2001",
        curso = 1
)
@Estudiante(
        nombre = "Jose",
        fechaNacimiento = "02/01/2001",
        curso = 2
)
public class Clase {
    List<Estudiante> estudiantes;
}
