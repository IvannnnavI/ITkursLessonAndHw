package lesson_44;

import java.io.File;
import java.io.IOException;

public class IoExample {
    public static void main(String[] args) {
        File pathDir = new File("testDir");

        // Операции с файлами и директориями.

        // mkdir - создать директорию.(boolean) Может создать только конечную папку.
        //  System.out.println(pathDir.mkdir());

//       File multiPath = new File("dir1");
//       System.out.println(multiPath.mkdir()); // Папок пути не существует мкдир не смог создать папку майДир.

        // mkDirs()  - создает директорию, включая все необходимые родительские директории.
        //System.out.println("mkdirs" + multiPath.mkdirs());
      //  System.out.println(multiPath.delete());

        // void deleteOnExit() - файл или директория будет удален по завершению работы виртуальной машины.

        File path = new File("src/lesson_44/db");

        path.mkdirs(); // создаем директории.
        File file = new File(path,"text.txt");
        //createNewFile() - создает новый файл.Если он не существует.

        // создаем файл по указанному пути.
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }


        // проверка свойств файла или директории.
        // isFile, isDirectory - даст true если объект является файлом \ директорией.
        System.out.println("path.isFile()"+ path.isFile());
        System.out.println("path.isDirectory()"+ path.isDirectory());
        System.out.println("file.isFile()"+ file.isFile());

        // isHidden() - является ли файл / директория скрытой.

        System.out.println("path.isHidden()"+ path.isHidden());

        // length
        //lastModified
        //getPass
        //getName
        System.out.println(file.length());
        System.out.println(file.lastModified());
        System.out.println(file.getPath());
        System.out.println(file.getName());


    }
}
