package lesson_40.hw_40.Task5;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {
    public static void main(String[] args) {
        List<Person> personList = getListPerson();
        System.out.println(personList);
        List<Person> filteredPeople = PersonFilter.filterPerson(personList, 30, "Майями");
        System.out.println("Люди проживающие в Майями, которые старше 30:");
        System.out.println(filteredPeople);


    }

    public static List<Person> filterPerson(List<Person> people, int age, String city) {
        return people.stream()
                .filter(p -> p.age > age && p.city.equals(city))
                .collect(Collectors.toList());
    }

    private static List<Person> getListPerson() {
        return List.of(
                new Person("Месси", 36, "Майями"),
                new Person("Дэвид Бэкхэм", 48, "Майями"),
                new Person("Рона́лду Луи́с Наза́риу ди Ли́ма", 47, "Майями"),
                new Person("Роналдиньо", 43, "Санни-Айлс-Бич"),
                new Person("Эрлинг Холланд", 23, "Манчестер"),
                new Person("Килиа́н Мбаппе́ Лотте́н", 25, "Париж")
        );

    }
}
