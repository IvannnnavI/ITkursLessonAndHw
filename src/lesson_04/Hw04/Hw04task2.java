package lesson_04.Hw04;

public class Hw04task2 {
    public static void main(String[] args) {
        String p1 = "Java ";
        String p2 = "is ";
        String p3 = "a ";
        String p4 = "powerful ";
        String p5 = "language";


        String sentence = String.join("", p1, p2, p3, p4, p5);
        System.out.println(sentence);
//        Способ с плюсом.
        String sentence1 = p1 + p2 + p3 + p4 + p5;
        System.out.println(sentence1);
        System.out.println("Длина строки: " + sentence1.length());

//        Способ при помощи соncat().
        String sentence2 = p1.concat(p2).concat(p3).concat(p4).concat(p5);
        System.out.println(sentence2);
        System.out.println("Длина строки: " + sentence2.length());

//        Замена слова и проверка на подстроку "age"
        String replacedsentence = sentence1.replace("powerful", "super");
        System.out.println(replacedsentence);

        boolean containsAge = replacedsentence.contains("age");
        System.out.println("Строка содержит 'age': " + containsAge);



    }
}
