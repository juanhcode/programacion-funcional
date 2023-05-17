import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.stream()
                .forEach(System.out::println);

        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.forEach(System.out::println);
    }
}
