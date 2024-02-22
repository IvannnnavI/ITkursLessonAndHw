package lesson_27.generic;

public class MultyGenericBox <T, V>{
    private T field1;
    private V field2;

    public MultyGenericBox(T field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "MultyGenericBox{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }

    public V getField2() {
        return field2;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }

    public T getField1() {
        return field1;
    }

    public void setField1(T field1) {
        this.field1 = field1;
    }

    public static void main(String[] args) {
        MultyGenericBox<String,Integer> multyGenericBox = new MultyGenericBox<>("Test",100);
        System.out.println(multyGenericBox);
    }
}
