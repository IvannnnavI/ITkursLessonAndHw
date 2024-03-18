package lesson_43;

public class EmailValidator {

    // ключевое слово Throw для явного выброса исключения (порождения , иниализации исключения.)
    public static void validate(String email) throws EmailValidateException {
        // проверяем что пришел не null и не пустая строка
        if (email == null || email.isEmpty())throw new EmailValidateException("Empty email");

        // tttt@trtrtr.n.et
        // 1. @ |
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@'))throw new EmailValidateException("@Error");

        // 2. Должна быть точка после @

        // Method overload - starts after with the index (in this case, the sign index @
        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1|| indexFirstDotAfterAt == indexAt + 1)throw new EmailValidateException("after@.");

        // 3. LastDot
        if (email.lastIndexOf('.') >= email.length() - 2) throw new EmailValidateException("last dot Error");

        // true - если первый символ является буквой алфавита
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) throw new EmailValidateException("illegal first symbol");


        // 5. Only alphabet characters, numbers, '-', '_', '.', '@' can only be present.

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            //true, if the symbol satisfies at least one of the criteria.
            boolean isCharValid = (
                    Character.isAlphabetic(c)
                            || Character.isDigit(c)
                            || c == '-'
                            || c == '_'
                            || c == '.'
                            || c == '@'
            );

            if (!isCharValid) throw new EmailValidateException("illegal Symbol");

        }

        // All checks passed, nowhere did the method return false ->

    }
    public static void isPasswordValid (String password) throws PasswordValidateException {
        if (password == null || password.length() < 8){
            throw new PasswordValidateException("Код должен содержать минимум 8 символов");
        }
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpecialSymbol = false;

        // альтернативный вариант запоминания
        boolean[] res = new boolean[4]; // false, false, false, false

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                isDigit = true;
//                res[0] = true;
                continue;
            }

            if (Character.isLowerCase(c)) {
                isLowerCase = true;
//                res[1] = true;
                continue;
            }

            if (Character.isUpperCase(c)) {
                isUpperCase = true;
                continue;
            }

            if ("!%$@&*()[]".indexOf(c) >= 0) {
                isSpecialSymbol = true;
                continue;
            }
        }


        if (!(isLowerCase && isUpperCase && isDigit && isSpecialSymbol)) {
            throw new
                    PasswordValidateException("Пароль должен содержать хотя бы одну строчную букву," +
                    " одну прописную букву, одну цифру и один специальный символ.");}

    }

    public static class PasswordValidateException extends Exception{
        public PasswordValidateException (String message){
            super(message);
        }
    }
}
