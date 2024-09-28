import java.util.stream.IntStream;

public class NonCons {
    public static void main(String[] args) {
        int w[] = {1, 221, 3, 4, 6, 7, 8};
        System.out.println(nonc(w));
    }

    private static Integer nonc(int[] array) {
        return IntStream.range(1, array.length).filter(i -> array[i - 1] != array[i] - 1)
                .mapToObj(x -> new Integer(array[x])).findFirst().orElse(null);
    }


}
