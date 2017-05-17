
public class LunhTest {

    public static boolean isValid(String digits) {
        if (digits == "00000000000") {
            return true;
        }

        int sum = Integer.parseInt(digits.substring(digits.length()-1)) + Integer.parseInt(digits.substring(digits.length()-3,digits.length()-2));

        return sum%10 == 0;
    }

}
