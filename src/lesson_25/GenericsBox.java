package lesson_25;
/*
Традиционно символ заполнитель < T >  любая заглавная буква.
 */

public class GenericsBox <T> {

    private T value;
    public GenericsBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericsBox{" +
                "value=" + value +
                '}';
    }
}
