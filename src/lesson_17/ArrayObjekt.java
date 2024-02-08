package lesson_17;

public class ArrayObjekt {
    public static void main(String[] args) {
        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());

       /* System.out.println(garry.name);
        garry.name = "Harold";
        garry.age = 18;*/

        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Read, Musik");

        Person[] people = new Person[5];
        people[0] = john;
        people[1] = garry;
        people[4] = new Person("Tom", 5, "sing");

        System.out.println("=========================================");
        System.out.println(people[1].name);
        System.out.println(garry.name);

        people[1].name = "Oskold";
        System.out.println(people[1].toString());
        System.out.println(garry.toString());

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].name);
                System.out.println(people[i].hobby);
            } else {
                System.out.println("Cоздаю нового Person");
                people[i] = new Person("Name" + i, 18 + i, "java");
                System.out.println(people[i].toString());


                // System.out.println("Игнорируем ссылку на налл!");
            }


        }
        System.out.println("=============================================>");
        Person test = new Person("Test", 50, "test");
        people[3] = test;

        test = null;

        System.out.println(people[3].hobby);
        test = people[1];



    }
}
