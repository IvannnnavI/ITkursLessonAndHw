package lesson_18;

public class StaticBlockDemo {
    private static String[] color;
    private static int number = 10;
    private String title = "STR1";

    static {
        System.out.println("Static init block start!");
        color = new String[3];
        color[0] = "RED";
        color[1] = "Syan";
        color[2] = "Yellow";

    }
    {
        System.out.println("ne statica");
    }


    public StaticBlockDemo(){
        System.out.println("Construktor start!");
    }

    public void printColor(){
        for (int i = 0; i < color.length ; i++) {
            System.out.println(color[i]);

        }
    }
}
