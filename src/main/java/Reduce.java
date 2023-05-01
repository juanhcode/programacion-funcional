import java.util.Arrays;
import java.util.List;

public class Reduce {

    public static void main(String[] args) {
        /*
         * reduce(): Esta función permite combinar los elementos de un Stream utilizando una función de reducción.
         * Por ejemplo, si tenemos un Stream de números enteros y queremos obtener la suma de todos ellos,
         * podemos utilizar la función reduce() de la siguiente manera:
         *
         * */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int suma = numeros.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(suma);

        // El valor inicial es 0, y la expresión lambda es a + b

        // Iteración 1: a=0, b=1, a+b=1 (nuevo valor de a)
        // Iteración 2: a=1, b=2, a+b=3 (nuevo valor de a)
        // Iteración 3: a=3, b=3, a+b=6 (nuevo valor de a)
        // Iteración 4: a=6, b=4, a+b=10 (nuevo valor de a)
        // Iteración 5: a=10, b=5, a+b=15 (nuevo valor de a)

        // El resultado final es 15, que es la suma de todos los elementos del Stream

    }
}
