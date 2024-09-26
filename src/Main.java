public class Main {
    public static void main(String[] args) {
        Operacion o = (x, y) -> x + y;
        /* Operacion o = (x,y) -> {
                return x + y;
           }
         //SON EQUIVALENTES, SIEMPRE QUE SOLO HAYA RETURN EN EL BLOQUE, PUEDES SIMPLIFICARLO*/


        double res = o.calcular(1.2,1.3);
        System.out.println(res);
    }
}