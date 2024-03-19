package lesson_44.catsWriter;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatsWriterReader {
        public static void main(String[] args) {
            List<Catty> cats = new ArrayList<>(List.of(
                    new Catty("Cat", 9, true),
                    new Catty("John", 2, true),
                    new Catty("Boris", 7, true),
                    new Catty("Hanna", 4, false)
            ));

            File path = new File("src/lesson_44/catsWriter");
            if (!path.exists()) {
                path.mkdirs();
            }

            File file = new File(path, "cats.txt");

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

           // writeCatsToFile(cats, file);
            List<Catty> cattyList = readCatsFromFile(file);
            cattyList.forEach(System.out::println);
        }

    private static List<Catty> readCatsFromFile(File file)
    {
        List<Catty> cats = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" \\| ");
                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    boolean isMale = Boolean.parseBoolean(parts[2]);
                    cats.add(new Catty(name, age, isMale));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cats;
    }

    private static void writeCatsToFile(List<Catty> cats, File file) {
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Catty cat : cats) {
                String toWrite = cat.getName() + " | " + cat.getAge() + " | " + cat.isMale();
                bufferedWriter.write(toWrite);
                bufferedWriter.newLine(); // перенос на новую строку
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
