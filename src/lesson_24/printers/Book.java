package lesson_24.printers;

public class Book implements Printable {
    private String title;
    private String autor;

    @Override
    public void sayHello(String string) {
        System.out.println("Overload"+ string + " : " + power);
    }

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }
    public void bookSayHello(){
        System.out.println("Hello " + title);
    }

    @Override
    public void print() {
        System.out.println("Print Book " + title + " (autor:  " + autor );
    }
}
