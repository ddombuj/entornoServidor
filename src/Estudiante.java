import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Estudiantes.class)
public @interface Estudiante {
    String nombre() default "";
    String fechaNacimiento() default "";
    int curso() default 0;
    String direccion() default "No especificada";


}
