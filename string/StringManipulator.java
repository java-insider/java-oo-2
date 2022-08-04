package string;

public interface StringManipulator {

    String join(String s1, String s2);

    String takeFirst(String s, int length);

    default String upper(String s) {
        return s.toUpperCase();
    }

    static String lower(String s) {
        return s.toLowerCase();
    }
}
