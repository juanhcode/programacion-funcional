import java.util.Arrays;
import java.util.List;

public class AnyMatch {

    public static void main(String[] args) {
        /*
        * Esta función permite verificar si al menos uno de los elementos de un Stream cumple una condición.
        * Por ejemplo, si tenemos un Stream de números enteros y queremos saber si hay algún número par,
        * podemos utilizar la función anyMatch() de la siguiente manera
        *
        * */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        boolean hayPares = numeros.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(hayPares);

    }
}
