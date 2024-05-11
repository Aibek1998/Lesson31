import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(25,78,10,9,214,27,105,874));
        List<Integer> listet = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sorted((x,y) -> x.compareTo(y))
                .collect(Collectors.toList());

        System.out.println(listet);
    }
}