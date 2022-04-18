import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Not generic methode to find element with the not generic predicate
        Predicate predicate = x -> x > 0;
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, -10};
        System.out.println(Arrays.toString(select(input, predicate)));

        // Generic methode to find element with the generic predicate
        PredicateGeneric<Integer> integerPredicateGeneric = x -> x > 5;
        Integer[] integerInput = {1, 2, 3, 4, 5, 6, 7, 8, 9, -10};
        System.out.println(Arrays.toString(selectGeneric(integerInput, integerPredicateGeneric)));

        // Generic search for generic predicate
        PredicateSearchGeneric<Integer> predicateSearchGeneric = x -> x > 5;
        System.out.println(search(integerInput, predicateSearchGeneric));

        // Methode to apply Operation to all given elements
        Operation operation1 = x -> x * 2;
        Operation operation2 = x -> x * x;
        printTable(input, operation1);
        printTable(input, operation2);

        // Convert String with the ConvertString function
        String s = "patrick";
        ConvertString convertToUpperCase = String::toUpperCase;
        System.out.println(convert(s, convertToUpperCase));
        // decrypt function for String
        ConvertString decrypt = x -> {
            char[] charArray = x.toCharArray();
            char[] arr = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                arr[i] = (char) (charArray[i] + 5);
            }
            return String.valueOf(arr);
        };
        System.out.println(convert(s, decrypt));
        // Encrypt function for String
        ConvertString encrypt = x -> {
            char[] charArray = x.toCharArray();
            char[] arr = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                arr[i] = (char) (charArray[i] - 5);
            }
            return String.valueOf(arr);
        };
        System.out.println(convert(convert(s, decrypt), encrypt));
    }

    private static int[] select(int[] array, Predicate matches) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (matches.exec(array[i])) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }

    private static <T> T[] selectGeneric(T[] array, PredicateGeneric<T> matches) {
        T[] result = (T[]) new Object[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (matches.exec(array[i])) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }

    private static <T> T search(T[] array, PredicateSearchGeneric<T> matches) {
        for (int i = 0; i < array.length; i++) {
            if (matches.matche(array[i])) {
                return array[i];
            }
        }
        return null;
    }

    private static void printTable(int[] array, Operation operation) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(operation.exec(array[i]));
        }
    }

    private static String convert(String s, ConvertString c) {
        return c.convert(s);
    }
}