import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character, Integer> countFrequency(String str) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        return frequency;
    }

    public static void main(String[] args) {
        String input = "banana";

        Map<Character, Integer> result = countFrequency(input);

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}