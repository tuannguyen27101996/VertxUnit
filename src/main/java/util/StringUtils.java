package util;

public class StringUtils {

    public static String getNoSpaceString(String input) {
        return input.replace(" ", "");
    }

    public static boolean checkIsNumberString(String input) {
        try {
            int target = Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
