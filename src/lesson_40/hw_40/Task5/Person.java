package lesson_40.hw_40.Task5;

import java.util.Objects;

/*
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают
 в определенном городе, а затем соберите их в список.
 */
public class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        if (age != that.age) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя ='" + name + '\'' +
                ", Возраст =" + age +
                ", Город проживания ='" + city + '\'' +
                '}';
    }
}
