package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;
        for (String each : array) {
            if (each.equals(value)) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int arrayLength = array.length - 1;
        String[] reversed = new String[array.length];
        for (int i = 0; i <= arrayLength; i++) {
            reversed[i] = array[arrayLength - i];
        }
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int arrayLength = array.length - 1;
        String[] reversed = new String[array.length];
        for (int i = 0; i <= arrayLength; i++) {
            reversed[i] = array[arrayLength - i];
        }
        return (Arrays.equals(reversed, array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String answer = Arrays.toString(array).toLowerCase();

        for (int i = 0; i < alphabet.length(); i++) {
            if (!answer.contains(String.valueOf(alphabet.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /**
     * +
     *
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String each : array) {
            if (each.equals(value)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i <= array.length - 1; i++) {
            if (!array[i].equals(valueToRemove)) {
                arrayList.add(array[i]);
            }
        }
        String[] arrayFinal = arrayList.toArray(new String[arrayList.size()]);
        return arrayFinal;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("");
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                arrayList.set(i + 1, "");
            }
        }
        arrayList.removeAll(removeList);
        String[] arrayFinal = arrayList.toArray(new String[arrayList.size()]);
        return arrayFinal;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                arrayList.set(i, array[i] + "");
            } else {
                arrayList.set(i, array[i] + " ");
            }
        }
        String arrayListString = String.join("", arrayList);
        String[] finalArray = arrayListString.split(" ");
        return finalArray;
    }


}
