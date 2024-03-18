package lesson_43;

public class ValidationEmailApp {
    public static void main(String[] args) {
        String email = "john@email.com";
        email= "john.email,com";
        String password = "Password1234!";
        password = "qwer";


        try {
            EmailValidator.validate(email);
            System.out.println("Валидация пройдена.");
        } catch (EmailValidateException e) {
            System.out.println("Вы ввели неверный email.");
            System.out.println(e.getMessage());;
        }
        try {
            EmailValidator.isPasswordValid(password);
            System.out.println("Валидация пароля пройдена");
        }catch (EmailValidator.PasswordValidateException e ){
            System.out.println("Ошибка валидации пароля: " + e.getMessage());
        }
    }
}
