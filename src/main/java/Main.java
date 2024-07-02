import java.util.HashMap;
public class Main {
    // we sorteren de getallen op even en oneven en houden te telling bij in een Hashmap.
    public static void main(String[] args) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        int[] arr = {42, 67, 35, 89, 24, 76, 58, 93, 7, 30, 83, 46, 13, 25, 98, 53, 17, 79, 57, 8};
        int x = 0;
        int y = 0;
        // met de for loop itereer ik door de array heen om te bepalen of het even of oneven is.
        for (int j : arr) {
            if ((j % 2) == 0) {
                dictionary.put("even", ++x);
            } else {
                dictionary.put("oneven", (++y));
            }
        }
        System.out.println(dictionary.get("even"));
        System.out.println(dictionary.get("oneven"));
    }
}
