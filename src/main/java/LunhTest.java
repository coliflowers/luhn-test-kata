
public class LunhTest {

    public static boolean isValid(String digits) {
        digits = new StringBuilder(digits).reverse().toString();

        int sum = Integer.parseInt(digits.substring(0,1)) + Integer.parseInt(digits.substring(2,3));

        return sum%10 == 0;
    }

}
