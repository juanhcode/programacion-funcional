import java.util.Arrays;
import java.util.List;

public class NoneMatch {
    public static void main(String[] args) {


        /*
         Esta función permite verificar si ninguno de los elementos de un Stream cumple una condición.
         Por ejemplo, si tenemos un Stream de números enteros y queremos saber si no hay ningún número negativo,
         podemos utilizar la función noneMatch() de la siguiente manera:
        */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        boolean todosMayoresQueCero = numeros.stream()
                .allMatch(n -> n > 0);
        System.out.println(todosMayoresQueCero);

    }
}
