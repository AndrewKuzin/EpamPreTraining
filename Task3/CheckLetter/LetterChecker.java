public class LetterChecker {
    public static final String A = "a";
    public static final String E = "e";
    public static final String I = "i";
    public static final String O = "o";
    public static final String U = "u";
    public static final String Y = "y";

    public static Boolean checkLetter1(char letter) {
        String string = String.valueOf(letter);
        string = string.toLowerCase();
        return  (string.equals(A) || string.equals(E) || string.equals(I) || string.equals(O)
                || string.equals(U)||string.equals(Y));
    }

    public static Boolean checkLetter2(char letter){
        String string = String.valueOf(letter);
        string = string.toLowerCase();
        switch (string){
            case A:
            case E:
            case I:
            case O:
            case U:
            case Y: {
                return true;
            }
            default:
                return false;

        }
    }
}
