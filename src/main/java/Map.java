import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        /*
        * map(): Esta función permite transformar los elementos de un Stream
        * aplicando una función a cada uno de ellos
        * */
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> resultado = numeros.stream().map(n -> n*n).collect(Collectors.toList());
        resultado.forEach(System.out::println);
    }
}
