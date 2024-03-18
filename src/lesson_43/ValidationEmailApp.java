package lesson_43;

public class ValidationEmailApp {
    public static void main(String[] args) {
        String email = "john@email.com";
        email= "john.email,com";

        try {
            EmailValidator.validate(email);
            System.out.println("Валидация пройдена.");
        } catch (EmailValidateException e) {
            System.out.println("Вы ввели неверный email.");
            System.out.println(e.getMessage());;
        }


    }
}
