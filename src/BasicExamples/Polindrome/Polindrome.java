package BasicExamples.Polindrome;

public class Polindrome {

    public static void checkPolindrome(String number) {
        int lenght = number.length();
        boolean isPolindrom = true;

        for (int x = 0; x < lenght / 2; x++) {
            if (number.charAt(lenght - (1 + x)) != number.charAt(x)) {
                isPolindrom = false;
                break;
            }

        }
        System.out.println(isPolindrom);
    }
}


class TestPolyndrom {

    public static void main(String[] args) {
        Polindrome.checkPolindrome("123");
        Polindrome.checkPolindrome("1233321");
        Polindrome.checkPolindrome("123321");
        Polindrome.checkPolindrome("2125533332222111");
    }
}