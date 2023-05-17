import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {

        /*
        * flatMap(): Esta función permite aplanar un Stream que contiene Streams anidados. Por ejemplo,
        * si tenemos un Stream de Listas y queremos obtener un nuevo Stream con todos los elementos de todas las listas
        * */

        List<List<Integer>> listas = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> numeros = listas.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(numeros);


        List<String> listaPalabras = Arrays.asList("Una","Dos","Tres","Cuarta");
        List<String> palabrasModificado = listaPalabras.stream().flatMap(palabra -> Stream.of(palabra.concat("   Modificada")))
                .collect(Collectors.toList());

        System.out.println(palabrasModificado);

    }
}
