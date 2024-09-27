package anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Estudiantes.class)
public @interface Estudiante {
    String nombre();
    String fechaNacimiento();
    int curso();
    String direccion() default "No especificada";


}
