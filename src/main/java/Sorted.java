import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {

        /*
        * Esta función permite ordenar los elementos de un Stream utilizando un comparador.
        * Por ejemplo, si tenemos un Stream de cadenas de texto y queremos obtener un nuevo Stream
        * con las cadenas ordenadas alfabéticamente, podemos utilizar la función sorted() de la siguiente manera:
        * */
        List<String> palabras = Arrays.asList("hola", "mundo", "desde", "java");
        List<String> ordenado = palabras.stream()
                .sorted()
                .collect(Collectors.toList());

    }
}
