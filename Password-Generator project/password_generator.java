import java.util.*;

class password_generator{
    static void randPass(int length) {
        char[] password = new char[length];
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special = "!@#$%^&*()_-=";
        String number = "1234567890";
        String combine = lowerCase + upperCase + special + number;
        Random random = new Random();
        boolean validPass = false;
        if (8 <= length && length <= 16) {
            for (int i = 0; i < length; i++) {
                password[i] = combine.charAt(random.nextInt(combine.length()));
                validPass = true;
            }
        }
        String pass = new String(password);
        if (validPass) {
            System.out.println("Generated password is : " + pass);
            System.out.println("Length of password is : " + length);
        } else {
            System.out.println("Please enter password in range of 8~16 character ");
        }
        boolean hasLower = false;
        boolean hasupper = false;
        boolean hasDigit = false;
        boolean hasSpeciaChar = false;
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^',
                '&', '*', '(', ')', '_', '=', '-' ));

        for (char i:password) {
            if (Character.isLowerCase(i)) {
                hasLower = true;
            }
            if (Character.isUpperCase(i)) {
                hasupper = true;
            }
            if (Character.isDigit(i)) {
                hasDigit = true;
            }
            if (set.contains(i)) {
                hasSpeciaChar = true;
            }
        }
       
        if (hasDigit && hasLower && hasSpeciaChar && hasupper) {
            System.out.println("very Strong password");
        }else
        if (hasDigit && hasLower && hasupper) {
            System.out.println("Strong password");
        }else
        if (hasLower && hasSpeciaChar && hasupper) {
            System.out.println("medium password");
        }
        else if (hasLower && hasupper) {
            System.out.println("weak password");
        }
    }

    public static void main(String[] args) {
        randPass(7);
        randPass(17);
        randPass(10);
    }
}
