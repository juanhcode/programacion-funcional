import java.util.Arrays;
import java.util.List;

public class AllMatch {

    public static void main(String[] args) {
        /*
        *
        * Esta función permite verificar si todos los elementos de un Stream cumplen una condición.
        * Por ejemplo, si tenemos un Stream de números enteros y queremos saber si todos los números
        * son mayores que cero, podemos utilizar la función allMatch() de la siguiente manera:
        * */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        boolean todosMayoresQueCero = numeros.stream()
                .allMatch(n -> n > 0);

        System.out.println(todosMayoresQueCero);

    }
}
