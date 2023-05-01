import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public static void main(String[] args) {

        //filter(): Esta función permite filtrar los elementos de un Stream utilizando una condición.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares);
        //Imprimir Streams
        Stream<Integer> numer = numeros.stream().filter(n -> n % 2 == 0);
        numer.forEach(System.out::println);

    }
}
