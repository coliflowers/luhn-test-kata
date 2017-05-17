
public class LunhTest {

    public static boolean isValid(String digits) {
        digits = new StringBuilder(digits).reverse().toString();

        int sum = Integer.parseInt(digits.substring(0,1)) +
                2 * Integer.parseInt(digits.substring(1,2)) +
                Integer.parseInt(digits.substring(2,3)) +
                2 * Integer.parseInt(digits.substring(3,4));

        return sum%10 == 0;
    }

}
