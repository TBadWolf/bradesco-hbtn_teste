public class Pessoa {
    public static boolean emailValid(String email) {

        boolean invalidEmail = email.isEmpty() || !email.contains("@") || (email.length() > 50);

        return !invalidEmail;
    }

}