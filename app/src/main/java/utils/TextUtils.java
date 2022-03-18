package utils;

public class TextUtils {
    public static int getCharsCount(String input){
        return input.length();
    }
    public static int getWordsCount(String input){
        String words = input.trim();
        return words.split("\\s+").length;
    }

}
