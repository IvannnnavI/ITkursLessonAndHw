package lesson_43;

public class EmailValidateException extends Exception {
    /*
    getMessage() -  возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение , которое вызвало текущее исключение
    toString(): Возвращает строковое представление объекта исключения.
     printStackTrace(): Выводит трассировку стека исключения.

     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception " + super.getMessage();
    }
}
