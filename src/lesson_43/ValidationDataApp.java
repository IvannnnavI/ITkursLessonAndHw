package lesson_43;

public class ValidationDataApp {
    public static void main(String[] args) {
        String email = "john@email.com";
        email= "john.email,com";
        String password = "Password1234!";
        password = "qweryyyyP1";


        try {
            DataValidator.validate(email);
            System.out.println("Валидация пройдена.");
        } catch (EmailValidateException e) {
            System.out.println("Вы ввели неверный email.");
            System.out.println(e.getMessage());;
        }
        try {
            DataValidator.isPasswordValid(password);
            System.out.println("Валидация пароля пройдена");
        }catch (DataValidator.PasswordValidateException e ){
            System.out.println("Ошибка валидации пароля: " + e.getMessage());
        }
    }
}
