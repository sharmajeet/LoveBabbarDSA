// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Practicle1_part1 {
//     public static void main(String[] args) {
//         String str = "jeet";
//         String[] combo = generateCombinations(str, "");
//         System.out.println("Combinations: " + Arrays.toString(combo));
//     }

//     public static String[] generateCombinations(String remaining, String prefix) {
//         List<String> combinationsList = new ArrayList<>();

//         if (remaining.isEmpty()) {
//             combinationsList.add(prefix);
//         } else {
//             for (int i = 0; i < remaining.length(); i++) {
//                 char currentChar = remaining.charAt(i);
//                 String newPrefix = prefix + currentChar;
//                 String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
//                 combinationsList.addAll(Arrays.asList(generateCombinations(newRemaining, newPrefix)));
//             }
//         }

//         return combinationsList.toArray(new String[0]);
//     }
// }

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practicle1_part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Java code:");
        String javaCode = scanner.nextLine();

        // Tokenize the Java code
        String[] tokens = tokenizeJavaCode(javaCode);

        // Print the result
        System.out.println("\nKeywords:");
        printArray(findKeywords(tokens));

        System.out.println("\nOperators:");
        printArray(findOperators(tokens));

        System.out.println("\nSeparators:");
        printArray(findSeparators(tokens));

        scanner.close();
    }

    private static String[] tokenizeJavaCode(String code) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b|[.,;(){}\\[\\]<>+\\-*/=!&|%^~?]");
        Matcher matcher = pattern.matcher(code);

        StringBuilder tokens = new StringBuilder();

        while (matcher.find()) {
            tokens.append(matcher.group()).append(" ");
        }

        return tokens.toString().trim().split("\\s+");
    }

    private static String[] findKeywords(String[] tokens) {
        String[] keywords = { "abstract",
                "const", "static","true",
                "try", "void", "while", "String" };

        return findCommon(tokens, keywords);
    }

    private static String[] findOperators(String[] tokens) {
        String[] operators = { "+", "-", "*", "/", "=", ">", "<", "!", "&", "|", "^", "~", "?", ":" };

        return findCommon(tokens, operators);
    }

    private static String[] findSeparators(String[] tokens) {
        String[] separators = { ",", ".", ";", "(", ")", "{", "}", "[", "]" };

        return findCommon(tokens, separators);
    }

    private static String[] findCommon(String[] tokens, String[] target) {
        return Arrays.stream(tokens)
                .filter(token -> Arrays.asList(target).contains(token))
                .distinct()
                .toArray(String[]::new);
    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
}
