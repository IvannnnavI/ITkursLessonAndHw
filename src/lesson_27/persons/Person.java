package lesson_27.persons;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;

        }
    }
    /*
    john@test.net
    1.@ должна присутствовать собака но только одна.
    2.точка после собаки
    3.точка не может быть сразу после собаки.
    4. после точки не менее двух символов.
    5.могут присутствовать символы алфавита, цифры, "-" "_" "@"
    6. Место для собаки не первое
    7.Первый символ алфавитный.
     */

    private boolean isEmailValid(String email) {
        if (email == null || email.isEmpty()) return false;

        // 1. @ |
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) return false;
        // должна быть точка после собаки.
        int firstdotafterAt = email.indexOf('.', indexAt);
        if (firstdotafterAt == -1 || firstdotafterAt != indexAt + 1) return false;

        // lastdort
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) return false;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            boolean isCharValid = (Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.' || c == '@');

            if (isCharValid) return false;

        }
        return true;


    }

    public String getPassword() {
        return password;
    }

    /* Требования к валидности пароля
    1. длина пароля >= 8
    2. мин 1 маленькая буква
    3. мин 1 большая буква
    4. мин 1 цифра
    5. мин 1 спец символ ("!%$@&*()[]")
    6. проверка на одинаковые последовательные символы.

     */
    private boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false; //длина не менее 8 символов
        // ставлю маячки на все условия валидации.
        boolean hasLower = false; // наличие хотя бы 1 маленькой буквы
        boolean hasUpper = false; // наличие хотя бы 1 большой буквы
        boolean hasDigit = false; // наличие хотя бы 1 цифры.
        boolean hasSpec = false; // наличие хотя бы 1 спецсимвола
        boolean hasSequential = false; //наличие двух последовательных символов.

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if ("!%$@&*()[]".indexOf(c) >= 0) hasSpec = true;
        }
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                hasSequential = true;
                break;
            }
        }
        return hasLower && hasUpper && hasDigit && hasSpec && !hasSequential;

    }


    public void setPassword(String password) {
        this.password = password;
    }
}
