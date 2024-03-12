import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingSubstring {

	public static void main(String[] args) {
		String inputString = "abccbaabc";

        // Find the maximum repeating substring
        String maxRepeatingSubstring = findMaxRepeatingSubstring(inputString);

        // Print the result
        System.out.println("Maximum repeating substring: " + maxRepeatingSubstring);
    }

    private static String findMaxRepeatingSubstring(String inputString) {
        Map<String, Integer> substringFrequency = new HashMap<>();

        // Iterate through all possible substrings
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j <= inputString.length(); j++) {
                String substring = inputString.substring(i, j);

                // Update frequency in the map
                substringFrequency.put(substring, substringFrequency.getOrDefault(substring, 0) + 1);
            }
        }

        // Find the substring with the maximum frequency
        String maxRepeatingSubstring = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : substringFrequency.entrySet()) {
            if (entry.getValue() > 1 && entry.getKey().length() > maxRepeatingSubstring.length()) {
                maxRepeatingSubstring = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("Frequency of maximum repeating substring: " + maxFrequency);

        return maxRepeatingSubstring;
    }
}import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingSubstring {

	public static void main(String[] args) {
		String inputString = "abccbaabc";

        // Find the maximum repeating substring
        String maxRepeatingSubstring = findMaxRepeatingSubstring(inputString);

        // Print the result
        System.out.println("Maximum repeating substring: " + maxRepeatingSubstring);
    }

    private static String findMaxRepeatingSubstring(String inputString) {
        Map<String, Integer> substringFrequency = new HashMap<>();

        // Iterate through all possible substrings
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j <= inputString.length(); j++) {
                String substring = inputString.substring(i, j);

                // Update frequency in the map
                substringFrequency.put(substring, substringFrequency.getOrDefault(substring, 0) + 1);
            }
        }

        // Find the substring with the maximum frequency
        String maxRepeatingSubstring = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : substringFrequency.entrySet()) {
            if (entry.getValue() > 1 && entry.getKey().length() > maxRepeatingSubstring.length()) {
                maxRepeatingSubstring = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        System.out.println("Frequency of maximum repeating substring: " + maxFrequency);

        return maxRepeatingSubstring;
    }
}