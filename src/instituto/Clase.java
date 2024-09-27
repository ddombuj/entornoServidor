package instituto;

import anotaciones.Estudiante;
import anotaciones.Estudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Hay dos formas
// En la primera, se necesita el @repeatable
//@Estudiante(
//        nombre = "Diego",
//        fechaNacimiento = "01/01/2001",
//        curso = 1
//)
//@Estudiante(
//        nombre = "Jose",
//        fechaNacimiento = "02/01/2001",
//        curso = 2
//)
//Para esta segunda no es necesaria @repeatable
@Estudiantes({
        @Estudiante(nombre = "Jose", fechaNacimiento = "02/01/2001", curso = 2),
        @Estudiante(nombre = "Diego", fechaNacimiento = "01/01/2001", curso = 1)
})
public class Clase {
    private int curso;
    private String aula;
    private List<instituto.Estudiante> estudiantes = new ArrayList<>();

    public Clase(int curso) {
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public List<instituto.Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<instituto.Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clase clase = (Clase) o;
        return Objects.equals(curso, clase.curso) && Objects.equals(aula, clase.aula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curso, aula);
    }
}
