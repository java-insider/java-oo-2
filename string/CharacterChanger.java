package string;

public interface CharacterChanger {

    default String upper(String s) {
        return getChar() + s.substring(1);
    }

    private char getChar() {
        return '*';
    }
}
